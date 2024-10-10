package com.example.atividade2;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText edLarguraA;
    EditText edLarguraB;
    EditText edAlturaA;
    EditText edAlturaB;
    TextView tvPerimetro;
    TextView tvArea;
    Button btCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edLarguraA = findViewById(R.id.edLarguraA);
        edLarguraB = findViewById(R.id.edLarguraB);
        edAlturaA = findViewById(R.id.edAlturaA);
        edAlturaB = findViewById(R.id.edAlturaB);
        tvPerimetro = findViewById(R.id.tvPerimetro);
        tvArea = findViewById(R.id.tvArea);
        btCalcular = findViewById(R.id.btCalcular);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          
                double larguraA = Double.parseDouble(edLarguraA.getText().toString());
                double larguraB = Double.parseDouble(edLarguraB.getText().toString());
                double alturaA = Double.parseDouble(edAlturaA.getText().toString());
                double alturaB = Double.parseDouble(edAlturaB.getText().toString());

                double perimetro = 2 * (larguraA + larguraB + alturaA + alturaB);
                double area = larguraA * larguraB;

                tvPerimetro.setText(String.format("%.2f", perimetro));
                tvArea.setText(String.format("%.2f", area));
            }
        });
    }
}