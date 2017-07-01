package com.dawn.assetsdawn;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

/**
 * Created by 90449 on 2017/7/1.
 */

public class AssetMusicActivity extends AppCompatActivity {
    Button btnStart;
    Button btnStop;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_music);
        btnStart = (Button) findViewById(R.id.btn_start);
        btnStop = (Button) findViewById(R.id.btn_stop);

        mediaPlayer = new MediaPlayer();
        try {
            AssetFileDescriptor assetFileDescriptor = getAssets().openFd("约定.mp3");
            mediaPlayer.reset();
            mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void Start(View view){
        mediaPlayer.start();
    }
    public void Stop(View view){
        mediaPlayer.stop();
    }

}
