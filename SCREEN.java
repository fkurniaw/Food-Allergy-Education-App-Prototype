package com.example.felix.myfirstapp;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

import java.lang.annotation.Target;

@TargetApi(14)
public class SCREEN extends AppCompatActivity {

    Button start;
    ImageView burger;
    ImageView salad;
    ImageView pizza;
    ImageView smoothie;
    ImageView muffin;
    TextView textbox3;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);

        burger = (ImageView) findViewById(R.id.burger);
        salad = (ImageView) findViewById(R.id.salad);
        pizza = (ImageView) findViewById(R.id.pizza);
        muffin = (ImageView) findViewById(R.id.muffin);
        smoothie = (ImageView) findViewById(R.id.smoothie);
        textbox3 = (TextView) findViewById(R.id.textView3);

        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                burger.setVisibility(View.VISIBLE);
                salad.setVisibility(View.VISIBLE);
                pizza.setVisibility(View.VISIBLE);
                muffin.setVisibility(View.VISIBLE);
                smoothie.setVisibility(View.VISIBLE);
                textbox3.setVisibility(View.VISIBLE);

                count++;

                if(count >= 2)
                {
                    Intent play = new Intent(SCREEN.this, game.class);
                    startActivity(play);
                }
            }


        });
    }
}
