package com.example.sergio.gallery;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends DialogFragment {
    private View view;
    private TextView textView;
    private RecyclerView recyclerView;
    private ImageView imageView;
    private ArrayList<Menu> listMenu;
    private Adapter adapter;
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blank, container, false);

        textView = view.findViewById(R.id.imageTitle);
        imageView = view.findViewById(R.id.imageView);
        recyclerView = view.findViewById(R.id.recyclerview);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        listMenu = new Menu().listMenu();

        adapter = new Adapter(listMenu, new RecyclerOnClickListener() {
            @Override
            public void OnClickListener(Menu menu) {
                Glide.with(view.getContext()).load(menu.getIdImage()).into(imageView);
                textView.setText(menu.getNameImage());
            }
        });
        recyclerView.setAdapter(adapter);
        return view;
    }

}
