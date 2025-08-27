package defpackage;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: tt8  reason: default package */
public final class tt8 {
    public final ekf a = new ekf();
    public final hkf b = new hkf();
    public final wb4 c;
    public final iw6 d;
    public final lc5 e;
    public long f;
    public int g;
    public boolean h;
    public ot8 i;
    public ot8 j;
    public ot8 k;
    public int l;
    public Object m;
    public long n;
    public List o = new ArrayList();

    public tt8(wb4 wb4, k7f k7f, lc5 lc5) {
        this.c = wb4;
        this.d = k7f;
        this.e = lc5;
    }

    public static nz8 m(jkf jkf, Object obj, long j2, long j3, hkf hkf, ekf ekf) {
        jkf jkf2 = jkf;
        long j4 = j2;
        hkf hkf2 = hkf;
        Object obj2 = obj;
        ekf ekf2 = ekf;
        jkf.h(obj2, ekf2);
        jkf.o(ekf2.c, hkf2);
        int b2 = jkf.b(obj);
        Object obj3 = obj2;
        while (true) {
            int i2 = ekf2.g.b;
            if (i2 == 0) {
                break;
            }
            if ((i2 == 1 && ekf2.h(0)) || !ekf2.i(ekf2.g.e)) {
                break;
            }
            long j5 = 0;
            if (ekf2.c(0) != -1) {
                break;
            }
            if (ekf2.d != 0) {
                int i3 = i2 - (ekf2.h(i2 + -1) ? 2 : 1);
                for (int i4 = 0; i4 <= i3; i4++) {
                    j5 += ekf2.g.a(i4).h;
                }
                if (ekf2.d > j5) {
                    break;
                }
            }
            if (b2 > hkf2.o) {
                break;
            }
            jkf.g(b2, ekf2, true);
            obj3 = ekf2.b;
            obj3.getClass();
            b2++;
        }
        jkf.h(obj3, ekf2);
        int c2 = ekf2.c(j4);
        if (c2 == -1) {
            return new nz8(obj3, j3, ekf2.b(j4));
        }
        long j6 = j3;
        return new nz8(obj3, c2, ekf2.f(c2), j3, -1);
    }

    public final ot8 a() {
        ot8 ot8 = this.i;
        if (ot8 == null) {
            return null;
        }
        if (ot8 == this.j) {
            this.j = ot8.l;
        }
        ot8.g();
        int i2 = this.l - 1;
        this.l = i2;
        if (i2 == 0) {
            this.k = null;
            ot8 ot82 = this.i;
            this.m = ot82.b;
            this.n = ot82.f.a.d;
        }
        this.i = this.i.l;
        k();
        return this.i;
    }

    public final void b() {
        if (this.l != 0) {
            ot8 ot8 = this.i;
            n79.o(ot8);
            this.m = ot8.b;
            this.n = ot8.f.a.d;
            while (ot8 != null) {
                ot8.g();
                ot8 = ot8.l;
            }
            this.i = null;
            this.k = null;
            this.j = null;
            this.l = 0;
            k();
        }
    }

    public final rt8 c(jkf jkf, ot8 ot8, long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        long o2;
        jkf jkf2 = jkf;
        ot8 ot82 = ot8;
        rt8 rt8 = ot82.f;
        int d2 = jkf.d(jkf2.b(rt8.a.a), this.a, this.b, this.g, this.h);
        if (d2 == -1) {
            return null;
        }
        ekf ekf = this.a;
        boolean z = true;
        int i2 = jkf2.g(d2, ekf, true).c;
        Object obj = ekf.b;
        obj.getClass();
        nz8 nz8 = rt8.a;
        long j7 = nz8.d;
        if (jkf2.n(i2, this.b, 0).n == d2) {
            Pair k2 = jkf.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j2));
            if (k2 == null) {
                return null;
            }
            obj = k2.first;
            long longValue = ((Long) k2.second).longValue();
            ot8 ot83 = ot82.l;
            if (ot83 == null || !ot83.b.equals(obj)) {
                o2 = o(obj);
                if (o2 == -1) {
                    o2 = this.f;
                    this.f = 1 + o2;
                }
            } else {
                o2 = ot83.f.a.d;
            }
            j7 = o2;
            j4 = longValue;
            j3 = -9223372036854775807L;
        } else {
            j4 = 0;
            j3 = 0;
        }
        nz8 m2 = m(jkf, obj, j4, j7, this.b, this.a);
        if (j3 != -9223372036854775807L) {
            j6 = rt8.c;
            if (j6 != -9223372036854775807L) {
                int i3 = jkf2.h(nz8.a, ekf).g.b;
                int i4 = ekf.g.e;
                if (i3 <= 0 || !ekf.i(i4) || (i3 <= 1 && ekf.d(i4) == Long.MIN_VALUE)) {
                    z = false;
                }
                if (m2.b() && z) {
                    j5 = j4;
                    return e(jkf, m2, j6, j5);
                } else if (z) {
                    j5 = j6;
                    j6 = j3;
                    return e(jkf, m2, j6, j5);
                }
            }
        }
        j5 = j4;
        j6 = j3;
        return e(jkf, m2, j6, j5);
    }

    public final rt8 d(jkf jkf, ot8 ot8, long j2) {
        jkf jkf2 = jkf;
        ot8 ot82 = ot8;
        rt8 rt8 = ot82.f;
        long j3 = (ot82.o + rt8.e) - j2;
        if (rt8.g) {
            return c(jkf2, ot82, j3);
        }
        nz8 nz8 = rt8.a;
        Object obj = nz8.a;
        ekf ekf = this.a;
        jkf2.h(obj, ekf);
        boolean b2 = nz8.b();
        Object obj2 = nz8.a;
        if (b2) {
            q9 q9Var = ekf.g;
            int i2 = nz8.b;
            int i3 = q9Var.a(i2).b;
            if (i3 != -1) {
                int a2 = ekf.g.a(i2).a(nz8.c);
                if (a2 < i3) {
                    return f(jkf, nz8.a, i2, a2, rt8.c, nz8.d);
                }
                long j4 = rt8.c;
                if (j4 == -9223372036854775807L) {
                    Pair k2 = jkf.k(this.b, ekf, ekf.c, -9223372036854775807L, Math.max(0, j3));
                    if (k2 != null) {
                        j4 = ((Long) k2.second).longValue();
                    }
                }
                jkf2.h(obj2, ekf);
                int i4 = nz8.b;
                long d2 = ekf.d(i4);
                return g(jkf, nz8.a, Math.max(d2 == Long.MIN_VALUE ? ekf.d : ekf.g.a(i4).h + d2, j4), rt8.c, nz8.d);
            }
            return null;
        }
        int i5 = nz8.e;
        if (i5 != -1 && ekf.h(i5)) {
            return c(jkf2, ot82, j3);
        }
        int f2 = ekf.f(i5);
        boolean z = ekf.i(i5) && ekf.e(i5, f2) == 3;
        if (f2 == ekf.g.a(i5).b || z) {
            jkf2.h(obj2, ekf);
            long d3 = ekf.d(i5);
            return g(jkf, nz8.a, d3 == Long.MIN_VALUE ? ekf.d : ekf.g.a(i5).h + d3, rt8.e, nz8.d);
        }
        return f(jkf, nz8.a, nz8.e, f2, rt8.e, nz8.d);
    }

    public final rt8 e(jkf jkf, nz8 nz8, long j2, long j3) {
        nz8 nz82 = nz8;
        jkf jkf2 = jkf;
        jkf.h(nz82.a, this.a);
        if (nz8.b()) {
            int i2 = nz82.c;
            long j4 = nz82.d;
            return f(jkf, nz82.a, nz82.b, i2, j2, j4);
        }
        return g(jkf, nz82.a, j3, j2, nz82.d);
    }

    public final rt8 f(jkf jkf, Object obj, int i2, int i3, long j2, long j3) {
        int i4 = i2;
        int i5 = i3;
        nz8 nz8 = new nz8(obj, i2, i3, j3, -1);
        ekf ekf = this.a;
        long a2 = jkf.h(obj, ekf).a(i4, i5);
        long j4 = i5 == ekf.f(i4) ? ekf.g.c : 0;
        return new rt8(nz8, (a2 == -9223372036854775807L || j4 < a2) ? j4 : Math.max(0, a2 - 1), j2, -9223372036854775807L, a2, ekf.i(i4), false, false, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0094 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00be A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.rt8 g(defpackage.jkf r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            ekf r5 = r0.a
            r1.h(r2, r5)
            int r6 = r5.b(r3)
            r7 = 0
            r8 = 1
            r9 = -1
            if (r6 == r9) goto L_0x001e
            boolean r10 = r5.h(r6)
            if (r10 == 0) goto L_0x001e
            r10 = r8
            goto L_0x001f
        L_0x001e:
            r10 = r7
        L_0x001f:
            if (r6 != r9) goto L_0x0031
            q9 r11 = r5.g
            int r12 = r11.b
            if (r12 <= 0) goto L_0x0063
            int r11 = r11.e
            boolean r11 = r5.i(r11)
            if (r11 == 0) goto L_0x0063
            r11 = r8
            goto L_0x0064
        L_0x0031:
            boolean r11 = r5.i(r6)
            if (r11 == 0) goto L_0x0063
            long r11 = r5.d(r6)
            long r13 = r5.d
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0063
            q9 r11 = r5.g
            o9 r11 = r11.a(r6)
            int r12 = r11.b
            if (r12 != r9) goto L_0x004d
        L_0x004b:
            r11 = r8
            goto L_0x005d
        L_0x004d:
            r13 = r7
        L_0x004e:
            if (r13 >= r12) goto L_0x005c
            int[] r14 = r11.f
            r14 = r14[r13]
            if (r14 == 0) goto L_0x004b
            if (r14 != r8) goto L_0x0059
            goto L_0x004b
        L_0x0059:
            int r13 = r13 + 1
            goto L_0x004e
        L_0x005c:
            r11 = r7
        L_0x005d:
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x0063
            r11 = r8
            r6 = r9
            goto L_0x0064
        L_0x0063:
            r11 = r7
        L_0x0064:
            nz8 r13 = new nz8
            r14 = r33
            r13.<init>(r2, r14, r6)
            boolean r2 = r13.b()
            if (r2 != 0) goto L_0x0075
            if (r6 != r9) goto L_0x0075
            r2 = r8
            goto L_0x0076
        L_0x0075:
            r2 = r7
        L_0x0076:
            boolean r24 = r0.j(r1, r13)
            boolean r25 = r0.i(r1, r13, r2)
            if (r6 == r9) goto L_0x008b
            boolean r0 = r5.i(r6)
            if (r0 == 0) goto L_0x008b
            if (r10 != 0) goto L_0x008b
            r22 = r8
            goto L_0x008d
        L_0x008b:
            r22 = r7
        L_0x008d:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L_0x009d
            if (r10 != 0) goto L_0x009d
            long r9 = r5.d(r6)
        L_0x009a:
            r18 = r9
            goto L_0x00a4
        L_0x009d:
            if (r11 == 0) goto L_0x00a2
            long r9 = r5.d
            goto L_0x009a
        L_0x00a2:
            r18 = r0
        L_0x00a4:
            int r6 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00b2
            r9 = -9223372036854775808
            int r6 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r6 != 0) goto L_0x00af
            goto L_0x00b2
        L_0x00af:
            r20 = r18
            goto L_0x00b6
        L_0x00b2:
            long r5 = r5.d
            r20 = r5
        L_0x00b6:
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00ce
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x00ce
            if (r25 != 0) goto L_0x00c2
            if (r11 != 0) goto L_0x00c3
        L_0x00c2:
            r7 = r8
        L_0x00c3:
            long r0 = (long) r7
            long r0 = r20 - r0
            r3 = 0
            long r0 = java.lang.Math.max(r3, r0)
            r14 = r0
            goto L_0x00cf
        L_0x00ce:
            r14 = r3
        L_0x00cf:
            rt8 r0 = new rt8
            r12 = r0
            r16 = r31
            r23 = r2
            r12.<init>(r13, r14, r16, r18, r20, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tt8.g(jkf, java.lang.Object, long, long, long):rt8");
    }

    public final rt8 h(jkf jkf, rt8 rt8) {
        jkf jkf2 = jkf;
        rt8 rt82 = rt8;
        nz8 nz8 = rt82.a;
        boolean b2 = nz8.b();
        int i2 = nz8.e;
        boolean z = !b2 && i2 == -1;
        boolean j2 = j(jkf2, nz8);
        boolean i3 = i(jkf2, nz8, z);
        Object obj = rt82.a.a;
        ekf ekf = this.a;
        jkf2.h(obj, ekf);
        long d2 = (nz8.b() || i2 == -1) ? -9223372036854775807L : ekf.d(i2);
        boolean b3 = nz8.b();
        int i4 = nz8.b;
        return new rt8(nz8, rt82.b, rt82.c, d2, b3 ? ekf.a(i4, nz8.c) : (d2 == -9223372036854775807L || d2 == Long.MIN_VALUE) ? ekf.d : d2, nz8.b() ? ekf.i(i4) : i2 != -1 && ekf.i(i2), z, j2, i3);
    }

    public final boolean i(jkf jkf, nz8 nz8, boolean z) {
        int b2 = jkf.b(nz8.a);
        if (jkf.n(jkf.g(b2, this.a, false).c, this.b, 0).i) {
            return false;
        }
        return jkf.d(b2, this.a, this.b, this.g, this.h) == -1 && z;
    }

    public final boolean j(jkf jkf, nz8 nz8) {
        if (!(!nz8.b() && nz8.e == -1)) {
            return false;
        }
        Object obj = nz8.a;
        return jkf.n(jkf.h(obj, this.a).c, this.b, 0).o == jkf.b(obj);
    }

    public final void k() {
        qb7 o2 = tb7.o();
        for (ot8 ot8 = this.i; ot8 != null; ot8 = ot8.l) {
            o2.a(ot8.f.a);
        }
        ot8 ot82 = this.j;
        ((k7f) this.d).d(new x55((Object) this, (Object) o2, (Object) ot82 == null ? null : ot82.f.a, 14));
    }

    public final boolean l(ot8 ot8) {
        n79.o(ot8);
        boolean z = false;
        if (ot8.equals(this.k)) {
            return false;
        }
        this.k = ot8;
        while (true) {
            ot8 = ot8.l;
            if (ot8 == null) {
                break;
            }
            if (ot8 == this.j) {
                this.j = this.i;
                z = true;
            }
            ot8.g();
            this.l--;
        }
        ot8 ot82 = this.k;
        ot82.getClass();
        if (ot82.l != null) {
            ot82.b();
            ot82.l = null;
            ot82.c();
        }
        k();
        return z;
    }

    public final nz8 n(jkf jkf, Object obj, long j2) {
        long j3;
        int b2;
        jkf jkf2 = jkf;
        Object obj2 = obj;
        ekf ekf = this.a;
        int i2 = jkf2.h(obj2, ekf).c;
        Object obj3 = this.m;
        if (obj3 == null || (b2 = jkf2.b(obj3)) == -1 || jkf2.g(b2, ekf, false).c != i2) {
            ot8 ot8 = this.i;
            while (true) {
                if (ot8 == null) {
                    ot8 ot82 = this.i;
                    while (true) {
                        if (ot82 != null) {
                            int b3 = jkf2.b(ot82.b);
                            if (b3 != -1 && jkf2.g(b3, ekf, false).c == i2) {
                                j3 = ot82.f.a.d;
                                break;
                            }
                            ot82 = ot82.l;
                        } else {
                            j3 = o(obj2);
                            if (j3 == -1) {
                                j3 = this.f;
                                this.f = 1 + j3;
                                if (this.i == null) {
                                    this.m = obj2;
                                    this.n = j3;
                                }
                            }
                        }
                    }
                } else if (ot8.b.equals(obj2)) {
                    j3 = ot8.f.a.d;
                    break;
                } else {
                    ot8 = ot8.l;
                }
            }
        } else {
            j3 = this.n;
        }
        jkf2.h(obj2, ekf);
        int i3 = ekf.c;
        hkf hkf = this.b;
        jkf2.o(i3, hkf);
        boolean z = false;
        for (int b4 = jkf.b(obj); b4 >= hkf.n; b4--) {
            boolean z2 = true;
            jkf2.g(b4, ekf, true);
            if (ekf.g.b <= 0) {
                z2 = false;
            }
            z |= z2;
            if (ekf.c(ekf.d) != -1) {
                obj2 = ekf.b;
                obj2.getClass();
            }
            if (z && (!z2 || ekf.d != 0)) {
                break;
            }
        }
        return m(jkf, obj2, j2, j3, this.b, this.a);
    }

    public final long o(Object obj) {
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            ot8 ot8 = (ot8) this.o.get(i2);
            if (ot8.b.equals(obj)) {
                return ot8.f.a.d;
            }
        }
        return -1;
    }

    public final boolean p(jkf jkf) {
        ot8 ot8;
        ot8 ot82 = this.i;
        if (ot82 == null) {
            return true;
        }
        int b2 = jkf.b(ot82.b);
        while (true) {
            jkf jkf2 = jkf;
            b2 = jkf2.d(b2, this.a, this.b, this.g, this.h);
            while (true) {
                ot82.getClass();
                ot8 = ot82.l;
                if (ot8 != null && !ot82.f.g) {
                    ot82 = ot8;
                }
            }
            if (b2 == -1 || ot8 == null || jkf.b(ot8.b) != b2) {
                boolean l2 = l(ot82);
                ot82.f = h(jkf, ot82.f);
            } else {
                ot82 = ot8;
            }
        }
        boolean l22 = l(ot82);
        ot82.f = h(jkf, ot82.f);
        return !l22;
    }

    public final boolean q(jkf jkf, long j2, long j3) {
        rt8 rt8;
        ot8 ot8 = this.i;
        ot8 ot82 = null;
        while (ot8 != null) {
            rt8 rt82 = ot8.f;
            if (ot82 == null) {
                rt8 = h(jkf, rt82);
            } else {
                rt8 d2 = d(jkf, ot82, j2);
                if (d2 == null) {
                    return !l(ot82);
                }
                if (rt82.b != d2.b || !rt82.a.equals(d2.a)) {
                    return !l(ot82);
                }
                rt8 = d2;
            }
            ot8.f = rt8.a(rt82.c);
            long j4 = rt82.e;
            if (j4 != -9223372036854775807L) {
                long j5 = rt8.e;
                if (j4 != j5) {
                    ot8.i();
                    return !l(ot8) && !(ot8 == this.j && !ot8.f.f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : ot8.o + j5) ? 1 : (j3 == ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : ot8.o + j5) ? 0 : -1)) >= 0));
                }
            }
            ot82 = ot8;
            ot8 = ot8.l;
        }
        return true;
    }
}
