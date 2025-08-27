package defpackage;

import kotlin.collections.ArraysKt;

/* renamed from: fp7  reason: default package */
public final class fp7 {
    public final u05 a;
    public boolean b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, u05] */
    public fp7(usd usd) {
        zw zwVar = new zw(23, (Object) this);
        ? obj = new Object();
        obj.b = usd;
        obj.c = zwVar;
        int e = usd.e();
        long j = 0;
        if (e <= 64) {
            obj.a = e != 64 ? -1 << e : j;
            obj.o = u05.v;
        } else {
            obj.a = 0;
            long[] jArr = new long[((e - 1) >>> 6)];
            if ((e & 63) != 0) {
                jArr[ArraysKt.getLastIndex(jArr)] = -1 << e;
            }
            obj.o = jArr;
        }
        this.a = obj;
    }
}
