package com.krytality.hamperhelper;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Constants();
        TextView textView = findViewById(R.id.info);

        // set intro text for users to read when opening the app
        textView.setText("Do you have a hard time understanding those mystical symbols on clothing tags? Don't worry, I do too! \n\n" +
                "This app is designed to decipher those crazy hieroglyphs to make washing clothes easier.\n\n" +
                "Like does this blouse have to stay out of the dryer or if that blazer you got has to be dry cleaned?\n\n" +
                "Hopefully this app helps you out!!\n\n" +
                "Click the button to begin");


        // set the button to transition to the next screen to use the main part of the app
        Button scanButton = findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, UserChoices.class));
            }
        });
    }
}
