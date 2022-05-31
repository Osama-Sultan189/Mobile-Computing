package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class learnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        ArrayList<String> duaLists=new ArrayList<String>();
        duaLists.add("کھانے سے پہلے کی دعا");
        duaLists.add("کھانے کے بعد دعا");
        duaLists.add("سونے کی دعا");
        duaLists.add("پانی پینے کی دعا");
        duaLists.add("علم میں اضافے کی دعا");
        duaLists.add("مسجد میں داخل ہونے کی دعا");
        duaLists.add("مسجد سے نکلنے کی دعا");
        duaLists.add("سفر شروع کرنے کی دعا");
        ArrayAdapter<String> duaAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,duaLists);
        ListView dua=findViewById(R.id.duaList);
        dua.setAdapter(duaAdapter);

        dua.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(learnActivity.this,displayDua.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });


    }
}