package com.example.reader.Base;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/11/15.
 */

public class MyApplication extends Application{
    private static Context mContext;
    public void onCreate(){
        super.onCreate();
        mContext = getApplicationContext();
    }
    public static Context getmContext() {
        return mContext;
    }
}
