package com.example.reader;

/**
 * Created by Administrator on 2017/11/15.
 */

public class Chapter extends Book{
    private String chapterName;
    private int chapterBytePosition, chapterParagraphPosition;

    public void setChapterName(String chapterName){
        this.chapterName = chapterName;
    }
    public String getChapterName(){
        return  chapterName;
    }

    public void setChapterBytePosition(int chapterBytePosition){
        this.chapterBytePosition = chapterBytePosition;
    }
    public int getChapterBytePosition(){
        return chapterBytePosition;
    }

    public void setChapterParagraphPosition(int chapterParagraphPosition){
        this.chapterParagraphPosition = chapterParagraphPosition;
    }
    public int getChapterParagraphPosition(){
        return chapterParagraphPosition;
    }
}
