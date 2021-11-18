package com.example.skincare.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skincare.adapters.Forehead_Adapter;
import com.example.skincare.datas.Input_Forehead;
import com.example.skincare.R;

public class Forehead_Fragment extends Fragment {

    private Forehead_Adapter adapter = new Forehead_Adapter();
    private RecyclerView recyclerView;

    public static Forehead_Fragment newInstance() {
        return new Forehead_Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.forehead_main, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.forehead_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(adapter);

        adapter.setItems(new Input_Forehead().getItems());

        return v;
    }
}
