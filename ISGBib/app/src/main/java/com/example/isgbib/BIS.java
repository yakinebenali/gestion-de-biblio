package com.example.isgbib;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class BIS extends AppCompatActivity {
    GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bis);
        grid = findViewById(R.id.grid);

        ArrayList<String> data = new ArrayList<>();
        data.add("python");
        data.add("j2ee");
        data.add("c++");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Dialog dialog = new Dialog(BIS.this);
                    dialog.setContentView(R.layout.python);
                    dialog.show();
                }
                else if (position == 1) {
                    Dialog dialog = new Dialog(BIS.this);
                    dialog.setContentView(R.layout.j2ee);
                    dialog.show();
                }
                if (position == 2) {
                    Dialog dialog = new Dialog(BIS.this);
                    dialog.setContentView(R.layout.cplusplus);
                    dialog.show();
                }
            }




        });
    }
}