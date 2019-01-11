package com.example.sergio.gallery;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Menu> listMenu;
    private RecyclerOnClickListener OnCLick;

    public Adapter(ArrayList<Menu> listMenu, RecyclerOnClickListener OnClick) {
        this.listMenu = listMenu;
        this.OnCLick = OnClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view,viewGroup,false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Menu menu = listMenu.get(i);
        viewHolder.bind(menu,OnCLick);
    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }
}
