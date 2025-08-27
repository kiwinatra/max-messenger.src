package defpackage;

import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: pm4  reason: default package */
public final class pm4 {
    public static final Lazy c = LazyKt.lazy(new qr3(10));
    public final ThreadLocal a;
    public final Looper b = Looper.myLooper();

    public pm4(ThreadLocal threadLocal) {
        this.a = threadLocal;
        Looper.prepare();
    }
}
