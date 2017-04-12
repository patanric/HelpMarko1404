package com.example.riccardo.helpmarko1404;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String ImeIgraca;
    EditText Namesfield;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Namesfield = (EditText)findViewById(R.id.name_field);

    }

    //button will let the user proceed to  main activity and will check whether user entered his name or not.
    //a string will be stored for future use
    public void Goforward(View view) {
        ImeIgraca = Namesfield.getText().toString();
        if (ImeIgraca.equals("")) {
            Toast msg = Toast.makeText(getApplicationContext(), "Come on man, You gotta give me a name", Toast.LENGTH_SHORT);
            msg.show();
        } else {
            Intent quizIntent = new Intent(this, StartActivity.class);
            quizIntent.putExtra("key_string", ImeIgraca);
            startActivity(quizIntent);
            finish();
        }
    }


}
