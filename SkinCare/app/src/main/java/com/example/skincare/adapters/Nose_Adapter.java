package com.example.skincare.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.skincare.activities.Nose_Show_Activity;
import com.example.skincare.datas.Nose;
import com.example.skincare.R;

import java.util.ArrayList;

public class Nose_Adapter extends RecyclerView.Adapter<Nose_Adapter.ViewHolder> {

    private ArrayList<Nose> items = new ArrayList<>();

    @NonNull
    @Override
    public Nose_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nose_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Nose_Adapter.ViewHolder viewHolder, int position) {

        final Nose item = items.get(position);

        Glide.with(viewHolder.itemView.getContext())
                .load(item.getImg())
                .into(viewHolder.img);

        viewHolder.title.setText(item.getTitle());

        viewHolder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Nose_Show_Activity.class);
                intent.putExtra("img", item.getImg());
                intent.putExtra("title", item.getTitle());
                intent.putExtra("content", item.getContent());
                intent.putExtra("care", item.getCare());
                ((Activity) v.getContext()).startActivityForResult(intent, Activity.RESULT_OK);
            }
        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(ArrayList<Nose> items) {
        this.items = items;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public final View view;
        ImageView img;
        TextView title;

        ViewHolder(View itemView) {
            super(itemView);
            view = itemView;

            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
        }
    }
}