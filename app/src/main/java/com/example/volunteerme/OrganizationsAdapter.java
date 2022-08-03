package com.example.volunteerme;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class OrganizationsAdapter extends RecyclerView.Adapter<OrganizationsViewHolder>{
    private List<Organizations> Organizations;
    public OrganizationsAdapter(List<Organizations> organizations)
    {
        this.Organizations = organizations;
    }
    @NonNull
    @Override
    public OrganizationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.organizations,parent,false);
        OrganizationsViewHolder viewh = new OrganizationsViewHolder(v);
        return viewh;
    }

    @Override
    public void onBindViewHolder(@NonNull OrganizationsViewHolder holder, int position) {
        Organizations organization = Organizations.get(position);

        holder.pic.setImageResource(organization.getImage());
        holder.organization.setText(organization.getName());
        holder.position.setText(organization.getPosition());
        holder.location.setText(organization.getLocation());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Organization_info.class);
                i.putExtra("organizations", organization);
                v.getContext().startActivity(i);
            }
        });
        }


    @Override
    public int getItemCount() {
        return Organizations.size();
    }
}
