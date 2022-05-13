package com.example.dictionaryapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseEditor extends SQLiteOpenHelper {

    public DatabaseEditor(@Nullable Context context) {
        super(context, "Dictionary", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE words (word_id INTEGER PRIMARY KEY AUTOINCREMENT, english TEXT, turkish TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS words"); //herhangi bir güncellemeden sonra tablonun üzerine doğru bir şekilde yazılması için drop yaptık
        onCreate(db);
    }
}
