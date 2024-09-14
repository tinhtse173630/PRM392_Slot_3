package com.example.slot3;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity2 extends AppCompatActivity {

    //Khai bao
    TextView tnum1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);

        // Anh xa
        tnum1 = findViewById(R.id.tnum1);
        btn1 = findViewById(R.id.btn1);

        //code
        btn1.setOnClickListener(v -> tnum1.setText("hehe"));

    }
}