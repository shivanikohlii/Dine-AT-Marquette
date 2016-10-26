package com.cosc1020.coscfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

import org.w3c.dom.Text;

public class Checkout extends AppCompatActivity {

    //Creating a variable for our random number generator
    Random gen = new Random();

    //Setting a random 8 digit number to a variable
    int num = gen.nextInt(100000000) + 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        //Once this activity is created, get all the extra string data from the previous intent
        Bundle cart = getIntent().getExtras();

        //Setting the components to variables
        TextView textName = (TextView) findViewById(R.id.textName);
        TextView textNumber = (TextView) findViewById(R.id.textNumber);
        TextView textCheckout = (TextView) findViewById(R.id.textCheckout);


        //Checking to see if the cart itself has no elements
        if(cart == null)
            return;

        //Setting all the string data from the Extras
        String finalCart = cart.getString("order");
        String firstName = cart.getString("first");
        String lastName = cart.getString("last");

        //These two lines will change the first character of the first and last name to be uppercase
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        //Setting the TextViews with the right data.
        textName.setText("Name: " + firstName + " " + lastName);
        textNumber.setText("Your order number is: " + num);
        textCheckout.setText("Order: " + finalCart);


    }
}
