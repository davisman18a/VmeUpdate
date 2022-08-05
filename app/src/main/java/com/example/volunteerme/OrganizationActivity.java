package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OrganizationActivity extends AppCompatActivity {

    VolunteersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization);

        List<Volunteers> volunteer = new ArrayList<Volunteers>();
        volunteer.add(new Volunteers(R.drawable.alon_davis, "Alon Davis", "General Practitioner", "MD"));
        volunteer.add(new Volunteers(R.drawable.chrstina_yang, "Chrstina Yang", "Cardiothoracic surgeon", "MD,PhD, FACS"));
        volunteer.add(new Volunteers(R.drawable.derek_shepherd, "Derek Shepherd", "Neurosurgeon", "MD, FACS"));
        volunteer.add(new Volunteers(R.drawable.ken_jeong, "Ken Jeong", "Physician", "MD"));
        volunteer.add(new Volunteers(R.drawable.meredith_grey, "Meredith Grey", "General Surgeon", "MD, FACS"));
        volunteer.add(new Volunteers(R.drawable.sheldon_cooper, "Sheldon Cooper", "Theoretical Physicist", "PhD"));
        volunteer.add(new Volunteers(R.drawable.steven_strange, "Steven Strange", "Neurosurgeon", "MD, PhD"));

        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(false);

        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 1);
        recycler.setLayoutManager(manager);

        adapter = new VolunteersAdapter(volunteer);
        recycler.setAdapter(adapter);


        }
}