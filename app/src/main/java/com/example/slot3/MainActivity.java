package com.example.slot3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    // khai bao bien
    TextView txtNoidung;
    Button but1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

       // anh xa
        txtNoidung = (TextView) findViewById(R.id.textView);
        but1 = (Button) findViewById(R.id.btn1);

        // code

        //Bat su kien button
//        but1.setOnClickListener(v -> txtNoidung.setText("Hello World") );

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNoidung.setText("Hello World");
            }
        });
//        txtNoidung.setText("Hello World");
    }
}