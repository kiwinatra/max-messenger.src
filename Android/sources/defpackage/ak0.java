package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ak0  reason: default package */
public final /* synthetic */ class ak0 implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf8 b;

    public /* synthetic */ ak0(pf8 pf8, int i) {
        this.a = i;
        this.b = pf8;
    }

    public final void accept(Object obj) {
        pf8 pf8;
        switch (this.a) {
            case 0:
                g1a g1a = (g1a) obj;
                g1a.getClass();
                pf8 pf82 = this.b;
                long j = pf82.c;
                long j2 = g1a.A0.h;
                int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                ConcurrentHashMap concurrentHashMap = g1a.b;
                f2a f2a = g1a.a;
                s58 s58 = pf82.a;
                if (i == 0) {
                    g1a.Y(new zj0(16));
                    pf8 pf83 = (pf8) concurrentHashMap.get(Long.valueOf(g1a.A0.h));
                    if (pf83 != null) {
                        g1a.F0.d(pf83);
                    }
                    ((f3a) f2a).a0(s58.a, s58.b, false);
                } else {
                    if (!(j2 == -1 || (pf8 = (pf8) concurrentHashMap.get(Long.valueOf(j2))) == null)) {
                        of8 a2 = pf8.a();
                        a2.d = tf8.b;
                        concurrentHashMap.put(Long.valueOf(pf8.c), new pf8(a2));
                    }
                    long j3 = g1a.A0.h;
                    long j4 = pf82.c;
                    if (j4 != j3) {
                        g1a.Y(new ak0(pf82, 3));
                        pf8 pf84 = (pf8) concurrentHashMap.get(Long.valueOf(g1a.A0.h));
                        if (pf84 != null) {
                            of8 a3 = pf84.a();
                            a3.d = tf8.c;
                            concurrentHashMap.put(Long.valueOf(pf84.c), new pf8(a3));
                            g1a.F0.d(pf84);
                        }
                        g1a.d0(j4);
                        ((f3a) f2a).a0(s58.a, s58.b, false);
                    }
                }
                ((f3a) f2a).Z(-1, pf82.k);
                g1a.D0 = true;
                g1a.e0((c1a) null);
                g1a.b0();
                return;
            case 1:
                g1a g1a2 = (g1a) obj;
                g1a2.getClass();
                pf8 pf85 = this.b;
                int i2 = (pf85.j > g1a2.A0.o ? 1 : (pf85.j == g1a2.A0.o ? 0 : -1));
                f2a f2a2 = g1a2.a;
                s58 s582 = pf85.a;
                if (i2 == 0) {
                    ((f3a) f2a2).a0(s582.a, s582.b, false);
                    return;
                } else if (((List) g1a2.c.get(Long.valueOf(pf85.c))) != null) {
                    g1a2.Y(new ak0(pf85, 4));
                    g1a2.e0((c1a) null);
                    f3a f3a = (f3a) f2a2;
                    f3a.Z(pf85.j, pf85.k);
                    pf8 pf86 = (pf8) g1a2.b.get(Long.valueOf(g1a2.A0.h));
                    if (pf86 != null) {
                        g1a2.F0.d(pf86);
                    }
                    f3a.a0(s582.a, s582.b, false);
                    return;
                } else {
                    return;
                }
            case 2:
                ((u58) obj).h = this.b.c;
                return;
            case 3:
                u58 u58 = (u58) obj;
                u58.h = this.b.c;
                u58.o = -1;
                return;
            default:
                ((u58) obj).o = this.b.j;
                return;
        }
    }
}
