package com.example.uriyasofshana;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    TextView tvPlayerName, tvRight, tvLeft;
    Button btnLeftSmallerRight, btnEqual, btnLeftBiggerRight;
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
        int count = 0;
        ArrayList<Questions> populateQuestions = new ArrayList<>(100);
        for (int i = 0;i < populateQuestions.size(); i ++){
            populateQuestions.set(i, new Questions());
        }

        tvRight = findViewById(R.id.tvRight);
        tvLeft = findViewById(R.id.tvLeft);
        btnEqual = findViewById(R.id.btnEqual);
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if
            }
        });
        btnLeftBiggerRight = findViewById(R.id.btnLeftBiggerRight);
        btnLeftSmallerRight = findViewById(R.id.btnLeftSmallerRight);
        for (int i = 0; i < 100; i ++){
            tvRight.setText(String.valueOf(populateQuestions.get(i).GetN1()));
            tvLeft.setText(String.valueOf(populateQuestions.get(i).GetN1()));
            btnEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (populateQuestions.get(i).GetN1()) {
                        count = count 1;
                    }
                }
            }
        }
    }
}