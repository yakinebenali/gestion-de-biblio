package com.example.isgbib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pwd;
    Button SIn, SendEmail;
    TextView SUp;
    ImageView Call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.user);
        pwd = findViewById(R.id.pwd);
        SIn = findViewById(R.id.SIn);
        SUp = findViewById(R.id.SUp);
        Call = findViewById(R.id.Call);
        SendEmail = findViewById(R.id.SendEmail);  // Reference the new button

        SIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = user.getText().toString();
                String p = pwd.getText().toString();

                if (n.equalsIgnoreCase("yakine") && p.equalsIgnoreCase("yakine")) {
                    Toast.makeText(MainActivity.this, "Accès donné", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, Filiere.class);
                    i.putExtra("nom", n);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Accès refusé", Toast.LENGTH_LONG).show();
                }
            }
        });

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:20993368"));
                startActivity(i);
            }
        });

        SendEmail.setOnClickListener(new View.OnClickListener() {  // Set up email button
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:yakinebenali5@mail.com"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Besoin d'assistance");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Bonjour,\n\nJ'ai besoin d'assistance.");
                startActivity(Intent.createChooser(emailIntent, "Choisissez une application d'email"));
            }
        });
    }
}
