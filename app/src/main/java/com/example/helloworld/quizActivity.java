package com.example.helloworld;
import java.util.List;
import java.util.Random;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class quizActivity extends AppCompatActivity {
    TextView txt;
    TextView scr;
    ListView list;
    int score;
    int random(){
        Random rd=new Random();
        return rd.nextInt()%5;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        score=0;
        ArrayList<String> duaLists=new ArrayList<String>();
        duaLists.add("کھانے سے پہلے کی دعا");
        duaLists.add("کھانے کے بعد دعا");
        duaLists.add("سونے کی دعا");
        duaLists.add("پانی پینے کی دعا");
        duaLists.add("علم میں اضافے کی دعا");
        duaLists.add("مسجد میں داخل ہونے کی دعا");
        duaLists.add("مسجد سے نکلنے کی دعا");
        duaLists.add("سفر شروع کرنے کی دعا");
        ArrayList<String> duas=new ArrayList<String>();
        duas.add("بِسْمِ اللَّٰہِ وَعَلٰی بَرَکَۃِ اللّٰہ");
        duas.add(" اَلْحَمْدُ لِلّٰهِ الَّذِيْ أَطْعَمَنَا وَ سَقَانَا وَ جَعَلَنَا مُسْلِمِیْنَ");
        duas.add("اَللّٰهُمَّ بِاسْمِكَ اَمُوْتُ وَ اَحْیٰ");
        duas.add("اَللّٰهُمَّ بِاسْمِكَ اَمُوْتُ وَ اَحْیٰ");
        duas.add("رَبِّ زِدْنِي عِلْمًاٰ");
        duas.add("اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِکَٰ");
        duas.add("اَللّٰهُمَّ إِنِّی أَسْأَلُکَ مِنْ فَضْلِکَٰ");
        duas.add("سُبْحَانَ الَّذِيْ سَخَّرَ لَنَا هٰذَا وَمَا كُنَّا لَه مُقْرِنِيْنَ وَإِنَّـآ إِلىٰ رَبِّـنَا لَمُنْقَلِبُوْنَ");
        txt=findViewById(R.id.ques);
        list=findViewById(R.id.options);
        scr=findViewById(R.id.score);
        scr.setText("score : " + score);
        int[] arr=new int[4];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        quizQues(duaLists,duas,arr,3);
    }

    void quizQues(ArrayList<String> duaLists,ArrayList<String> duas,int[]arr,int i){
        txt.setText(duaLists.get(i));
        ArrayList<String> options=new ArrayList<String>();
        options.add(duas.get(arr[0]));
        options.add(duas.get(arr[1]));
        options.add(duas.get(arr[2]));
        options.add(duas.get(arr[3]));
        ArrayAdapter<String> duaAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,options);
        list.setAdapter(duaAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(arr[position]==i){
                    score++;
                    scr.setText("score : " + score);
                    if(i>0)
                        quizQues(duaLists,duas,arr,i-1);
                    else if(i==0) {
                        txt.setText("ماشاءاللہ");
                        options.remove(3);
                        options.remove(2);
                        options.remove(1);
                        options.remove(0);
                    }
                }
            }
        });
    }
}