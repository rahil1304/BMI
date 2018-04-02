package com.example.rahilsarvaiya.bmiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
    }

public void calculateBMI(View view){

    double height=0,weight=0;
    double bmi=0;
    String message="";


    EditText et1=(EditText)findViewById(R.id.editText1);
    EditText et2=(EditText)findViewById(R.id.editText2);

    Button b1=(Button)findViewById(R.id.button2);

    TextView t1=(TextView)findViewById(R.id.newText1);
    TextView t2=(TextView) findViewById(R.id.newText2);

    weight=Double.parseDouble(et1.getText().toString());
    height=Double.parseDouble((et2.getText().toString()));

    bmi=height*height;
    bmi=weight/bmi;

        DecimalFormat twoDForm = new DecimalFormat("#.##");
        bmi=Double.valueOf(twoDForm.format(bmi));


    t1.setText(String.valueOf(bmi));

    if(bmi<=18.5){
        message="Underweight";}
        else if(bmi>18.5 &&bmi<=22.9)
        {
            message="Normal";

        } else if (bmi >= 23 && bmi <= 24.9) {

        message="Overweight";
    } else if (bmi>=25&&bmi<=29.9)
    {
        message="Pre-obese";
    }
    else

            message="Obese";

    t2.setText(message);

    }
}
