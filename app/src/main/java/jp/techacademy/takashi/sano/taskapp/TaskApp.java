package jp.techacademy.takashi.sano.taskapp;

/**
 * Created by 307156 on 2017/02/27.
 */

import android.app.Application;

import io.realm.Realm;

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}