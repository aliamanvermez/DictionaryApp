package com.example.dictionaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DatabaseEditor databaseEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        databaseEditor = new DatabaseEditor(this);

        new Wordsdao().insertWord(databaseEditor,"door","kapı");

        new Wordsdao().insertWord(databaseEditor,"table","masa");

        new Wordsdao().insertWord(databaseEditor,"paper","kağıt");

        ArrayList <Words> wordListCome = new Wordsdao().allWords(databaseEditor);

        for(Words w :wordListCome) {
            Log.e(String.valueOf(w.getWord_id()),w.getTurkish()+""+w.getEnglish());
        }



    }
}