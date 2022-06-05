package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class quizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        Integer score=0;
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

        for(int i=0;i<5;i++)
        {

        }
    }
}