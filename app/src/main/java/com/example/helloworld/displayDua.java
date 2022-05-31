package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class displayDua extends AppCompatActivity {
    int position;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_dua);
        img=findViewById(R.id.img);
        Intent intent=getIntent();
        position=Integer.parseInt(intent.getStringExtra("position"));
        if(position==0)
        {
            img.setImageResource(R.drawable.dua1);
        }
        else if(position==1)
        {

        }
        else if(position==2)
        {

        }
        else if(position==3)
        {

        }
        else if(position==4)
        {

        }
        else if(position==5)
        {

        }
        else if(position==6)
        {

        }
        else if(position==7)
        {

        }
    }
}