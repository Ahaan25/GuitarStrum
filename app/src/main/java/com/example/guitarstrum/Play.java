package com.example.guitarstrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Play extends AppCompatActivity {
    TextView strum;
    TextView chords;
    Button play;
    String strum3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        strum=findViewById(R.id.strummingpattern);
        chords=findViewById(R.id.chordprogression);
        play=findViewById(R.id.play);
        //strum.setText("Strum pattern is: "+cntdown+cntup+cntslap);
        strum3=getIntent().getStringExtra("Strum Pattern: ");
        strum.setText(strum3);

    }
}