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

    }

    public void openChooseChords(){
        Intent intent=new Intent(this, ChooseChords.class);
        startActivity(intent);
    }
}

/*
Widgets declared
    public Button up=(Button) findViewById(R.id.up);
    public Button down=(Button) findViewById(R.id.down);
    public Button slap=(Button) findViewById(R.id.slap);
    public Button clear=(Button) findViewById(R.id.clear);
    public Button strum=(Button) findViewById(R.id.button);
    public EditText strumpattern=(EditText) findViewById(R.id.StrumPattern);
 */


/*
Clear button code
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                strumpattern.setText(null);
            }
        });

 */