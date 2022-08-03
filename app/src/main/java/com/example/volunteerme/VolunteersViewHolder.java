package com.example.volunteerme;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class VolunteersViewHolder extends RecyclerView.ViewHolder {
    public CardView card;
    public ImageView avatar;
    public TextView name;
    public TextView degree;
    public TextView occupation;

    public VolunteersViewHolder(@NonNull View itemView) {
        super(itemView);
        card = itemView.findViewById(R.id.card);
        avatar = itemView.findViewById(R.id.avatar);
        name = itemView.findViewById(R.id.name);
        degree = itemView.findViewById(R.id.degree);
        occupation = itemView.findViewById(R.id.occupation);


    }
}
