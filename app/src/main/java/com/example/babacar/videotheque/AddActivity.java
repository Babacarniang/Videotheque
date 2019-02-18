package com.example.babacar.videotheque;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.babacar.videotheque.R;

public class AddActivity extends AppCompatActivity {

    private Button send;
    private EditText nom;
    private EditText synopsis_du_film;
    private EditText annee;
    private EditText image_illustrative;
    private EditText type;
    private EditText prix;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        send=findViewById(R.id.btnenreg);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}

