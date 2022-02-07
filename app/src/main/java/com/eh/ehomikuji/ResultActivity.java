package com.eh.ehomikuji;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView resultTextView = findViewById(R.id.result_text_view);

        //配列宣言
        String unsei = "";

        //ランダム宣言
        Random random = new Random();

        switch(random.nextInt(5)) {
            case 0:
                unsei = "大吉";
                break;
            case 1:
                unsei = "中吉";
                break;
            case 2:
                unsei = "小吉";
                break;
            case 3:
                unsei = "吉";
                break;
            case 4:
                unsei = "凶";
                break;
            case 5:
                unsei = "大凶";
                break;
        }

        resultTextView.setText(unsei);

        //  Toast.makeText(MainActivity.this, unsei, Toast.LENGTH_SHORT).show();
    }
}
