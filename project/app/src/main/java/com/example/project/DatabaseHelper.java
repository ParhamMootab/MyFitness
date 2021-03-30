package com.example.project;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

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


    public static final String DATABASE_NAME = "MyDatabase.db";

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

    public User authenticate(User user) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(tableName, new String[]
                        {columnID, columnFullName, columnUserName, columnPassword, columnWeight, columnHeight},
                columnUserName + "=?", new String[]{user.getUserName()}, null, null, null);
        if (cursor != null && cursor.moveToFirst() && cursor.getCount() > 0) {

            User user1 = new User(cursor.getString(0), cursor.getString(1),
                    cursor.getString(2), cursor.getString(3), cursor.getDouble(4), cursor.getInt(5));

            if (user.getPassword().equals(user1.getPassword())) {
                return user1;
            }
        }
        return null;
    }

    public List<User> GetUser(Context context) {
        List<User> users = null;
        SQLiteDatabase db = this.getReadableDatabase();
        String[] columns = new String[]{columnID, columnFullName, columnUserName, columnPassword, columnWeight, columnHeight};
        Cursor cursor = db.query(tableName, columns, null, null, null, null, null);
        while (cursor.moveToNext()) {
            User user1 = new User(cursor.getString(2), cursor.getString(3));
            user1.setID(cursor.getString(cursor.getColumnIndexOrThrow(columnID)));
            user1.setFullName(cursor.getString(cursor.getColumnIndexOrThrow(columnFullName)));
            user1.setHeight(cursor.getInt(cursor.getColumnIndexOrThrow(columnHeight)));
            user1.setWeight(cursor.getDouble(cursor.getColumnIndexOrThrow(columnWeight)));
            users.add(user1);
        }
        db.close();
        return users;
    }



}
