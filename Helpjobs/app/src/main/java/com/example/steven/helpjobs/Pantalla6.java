package com.example.steven.helpjobs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Pantalla6 extends AppCompatActivity {
    ImageButton imgButtonfor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla6);

        imgButtonfor = (ImageButton)findViewById(R.id.imgButtonfor);
        imgButtonfor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"HOLA", Toast.LENGTH_LONG).show();
            }
        });
    }
}
