package com.cosc1020.coscfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    /**
     * This method will run once the user clicks the button to login, and will take them to the main menu
     * @param v The view
     */
    public void Login(View v) {

        //Setting the two components to variables
        EditText textEmail = (EditText) findViewById(R.id.textEmail);
        EditText textPass = (EditText) findViewById(R.id.textPass);

        //Checking to see if the text fields have the right data and are not null.
        if (textEmail.getText().toString().contains("@marquette.edu") && textPass.getText().toString() != null) {

            //Creating an intent to move to the next screen
            Intent i = new Intent(this, restaurant_menu.class);

            //Placing all our string data as extra data and sending it to the next screen
            i.putExtra("email", textEmail.getText().toString());
            i.putExtra("first", textEmail.getText().toString().substring(0,textEmail.getText().toString().indexOf(".")));
            i.putExtra("last", textEmail.getText().toString().substring(textEmail.getText().toString().indexOf(".") + 1,textEmail.getText().toString().indexOf("@")));

            //Starting the next activity
            startActivity(i);
        }

        else if(!(textEmail.getText().toString().contains("@marquette.edu")))
        {
            textEmail.setText("Invalid Email");
        }

        else if (textPass.getText().toString().equals(""))
        {
            textPass.setText("Invalid Password");
        }
    }


}
