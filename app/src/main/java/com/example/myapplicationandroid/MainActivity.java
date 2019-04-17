package com.example.myapplicationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        login= (Button)findViewById(R.id.login);
        register= (Button)findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent;
                registerIntent = new Intent(MainActivity.this,welcomeuser.class);
                startActivity(registerIntent);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent;
                registerIntent = new Intent(MainActivity.this,studentregistration.class);
                startActivity(registerIntent);
            }
        });


    }
}
