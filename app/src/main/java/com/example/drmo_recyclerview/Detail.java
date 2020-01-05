package com.example.drmo_recyclerview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    private static final String TAG = "Detail";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        getcomingIntent();
    }
    private  void  getcomingIntent(){

        if(getIntent().hasExtra("image") && getIntent().hasExtra("name")){

            String image = getIntent().getStringExtra("image");
            String name = getIntent().getStringExtra("name");
            String detail = getIntent().getStringExtra("detail");

            setimage(image,name,detail);

        }
    }
    private  void  setimage( String imageurl,String imagename,String dt){
        TextView name = findViewById(R.id.detail_name);
        name.setText(imagename);
        TextView detail = findViewById(R.id.t_Detail);
        detail.setText(dt);
        ImageView imges = findViewById(R.id.detail_image);

        Glide.with(this)
                .asBitmap()
                .load(imageurl)
                .into(imges);
    }
}
