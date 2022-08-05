package com.example.volunteerme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.analytics.FirebaseAnalytics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PicActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;
    private ImageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        RecyclerView rv = findViewById(R.id.images);
        adapter = new ImageAdapter();
        rv.setHasFixedSize(false);
        RecyclerView.LayoutManager manager = new GridLayoutManager(getApplicationContext(), 4);
        rv.setLayoutManager(manager);
        rv.setAdapter(adapter);

    }
}