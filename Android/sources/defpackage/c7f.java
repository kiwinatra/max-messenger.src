package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: c7f  reason: default package */
public final class c7f {
    public static final c7f a = new Object();

    public final k7f a(Looper looper, Handler.Callback callback) {
        return new k7f(new Handler(looper, callback));
    }
}
