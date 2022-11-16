package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


       TextView welcomeView , counterView;
      Button btn;
      int counter = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.buttonView);
        welcomeView = findViewById(R.id.wlecome);
        counterView = findViewById(R.id.counterTextView);


        // Adding the functionalities

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counterView.setText(" "+ increasCounter()); // calling method when ever click on button
            }
        });
    }


    // creating method
     public int increasCounter(){
       return  ++counter;
     }
}