package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: pe  reason: default package */
public abstract class pe {
    public static final hw6 a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        lfd lfd = qe.a;
        a = new hw6(new Handler(mainLooper));
    }
}
