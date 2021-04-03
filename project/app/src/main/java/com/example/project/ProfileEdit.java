package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project.ui.ProfileFragment;
import com.google.android.material.snackbar.Snackbar;

public class ProfileEdit extends AppCompatActivity {

    SharedPreferences sp;
    private DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_edit);

        sp = getSharedPreferences("login", MODE_PRIVATE);
        helper = new DatabaseHelper(this);

        EditText userFullName = findViewById(R.id.etFullName2);
        EditText userWeight = findViewById(R.id.etWeight2);
        EditText userHeight = findViewById(R.id.etHeight2);

        userFullName.setText(getIntent().getExtras().getString("FullName"));
        userWeight.setText(String.valueOf(getIntent().getExtras().getDouble("Weight")));
        userHeight.setText(String.valueOf(getIntent().getExtras().getInt("Height")));

        Button btnUpdateProfile = findViewById(R.id.btnUpdateProfile);
        btnUpdateProfile.setOnClickListener((View v) -> {
            if (userFullName.getText().toString().isEmpty()){
                Toast.makeText(this, "Full name cannot be empty.", Toast.LENGTH_SHORT).show();
            } else {
                int id = sp.getInt("userId",0);
                helper.UpdateProfile(id, userFullName.getText().toString(), Double.parseDouble(userWeight.getText().toString()),
                        Integer.parseInt(userHeight.getText().toString()));
                Toast.makeText(this, "Update profile successfully.", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnBackHome = findViewById(R.id.btnBackHome);
        btnBackHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ProfileEdit.this, NavigationDrawer.class);
                startActivity(myIntent);
            }
        });
    }
}