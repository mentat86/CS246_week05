package com.example.michael.cs246_week05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_two);

        String book = getIntent().getStringExtra("userBook");
        String chapter = getIntent().getStringExtra("userChapter");
        String verse = getIntent().getStringExtra("userVerse");

        TextView passage = (TextView)findViewById(R.id.passageLabel);
        passage.setText(book + " " + chapter + ":" + verse);
    }
}
