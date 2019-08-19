package com.lsy.base.baselibrary;

import android.content.Context;

public class BaseLib {

    private static Context context;

    public BaseLib() {
    }

    public static void init(Context context) {
        context = context.getApplicationContext();
    }

    public static Context getContext() {
        if (context != null) {
            return context;
        } else {
            throw new NullPointerException("请先调用init()方法");
        }
    }

}
