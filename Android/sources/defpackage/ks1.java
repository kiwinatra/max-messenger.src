package defpackage;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ks1  reason: default package */
public final class ks1 {
    public static final long j;
    public static final long k;
    public final int a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final lr1 d;
    public final zq0 e;
    public final boolean f;
    public long g = j;
    public final ArrayList h = new ArrayList();
    public final is1 i = new is1(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        j = timeUnit.toNanos(1);
        k = timeUnit.toNanos(5);
    }

    public ks1(int i2, Executor executor, ScheduledExecutorService scheduledExecutorService, lr1 lr1, boolean z, zq0 zq0) {
        this.a = i2;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.d = lr1;
        this.f = z;
        this.e = zq0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: xa7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: go1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: xa7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: xa7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.zz7 a(int r5) {
        /*
            r4 = this;
            xa7 r0 = defpackage.xa7.c
            java.util.ArrayList r1 = r4.h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x004a
            is1 r1 = r4.i
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x002c
            ns1 r0 = new ns1
            r1 = 0
            r0.<init>(r1)
            lr1 r1 = r4.d
            r1.p(r0)
            ir1 r2 = new ir1
            r3 = 5
            r2.<init>(r3, r1, r0)
            go1 r0 = r0.b
            fo1 r3 = r0.b
            java.util.concurrent.Executor r1 = r1.c
            r3.d(r2, r1)
        L_0x002c:
            oj6 r0 = defpackage.oj6.a(r0)
            ud0 r1 = new ud0
            r2 = 2
            r1.<init>(r4, r5, r2)
            r0.getClass()
            java.util.concurrent.Executor r5 = r4.b
            cz1 r0 = defpackage.hd8.b0(r0, r1, r5)
            d9d r1 = new d9d
            r2 = 29
            r1.<init>(r2, r4)
            cz1 r0 = defpackage.hd8.b0(r0, r1, r5)
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.a(int):zz7");
    }
}
