package com.example.sergio.gallery;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageLoad);
    }
    public void bind(final Menu menu, final RecyclerOnClickListener OnCLick){
        Glide.with(imageView.getContext()).load(menu.getIdImage()).into(imageView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v!=null)
                    OnCLick.OnClickListener(menu);
            }
        });
    }
}
