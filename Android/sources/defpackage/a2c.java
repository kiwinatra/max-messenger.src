package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: a2c  reason: default package */
public abstract class a2c {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
