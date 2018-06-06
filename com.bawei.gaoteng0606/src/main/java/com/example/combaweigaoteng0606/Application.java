package com.example.combaweigaoteng0606;

import android.app.Application;

import org.xutils.BuildConfig;
import org.xutils.x;

/**
 * Created by Wangrx on 2017/10/31.
 */

class RegistApplication extends Application{
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(BuildConfig.DEBUG);}}