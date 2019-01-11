package com.example.sergio.gallery;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btngo= findViewById(R.id.button);
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getSupportFragmentManager();
                BlankFragment fragmen = new BlankFragment();
                fragmen.setStyle(BlankFragment.STYLE_NO_TITLE,R.style.transparent);
                fragmen.show(manager,"");
            }
        });
    }
}
