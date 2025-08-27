package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;

/* renamed from: rof  reason: default package */
public final class rof {
    public static final ConcurrentHashMap i = new ConcurrentHashMap();
    public final xof a;
    public final ekd b;
    public final y35 c = new y35(25);
    public final lq8 d;
    public final l15 e;
    public volatile boolean f;
    public final Lazy g;
    public final AtomicInteger h;

    /* JADX WARNING: type inference failed for: r1v2, types: [l15, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0055, code lost:
        r1 = new java.util.concurrent.atomic.AtomicInteger();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rof(defpackage.xof r6) {
        /*
            r5 = this;
            ekd r0 = new ekd
            r1 = 20
            r0.<init>(r1)
            r5.<init>()
            r5.a = r6
            r5.b = r0
            y35 r0 = new y35
            r1 = 25
            r0.<init>((int) r1)
            r5.c = r0
            lq8 r0 = r6.k
            r5.d = r0
            l15 r1 = new l15
            r1.<init>()
            r1.a = r6
            f7a r2 = r6.i
            r1.b = r2
            zqd r2 = new zqd
            r3 = 7
            r4 = 0
            r2.<init>((int) r3, (boolean) r4)
            java.lang.String r3 = "CRASH_REPORT"
            r2.b = r3
            r2.c = r0
            npg r0 = new npg
            r0.<init>((defpackage.zqd) r2)
            r1.c = r0
            r5.e = r1
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.PUBLICATION
            ve r1 = new ve
            r2 = 9
            r1.<init>((int) r2, (java.lang.Object) r5)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r0, r1)
            r5.g = r0
            java.util.concurrent.ConcurrentHashMap r0 = i
            java.lang.String r6 = r6.a
            java.lang.Object r1 = r0.get(r6)
            if (r1 != 0) goto L_0x0062
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>()
            java.lang.Object r6 = r0.putIfAbsent(r6, r1)
            if (r6 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r1 = r6
        L_0x0062:
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            r5.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rof.<init>(xof):void");
    }

    public final void a(String str, Throwable th) {
        if (!this.f && ((Boolean) this.g.getValue()).booleanValue()) {
            lq8 lq8 = this.d;
            lq8.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < lq8.b().getLong("system.shutdown.until.ts", Long.MIN_VALUE) || currentTimeMillis < lq8.b().getLong("system.CRASH_REPORT.shutdown.until.ts", Long.MIN_VALUE)) {
                return;
            }
            if (this.h.incrementAndGet() > 8) {
                ((Executor) this.a.j.b).execute(new qof(0, this));
            } else {
                ((Executor) this.a.j.b).execute(new jh3(this, th, str));
            }
        }
    }
}
