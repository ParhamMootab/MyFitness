package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private TextView info;
    private Button login;
    private Button signUp;
    private int counter = 3;
    private DatabaseHelper helper;
    public GoogleSignInClient mGoogleSignInClient;
    private static final int RC_SIGN_IN = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = findViewById(R.id.etUserName);
        password = findViewById(R.id.etPassword);
        info = findViewById(R.id.txtViewInfo);
        login = findViewById(R.id.btnLogin);
        signUp = findViewById(R.id.btnSignUp);
        helper = new DatabaseHelper(this);

        info.setVisibility(View.GONE);

        // Configure sign-in to request the user's ID, email address, and basic
        // profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        // Build a GoogleSignInClient object with the options specified by gso.
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        // Check for existing Google Sign In account, if the user is already signed in, open the next activity
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        updateUI(account);

        // Set the dimensions of the sign-in button.
        SignInButton signInButton = findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_WIDE);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.sign_in_button:
                        signIn();
                        break;
                    // ...
                }
            }
        });

        signUp.setOnClickListener((View v) -> {
            Intent intentSignUp = new Intent(MainActivity.this, SignUp.class);
            startActivity(intentSignUp);
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userName.getText().toString(), password.getText().toString());
            }
        });
    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }

    // update the UI if the user is already signed in
    private void updateUI(GoogleSignInAccount account) {
        if (account != null){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("Name", account.getGivenName());
            startActivity(intent);
        }
    }

    private void validate(String userName, String password){
        User user = helper.authenticate(new User(userName, password));
        if(user != null){
            Toast.makeText(getApplicationContext(), "Login successfully.",Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("Name", user.getFullName());
            startActivity(intent);
        } else {
            counter--;
            Toast.makeText(this, "Wrong username or password. Please try again.", Toast.LENGTH_SHORT).show();
            info.setText("Number of attempts remaining: " + counter);
            info.setVisibility(View.VISIBLE);
            if (counter == 0){
                login.setEnabled(false);
            }
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            System.out.println(account.getGivenName());

            // Signed in successfully, show authenticated UI.
            updateUI(account);
        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Toast.makeText(this,"Sign in cancel. ",Toast.LENGTH_LONG).show();
            updateUI(null);
        }
    }
}