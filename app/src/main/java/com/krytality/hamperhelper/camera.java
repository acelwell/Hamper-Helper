package com.krytality.hamperhelper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class camera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        //TextView textView = findViewById(R.id.temp);

        setStage();

        setButtons();
        setWashButtons();
        setWringButtons();
        setBleachButtons();
        setDryingButtons();
        setIroningButtons();
        setDryCleaningButtons();

    }

    private void setStage()
    {
        for(int i = 0; i < Constants.activeSymbols.length; i++)
        {
            Constants.activeSymbols[i] = false;
        }
    }

    private void setClick(final int i, final int shift, final ImageButton ib)
    {
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constants.activeSymbols[i + shift] = !Constants.activeSymbols[i + shift];
                //System.out.println(Constants.activeSymbols[i + shift]);

                System.out.println(ib.getBackground());


                if(Constants.activeSymbols[i+shift])
                {
                    ib.setBackgroundColor(Color.GREEN);
                }
                else
                {
                    ib.setBackgroundColor(Color.WHITE);
                }
            }
        });
    }

    private void setDryCleaningButtons()
    {
        ImageButton dryclean1 = findViewById(R.id.imageButton9);
        ImageButton dryclean2 = findViewById(R.id.imageButton10);
        ImageButton dryclean3 = findViewById(R.id.imageButton11);
        ImageButton dryclean4 = findViewById(R.id.imageButton12);

        ImageButton dryclean5 = findViewById(R.id.imageButton13);
        ImageButton dryclean6 = findViewById(R.id.imageButton14);
        ImageButton dryclean7 = findViewById(R.id.imageButton15);
        ImageButton dryclean8 = findViewById(R.id.imageButton16);

        ImageButton dryclean9 = findViewById(R.id.imageButton17);
        ImageButton dryclean10 = findViewById(R.id.imageButton18);
        ImageButton dryclean11 = findViewById(R.id.imageButton19);
        ImageButton dryclean12 = findViewById(R.id.imageButton20);

        ImageButton dryclean13 = findViewById(R.id.imageButton21);


        List<ImageButton> buttonList = new ArrayList<>();

        buttonList.add(dryclean1);
        buttonList.add(dryclean2);
        buttonList.add(dryclean3);
        buttonList.add(dryclean4);

        buttonList.add(dryclean5);
        buttonList.add(dryclean6);
        buttonList.add(dryclean7);
        buttonList.add(dryclean8);

        buttonList.add(dryclean9);
        buttonList.add(dryclean10);
        buttonList.add(dryclean11);
        buttonList.add(dryclean12);

        buttonList.add(dryclean13);

        final int shift = 48;
        for(int i = 0; i < buttonList.size(); i++) {
            setClick(i, shift, buttonList.get(i));
            ((ViewGroup.MarginLayoutParams) buttonList.get(i).getLayoutParams()).setMargins(7,7,7,7);
        }
    }

    private void setIroningButtons()
    {
        ImageButton iron1 = findViewById(R.id.imageButton68);
        ImageButton iron2 = findViewById(R.id.imageButton69);
        ImageButton iron3 = findViewById(R.id.imageButton70);
        ImageButton iron4 = findViewById(R.id.imageButton71);

        ImageButton iron5 = findViewById(R.id.imageButton6);
        ImageButton iron6 = findViewById(R.id.imageButton7);
        ImageButton iron7 = findViewById(R.id.imageButton8);


        List<ImageButton> buttonList = new ArrayList<>();

        buttonList.add(iron1);
        buttonList.add(iron2);
        buttonList.add(iron3);
        buttonList.add(iron4);

        buttonList.add(iron5);
        buttonList.add(iron6);
        buttonList.add(iron7);


        final int shift = 41;
        for(int i = 0; i < buttonList.size(); i++) {
            setClick(i, shift, buttonList.get(i));
            ((ViewGroup.MarginLayoutParams) buttonList.get(i).getLayoutParams()).setMargins(7,7,7,7);
        }
    }

    private void setDryingButtons()
    {
        ImageButton dry1 = findViewById(R.id.imageButton39);
        ImageButton dry2 = findViewById(R.id.imageButton40);
        ImageButton dry3 = findViewById(R.id.imageButton41);
        ImageButton dry4 = findViewById(R.id.imageButton42);
        ImageButton dry5 = findViewById(R.id.imageButton43);

        ImageButton dry6 = findViewById(R.id.imageButton44);
        ImageButton dry7 = findViewById(R.id.imageButton45);
        ImageButton dry8 = findViewById(R.id.imageButton46);
        ImageButton dry9 = findViewById(R.id.imageButton);
        ImageButton dry10 = findViewById(R.id.imageButton2);

        ImageButton dry11 = findViewById(R.id.imageButton62);
        ImageButton dry12 = findViewById(R.id.imageButton63);
        ImageButton dry13 = findViewById(R.id.imageButton64);
        ImageButton dry14 = findViewById(R.id.imageButton3);
        ImageButton dry15 = findViewById(R.id.imageButton4);


        List<ImageButton> buttonList = new ArrayList<>();

        buttonList.add(dry1);
        buttonList.add(dry2);
        buttonList.add(dry3);
        buttonList.add(dry4);
        buttonList.add(dry5);

        buttonList.add(dry6);
        buttonList.add(dry7);
        buttonList.add(dry8);
        buttonList.add(dry9);
        buttonList.add(dry10);

        buttonList.add(dry11);
        buttonList.add(dry12);
        buttonList.add(dry13);
        buttonList.add(dry14);
        buttonList.add(dry15);

        final int shift = 26;
        for(int i = 0; i < buttonList.size(); i++) {
            setClick(i, shift, buttonList.get(i));
            ((ViewGroup.MarginLayoutParams) buttonList.get(i).getLayoutParams()).setMargins(7,7,7,7);
        }
    }


    private void setBleachButtons()
    {

        ImageButton bleach1 = findViewById(R.id.imageButton65);
        ImageButton bleach2 = findViewById(R.id.imageButton66);
        ImageButton bleach3 = findViewById(R.id.imageButton67);
        ImageButton bleach4 = findViewById(R.id.imageButton5);


        List<ImageButton> buttonList = new ArrayList<>();

        buttonList.add(bleach1);
        buttonList.add(bleach2);
        buttonList.add(bleach3);
        buttonList.add(bleach4);


        final int shift = 22;
        for(int i = 0; i < buttonList.size(); i++) {
            setClick(i, shift, buttonList.get(i));
            ((ViewGroup.MarginLayoutParams) buttonList.get(i).getLayoutParams()).setMargins(7,7,7,7);
        }
    }


//


    private void setWringButtons()
    {
        ImageButton wring1 = findViewById(R.id.imageButton22);
        ImageButton wring2 = findViewById(R.id.imageButton23);


        List<ImageButton> buttonList = new ArrayList<>();

        buttonList.add(wring1);
        buttonList.add(wring2);

        final int shift = 20;
        for(int i = 0; i < buttonList.size(); i++) {
            setClick(i, shift, buttonList.get(i));
            ((ViewGroup.MarginLayoutParams) buttonList.get(i).getLayoutParams()).setMargins(7,7,7,7);
        }

    }

    private void setWashButtons()
    {
        ImageButton wash1 = findViewById(R.id.imageButton104);
        ImageButton wash2 = findViewById(R.id.imageButton105);
        ImageButton wash3 = findViewById(R.id.imageButton106);
        ImageButton wash4 = findViewById(R.id.imageButton107);

        ImageButton wash5 = findViewById(R.id.imageButton29);
        ImageButton wash6 = findViewById(R.id.imageButton30);
        ImageButton wash7 = findViewById(R.id.imageButton31);
        ImageButton wash8 = findViewById(R.id.imageButton32);

        ImageButton wash9 = findViewById(R.id.imageButton34);
        ImageButton wash10 = findViewById(R.id.imageButton35);
        ImageButton wash11 = findViewById(R.id.imageButton73);
        ImageButton wash12 = findViewById(R.id.imageButton74);

        ImageButton wash13 = findViewById(R.id.imageButton37);
        ImageButton wash14 = findViewById(R.id.imageButton38);
        ImageButton wash15 = findViewById(R.id.imageButton77);
        ImageButton wash16 = findViewById(R.id.imageButton75);

        ImageButton wash17 = findViewById(R.id.imageButton25);
        ImageButton wash18 = findViewById(R.id.imageButton26);
        ImageButton wash19 = findViewById(R.id.imageButton27);
        ImageButton wash20 = findViewById(R.id.imageButton28);

        List<ImageButton> buttonList = new ArrayList<>();

        buttonList.add(wash1);
        buttonList.add(wash2);
        buttonList.add(wash3);
        buttonList.add(wash4);

        buttonList.add(wash5);
        buttonList.add(wash6);
        buttonList.add(wash7);
        buttonList.add(wash8);

        buttonList.add(wash9);
        buttonList.add(wash10);
        buttonList.add(wash11);
        buttonList.add(wash12);

        buttonList.add(wash13);
        buttonList.add(wash14);
        buttonList.add(wash15);
        buttonList.add(wash16);

        buttonList.add(wash17);
        buttonList.add(wash18);
        buttonList.add(wash19);
        buttonList.add(wash20);

        final int shift = 0;
        for(int i = 0; i < buttonList.size(); i++) {
            setClick(i, shift, buttonList.get(i));
            //((ViewGroup.MarginLayoutParams) buttonList.get(i).getLayoutParams()).setMargins(7,7,7,7);
        }


    }

    private void setButtons()
    {


        Button confirmButton = findViewById(R.id.confirmButton);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(camera.this, Results.class));
            }
        });
    }

    private void finished()
    {
        startActivity(new Intent(camera.this, Results.class));
    }
}
