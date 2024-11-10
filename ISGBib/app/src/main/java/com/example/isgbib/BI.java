package com.example.isgbib;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

public class BI extends AppCompatActivity {
CardView card1,card2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bi);
        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(BI.this);
                dialog.setContentView(R.layout.python);
                dialog.show();
            }
        });
    }
}