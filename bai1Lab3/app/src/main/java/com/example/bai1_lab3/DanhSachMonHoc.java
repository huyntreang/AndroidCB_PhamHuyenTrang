package com.example.bai1_lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class DanhSachMonHoc extends AppCompatActivity {
    ListView lstDSMonHoc;
    Button btnTroVe;
    ArrayList<String> arrMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_danh_sach_mon_hoc);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        AnhXa();

        btnTroVe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void AnhXa(){
        lstDSMonHoc = findViewById(R.id.lstDanhSach);
        btnTroVe = findViewById(R.id.btnTroVe);

        arrMonHoc = new ArrayList<>();
        arrMonHoc.add("Lập trình Web");
        arrMonHoc.add("Nhập môn khai phá dữ liệu và máy học");
        arrMonHoc.add("Android cơ bản");
        arrMonHoc.add("Giải tích 1");
        arrMonHoc.add("Đại số hình giải tích");

        ArrayAdapter adapter = new ArrayAdapter(DanhSachMonHoc.this, android.R.layout.simple_list_item_1,arrMonHoc);
        lstDSMonHoc.setAdapter(adapter);

    }

}