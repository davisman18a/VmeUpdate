package com.example.volunteerme;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class OrganizationsViewHolder extends RecyclerView.ViewHolder{
    public CardView card;
    public ImageView pic;
    public TextView organization;
    public TextView position;
    public TextView location;
    public OrganizationsViewHolder(@NonNull View itemView) {
        super(itemView);

        card = itemView.findViewById(R.id.org_card);
        pic = itemView.findViewById(R.id.pic);
        organization = itemView.findViewById(R.id.organization);
        position = itemView.findViewById(R.id.position);
        location = itemView.findViewById(R.id.location);

    }
}
