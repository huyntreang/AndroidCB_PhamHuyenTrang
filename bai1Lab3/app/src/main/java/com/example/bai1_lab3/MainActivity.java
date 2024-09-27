package com.example.bai1_lab3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnGoogleSearch, btnSearchLocation, btnManTinhTong, btnDSMonHoc;
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
        AnhXa();

        btnGoogleSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com.vn"));
                startActivity(mh);
            }
        });

        btnSearchLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.com/search?q=%C4%91%E1%BB%8Ba+%C4%91i%E1%BB%83m+%C4%91%E1%BA%A1i+h%E1%BB%8Dc+m%E1%BB%9F+h%C3%A0+n%E1%BB%99i&rlz=1C1KNTJ_enVN1125VN1125&oq=%C4%91%E1%BB%8Ba+%C4%91i%E1%BB%83m+%C4%91%E1%BA%A1i+h%E1%BB%8Dc+m%E1%BB%9F+h%C3%A0+n%E1%BB%99i&gs_lcrp=EgZjaHJvbWUqCggAEAAY4wIYgAQyCggAEAAY4wIYgAQyBwgBEC4YgAQyCAgCEAAYFhgeMgoIAxAAGIAEGKIEMgoIBBAAGIAEGKIEMgoIBRAAGIAEGKIEMgoIBhAAGIAEGKIE0gEINjcyN2owajeoAgiwAgE&sourceid=chrome&ie=UTF-8";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        btnManTinhTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TinhTong.class);
                startActivity(intent);
            }
        });

        btnDSMonHoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DanhSachMonHoc.class);
                startActivity(intent);
            }
        });
    }

    public void AnhXa() {
        btnGoogleSearch = findViewById(R.id.btnGoogleSearch);
        btnSearchLocation = findViewById(R.id.btnCheckDiaDiem);
        btnManTinhTong = findViewById(R.id.btnManHinhTinhTong);
        btnDSMonHoc = findViewById(R.id.btnDSMonHoc);
    }
}