package com.thingple.shared_context;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * 配置
 * Created by lism on 2017/8/16.
 */
class PropertiesHandler {

    SharedPreferences preferences = null;

    PropertiesHandler(Context context, String name) {
        preferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
    }

    public String get(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }

    public String get(String key) {
        return get(key, null);
    }

    public void set(String key, String value) {
        preferences.edit().putString(key, value).commit();
    }

}
