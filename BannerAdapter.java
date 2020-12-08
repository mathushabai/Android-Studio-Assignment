package com.example.moviebooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BannerAdapter extends RecyclerView.Adapter<BannerAdapter.ViewHolder> {

    private List<Banner> imgs;
    Context ctx;


    public BannerAdapter(Context ctx, List<Banner> imgs) {
        this.imgs = imgs;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public BannerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.banner_item,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BannerAdapter.ViewHolder holder, int position) {
        holder.bannerImg.setImageResource(imgs.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return imgs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView bannerImg;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            bannerImg = itemView.findViewById(R.id.bannerimg);
        }
    }
}
