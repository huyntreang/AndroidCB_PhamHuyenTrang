package com.example.bai1;

import android.os.Bundle;
import android.widget.ImageView;
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
    ConstraintLayout ConstraintBackground;

    ArrayList<Integer> arrBackground;
    int[] arrIcon ={R.drawable.chimcanhcut, R.drawable.hinhanh1, R.drawable.hinhanh2, R.drawable.hinhanh3};

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

        arrBackground = new ArrayList<>();
        arrBackground.add(R.color.black);
        arrBackground.add(R.color.white);
        arrBackground.add(R.color.red);
        arrBackground.add(R.color.lime);
        arrBackground.add(R.color.blue);
        arrBackground.add(R.color.yellow);
        arrBackground.add(R.color.gray);
        arrBackground.add(R.color.silver);
        arrBackground.add(R.color.olive);
        arrBackground.add(R.color.green);
        arrBackground.add(R.color.purple);
        arrBackground.add(R.color.teal);

        Random random = new Random();
        int randomBack = random.nextInt(arrBackground.size());
        ConstraintBackground.setBackgroundResource(arrBackground.get(randomBack));

        int randomIcon = random.nextInt(arrIcon.length);
        imgvHinhAnh.setImageResource(arrIcon[randomIcon]);
    }

    public void AnhXa(){
        imgvHinhAnh = findViewById(R.id.imgvHinhAnh);
        txtvAnimal = findViewById(R.id.txtvAnimal);
        ConstraintBackground = findViewById(R.id.main);
    }

}