package com.example.mati.beeryouwant;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TimeOfAppRunningService extends Service{

    private final IBinder binder = new LocalBinder();
    long startTime, currentTime, duration;
    public class LocalBinder extends Binder {
        TimeOfAppRunningService getService() {
            return TimeOfAppRunningService.this;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void getTime(){
        String show = "";
        currentTime = System.currentTimeMillis();
        duration = currentTime - startTime;
        duration /= 1000;
        if(duration < 60){
            show += duration + "s";
        }else {
            show += duration / 60 + "min " + duration % 60 + "s";
        }
        Toast.makeText(getApplicationContext(), show, Toast.LENGTH_SHORT).show();
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        startTime = System.currentTimeMillis();
        return binder;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
