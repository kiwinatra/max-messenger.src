package com.my.tracker.obfuscated;

import android.content.Context;
import android.os.Build;

public abstract class m1 {
    public static final boolean a;
    public static final boolean b;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        a = i <= 30;
        if (i <= 30 && !Build.MODEL.equals("Pixel 5")) {
            z = true;
        }
        b = z;
    }

    public static boolean a() {
        return false;
    }

    public static boolean a(String str, Context context) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }
}
