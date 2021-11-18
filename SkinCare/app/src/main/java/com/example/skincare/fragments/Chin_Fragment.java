package com.example.skincare.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skincare.adapters.Chin_Adapter;
import com.example.skincare.datas.Input_Chin;
import com.example.skincare.R;

public class Chin_Fragment extends Fragment {

    private Chin_Adapter adapter = new Chin_Adapter();
    private RecyclerView recyclerView;

    public static Chin_Fragment newInstance() {
        return new Chin_Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.chin_main, container, false);

        recyclerView = (RecyclerView) v.findViewById(R.id.chin_recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(adapter);

        adapter.setItems(new Input_Chin().getItems());

        return v;
    }
}
