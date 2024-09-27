package com.example.bai1_lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TinhTong extends AppCompatActivity {
    EditText etSoA, etSoB;
    Button btnTinhTong, btnTroVe, btnThoat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tinh_tong);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        AnhXa();
        btnTinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int soA = Integer.parseInt(etSoA.getText().toString());
                int soB = Integer.parseInt(etSoB.getText().toString());
                Toast.makeText(TinhTong.this, "Tong la: "+ (soA + soB), Toast.LENGTH_SHORT).show();
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnTroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TinhTong.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void AnhXa(){
        etSoA = findViewById(R.id.edSoA);
        etSoB = findViewById(R.id.edSoB);
        btnTinhTong = findViewById(R.id.btnTinhTong);
        btnTroVe = findViewById(R.id.btnBack);
        btnThoat = findViewById(R.id.btnThoat);
    }

}