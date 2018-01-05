package com.example.code.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butondrugi = findViewById(R.id.drugo_dugme);
        Button butontreci = findViewById(R.id.trece_dugme);
        TextView prvitekst = findViewById(R.id.rezultat1);
        TextView drugitekst = findViewById(R.id.rezultat2);

        Button butonprvi = findViewById(R.id.prvo_dugme);
        butonprvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
