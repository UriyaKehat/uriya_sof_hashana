package com.example.uriyasofshana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    int k = 0;
    int countRight = 0;
    int count = 0;
    TextView tvPlayerName, tvRight, tvLeft;
    String userName;
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
        tvPlayerName = findViewById(R.id.tvPlayerName);
        userName = getIntent().getStringExtra("UserName");
        tvPlayerName.setText("hello" + userName );
        ArrayList<Questions> populateQuestions = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            populateQuestions.add( new Questions());
        }
        tvRight = findViewById(R.id.tvRight);
        tvLeft = findViewById(R.id.tvLeft);
        btnEqual = findViewById(R.id.btnEqual);
        btnLeftBiggerRight = findViewById(R.id.btnLeftBiggerRight);
        btnLeftSmallerRight = findViewById(R.id.btnLeftSmallerRight);
        btnScore = findViewById(R.id.btnScore);
        tvRight.setText(String.valueOf(populateQuestions.get(k).GetN1()));
        tvLeft.setText(String.valueOf(populateQuestions.get(k).GetN2()));
        btnEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (populateQuestions.get(k).GetN1() == populateQuestions.get(k).GetN2()) {
                        countRight++;
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                    k++;
                    tvRight.setText(String.valueOf(populateQuestions.get(k).GetN1()));
                    tvLeft.setText(String.valueOf(populateQuestions.get(k).GetN2()));
                    count++;
                }
            });
            btnLeftBiggerRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (populateQuestions.get(k).GetN1() < populateQuestions.get(k).GetN2()) {
                        countRight++;
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                    k++;
                    tvRight.setText(String.valueOf(populateQuestions.get(k).GetN1()));
                    tvLeft.setText(String.valueOf(populateQuestions.get(k).GetN2()));
                    count++;
                }
            });
            btnLeftSmallerRight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (populateQuestions.get(k).GetN1() > populateQuestions.get(k).GetN2()) {
                        countRight++;
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Wrong!", Toast.LENGTH_SHORT).show();
                    }
                    k++;
                    tvRight.setText(String.valueOf(populateQuestions.get(k).GetN1()));
                    tvLeft.setText(String.valueOf(populateQuestions.get(k).GetN2()));
                    count++;
                }
            });
        btnScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int percent;
                percent = ( (countRight* 100)/count) ;
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("UserName",userName);
                intent.putExtra("scorePercent", percent);
                startActivity(intent);
            }
        });
    }
}
