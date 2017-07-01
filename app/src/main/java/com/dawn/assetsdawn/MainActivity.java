package com.dawn.assetsdawn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void jumpToAssetWeb(View view){
        startActivity(new Intent(this, AssetWebActivity.class));
    }
    public void jumpToAssetManager(View view){
        startActivity(new Intent(this, AssetManagerActivity.class));
    }
    public void jumpToAssetImage(View view){
        startActivity(new Intent(this, AssetImageActivity.class));
    }
    public void jumpToAssetMusic(View view){
        startActivity(new Intent(this, AssetMusicActivity.class));
    }
    public void jumpToAssetCopy(View view){
        startActivity(new Intent(this, AssetCopyActivity.class));
    }
    public void jumpToAssetStr(View view){
        startActivity(new Intent(this, AssetStrActivity.class));
    }
}
