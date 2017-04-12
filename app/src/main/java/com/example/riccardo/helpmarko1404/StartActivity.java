package com.example.riccardo.helpmarko1404;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        String s = getIntent().getStringExtra("key_string");
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();

//        TextView mytext = (TextView) findViewById(R.id.resultat);
//        mytext.setText(s);
    }
}
