package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class SignUp extends AppCompatActivity {

    private EditText fullName;
    private EditText userName;
    private EditText password;
    private EditText weight;
    private EditText height;
    private Button btnCreate, btnBack;
    DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fullName = findViewById(R.id.etFullName);
        userName = findViewById(R.id.editTextUserName);
        password = findViewById(R.id.editTextPassword);
        weight = findViewById(R.id.etWeight);
        height = findViewById(R.id.etHeight);
        btnCreate = findViewById(R.id.btnRegister);
        btnBack = findViewById(R.id.btnBackLogin);

        helper = new DatabaseHelper(this);

        btnCreate.setOnClickListener((View v) -> {
            if (userName.getText().toString().isEmpty() || password.getText().toString().isEmpty()){
                Toast.makeText(this, "Username and password cannot be empty.", Toast.LENGTH_SHORT).show();
            } else {
                User user = new User();
                user.setFullName(fullName.getText().toString());
                user.setUserName(userName.getText().toString());
                user.setPassword(password.getText().toString());
                user.setWeight(Double.parseDouble(weight.getText().toString()));
                user.setHeight(Integer.parseInt(height.getText().toString()));

                helper.Register(user);
                Toast.makeText(this, "User registration successful! Please come back to Login page to login.", Toast.LENGTH_SHORT).show();
                clear();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUp.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void clear() {
        fullName.setText("");
        userName.setText("");
        password.setText("");
        weight.setText("");
        height.setText("");
    }
}