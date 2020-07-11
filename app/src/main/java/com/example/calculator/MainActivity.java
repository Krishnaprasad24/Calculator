package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ranBtn =(Button)findViewById(R.id.rndButton);
        ranBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstnumEdittext = (EditText) findViewById(R.id.fisrtnumText);
                EditText secondnumEdittext = (EditText) findViewById(R.id.secondnumText);
                TextView resTextview = (TextView) findViewById(R.id.restextView);
                int startvalue = Integer.parseInt(firstnumEdittext.getText().toString());
                int endvalue = Integer.parseInt(secondnumEdittext.getText().toString());
                if (startvalue > endvalue)
                {
                    int temp = startvalue;
                    startvalue=endvalue;
                    endvalue=temp;
                }

                int result = (int) (Math.random() * (endvalue - startvalue + 1) + startvalue);
                String res=Integer.toString(result);
                resTextview.setText(res);
            }
        });
    }
}