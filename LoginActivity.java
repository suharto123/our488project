package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

public class LoginActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // hide action bar
        getSupportActionBar().hide();


        final EditText email = findViewById(R.id.email_editText);
        final EditText password = findViewById(R.id.password_editText);
        final Button login = findViewById(R.id.login);
        final Button new_user = findViewById(R.id.new_user);
        final ImageView helpIcon = findViewById(R.id.help_icon);
        final TextView forgotPassword = findViewById(R.id.forgotPasswordTextview);

        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, ResetPasswordActivity.class));
            }
        });

        helpIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, HelpActivity.class));
            }
        });

    }

    public void logIn(View view){
        Toast.makeText(LoginActivity.this, "Logged in", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void new_user(View view) {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
    }

}