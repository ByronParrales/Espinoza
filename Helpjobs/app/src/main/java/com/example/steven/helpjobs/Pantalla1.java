package com.example.steven.helpjobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pantalla1 extends AppCompatActivity {
    Button  btn1,btn2;
    EditText etusuario, etcontraseña;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);

        btn1 = (Button)findViewById(R.id.btn1);
        etusuario = (EditText)findViewById(R.id.etusuario);
        etcontraseña = (EditText)findViewById(R.id.etcontraseña);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(Pantalla1.this, Pantalla3.class);
                startActivity(intent1);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Pantalla1.this,Pantalla2.class);
                startActivity(intent2);
            }
        });
    }
}
