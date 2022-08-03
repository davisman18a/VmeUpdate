package com.example.volunteerme;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VolunteersAdapter extends RecyclerView.Adapter<VolunteersViewHolder>{
    private List<Volunteers> Volunteers;
    public VolunteersAdapter(List<Volunteers> volunteers)
    {
        this.Volunteers = volunteers;
    }
    @NonNull
    @Override
    public VolunteersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.volunteers,parent,false);
        VolunteersViewHolder vh = new VolunteersViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VolunteersViewHolder holder, int position) {
        Volunteers volunteer = Volunteers.get(position);

        holder.avatar.setImageResource(volunteer.getImage());
        holder.name.setText(volunteer.getName());
        holder.degree.setText(volunteer.getDegree());
        holder.occupation.setText(volunteer.getOccupation());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Volunteer_info.class);
                i.putExtra("volunteers", volunteer);
                v.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return Volunteers.size();
    }
    }

