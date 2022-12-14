package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OrganizationActivity extends AppCompatActivity {

    OrganizationsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer);
        DataPersistencyHelper.Context = getApplicationContext();
        List<Organizations> organizations = DataPersistencyHelper.LoadData1();



        RecyclerView recycler = findViewById(R.id.org_recycler);
        recycler.setHasFixedSize(false);

        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 1);
        recycler.setLayoutManager(manager);

        adapter = new OrganizationsAdapter(organizations);
        recycler.setAdapter(adapter);




    }
}