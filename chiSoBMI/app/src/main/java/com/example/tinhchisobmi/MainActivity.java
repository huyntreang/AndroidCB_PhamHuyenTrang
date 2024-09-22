package com.example.tinhchisobmi;

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

    EditText edtChieuCao, edtCanNang, edtTinhBMI, edtChuanDoan;
    Button btnTinhBMI;

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

        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtChieuCao.getText().toString().isEmpty() || edtCanNang.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Mời bạn nhập giá trị", Toast.LENGTH_SHORT).show();
                    edtTinhBMI.setText("Mời bạn nhập giá trị");
                }else{
                    try{
                        Float canNang = Float.parseFloat(edtCanNang.getText().toString());
                        Float chieuCao = Float.parseFloat(edtChieuCao.getText().toString());

                        if (chieuCao == 0){
                            Toast.makeText(MainActivity.this, "Vui lòng nhập chiều cao hợp lệ!", Toast.LENGTH_SHORT).show();
                            edtTinhBMI.setText("Vui lòng nhập chiều cao hợp lệ!");
                        }

                        Float BMI = canNang / (chieuCao * chieuCao);
                        String ketQua = String.valueOf(BMI);
                        edtTinhBMI.setText(ketQua);

                        if(BMI < 18){
                            edtChuanDoan.setText("Người gầy");
                        }else if(BMI>=18 && BMI <=24.9){
                            edtChuanDoan.setText("Người bình thường");
                        }else if(BMI>=25 && BMI <=29.9){
                            edtChuanDoan.setText("Người béo phì độ I");
                        }else if(BMI>=30 && BMI <=34.9){
                            edtChuanDoan.setText("Người béo phì độ II");
                        }else if(BMI>35){
                            edtChuanDoan.setText("Người béo phì độ III");
                        }
                    }catch(NumberFormatException e){
                        Toast.makeText(MainActivity.this, "Vui lòng nhập số hợp lệ", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }

    public void AnhXa(){
        edtChieuCao = findViewById(R.id.edChieuCao);
        edtCanNang = findViewById(R.id.edCanNang);
        btnTinhBMI = findViewById(R.id.btnTinhBMI);
        edtTinhBMI = findViewById(R.id.edTinhBMI);
        edtChuanDoan= findViewById(R.id.edChuanDoan);
    }

}