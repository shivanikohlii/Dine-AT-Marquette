package com.cosc1020.coscfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.ToggleButton;



public class Grill extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grill);
    }

    public void Checkout(View v) {
        Intent i = new Intent(this, Checkout.class);

        Bundle names = getIntent().getExtras();

        i.putExtras(names);

        String order;

        RadioButton radioTender = (RadioButton) findViewById(R.id.chickenTenders);
        RadioButton radioTurkey = (RadioButton) findViewById(R.id.turkeyBurger);
        RadioButton radioGrilled = (RadioButton) findViewById(R.id.grilledCheese);
        RadioButton radioQuarter = (RadioButton) findViewById(R.id.burger);
        RadioButton radioHalf = (RadioButton) findViewById(R.id.cheeseBurger);

        CheckBox toggleFries = (CheckBox) findViewById(R.id.fries);


        if (radioTender.isChecked())
            order = radioTender.getText().toString();
        else if (radioTurkey.isChecked())
            order = radioTurkey.getText().toString();
        else if(radioGrilled.isChecked())
            order = radioGrilled.getText().toString();
        else if(radioQuarter.isChecked())
            order = radioQuarter.getText().toString();
        else if(radioHalf.isChecked())
            order = radioHalf.getText().toString();
        else
            order = "No Order";

        if(toggleFries.isChecked()) {
            order = order + " w/Fries";
        }
        else{
            order = order + " without Fries";
        }


        i.putExtra("order",order);


        startActivity(i);
    }

}
