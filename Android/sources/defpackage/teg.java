package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: teg  reason: default package */
public abstract class teg {
    public static final String a = h88.V("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        String m = a81.m("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, m);
        synchronized (ueg.a) {
            String str2 = (String) ueg.b.put(newWakeLock, m);
        }
        return newWakeLock;
    }
}
