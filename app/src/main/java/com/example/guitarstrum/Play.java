package com.example.guitarstrum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Play extends AppCompatActivity {
    EditText strum;
    EditText chords;
    Button play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        strum=findViewById(R.id.strummingpattern);
        chords=findViewById(R.id.chordprogression);
        play=findViewById(R.id.play);
        strum.setText("Strum pattern is: "+cntdown+cntup+cntslap);

        /*
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ChooseChords.this, Play.class);
            }
        });
         */
    }
}