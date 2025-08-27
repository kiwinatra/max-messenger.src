package defpackage;

import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ranges.RangesKt;

/* renamed from: gg  reason: default package */
public abstract class gg {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final AtomicInteger b = new AtomicInteger(0);
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final ConcurrentHashMap d = new ConcurrentHashMap();
    public static final Lazy e;
    public static final gc f;
    public static final gc g;

    static {
        Lazy lazy = LazyKt.lazy(new m(3));
        e = lazy;
        gc gcVar = new gc(1);
        f = gcVar;
        gc gcVar2 = new gc(2);
        g = gcVar2;
        ((Handler) lazy.getValue()).post(gcVar);
        ((Handler) lazy.getValue()).post(gcVar2);
    }

    public static void a(le6 le6, int i) {
        wef wef = le6.b;
        int coerceIn = RangesKt.coerceIn(wef.g + i, (int) RangesKt.coerceAtLeast(((float) le6.a) * 0.5f, 1.0f), le6.a);
        int i2 = wef.g;
        if (coerceIn != i2 && coerceIn != i2) {
            wef.g = RangesKt.coerceIn(coerceIn, 1, wef.f);
            yt0 q = wef.q();
            if (q != null) {
                q.a(wef.g);
            }
        }
    }
}
