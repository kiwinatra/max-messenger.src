package com.my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b1 {
    private static final Integer a = 1;
    private static final AtomicBoolean b = new AtomicBoolean();

    public static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            x2.b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            x2.b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            x2.b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    public static boolean b(Context context) {
        String packageName = context.getPackageName();
        if (String.valueOf(a).equals(c2.a(packageName + "_mytracker_debug"))) {
            x2.a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        x2.a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static void c(Context context) {
        if (!b.compareAndSet(false, true)) {
            x2.a("LoggingHandler: instance has already been initialized");
        } else if (x2.a()) {
            x2.a("LoggingHandler: tracing has already been enabled");
        } else {
            m.a(new nn(context, 7));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        String str;
        if (a(context)) {
            x2.a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (a.equals((Integer) c2.a(context, "com.my.tracker.debugMode", Integer.class))) {
                x2.a(true);
                str = "LoggingHandler: debug mode is enabled by manifest metadata";
            } else if (b(context)) {
                x2.a(true);
                x2.a("LoggingHandler: debug mode is enabled by system properties");
                return;
            } else {
                return;
            }
        }
        x2.a(str);
    }
}
