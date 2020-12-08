package com.example.moviebooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.auth.FirebaseAuth;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {

    FirebaseAuth mAuth;
    private EditText email;
    private EditText phone;
    private EditText firstName;
    private EditText lastName;
    private EditText pw;
    private EditText pwConfirm;
    private Button submitBtn;
    private TextView signInBtn;
    private CheckBox tNc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        email = findViewById(R.id.email);
        phone = findViewById(R.id.phoneNum);
        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        pw = findViewById(R.id.pw);
        pwConfirm = findViewById(R.id.pw2);
        signInBtn = findViewById(R.id.signInBtn);
        submitBtn = findViewById(R.id.submitBtn);
        tNc = findViewById(R.id.terms);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUp.this, SignIn.class);
                startActivity(i);
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                if (firstName.getText().toString()=="" || lastName.getText().toString()=="" || pw.getText().toString()=="" ||
                        pwConfirm.getText().toString()=="" || email.getText().toString()=="" || phone.getText().toString()=="") {
                    Toast.makeText(SignUp.this, "Please ensure that all fields are completed before submitting", Toast.LENGTH_SHORT).show();

                    if (firstName.getText().toString()=="") {
                        firstName.requestFocus();
                    }
                    else if (lastName.getText().toString()=="") {
                        lastName.requestFocus();
                    }
                    else if (pw.getText().toString()=="") {
                        pw.requestFocus();
                    }
                    else if (pwConfirm.getText().toString()=="") {
                        pwConfirm.requestFocus();
                    }
                    else if (email.getText().toString()=="") {
                        email.requestFocus();
                    }
                    else if (phone.getText().toString()=="") {
                        phone.requestFocus();
                    }
                }
                else if (!isValidEmailId(email.getText().toString().trim())) {
                    Toast.makeText(SignUp.this, "Error: Invalid email format! Acceptable format:'user@mail.com'", Toast.LENGTH_SHORT).show();
                }
                else if (pw.getText().toString() != pwConfirm.getText().toString()) {
                    Toast.makeText(SignUp.this, "Error: Your passwords don't match!", Toast.LENGTH_SHORT).show();
                }
                else if (!tNc.isChecked()){
                    Toast.makeText(SignUp.this, "Please accept the Terms and Conditions to proceed", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SignUp.this, "Succesfully Signed Up!", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(SignUp.this, Home.class);
                    startActivity(i);
                }
            }
        });
    }

    private boolean isValidEmailId(String email){

        return Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$").matcher(email).matches();
    }
}
