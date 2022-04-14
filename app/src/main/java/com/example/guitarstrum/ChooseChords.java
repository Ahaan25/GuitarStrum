package com.example.guitarstrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseChords extends AppCompatActivity {

    Button back;
    Button addchord;
    String strum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_chords);

        strum2=getIntent().getStringExtra("Strum Pattern: ");
        addchord=findViewById(R.id.addchords);
        addchord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addchords();
            }
        });

        back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back();
            }
        });
    }


    public void back(){
        Intent intent=new Intent(ChooseChords.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void addchords(){

        Intent intent=new Intent(ChooseChords.this, Play.class);
        intent.putExtra("Strum Pattern: ", strum2);
        startActivity(intent);
        finish();
    }

}