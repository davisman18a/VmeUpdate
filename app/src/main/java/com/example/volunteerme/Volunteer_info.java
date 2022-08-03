package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Volunteer_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_info);


        Bundle b = getIntent().getExtras();
        Volunteers volunteer = (Volunteers) b.getSerializable("volunteers");

        ImageView pic = findViewById(R.id.avatar);
        TextView name = findViewById(R.id.name);
        TextView degree = findViewById(R.id.degree);
        TextView occupation = findViewById(R.id.occupation);

        pic.setImageResource(volunteer.getImage());
        name.setText(volunteer.getName());
        degree.setText(volunteer.getDegree());
        occupation.setText(volunteer.getOccupation());


        Button picbtn = findViewById(R.id.picturesbtn);
        picbtn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent i = new Intent(Volunteer_info.this, PicActivity.class);
                Bundle data1 = new Bundle();
                i.putExtra("image", data1);
                startActivity(i);


            }
        });
    }
}