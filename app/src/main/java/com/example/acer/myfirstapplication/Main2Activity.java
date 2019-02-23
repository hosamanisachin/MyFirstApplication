package com.example.acer.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textname = findViewById(R.id.dname);

        Intent intent = getIntent();
        String getname= intent.getStringExtra("Name");

        textname.setText("Name"+getname);
    }
}
