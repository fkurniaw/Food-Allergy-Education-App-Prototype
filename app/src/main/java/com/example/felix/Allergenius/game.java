package com.example.felix.Allergenius;

import android.annotation.TargetApi;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@TargetApi(11)
public class game extends AppCompatActivity {

    Button firstaid;
    Button smoothieButton;
    Button pizzaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        firstaid = (Button) findViewById(R.id.firstaid);
        firstaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(game.this, firstaid.class);
                startActivity(i);
            }
        });

       smoothieButton = (Button) findViewById(R.id.smoothieButton);
       smoothieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(game.this, smoothiePopUp.class);
                startActivity(i);
            }
        });

        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        pizzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(game.this, smoothiePopUp.class);
                startActivity(i);
            }
        });

    }

}
