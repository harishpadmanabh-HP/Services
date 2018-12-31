package com.example.user.services;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;

public class MyServices extends Service {
    private MediaPlayer player;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player.start();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        player=MediaPlayer.create(getApplicationContext(),R.raw.simple_piano);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        player.stop();
    }
}
