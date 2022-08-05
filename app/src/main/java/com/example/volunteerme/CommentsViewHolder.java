package com.example.volunteerme;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CommentsViewHolder extends RecyclerView.ViewHolder {

    public ImageView userImage;
    public TextView userName;
    public TextView message;

    public CommentsViewHolder(@NonNull View itemView) {
        super(itemView);

        userImage = itemView.findViewById(R.id.userImage_c);
        userName = itemView.findViewById(R.id.userTV_c);
        message = itemView.findViewById(R.id.messageText_c);
    }
}
