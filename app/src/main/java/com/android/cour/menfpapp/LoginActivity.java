package com.android.cour.menfpapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button btnval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnval = (Button) findViewById(R.id.btnVal);

        btnval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pase nan yn lot activite
               Intent intent = new Intent(getApplicationContext(), LocalisationActivity.class);
                startActivity(intent);
            }
        });
    }

}
