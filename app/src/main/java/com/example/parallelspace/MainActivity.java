package com.example.parallelspace;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button ytbtn, fbbtn, instabtn, twitterbtn, amazonbtn, flipkartbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ytbtn=findViewById(R.id.ytbtn);
        fbbtn=findViewById(R.id.fbbtn);
        instabtn=findViewById(R.id.instabtn);
        twitterbtn=findViewById(R.id.twitterbtn);
        amazonbtn=findViewById(R.id.amazonbtn);
        flipkartbtn=findViewById(R.id.flipkartbtn);

        ytbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, youtube.class);
                startActivity(i);

            }
        });

        fbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, facebook.class);
                startActivity(i);
            }
        });

        instabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, insta.class);
                startActivity(i);
            }
        });

        twitterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, twitter.class);
                startActivity(i);
            }
        });

        amazonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, amazon.class);
                startActivity(i);
            }
        });

        flipkartbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, flipkart.class);
                startActivity(i);
            }
        });

    }
}