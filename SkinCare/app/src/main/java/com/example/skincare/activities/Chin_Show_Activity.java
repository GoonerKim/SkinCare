package com.example.skincare.activities;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.skincare.R;

public class Chin_Show_Activity extends AppCompatActivity {

    ImageView chin_img;
    TextView chin_title, chin_content;
    String url, title, content, care;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chin_show);

        Intent intent = getIntent();

        url = intent.getStringExtra("img");
        title = intent.getStringExtra("title");
        content = intent.getStringExtra("content");
        care = intent.getStringExtra("care");

        chin_img = (ImageView) findViewById(R.id.img);
        chin_title = (TextView) findViewById(R.id.title);
        chin_content = (TextView) findViewById(R.id.content);

        Glide.with(this).load(url).into(chin_img);
        chin_title.setText(title);
        chin_content.setText(content);

        confirm = (Button) findViewById(R.id.confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createDialog();
            }
        });
    }

    public void createDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this, R.style.MyDialogTheme);

        builder.setTitle("관리 방법");
        builder.setMessage(care);

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }

}