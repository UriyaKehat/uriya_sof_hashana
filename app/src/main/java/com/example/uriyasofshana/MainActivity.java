package com.example.uriyasofshana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button btn1;

    public final static String KEY_INTENT="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String U1 = "1", P1 = "1";
        String U2 = "Shakked", P2 = "4321";
        String U3 = "Raday", P3 = "0000";
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((et1.getText().toString().equals(U1) && et2.getText().toString().equals(P1)) || (et1.getText().toString().equals(U2) && et2.getText().toString().equals(P2)) || (et1.getText().toString().equals(U3) && et2.getText().toString().equals(P3))) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("UserName", et1.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}