package com.thingple.shared_context;

import android.content.Context;

/**
 *
 * Created by lism on 2017/8/18.
 */
public class PreferencesUtils extends PropertiesHandler {

    private static PreferencesUtils ins;

    PreferencesUtils(Context context, String name) {
        super(context, name);
    }

    public static void init(Context context, String name) {
        ins = new PreferencesUtils(context, name);
    }

    public static PreferencesUtils shareInstance() {
        return ins;
    }

}
