package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: ud3  reason: default package */
public abstract class ud3 {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
