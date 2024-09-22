package com.example.chuyennhietdo;

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

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView Fehrenheit, Celsius;
    EditText edtText, edtText2;
    Button btnCelsius, btnFahrenheit, btnClear;
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

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtText.setText("");
                edtText2.setText("");
            }
        });

        btnCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    float giaTriDoF = Float.parseFloat(edtText.getText().toString());
                    float congThuc = (((giaTriDoF) - 32) * 5/9);
                    String ketQua = String.valueOf(congThuc);
                    edtText2.setText(ketQua + "°C");
            }
        });

        btnFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float giaTriDoC = Float.parseFloat(edtText2.getText().toString());
                float congThuc = (giaTriDoC* 9/5 + 32);
                String ketQua = String.valueOf(congThuc);
                edtText.setText(ketQua + "°F");
            }
        });
    }

    public void AnhXa(){
        Fehrenheit = (TextView) findViewById(R.id.Fehrenheit);
        Celsius = (TextView) findViewById(R.id.Celsius);
        edtText = (EditText) findViewById(R.id.edtText);
        edtText2 = (EditText) findViewById(R.id.edtText2);
        btnCelsius = (Button) findViewById(R.id.btnCelsius);
        btnFahrenheit = (Button) findViewById(R.id.btnFahrenheit);
        btnClear = (Button) findViewById(R.id.btnClear);
    }

}