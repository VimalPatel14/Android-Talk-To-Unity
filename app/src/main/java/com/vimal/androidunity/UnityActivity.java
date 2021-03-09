package com.vimal.androidunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.unity3d.player.UnityPlayer;

import comvimal.unityproject.UnityPlayerActivity;

public class UnityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unity);

        Intent vimal = new Intent(UnityActivity.this, UnityPlayerActivity.class);
        vimal.putExtra("name","value");
        startActivity(vimal);
    }
}