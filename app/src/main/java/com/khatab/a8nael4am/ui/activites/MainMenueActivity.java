package com.khatab.a8nael4am.ui.activites;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import com.khatab.a8nael4am.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainMenueActivity extends AppCompatActivity {

    @BindView(R.id.Menue_Icon)
    ImageButton MenueIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menue);
        ButterKnife.bind(this);


        VideoView videoView = findViewById(R.id.main_Vedio);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.mainvedios;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);





        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

    @OnClick(R.id.Menue_Icon)
    public void onViewClicked() {

        Intent i = new Intent(MainMenueActivity.this, FullMenueWithIcons.class);
        startActivity(i);

    }
}
