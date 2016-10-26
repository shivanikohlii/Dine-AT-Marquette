package com.cosc1020.coscfinal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class restaurant_menu extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_menu);

    }

    public void onSandwich(View v){
        Intent i = new Intent(this,Sandwiches.class);
        Bundle names = getIntent().getExtras();
        i.putExtras(names);

        startActivity(i);

    }

    public void onBagel(View v){
        Intent i = new Intent(this,Bagels.class);
        Bundle names = getIntent().getExtras();
        i.putExtras(names);

        startActivity(i);
    }

    public void onGrill(View v){
        Intent i = new Intent(this,Grill.class);
        Bundle names = getIntent().getExtras();
        i.putExtras(names);

        startActivity(i);
    }

    public void Timings(View view)
    {
        Intent i = new Intent(this, Timings.class);
        startActivity(i);
    }


}


