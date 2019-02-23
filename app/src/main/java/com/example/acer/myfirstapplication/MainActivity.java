package com.example.acer.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText editname;
    Button clickbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // internally it looks at content of xml file

            //bind the id to variables
        editname = findViewById(R.id.iname);
        clickbutton = findViewById(R.id.button);

    }
    //call this method when user taps the button
    public void sendMessage(View view) { //it is a view object that is clicked
        //do something on response
        String passname = editname.getText().toString();  //to get text from user and store in pname
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("Name",passname); //pass the entered name

        startActivity(intent);
    }
}
