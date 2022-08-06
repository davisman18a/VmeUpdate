package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class VolunteerActivity extends AppCompatActivity {

    VolunteersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization);

        DataPersistencyHelper.Context = getApplicationContext();
        List<Volunteers> volunteer = DataPersistencyHelper.LoadData();

        RecyclerView recycler = findViewById(R.id.recycler);
        recycler.setHasFixedSize(false);

        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 1);
        recycler.setLayoutManager(manager);

        adapter = new VolunteersAdapter(volunteer);
        recycler.setAdapter(adapter);


        }
}