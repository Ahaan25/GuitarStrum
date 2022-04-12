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
                strm.setText(null);
            }
        });

        addstrum=findViewById(R.id.addstrum);
        addstrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddStrum();
            }
        });

    }

    public void AddStrum(){
        strm.setText("a");
    }

    public void openChooseChords(){
        Intent intent=new Intent(this, ChooseChords.class);
        startActivity(intent);
    }
}