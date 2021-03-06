package com.example.reader;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.reader.Base.MyApplication;

/**
 * Created by Administrator on 2017/11/15.
 */

public class DBOpenHelper extends SQLiteOpenHelper{
    private static final int VERSION = 1;
    private static final String NAME = "book.db";
    public static final String CREATE_BOOK_LIST = "create table book(" +
            "id integer primary key autoincrement," +
            "book_name text," +
            "book_path text," +
            "book_encoding text," +
            "access_time long)";
    public static final String CREATE_CHAPTER = "create table chapter (" +
            "id integer primary key autoincrement," +
            "book_name text," +
            "chapter_paragraph_position integer," +
            "chapter_byte_position integer," +
            "chapter_name)";
    public DBOpenHelper(){
        super(MyApplication.getmContext(),NAME,null,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_BOOK_LIST);
        db.execSQL(CREATE_CHAPTER);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
        if(newVersion > oldVersion){
            db.execSQL(CREATE_BOOK_LIST);
            db.execSQL(CREATE_CHAPTER);
        }
    }
}
