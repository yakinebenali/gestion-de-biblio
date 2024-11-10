package com.example.isgbib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;

public class Info extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        list = findViewById(R.id.list);
        ArrayList<String> data = new ArrayList<>();
        data.add("EB");
        data.add("BIS");
        data.add("BI");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent i = new Intent(Info.this, EB.class);
                    startActivity(i);
                } else if (position == 1) {
                    Intent i = new Intent(Info.this, BIS.class);
                    startActivity(i);
                } else if (position == 2) {
                    Intent i = new Intent(Info.this, BI.class);
                    startActivity(i);
                }
            }

            ;
        });
    }
}