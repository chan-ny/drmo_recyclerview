package com.example.drmo_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private static final String TAG = "Adapter";

    private ArrayList<String> mImageName= new ArrayList<>();
    private ArrayList<String> mImage= new ArrayList<>();
    private ArrayList<String> mDetail= new ArrayList<>();
    private Context context;

    public Adapter( Context context,ArrayList<String> mImageName, ArrayList<String> mImage, ArrayList<String> mDetail) {
        this.mImageName = mImageName;
        this.mImage = mImage;
        this.mDetail = mDetail;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context)
                .load(mImage.get(position))
                .into(holder.image);
           holder.image_name.setText(mImageName.get(position));
           holder.detail.setText(mDetail.get(position));
           holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Toast.makeText(context,mImageName.get(position),Toast.LENGTH_LONG).show();
                   Intent intent = new Intent(context , Detail.class);
                   intent.putExtra("image",mImage.get(position));
                   intent.putExtra("name",mImageName.get(position));
                   intent.putExtra("detail",mDetail.get(position));
                   context.startActivity(intent);
               }
           });
    }

    @Override
    public int getItemCount() {
        return mImageName.size();
    }

    public  class  ViewHolder  extends RecyclerView.ViewHolder{

       CircleImageView image;
       TextView image_name,detail;
       RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            image_name=itemView.findViewById(R.id.image_name);
            detail = itemView.findViewById(R.id.t_detail);
            relativeLayout = itemView.findViewById(R.id.panel_relative);
        }
    }
}
