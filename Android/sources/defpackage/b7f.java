package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: b7f  reason: default package */
public final class b7f {
    public static final b7f a = new Object();

    public final j7f a(Looper looper, Handler.Callback callback) {
        return new j7f(new Handler(looper, callback));
    }
}
