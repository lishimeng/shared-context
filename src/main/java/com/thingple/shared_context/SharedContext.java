package com.thingple.shared_context;

import android.content.Context;

/**
 *
 * Created by lism on 2017/8/18.
 */
public class SharedContext extends PropertiesHandler {

    private static SharedContext ins;

    SharedContext(Context context, String name) {
        super(context, name);
    }

    public static void init(Context context, String name) {
        ins = new SharedContext(context, name);
    }

    public static SharedContext shareInstance() {
        return ins;
    }

}
