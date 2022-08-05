package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Apply extends AppCompatActivity  {

    EditText name;
    EditText degree;
    EditText occupation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);


        Button applybtn = findViewById(R.id.btn);
        applybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = (EditText) findViewById(R.id.name);
                degree = (EditText) findViewById(R.id.degree);
                occupation = (EditText) findViewById(R.id.occupation);

                Volunteers volunteer = new Volunteers(R.drawable.chrstina_yang, SecurityHelper.Encrypt(name.getText().toString()), SecurityHelper.Encrypt(degree.getText().toString()),  SecurityHelper.Encrypt(occupation.getText().toString()));
                Intent result = new Intent();
                result.putExtra("user", volunteer);
                setResult(1, result);
                finish();
                Toast.makeText(Apply.this, "Application succeeded", Toast.LENGTH_LONG).show();


            }
        });
    }

}
