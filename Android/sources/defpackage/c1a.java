package defpackage;

import android.location.Location;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: c1a  reason: default package */
public final /* synthetic */ class c1a implements zi6, qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1a b;

    public /* synthetic */ c1a(g1a g1a, int i) {
        this.a = i;
        this.b = g1a;
    }

    public void accept(Object obj) {
        pf8 pf8;
        Iterator it;
        boolean z;
        String str;
        List list;
        g1a g1a;
        Iterator it2;
        long j;
        boolean z2;
        long j2 = 0;
        g1a g1a2 = this.b;
        switch (this.a) {
            case 1:
                g1a g1a3 = g1a2;
                pf8 pf82 = (pf8) obj;
                g1a3.getClass();
                long j3 = pf82.c;
                if (j3 == 0) {
                    g1a3.C0 = pf82;
                    g1a3.c0();
                    return;
                }
                ConcurrentHashMap concurrentHashMap = g1a3.b;
                pf8 pf83 = (pf8) concurrentHashMap.get(Long.valueOf(j3));
                if (pf83 != null) {
                    of8 a2 = pf83.a();
                    a2.f = pf82.f;
                    a2.g = pf82.g;
                    a2.i = pf82.i;
                    concurrentHashMap.put(Long.valueOf(pf83.c), new pf8(a2));
                    g1a3.b0();
                    return;
                }
                return;
            case 2:
                g1a g1a4 = g1a2;
                Boolean bool = (Boolean) obj;
                qh8 qh8 = new qh8(new ti8[]{((j18) g1a4.x).c(g1a4.z), new d1a(g1a4)}, 1);
                q0a q0a = new q0a(7);
                int i = wv5.a;
                iq.h0(i, "bufferSize");
                dx5 dx5 = new dx5(new yv5(new nw5(qh8, q0a, i), new q0a(8)), 1);
                jbf jbf = g1a4.x0;
                jbf.getClass();
                fce j4 = dx5.n(((kbf) jbf).a()).j(qe.a());
                ao1 ao1 = new ao1(3, new c1a(g1a4, 3), new c1a(g1a4, 5));
                j4.l(ao1);
                g1a4.o.a(ao1);
                return;
            case 3:
                List list2 = (List) obj;
                g1a2.getClass();
                z68.c("g1a", "invalidateLiveLocations %s", list2);
                ConcurrentHashMap concurrentHashMap2 = g1a2.b;
                Iterator it3 = concurrentHashMap2.entrySet().iterator();
                while (true) {
                    boolean hasNext = it3.hasNext();
                    pf8 pf84 = g1a2.Y;
                    if (hasNext) {
                        Map.Entry entry = (Map.Entry) it3.next();
                        pf8 pf85 = (pf8) entry.getValue();
                        Long l = (Long) entry.getKey();
                        long longValue = l.longValue();
                        if (longValue != j2) {
                            if (pf85.h) {
                                Iterator it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        uc9 uc9 = (uc9) it4.next();
                                        if (longValue == uc9.a) {
                                            s58 s58 = pf85.a;
                                            double d = s58.a;
                                            s58 s582 = uc9.c;
                                            list = list2;
                                            j = longValue;
                                            g1a = g1a2;
                                            it2 = it3;
                                            boolean f = ((be) g1a2.w).f(d, s58.b, s582.a, s582.b);
                                            boolean z3 = pf85.k;
                                            boolean z4 = uc9.e;
                                            boolean z5 = z3 == z4;
                                            of8 a3 = pf85.a();
                                            a3.a = s582;
                                            a3.j = uc9.d;
                                            a3.h = true;
                                            a3.k = z4;
                                            concurrentHashMap2.put(Long.valueOf(pf85.c), new pf8(a3));
                                            pf8 pf86 = (pf8) concurrentHashMap2.get(l);
                                            if (pf86 != null && (pf86.i || !f || !z5)) {
                                                g1a.F0.d(pf86);
                                            }
                                            z2 = true;
                                        }
                                    } else {
                                        list = list2;
                                        g1a = g1a2;
                                        it2 = it3;
                                        j = longValue;
                                        z2 = false;
                                    }
                                }
                                if ((pf84 == null || pf84.c != j) && !z2) {
                                    it2.remove();
                                }
                                it3 = it2;
                                g1a2 = g1a;
                                j2 = 0;
                                list2 = list;
                            }
                        }
                    } else {
                        List list3 = list2;
                        g1a g1a5 = g1a2;
                        Iterator it5 = list3.iterator();
                        boolean z6 = false;
                        boolean z7 = false;
                        boolean z8 = false;
                        long j5 = 0;
                        long j6 = 0;
                        boolean z9 = false;
                        while (true) {
                            boolean hasNext2 = it5.hasNext();
                            tf8 tf8 = tf8.c;
                            if (hasNext2) {
                                uc9 uc92 = (uc9) it5.next();
                                long j7 = uc92.b;
                                long j8 = g1a5.y;
                                int i2 = (j8 > j7 ? 1 : (j8 == j7 ? 0 : -1));
                                long j9 = uc92.d;
                                String str2 = uc92.f;
                                boolean z10 = uc92.e;
                                long j10 = uc92.a;
                                if (i2 != 0 || !z10) {
                                    it = it5;
                                } else {
                                    if (j10 == 0 || !cvg.c(str2, g1a5.w0.a())) {
                                        ltb ltb = (ltb) g1a5.y0;
                                        it = it5;
                                        z9 = ltb.a.m() - j9 >= TimeUnit.SECONDS.toMillis((long) ltb.b.q()) * 2;
                                        z8 = true;
                                    } else {
                                        it = it5;
                                        z7 = true;
                                    }
                                    j6 = uc92.g;
                                    j5 = j10;
                                    z6 = true;
                                }
                                if (((pf8) concurrentHashMap2.get(Long.valueOf(j10))) != null) {
                                    z = z6;
                                } else {
                                    if (pf84 == null || pf84.h) {
                                        z = z6;
                                    } else {
                                        z = z6;
                                        if (pf84.c == j10) {
                                        }
                                    }
                                    long j11 = uc92.b;
                                    if (j8 == j11) {
                                        str = g1a5.X;
                                    } else {
                                        vk3 p = g1a5.Z.p(j11, false);
                                        str = p != null ? p.f() : "";
                                    }
                                    of8 of8 = new of8(uc92.c);
                                    of8.b = j11;
                                    of8.c = j10;
                                    of8.j = j9;
                                    of8.h = true;
                                    of8.e = str;
                                    of8.k = z10;
                                    if (j10 != g1a5.A0.h) {
                                        tf8 = tf8.b;
                                    }
                                    of8.d = tf8;
                                    of8.l = str2;
                                    pf8 pf87 = new pf8(of8);
                                    concurrentHashMap2.put(Long.valueOf(j10), pf87);
                                    g1a5.F0.d(pf87);
                                }
                                it5 = it;
                                z6 = z;
                            } else {
                                g1a5.Y(new e1a(z6 || g1a5.A0.d == 3, z7, z8, j5, j6, z9));
                                if (concurrentHashMap2.size() == 1) {
                                    pf8 pf88 = (pf8) concurrentHashMap2.values().iterator().next();
                                    if (g1a5.A0.h != pf88.c) {
                                        of8 a4 = pf88.a();
                                        a4.d = tf8;
                                        concurrentHashMap2.put(Long.valueOf(pf88.c), new pf8(a4));
                                        g1a5.Y(new ak0(pf88, 2));
                                    }
                                }
                                long j12 = g1a5.A0.h;
                                if (!(j12 == 0 || (pf8 = (pf8) concurrentHashMap2.get(Long.valueOf(j12))) == null)) {
                                    g1a5.d0(pf8.c);
                                    if (g1a5.D0 && g1a5.A0.o == -1) {
                                        s58 s583 = pf8.a;
                                        ((f3a) g1a5.a).a0(s583.a, s583.b, false);
                                    }
                                }
                                g1a5.e0((c1a) null);
                                g1a5.b0();
                                return;
                            }
                        }
                    }
                }
                break;
            case 5:
                g1a2.getClass();
                Locale locale = Locale.ENGLISH;
                z68.f("g1a", "Can't get getActiveLiveLocations for chat " + g1a2.z, (Throwable) obj);
                return;
            case 6:
                Long l2 = (Long) obj;
                g1a2.E0.d(Boolean.TRUE);
                return;
            case 7:
                g1a2.v.a(g1a2);
                g1a2.Y(new pv1(3, (Object) g1a2, (Object) (Boolean) obj));
                g1a2.e0((c1a) null);
                return;
            default:
                g1a2.getClass();
                g1a2.Y(new a0(4, (Boolean) obj));
                g1a2.e0((c1a) null);
                return;
        }
    }

    public Object apply(Object obj) {
        double d;
        double d2;
        float f;
        List list;
        pf8 pf8 = (pf8) obj;
        g1a g1a = this.b;
        g1a.getClass();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            long j = pf8.c;
            w58 w58 = g1a.A0;
            if (j == w58.h && w58.o != -1 && (list = (List) g1a.c.get(Long.valueOf(j))) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    pf8 pf82 = (pf8) it.next();
                    if (pf82.j == g1a.A0.o) {
                        s58 s58 = pf82.a;
                        d2 = s58.a;
                        d = s58.b;
                        break;
                    }
                }
            }
            d2 = 1.401298464324817E-45d;
            d = 1.401298464324817E-45d;
            if (d2 == 1.401298464324817E-45d || d == 1.401298464324817E-45d) {
                s58 s582 = pf8.a;
                d2 = s582.a;
                d = s582.b;
            }
            s58 s583 = g1a.B0;
            String c = ((be) g1a.w).c(d2, d, s583.a, s583.b);
            if (pf8.c == 0 || !g1a.B0.a()) {
                f = -1.0f;
            } else {
                s58 s584 = g1a.B0;
                float[] fArr = new float[1];
                Location.distanceBetween(d2, d, s584.a, s584.b, fArr);
                f = fArr[0];
            }
            of8 a2 = pf8.a();
            a2.f = c;
            a2.g = f;
            a2.i = false;
            return new pf8(a2);
        }
        throw new RuntimeException("This thread is main!");
    }
}
