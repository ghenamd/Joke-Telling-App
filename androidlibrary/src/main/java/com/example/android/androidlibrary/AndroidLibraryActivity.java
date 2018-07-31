package com.example.android.androidlibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity   {
    private final String JOKE = "joke";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library);
        String joke = getIntent().getStringExtra(JOKE);
        if (joke == null || TextUtils.isEmpty(joke)){
            joke = "No jokes retrieved";
        }
        TextView textView = findViewById(R.id.jokeText);
        textView.setText(joke);

    }
}
