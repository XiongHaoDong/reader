package com.example.reader;
import android.widget.Toast;
import com.example.reader.Base.MyApplication;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * Created by Administrator on 2017/11/15.
 */

public class Utils {
    private static Toast mToast;
    public static void makeToast(String message){
        if(mToast == null){
            mToast = Toast.makeText(MyApplication.getmContext(),"",Toast.LENGTH_SHORT);
        }
        mToast.setText(message);
        mToast.show();
    }

    public static String getEncoding(Book book){
        UniversalDetector detector = new UniversalDetector(null);
        byte[] bytes = new byte[1024];
        try{
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(book.getPath())));
            int length;
            while ((length = bufferedInputStream.read(bytes)) > 0){
                detector.handleData(bytes,0,length);
            }
            detector.dataEnd();
            bufferedInputStream.close();
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }catch (IOException i){
            i.printStackTrace();
        }
        return detector.getDetectedCharset();
    }
    public static int getPXWithDP(int dp){
        float density = MyApplication.getmContext().getResources().getDisplayMetrics().density;
        return (int)(dp*density);
    }
}
