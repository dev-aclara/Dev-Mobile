package com.example.projeto01;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txt;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bootStrap();
    }
    @SuppressLint("SetTextI18n")
    public void btnOkClick(View v){
        txt.setText("Click!");
    }
    @SuppressLint("SetTextI18n")
    private void bootStrap(){
        txt = findViewById(R.id.txtTexto);
        btnOk = findViewById(R.id.btnOk);
        txt.setText("Ana Clara");
    }
}