package com.example.projectbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    EditText ed1, ed2;
    Button btn1, btn2, btn3, btn4;
    TextView tvresult;
    double angkaPertama, angkaKedua, hasil;
    String sAngkaPertama, sAngkaKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn2 = (Button)findViewById(R.id.btn3);
        tvresult = (TextView) findViewById(R.id.tvresult);
         ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = ed1.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(ed2.getText().toString());
                hasil = angkaPertama-angkaKedua;
                tvresult.setText("Hasil dari "+angkaPertama+" - "+angkaKedua+" = "+hasil);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = ed1.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(ed2.getText().toString());
                hasil = angkaPertama*angkaKedua;
                tvresult.setText("Hasil dari "+angkaPertama+" x "+angkaKedua+" = "+hasil);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sAngkaPertama = ed1.getText().toString();
                angkaPertama = Double.parseDouble(sAngkaPertama);
                angkaKedua = Double.parseDouble(ed2.getText().toString());
                hasil = angkaPertama / angkaKedua;
                tvresult.setText("Hasil dari " + angkaPertama + " / " + angkaKedua + " = " + hasil);
            }
        });

    }
}
