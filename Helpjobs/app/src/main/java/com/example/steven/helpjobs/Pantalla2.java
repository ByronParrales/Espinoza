package com.example.steven.helpjobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Pantalla2 extends AppCompatActivity {
    Button btn1;
    EditText etnombre,etapellido, etemail, etcontraseña,etconf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        btn1 =(Button)findViewById(R.id.btn1);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 =new Intent(Pantalla2.this, Pantalla1.class);
                startActivity(intent1);
            }
        });
    }
}
