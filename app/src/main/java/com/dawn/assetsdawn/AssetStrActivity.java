package com.dawn.assetsdawn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 90449 on 2017/7/1.
 */

public class AssetStrActivity extends AppCompatActivity {
    private TextView tvContent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asset_str);
        tvContent = (TextView) findViewById(R.id.tv_content);
        try {
            InputStream inputStream = getAssets().open("dawn/dawn.txt");
            String str = nputStreamTOString(inputStream, "utf8");
            tvContent.setText(str);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 将InputStream转换成某种字符编码的String
     * @param in
     * @param encoding
     * @return
     * @throws Exception
     */
    public static String nputStreamTOString(InputStream in,String encoding) throws Exception{

        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        byte[] data = new byte[1024 * 4];
        int count = -1;
        while((count = in.read(data,0,1024 * 4)) != -1)
            outStream.write(data, 0, count);

        data = null;
        return new String(outStream.toByteArray(),encoding);
    }
}
