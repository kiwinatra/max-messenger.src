package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import kotlin.uuid.Uuid;

public abstract class c2 {
    public static Object a(Context context, String str, Class cls) {
        try {
            return cls.cast(context.getPackageManager().getApplicationInfo(context.getPackageName(), Uuid.SIZE_BITS).metaData.get(str));
        } catch (Throwable th) {
            x2.a("SystemUtils: exception when access to application info with key - " + str, th);
            return null;
        }
    }

    public static String a(String str) {
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            x2.a("SystemUtils: value in system properties is null for " + str);
            return null;
        } catch (Throwable th) {
            x2.a("SystemUtils: error occurred when getting value for property - " + str, th);
        }
    }
}
