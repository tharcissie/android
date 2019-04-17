package com.example.myapplicationandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentregistration extends AppCompatActivity {
    Button register_Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentregistration);

        register_Button =(Button) findViewById(R.id.register_button);
        register_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register_buttonIntent;
                register_buttonIntent = new Intent(studentregistration.this,MainActivity.class);
                startActivity(register_buttonIntent);
            }
        });
    }
}
