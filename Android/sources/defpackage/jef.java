package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.ranges.RangesKt;

/* renamed from: jef  reason: default package */
public abstract class jef {
    public static final String a;
    public static final long b = hd8.X(100000, 1, LongCompanionObject.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
    public static final int c = hd8.Y(RangesKt.coerceAtLeast(z7f.a, 2), 1, 0, 8, "kotlinx.coroutines.scheduler.core.pool.size");
    public static final int d = hd8.Y(2097150, 0, 2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
    public static final long e = TimeUnit.SECONDS.toNanos(hd8.X(60, 1, LongCompanionObject.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
    public static final p9a f = p9a.w;
    public static final jq5 g = new jq5(0, 9);
    public static final jq5 h = new jq5(1, 9);

    static {
        String str;
        int i = z7f.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
    }
}
