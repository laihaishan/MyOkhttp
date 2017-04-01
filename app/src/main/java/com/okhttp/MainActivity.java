package com.okhttp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.nostra13.universalimageloader.core.ImageLoader;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * JSONObject demoJson = new JSONObject(jsonString);
 * JSONArray numberList = demoJson.getJSONArray("number");
 */
public class MainActivity extends Activity {

    private Button btn;
    private ImageView img;
    List<Video> videos = new ArrayList<Video>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        img = (ImageView) findViewById(R.id.img);

     /*   btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = videos.get(1).getImgUrl();
                ImageLoader.getInstance().displayImage("http://14.215.135.63:90/" + url, img);
            }
        });*/

        OkHttpUrl();
    }

    //网络请求
    private void OkHttpUrl() {
        OkHttpClient okHttpClient = new OkHttpClient();
        MultipartBuilder builder = new MultipartBuilder().type(MultipartBuilder.FORM);//类似于表单提交
        builder.addFormDataPart("pageIndex", "1");//参数
        builder.addFormDataPart("pageSize", "5");

        //构建请求体
        RequestBody requestBody = builder.build();
        //构建请求
        Request request = new Request.Builder()
                .url("http://192.168.43.158:8080/users.json")
                .post(requestBody)
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                Log.v("====", "===请求失败===" + e.toString());
            }

            @Override
            public void onResponse(Response response) throws IOException {
                String str = response.body().string();
                try {
                    JSONArray jsonArray = new JSONArray(str);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject object = (JSONObject) jsonArray.get(i);
                        Video video  = new Video();
                        video.setId(object.getInt("id"));
                        videos.add(video);
                    }
                    Log.v("=====", "===数量===" + videos.size());
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        });
    }

}
