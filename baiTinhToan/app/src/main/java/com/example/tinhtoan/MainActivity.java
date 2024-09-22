package com.example.tinhtoan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtSoA, edtSoB;
    TextView txtKetQua;
    Button btnTong, btnHieu, btnTich, btnThuong, btnUocChung, btnThoat;
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

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhTong();
            }
        });

        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhHieu();
            }
        });

        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhTich();
            }
        });

        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tinhThuong();
            }
        });

        btnUocChung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timUCLN();
            }
        });

        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void AnhXa(){
        edtSoA = findViewById(R.id.edtSoA);
        edtSoB = findViewById(R.id.edtSoB);
        txtKetQua = findViewById(R.id.txtKetQua);
        btnTong = findViewById(R.id.tinhTong);
        btnHieu = findViewById(R.id.tinhHieu);
        btnTich = findViewById(R.id.tinhTich);
        btnThuong = findViewById(R.id.tinhThuong);
        btnThoat = findViewById(R.id.btntThoat);
        btnUocChung = findViewById(R.id.tinhUCLN);
    }

    public void tinhTong(){
        int a = Integer.parseInt(edtSoA.getText()+"");
        int b = Integer.parseInt(edtSoB.getText()+"");
        int kqua = a+b;
        txtKetQua.setText(String.valueOf(kqua));
    }

    public void tinhHieu(){
        int a = Integer.parseInt(edtSoA.getText()+"");
        int b = Integer.parseInt(edtSoB.getText()+"");
        int kqua = a-b;
        txtKetQua.setText(String.valueOf(kqua));
    }

    public void tinhTich(){
        int a = Integer.parseInt(edtSoA.getText()+"");
        int b = Integer.parseInt(edtSoB.getText()+"");
        int kqua = a*b;
        txtKetQua.setText(String.valueOf(kqua));
    }

    public void tinhThuong(){
        int a = Integer.parseInt(edtSoA.getText()+"");
        int b = Integer.parseInt(edtSoB.getText()+"");
        int kqua = a/b;
        txtKetQua.setText(String.valueOf(kqua));
    }

    public void timUCLN() {
        int a = Integer.parseInt(edtSoA.getText() + "");
        int b = Integer.parseInt(edtSoB.getText() + "");
        int x = 1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i ==0 && b%i==0){
                x=i;
            }
        }
        txtKetQua.setText(String.valueOf(x));
    }
}