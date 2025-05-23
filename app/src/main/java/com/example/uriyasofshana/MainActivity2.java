package com.example.uriyasofshana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView tvPlayerName, tvRight, tvLeft;
    Button btnLeftSmallerRight, btnEqual, btnLeftBiggerRight, btnScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvPlayerName.setText(getIntent().getStringExtra("UserName"));
        int count = 0;
        ArrayList<Questions> populateQuestions = new ArrayList<>(100);
        for (int i = 0; i < populateQuestions.size(); i++) {
            populateQuestions.set(i, new Questions());
        }
        tvRight = findViewById(R.id.tvRight);
        tvLeft = findViewById(R.id.tvLeft);
        btnEqual = findViewById(R.id.btnEqual);
        btnLeftBiggerRight = findViewById(R.id.btnLeftBiggerRight);
        btnLeftSmallerRight = findViewById(R.id.btnLeftSmallerRight);
        btnScore = findViewById(R.id.btnScore);
        for (int i = 0; i <= 100; i++) {
            int k = i;
            tvRight.setText(String.valueOf(populateQuestions.get(i).GetN1()));
            tvLeft.setText(String.valueOf(populateQuestions.get(i).GetN1()));
            btnEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (populateQuestions.get(k).GetN1() == populateQuestions.get(k).GetN2()) {
                        count++;
                    }
                }
            });
            btnLeftBiggerRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (populateQuestions.get(k).GetN1() < populateQuestions.get(k).GetN2()) {
                        count++;
                    }
                }
            });
            btnLeftSmallerRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (populateQuestions.get(k).GetN1() > populateQuestions.get(k).GetN2()) {
                        count++;
                    }
                }
            });
        }
        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
