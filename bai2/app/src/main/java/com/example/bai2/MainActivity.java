package com.example.bai2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgvHinhAnh;
    TextView txtvAnimal;
    ArrayList<Integer> arrHinh;
    ProgressBar prgBar;
    ConstraintLayout loading;
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

        arrHinh = new ArrayList<>();
        arrHinh.add(R.drawable.chimcanhcut);
        arrHinh.add(R.drawable.hinhanh1);
        arrHinh.add(R.drawable.hinhanh2);
        arrHinh.add(R.drawable.hinhanh3);

        Random random = new Random();
        int vitriHinh = random.nextInt(arrHinh.size());
        imgvHinhAnh.setImageResource(arrHinh.get(vitriHinh));

        prgBar.getProgress();

    }

    public void AnhXa(){
        imgvHinhAnh = findViewById(R.id.imgvHinhAnh);
        txtvAnimal = findViewById(R.id.txtvAnimal);
        prgBar = findViewById(R.id.prgBarLoading);
    }
}