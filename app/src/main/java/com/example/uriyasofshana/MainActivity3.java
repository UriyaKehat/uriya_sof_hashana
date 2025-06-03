package com.example.uriyasofshana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class MainActivity3 extends AppCompatActivity {
    String[] motivation;
    Random random = new Random();
    int randomNumber = random.nextInt(6);
    Button btnGoBack;
    Adapter adapter;
    RecyclerView recyclerView;
    private String[] gamesPoints;
    String name;
    int scorePercent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        motivation = new String[6];
        motivation[0] = "Well Done!";
        motivation[1] = "Good Job!";
        motivation[2] = "Very Good!";
        motivation[3] = "Keep Going!";
        motivation[4] = "Breaking Records!";
        motivation[5] = "World Champion Level!";
        name = (getIntent().getStringExtra("UserName"));
        scorePercent = getIntent().getIntExtra("scorePercent", 0);
        //gamesPoints = new String[100];
        //for (int i = 0;i < gamesPoints.length; i++){
            //gamesPoints[i] =
        name + "| Score Percent " + scorePercent + " | " + motivation[randomNumber];
        //}
        btnGoBack = findViewById(R.id.btnGoBack);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        gamesPoints = getallfromdatabase;
        this.recyclerView = findViewById(R.id.RecyclerView);
        adapter = new Adapter(MainActivity3.this, gamesPoints);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity3.this));
        recyclerView.setAdapter(adapter);
    }
}