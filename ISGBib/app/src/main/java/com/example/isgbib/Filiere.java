package com.example.isgbib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Filiere extends AppCompatActivity {
TextView nom;
RadioButton g1,g2,g3;
Button Ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_filiere);
        nom=findViewById(R.id.nom);
        g1=findViewById(R.id.g1);
        g2=findViewById(R.id.g2);
        g3=findViewById(R.id.g3);
        Ok=findViewById(R.id.Ok);
        String nn=getIntent().getStringExtra("nom");
        nom.setText("Bonjour "+nn);
        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(g1.isChecked()){
                    Intent i = new Intent(Filiere.this,Info.class);
                    startActivity(i);
                }
                else if(g2.isChecked()){
                    Intent i = new Intent(Filiere.this,Gestion.class);
                    startActivity(i);
                }
                else if(g3.isChecked()){
                    Intent i = new Intent(Filiere.this,Ico.class);
                    startActivity(i);
                }
            }
        });
    }

}