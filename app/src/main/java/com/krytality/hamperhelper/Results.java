package com.krytality.hamperhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    LinearLayout ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        //ScrollView scrollView = findViewById(R.id.symbolList);

        ll  = findViewById(R.id.linearView);

        for(int i = 0; i < Constants.activeSymbols.length; i++)
        {
            if(Constants.activeSymbols[i])
            {
                TextView t = new TextView(this);
                t.setText(" - " + Constants.dict.get(i).toString());
                t.setTextSize(24);

                this.ll.addView(t);
            }
        }

        setupScanButton();



    }

    private void reset()
    {
        this.ll.removeAllViews();
    }

    private void setupScanButton()
    {
        Button scanButton = findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                startActivity(new Intent(Results.this, camera.class));
            }
        });
    }

}
