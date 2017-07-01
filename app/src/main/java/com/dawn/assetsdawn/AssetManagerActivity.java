package com.dawn.assetsdawn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by 90449 on 2017/7/1.
 */

public class AssetManagerActivity extends AppCompatActivity {
    TextView tvContent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_manager);
        tvContent = (TextView) findViewById(R.id.tv_content);
        try {
            getAssets().open("index.html");
            String[] fileNames = getAssets().list("dawn");
            String fileNameStr = "file name = ";
            for(int i = 0; i < fileNames.length; i ++){
                fileNameStr += fileNames[i] + " ";
            }
            tvContent.setText(fileNameStr);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
