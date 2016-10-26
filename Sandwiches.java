package com.cosc1020.coscfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Sandwiches extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);
    }

    public void Checkout(View v){
        Intent i = new Intent(this, Checkout.class);

        Bundle names = getIntent().getExtras();
        i.putExtras(names);

        final String order;

        RadioButton radioComet = (RadioButton) findViewById(R.id.radioComet);
        RadioButton radioBornk = (RadioButton) findViewById(R.id.radioBornk);
        RadioButton radioJacob = (RadioButton) findViewById(R.id.radioJacob);
        RadioButton radioBoney = (RadioButton) findViewById(R.id.radioBoney);

        EditText editMinus = (EditText) findViewById(R.id.editMinus);

        String modifications;

        if(editMinus.getText().toString().equals(""))
            modifications = "Nothing";
        else
            modifications = editMinus.getText().toString();

        if(radioComet.isChecked())
            order = radioComet.getText().toString().substring(0,radioComet.getText().toString().indexOf(":"));
        else if(radioBornk.isChecked())
            order = radioBornk.getText().toString().substring(0, radioBornk.getText().toString().indexOf(":"));
        else if(radioJacob.isChecked())
            order = radioJacob.getText().toString().substring(0, radioJacob.getText().toString().indexOf(":"));
        else if(radioBoney.isChecked())
            order = radioBoney.getText().toString().substring(0, radioBoney.getText().toString().indexOf(":"));
        else
            order = "No sandwich.";


        i.putExtra("order", order + " minus " + modifications);

        startActivity(i);
    }
}
