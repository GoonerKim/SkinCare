package com.example.skincare.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skincare.adapters.Nose_Adapter;
import com.example.skincare.datas.Input_Nose;
import com.example.skincare.R;

public class Nose_Fragment extends Fragment {

    private Nose_Adapter adapter = new Nose_Adapter();
    private RecyclerView recyclerView;

    public static Nose_Fragment newInstance() {
        return new Nose_Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.nose_main, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.nose_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(adapter);

        adapter.setItems(new Input_Nose().getItems());

        return v;
    }
}


