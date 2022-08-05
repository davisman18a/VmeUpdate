package com.example.volunteerme;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CommentsActivity extends AppCompatActivity {

    GoogleSignInAccount account;
    CommentsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comments);

        Bundle extras = getIntent().getExtras();
        Image image = (Image) extras.getSerializable("image");
        account = MainActivity.GoogleSignInAccount1();

        adapter = new CommentsAdapter(image.Id);
        RecyclerView recycler = findViewById(R.id.chatRV_c);
        recycler.setHasFixedSize(false);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(),1);
        recycler.setLayoutManager(manager);

        recycler.setAdapter(adapter);

        FloatingActionButton btn = findViewById(R.id.addCommentBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                EditText text = findViewById(R.id.commentET);
                Comment m = new Comment(account.getPhotoUrl().toString(),account.getDisplayName(),account.getId(),text.getText().toString());
                adapter.addComment(m);
                text.setText("");
            }
        });
    }
}