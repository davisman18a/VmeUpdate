package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class Organization_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization_info);
        Bundle b = getIntent().getExtras();
        Organizations organizations = (Organizations) b.getSerializable("organizations");

        ImageView pic = findViewById(R.id.pic);
        TextView name = findViewById(R.id.organization);
        TextView position = findViewById(R.id.position);
        TextView location = findViewById(R.id.location);

        pic.setImageResource(organizations.getImage());
        name.setText(organizations.getName());
        position.setText(organizations.getPosition());
        location.setText(organizations.getLocation());

        Button btn = findViewById(R.id.applybtn);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), Apply.class);
                startActivity(i);
            }
        });

        Button btn2 = findViewById(R.id.volunteersbtn);
        btn2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), VolunteerActivity.class);
                startActivity(i);
            }
        });
        GoogleSignInAccount account = MainActivity.GoogleSignInAccount1();

        Button btn1 = findViewById(R.id.contactusbtn);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(view.getContext(), ChatActivity.class);

                i.putExtra("user",account);
                    startActivity(i);

            }
        });
    }

}