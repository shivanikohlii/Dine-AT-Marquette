package com.cosc1020.coscfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Bagels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bagels);
    }


     public void Checkout(View v){
     Intent i = new Intent(this,Checkout.class);

     Bundle names = getIntent().getExtras();
     i.putExtras(names);
     RadioButton rb = (RadioButton) findViewById(R.id.radioAsiago);
     RadioButton rb2 = (RadioButton) findViewById(R.id.radioPower);
     RadioButton rb3 = (RadioButton) findViewById(R.id.radioSour);
     RadioButton rb4 = (RadioButton) findViewById(R.id.radioHoney);
     RadioButton rb5 = (RadioButton) findViewById(R.id.radioCin);
     RadioButton rb6 = (RadioButton) findViewById(R.id.radioChocolate);
     RadioButton rb7 = (RadioButton) findViewById(R.id.radioPlain);
     RadioButton rb8 = (RadioButton) findViewById(R.id.radioBlue);
     RadioButton rb9 = (RadioButton) findViewById(R.id.radioEverything);

     RadioButton rb10 = (RadioButton) findViewById(R.id.radioPlainSpread);
     RadioButton rb11 = (RadioButton) findViewById(R.id.radioOnion);
     RadioButton rb12 = (RadioButton) findViewById(R.id.radioSmoked);
     RadioButton rb13 = (RadioButton) findViewById(R.id.radioReduced);
     RadioButton rb14 = (RadioButton) findViewById(R.id.radioStrawberry);
     RadioButton rb15 = (RadioButton) findViewById(R.id.radioAlmond);
     RadioButton rb16 = (RadioButton) findViewById(R.id.radioSalsa);
     RadioButton rb17 = (RadioButton) findViewById(R.id.radioGarden);
     RadioButton rb18 = (RadioButton) findViewById(R.id.radioGarlic);

     String order;

     if(rb.isChecked())
         order = rb.getText().toString() + " bagel";
     else if(rb2.isChecked())
         order = rb2.getText().toString()+ " bagel";
     else if(rb3.isChecked())
         order = rb3.getText().toString()+ " bagel";
     else if(rb4.isChecked())
         order = rb4.getText().toString()+ " bagel";
     else if(rb5.isChecked())
         order = rb5.getText().toString()+ " bagel";
     else if(rb6.isChecked())
         order = rb6.getText().toString()+ " bagel";
     else if(rb7.isChecked())
         order = rb7.getText().toString()+ " bagel";
     else if(rb8.isChecked())
         order = rb8.getText().toString()+ " bagel";
     else if(rb9.isChecked())
         order = rb9.getText().toString()+ " bagel";
     else
        order = "No Bagel";


    if(rb10.isChecked())
        order = order + " and " + rb10.getText().toString();
    else if(rb11.isChecked())
        order = order + " and " + rb11.getText().toString();
    else if(rb12.isChecked())
        order = order + " and " + rb12.getText().toString();
    else if(rb13.isChecked())
        order = order + " and " + rb13.getText().toString();
    else if(rb14.isChecked())
        order = order + " and " + rb14.getText().toString();
    else if(rb15.isChecked())
        order = order + " and " +  rb15.getText().toString();
    else if(rb16.isChecked())
        order = order + " " + rb16.getText().toString();
    else if(rb17.isChecked())
        order = order + " and " + rb17.getText().toString();
    else if(rb18.isChecked())
        order = order + " and " + rb18.getText().toString();
    else
        order = order + " and no spread";

     i.putExtra("order", order);
     startActivity(i);
    }


}