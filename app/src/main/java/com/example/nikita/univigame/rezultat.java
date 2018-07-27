package com.example.nikita.univigame;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class rezultat extends AppCompatActivity {
    Button button7, button9;
    rezultat tekactiviti;
    TextView textView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_rezultat);
        //  Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
//        getSupportActionBar().hide();
          tekactiviti=this;
        Intent intent = getIntent();

        String fName = intent.getStringExtra("record");


        textView8 = (TextView) findViewById(R.id.textView8);
        button9 = (Button) findViewById(R.id.button9);
        button7 = (Button) findViewById(R.id.button7);

        textView8.setText(fName);

        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View r) {
               onBackPressed();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View r) {
                onBackPressed();
                Intent intent = new Intent(tekactiviti, game.class);
                startActivity(intent);
            }
        });

    }

}
