package com.example.guitarstrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText strm;
    Button addchords;
    Button clear;
    Button addstrum;
    Button up;
    Button down;
    Button slap;
    int cntup;
    int cntdown;
    int cntslap;
    int strum=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addchords=findViewById(R.id.button);
        addchords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openChooseChords();
            }
        });

        clear=findViewById(R.id.clear);
        strm=findViewById(R.id.StrumPattern);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearstrum();
            }
        });

        addstrum=findViewById(R.id.addstrum);
        addstrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddStrum();
            }
        });

        up=findViewById(R.id.up);
        down=findViewById(R.id.down);
        slap=findViewById(R.id.slap);

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addupstroke();
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adddownstroke();
            }
        });

        slap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addslap();
            }
        });
    }

    public void clearstrum(){
        strm.setText(null);
        strum=0;
        cntup=0;
        cntdown=0;
        cntslap=0;
    }

    public void AddStrum(){
        strum=cntup+cntslap+cntdown;
        //strm.setText("Total strums: "+Integer.toString(strum));
        strm.setText("Strum pattern is: "+cntdown+cntup+cntslap);
    }

    public void openChooseChords(){
        Intent intent=new Intent(this, ChooseChords.class);
        startActivity(intent);
    }

    public void addupstroke(){
        cntup++;
        strm.setText("Up: "+Integer.toString(cntup));

    }

    public void adddownstroke(){
        cntdown++;
        strm.setText("Down: "+Integer.toString(cntdown));
    }

    public void addslap(){
        cntslap++;
        strm.setText("Slap: "+Integer.toString(cntslap));
    }
}