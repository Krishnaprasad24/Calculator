package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Attempt to launch addition
        Button cadd = (Button) findViewById(R.id.cadd);
        cadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),MainActivity2.class);
                startIntent.putExtra("com.example.calculator.SOMETHING","HELLO WORLD");
                startActivity(startIntent);
            }
        });

        //Attempt to launch multiplication
        Button cmulti = (Button) findViewById(R.id.cmulti);
        cmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),MainActivity3.class);
                startIntent.putExtra("com.example.calculator.SOMETHING","HELLO WORLD");
                        startActivity(startIntent);
            }
        });

        //Attempt to launch random number
        Button crand = (Button) findViewById(R.id.crand);
        crand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),MainActivity4.class);
                startIntent.putExtra("com.example.calculator.SOMETHING","HELLO WORLD");
                        startActivity(startIntent);
            }
        });
    }
}