package com.example.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnRegister;
    private EditText etUsername, etPassword, etConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        etConfirmPassword = findViewById(R.id.etConfirmPassword);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = etPassword.getText().toString();
                if (pass.equals(etConfirmPassword.getText().toString())) {
                    Signup();
                }
                else {

                    Toast.makeText(MainActivity.this, "Incorrect password", Toast.LENGTH_SHORT).show();


                }
            }



        });
    }

    private void Signup() {
        SharedPreferences sharedPreferences = getSharedPreferences("User", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("username", etUsername.getText().toString());
        editor.putString("password", etPassword.getText().toString());
        editor.commit();

        Toast.makeText(MainActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
    }
}
