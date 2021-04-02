package com.example.assignment3.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.assignment3.R;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText username, password;
    Button login;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.login_relative);

        username = findViewById(R.id.tiet_username);
        password = findViewById(R.id.tiet_password);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (password.getText().toString().toUpperCase().equals("TEST")) {
                    login_success();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Password yang anda masukkan salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void login_success() {
        String data_username = username.getText().toString();

        Intent i = new Intent(this, MainActivity.class);

        //mengambil inputan username untuk dibawa ke Main.Activity
        i.putExtra("USERNAME", data_username);

        startActivity(i);
    }
}
