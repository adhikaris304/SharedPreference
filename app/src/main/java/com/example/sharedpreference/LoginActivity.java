package com.example.sharedpreference;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private Button btnSignin;
    private EditText etUsername, etPassword;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        etUsername=findViewById(R.id.etUsername);
        etPassword=findViewById(R.id.etPassword);
        btnSignin=findViewById(R.id.btnSignin);
        
        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIN();
                
            }

            private void SignIN() {

                SharedPreferences sharedPreferences=getSharedPreferences("user", MODE_PRIVATE);

            }
        });
    }
}
