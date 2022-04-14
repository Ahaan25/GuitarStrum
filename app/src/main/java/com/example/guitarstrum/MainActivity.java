package com.example.guitarstrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView strm;
    Button addchords;
    Button clear;
    Button addstrum;
    Button up;
    Button down;
    Button slap;
    int cntup;
    int cntdown;
    int cntslap;
    String strum1;
    String strum="";
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
        strum="";
        cntup=0;
        cntdown=0;
        cntslap=0;
    }

    public void AddStrum(){

        strm.setText("Strum pattern is: "+strum);
                Intent intent=new Intent(MainActivity.this, ChooseChords.class);
                strum1=strm.getText().toString();
                intent.putExtra("Strum Pattern: ", strum1);
                startActivity(intent);
                finish();
            }


    public void openChooseChords(){
        Intent intent=new Intent(this, ChooseChords.class);
        startActivity(intent);

    }

    public void addupstroke(){
        cntup++;
        strum+="U";
        strm.setText("Up: "+Integer.toString(cntup));

    }

    public void adddownstroke(){
        cntdown++;
        strum+="D";
        strm.setText("Down: "+Integer.toString(cntdown));
    }

    public void addslap(){
        cntslap++;
        strum+="S";
        strm.setText("Slap: "+Integer.toString(cntslap));
    }
}