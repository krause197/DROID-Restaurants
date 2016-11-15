package com.epicodus.restaurants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mFindRestaruantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFindRestaruantsButton = (Button) findViewById(R.id.findRestaurandButton);
            mFindRestaruantsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   Toast.makeText(MainActivity.this, "Welcome to PDX", Toast.LENGTH_LONG).show();
                }
            });
    }
}
