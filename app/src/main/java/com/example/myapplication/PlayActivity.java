package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class PlayActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        videoView=findViewById(R.id.video_view);

Uri videoUri= Uri.parse(getIntent().getExtras().getString("videoUri"));
videoView.setVideoURI(videoUri);
videoView.start();

    }
}
