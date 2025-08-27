package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.Thread;

/* renamed from: zy1  reason: default package */
public final class zy1 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ int a = 1;
    public final Thread.UncaughtExceptionHandler b;
    public final Object c;

    public zy1(Context context) {
        this.c = context.getSharedPreferences("app_crash_prefs", 0);
        this.b = Thread.getDefaultUncaughtExceptionHandler();
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        switch (this.a) {
            case 0:
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) this.c;
                try {
                    uncaughtExceptionHandler = this.b;
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                    return;
                } finally {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            default:
                ((SharedPreferences) this.c).edit().putLong("pref_last_crash_time", System.currentTimeMillis()).apply();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                    return;
                }
                return;
        }
    }

    public zy1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.b = uncaughtExceptionHandler;
        this.c = uncaughtExceptionHandler2;
    }
}
