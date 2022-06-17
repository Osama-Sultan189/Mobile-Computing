package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class displayDua extends AppCompatActivity {
    int position;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dua);
        img=findViewById(R.id.img);
        Intent intent=getIntent();


        position=intent.getIntExtra("position",0);
        if(position==0)
        {
            img.setImageResource(R.drawable.dua1);
        }
        else if(position==1)
        {
            img.setImageResource(R.drawable.dua2);
        }
        else if(position==2)
        {
            img.setImageResource(R.drawable.dua3);
        }
        else if(position==3)
        {
            img.setImageResource(R.drawable.dua4);
        }
        else if(position==4)
        {
            img.setImageResource(R.drawable.dua5);
        }
        else if(position==5)
        {
            img.setImageResource(R.drawable.dua6);
        }
        else if(position==6)
        {
            img.setImageResource(R.drawable.dua7);
        }
        else if(position==7)
        {
            img.setImageResource(R.drawable.dua8);
        }
    }
}