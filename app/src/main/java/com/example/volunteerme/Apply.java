package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Apply extends AppCompatActivity implements View.OnClickListener {

    EditText name;
    EditText degree;
    EditText occupation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);

        name = (EditText)findViewById(R.id.name);
        degree= (EditText)findViewById(R.id.degree);
        occupation = (EditText)findViewById(R.id.occupation);


        Button applybtn = findViewById(R.id.btn);
        applybtn.setOnClickListener(this);

        }

    @Override
    public void onClick(View view) {
        Toast.makeText(Apply.this, "Application succeeded", Toast.LENGTH_LONG).show();

    }
}
