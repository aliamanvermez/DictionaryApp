package com.example.dictionaryapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

//DAO ----> Data Access Object yani veritabanıyla iletişim kuran sınıf
public class Wordsdao {
    public void insertWord ( DatabaseEditor databaseEditor,String english,String turkish) {

        SQLiteDatabase dbx = databaseEditor.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("english",english);
        values.put("turkish",turkish);

        dbx.insertOrThrow("words",null,values);
        dbx.close();
    }
    public ArrayList <Words> allWords (DatabaseEditor databaseEditor) {

        ArrayList<Words> wordsArrayList = new ArrayList<>();

        SQLiteDatabase dbx = databaseEditor.getWritableDatabase();

        Cursor c = dbx.rawQuery("SELECT * FROM words",null);

        while (c.moveToNext()){

            Words word = new Words(c.getInt(c.getColumnIndexOrThrow("word_id"))
                    ,c.getString(c.getColumnIndexOrThrow("english"))
                    , c.getString(c.getColumnIndexOrThrow("turkish")));

        }
        return wordsArrayList;
    }
}
