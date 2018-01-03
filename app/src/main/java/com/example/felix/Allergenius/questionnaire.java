package com.example.felix.Allergenius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class questionnaire extends AppCompatActivity {

    Button finished;
    CheckBox noAllergy;
    CheckBox yesAllergy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);

        finished = (Button) findViewById(R.id.button);
        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(questionnaire.this, SCREEN.class);
                startActivity(i);
            }
        });

    }
}
