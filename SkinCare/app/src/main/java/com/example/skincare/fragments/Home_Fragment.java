package com.example.skincare.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.skincare.activities.MainActivity;
import com.example.skincare.R;

public class Home_Fragment extends Fragment {

    Button forehead, cheek, nose, chin;

    public static Home_Fragment newInstance() {
        return new Home_Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.home_main, container, false);

        forehead =(Button) v.findViewById(R.id.forehead);
        forehead.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                ((MainActivity)getActivity()).replaceFragment(Forehead_Fragment.newInstance());
            }
        });

        cheek =(Button) v.findViewById(R.id.cheek);
        cheek.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                ((MainActivity)getActivity()).replaceFragment(Cheek_Fragment.newInstance());
            }
        });

        nose =(Button) v.findViewById(R.id.nose);
        nose.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                ((MainActivity)getActivity()).replaceFragment(Nose_Fragment.newInstance());
            }
        });

        chin =(Button) v.findViewById(R.id.chin);
        chin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View view){
                ((MainActivity)getActivity()).replaceFragment(Chin_Fragment.newInstance());
            }
        });

        return v;
    }

}

