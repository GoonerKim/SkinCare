package com.example.skincare.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skincare.adapters.Cheek_Adapter;
import com.example.skincare.datas.Input_Cheek;
import com.example.skincare.R;

public class Cheek_Fragment extends Fragment {

    private Cheek_Adapter adapter = new Cheek_Adapter();
    private RecyclerView recyclerView;

    public static Cheek_Fragment newInstance() {
        return new Cheek_Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.cheek_main, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.cheek_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(adapter);

        adapter.setItems(new Input_Cheek().getItems());

        return v;
    }
}
