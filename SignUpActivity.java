package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.text.BreakIterator;

public class SignUpActivity extends AppCompatActivity {
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        final EditText email = findViewById(R.id.email_editText);
        final EditText password = findViewById(R.id.password_editText);
        final Button signUp = findViewById(R.id.sign_up);
        final Button alreadyAuser = findViewById(R.id.already_a_user);
        final ImageView helpIcon = findViewById(R.id.help_icon);

        helpIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, HelpActivity.class));
            }
        });
    }

    public void signUp(View view){
        Toast.makeText(SignUpActivity.this, "Signed up", Toast.LENGTH_SHORT).show();
        //mAuth.createAUserWithEmailAndPasssword(emailEditText.getText.toString(), passwordEdittext.getText().toString());
    }

    public void alreadyAuser(View view){
        startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
    }


}