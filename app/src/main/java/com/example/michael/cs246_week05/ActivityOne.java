package com.example.michael.cs246_week05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_one);

        Button btn = (Button)findViewById(R.id.refButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityTwo.class);

                EditText book = (EditText) findViewById(R.id.bookText);
                EditText chap = (EditText) findViewById(R.id.chapterText);
                EditText verse = (EditText) findViewById(R.id.verseText);

                intent.putExtra("userBook", book.getText().toString());
                intent.putExtra("userChapter", chap.getText().toString());
                intent.putExtra("userVerse", verse.getText().toString());

                startActivity(intent);
            }
        });
    }
}
