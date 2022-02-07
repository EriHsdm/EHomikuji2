package com.eh.ehomikuji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button omikujiButton = findViewById(R.id.omikuji_button);
        omikujiButton.setOnClickListener(v -> {
            //  Log.v("MainActivity", "Button Clicked");
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ResultActivity.class);
            startActivity(intent);


            /*if( n == 0){
                resultTextView.setTextColor(Color.argb(255, 255, 0, 0));
            } else {
                resultTextView.setTextColor(Color.parseColor("#808080"));
            }

            resultTextView.text = unsei.get(n);
            }
            */
        });
    }
}