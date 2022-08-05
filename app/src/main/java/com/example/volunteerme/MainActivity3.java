package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    OrganizationsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);

        List<Organizations> organizations = new ArrayList<Organizations>();
        organizations.add(new Organizations(R.drawable.doctors_wout_borders, "Doctors without Borders", "General Practitioner", "New York/Global"));
        organizations.add(new Organizations(R.drawable.intern_medical_corps, "International Medical Corps", "Cardiothoracic surgeon", "Ecuador"));
        organizations.add(new Organizations(R.drawable.intern_medical_relief, "International Medical Relief", "Neurosurgeon", "Israel/Kazakhstan"));
        organizations.add(new Organizations(R.drawable.mercy_ships, "Mercy Ships", "Physician", "Papua New Guinea"));
        organizations.add(new Organizations(R.drawable.moh, "Ministry of Health", "General Surgeon", "Bnei Brak"));
        organizations.add(new Organizations(R.drawable.project_hope, "Project Hope", "CardioSurgeon", "Zambia"));
        organizations.add(new Organizations(R.drawable.ta_medical_center, "Ichlov Medical Center", "Neurosurgeon", "Tel-Aviv Yafo"));

        RecyclerView recycler = findViewById(R.id.org_recycler);
        recycler.setHasFixedSize(false);

        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 1);
        recycler.setLayoutManager(manager);

        adapter = new OrganizationsAdapter(organizations);
        recycler.setAdapter(adapter);




    }
}