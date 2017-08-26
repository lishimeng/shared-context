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
        preferences = context.getApplicationContext().getSharedPreferences(name, Context.MODE_PRIVATE);
    }

}
