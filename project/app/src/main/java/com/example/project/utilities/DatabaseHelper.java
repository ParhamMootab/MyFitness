package com.example.project.utilities;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.project.model.User;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String tableName = "userTable";
    private static String columnID = "id";
    private static String columnFullName = "fullName";
    private static String columnUserName = "userName";
    private static String columnPassword = "password";
    private static String columnWeight = "weight";
    private static String columnHeight = "height";

    public static String CreateQuery = "CREATE TABLE " + tableName +
            " ( "
            + columnID + " INTEGER PRIMARY KEY,"
            + columnFullName + " TEXT,"
            + columnUserName + " TEXT,"
            + columnPassword + " TEXT,"
            + columnWeight + " REAL,"
            + columnHeight + " INTEGER)";
    public static String DeleteQuery = "DROP TABLE IF EXISTS " + tableName;

    public static final String DATABASE_NAME = "MyDatabase";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DatabaseHelper.CreateQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(DatabaseHelper.DeleteQuery);
        onCreate(db);
    }

    public void Register(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(columnFullName, user.getFullName());
        contentValues.put(columnUserName, user.getUserName());
        contentValues.put(columnPassword, user.getPassword());
        contentValues.put(columnWeight, user.getWeight());
        contentValues.put(columnHeight, user.getHeight());
        db.insert(tableName, null, contentValues);
        db.close();
    }

    // this method is used to insert the user's information into the database
    // when the user signs in the app using Google account (for the first time)
    public int RegisterIfNotExist(GoogleSignInAccount account){

        int userId = 0;

        // check if the information of the user exists in the database or not
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(tableName, new String[]
                        {columnID, columnFullName, columnUserName, columnPassword, columnWeight, columnHeight},
                columnUserName + "=?", new String[]{account.getEmail()}, null, null, null);

        // if the user already logged in before, do nothing; else insert the user's email and full name
        if (cursor != null && cursor.moveToFirst() && cursor.getCount() > 0) {
            userId = cursor.getInt(0);
        }
        else {
            db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(columnFullName, account.getGivenName() + " " + account.getFamilyName());
            contentValues.put(columnUserName, account.getEmail());
            userId = (int) db.insert(tableName, null, contentValues);
            db.close();
        }
        return userId;
    }

    public User authenticate(User user) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(tableName, new String[]
                        {columnID, columnFullName, columnUserName, columnPassword, columnWeight, columnHeight},
                columnUserName + "=?", new String[]{user.getUserName()}, null, null, null);
        if (cursor != null && cursor.moveToFirst() && cursor.getCount() > 0) {

            User user1 = new User(cursor.getInt(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3), cursor.getDouble(4), cursor.getInt(5));

            if (user.getPassword().equals(user1.getPassword())) {
                return user1;
            }
        }
        return null;
    }

    public List<User> GetUserList(Context context) {
        List<User> users = null;
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = new String[]{columnID, columnFullName, columnUserName, columnPassword, columnWeight, columnHeight};
        Cursor cursor = db.query(tableName, columns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            User user1 = new User(cursor.getString(2), cursor.getString(3));
            user1.setID(cursor.getInt(cursor.getColumnIndexOrThrow(columnID)));
            user1.setFullName(cursor.getString(cursor.getColumnIndexOrThrow(columnFullName)));
            user1.setHeight(cursor.getInt(cursor.getColumnIndexOrThrow(columnHeight)));
            user1.setWeight(cursor.getDouble(cursor.getColumnIndexOrThrow(columnWeight)));
            users.add(user1);
        }
        db.close();
        return users;
    }

    public User GetUser(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = new String[]{columnID, columnFullName, columnUserName, columnPassword, columnWeight, columnHeight};
        Cursor cursor = db.query(tableName, columns, columnID + "=?", new String[]{String.valueOf(id)}, null, null, null);
        if (cursor != null && cursor.moveToFirst() && cursor.getCount() > 0) {
            User user1 = new User(cursor.getInt(0), cursor.getString(1),cursor.getString(2),
                    cursor.getString(3), cursor.getDouble(4), cursor.getInt(5));
            return user1;
        }
        else {
            return null;
        }
    }

    public void UpdateProfile(int id, String fullName, double weight, int height) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(columnFullName, fullName);
        contentValues.put(columnWeight, weight);
        contentValues.put(columnHeight, height);
        db.update(tableName, contentValues, columnID + "=?", new String[]{String.valueOf(id)});
        db.close();
    }
}
