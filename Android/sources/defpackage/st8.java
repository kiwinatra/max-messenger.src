package defpackage;

import android.os.Handler;
import android.util.Pair;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: st8  reason: default package */
public final class st8 {
    public final dkf a = new dkf();
    public final gkf b = new gkf();
    public final vb4 c;
    public final Handler d;
    public long e;
    public int f;
    public boolean g;
    public nt8 h;
    public nt8 i;
    public nt8 j;
    public int k;
    public Object l;
    public long m;

    public st8(vb4 vb4, Handler handler) {
        this.c = vb4;
        this.d = handler;
    }

    public static mz8 l(ikf ikf, Object obj, long j2, long j3, gkf gkf, dkf dkf) {
        ikf.h(obj, dkf);
        ikf.o(dkf.c, gkf);
        int b2 = ikf.b(obj);
        Object obj2 = obj;
        while (dkf.o == 0) {
            p9 p9Var = dkf.x;
            if (p9Var.a <= 0 || !dkf.g(p9Var.o) || dkf.c(0) != -1) {
                break;
            }
            int i2 = b2 + 1;
            if (b2 >= gkf.y0) {
                break;
            }
            ikf.g(i2, dkf, true);
            obj2 = dkf.b;
            obj2.getClass();
            b2 = i2;
        }
        ikf.h(obj2, dkf);
        int c2 = dkf.c(j2);
        return c2 == -1 ? new mz8(obj2, j3, dkf.b(j2)) : new pt8(obj2, c2, dkf.e(c2), j3, -1);
    }

    public final nt8 a() {
        nt8 nt8 = this.h;
        if (nt8 == null) {
            return null;
        }
        if (nt8 == this.i) {
            this.i = nt8.l;
        }
        nt8.f();
        int i2 = this.k - 1;
        this.k = i2;
        if (i2 == 0) {
            this.j = null;
            nt8 nt82 = this.h;
            this.l = nt82.b;
            this.m = nt82.f.a.d;
        }
        this.h = this.h.l;
        j();
        return this.h;
    }

    public final void b() {
        if (this.k != 0) {
            nt8 nt8 = this.h;
            y64.k(nt8);
            this.l = nt8.b;
            this.m = nt8.f.a.d;
            while (nt8 != null) {
                nt8.f();
                nt8 = nt8.l;
            }
            this.h = null;
            this.j = null;
            this.i = null;
            this.k = 0;
            j();
        }
    }

    public final qt8 c(ikf ikf, nt8 nt8, long j2) {
        long j3;
        long j4;
        long j5;
        mz8 mz8;
        long j6;
        long j7;
        long j8;
        long j9;
        ikf ikf2 = ikf;
        nt8 nt82 = nt8;
        qt8 qt8 = nt82.f;
        long j10 = (nt82.o + qt8.e) - j2;
        dkf dkf = this.a;
        boolean z = qt8.g;
        boolean z2 = true;
        long j11 = qt8.c;
        mz8 mz82 = qt8.a;
        if (z) {
            mz8 mz83 = mz82;
            long j12 = j11;
            int d2 = ikf.d(ikf2.b(mz82.a), this.a, this.b, this.f, this.g);
            if (d2 == -1) {
                return null;
            }
            int i2 = ikf2.g(d2, dkf, true).c;
            Object obj = dkf.b;
            obj.getClass();
            if (ikf2.n(i2, this.b, 0).x0 == d2) {
                Pair k2 = ikf.k(this.b, this.a, i2, -9223372036854775807L, Math.max(0, j10));
                if (k2 == null) {
                    return null;
                }
                obj = k2.first;
                long longValue = ((Long) k2.second).longValue();
                nt8 nt83 = nt82.l;
                if (nt83 == null || !nt83.b.equals(obj)) {
                    j9 = this.e;
                    this.e = 1 + j9;
                } else {
                    j9 = nt83.f.a.d;
                }
                j5 = longValue;
                mz8 = mz83;
                j6 = j9;
                j4 = -9223372036854775807L;
            } else {
                mz8 = mz83;
                j5 = 0;
                j4 = 0;
                j6 = mz8.d;
            }
            mz8 l2 = l(ikf, obj, j5, j6, this.b, this.a);
            if (!(j4 == -9223372036854775807L || j12 == -9223372036854775807L)) {
                if (ikf2.h(mz8.a, dkf).x.a <= 0 || !dkf.g(dkf.x.o)) {
                    z2 = false;
                }
                if (l2.a() && z2) {
                    j7 = j5;
                    j8 = j12;
                    return d(ikf, l2, j8, j7);
                } else if (z2) {
                    j8 = j4;
                    j7 = j12;
                    return d(ikf, l2, j8, j7);
                }
            }
            j7 = j5;
            j8 = j4;
            return d(ikf, l2, j8, j7);
        }
        mz8 mz84 = mz82;
        long j13 = j11;
        ikf2.h(mz84.a, dkf);
        boolean a2 = mz84.a();
        Object obj2 = mz84.a;
        if (a2) {
            p9 p9Var = dkf.x;
            int i3 = mz84.b;
            int i4 = p9Var.a(i3).b;
            if (i4 == -1) {
                return null;
            }
            int a3 = dkf.x.a(i3).a(mz84.c);
            if (a3 < i4) {
                return e(ikf, mz84.a, i3, a3, qt8.c, mz84.d);
            }
            if (j13 == -9223372036854775807L) {
                Pair k3 = ikf.k(this.b, dkf, dkf.c, -9223372036854775807L, Math.max(0, j10));
                if (k3 == null) {
                    return null;
                }
                j3 = ((Long) k3.second).longValue();
            } else {
                j3 = j13;
            }
            ikf2.h(obj2, dkf);
            p9 p9Var2 = dkf.x;
            int i5 = mz84.b;
            long j14 = p9Var2.a(i5).a;
            return f(ikf, mz84.a, Math.max(j14 == Long.MIN_VALUE ? dkf.o : dkf.x.a(i5).w + j14, j3), qt8.c, mz84.d);
        }
        int i6 = mz84.e;
        int e2 = dkf.e(i6);
        if (!dkf.g(i6) || dkf.d(i6, e2) != 3) {
            z2 = false;
        }
        if (e2 == dkf.x.a(i6).b || z2) {
            ikf2.h(obj2, dkf);
            long j15 = dkf.x.a(i6).a;
            return f(ikf, mz84.a, j15 == Long.MIN_VALUE ? dkf.o : j15 + dkf.x.a(i6).w, qt8.e, mz84.d);
        }
        return e(ikf, mz84.a, mz84.e, e2, qt8.e, mz84.d);
    }

    public final qt8 d(ikf ikf, mz8 mz8, long j2, long j3) {
        mz8 mz82 = mz8;
        ikf ikf2 = ikf;
        ikf.h(mz82.a, this.a);
        if (mz8.a()) {
            int i2 = mz82.c;
            long j4 = mz82.d;
            return e(ikf, mz82.a, mz82.b, i2, j2, j4);
        }
        return f(ikf, mz82.a, j3, j2, mz82.d);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: pt8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: mz8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qt8 e(defpackage.ikf r18, java.lang.Object r19, int r20, int r21, long r22, long r24) {
        /*
            r17 = this;
            r7 = r20
            r8 = r21
            mz8 r9 = new mz8
            r6 = -1
            r0 = r9
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r6)
            r0 = r17
            dkf r0 = r0.a
            r1 = r18
            r2 = r19
            dkf r1 = r1.h(r2, r0)
            long r10 = r1.a(r7, r8)
            int r1 = r0.e(r7)
            r2 = 0
            if (r8 != r1) goto L_0x0030
            p9 r1 = r0.x
            long r4 = r1.b
            goto L_0x0031
        L_0x0030:
            r4 = r2
        L_0x0031:
            boolean r12 = r0.g(r7)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            r0 = 1
            long r0 = r10 - r0
            long r0 = java.lang.Math.max(r2, r0)
            r2 = r0
            goto L_0x004d
        L_0x004c:
            r2 = r4
        L_0x004d:
            qt8 r14 = new qt8
            r13 = 0
            r15 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = 0
            r0 = r14
            r1 = r9
            r4 = r22
            r8 = r10
            r10 = r12
            r11 = r16
            r12 = r13
            r13 = r15
            r0.<init>(r1, r2, r4, r6, r8, r10, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st8.e(ikf, java.lang.Object, int, int, long, long):qt8");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qt8 f(defpackage.ikf r26, java.lang.Object r27, long r28, long r30, long r32) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            dkf r5 = r0.a
            r1.h(r2, r5)
            int r6 = r5.b(r3)
            r7 = 1
            r8 = 0
            r9 = -1
            if (r6 != r9) goto L_0x0026
            p9 r10 = r5.x
            int r11 = r10.a
            if (r11 <= 0) goto L_0x005c
            int r10 = r10.o
            boolean r10 = r5.g(r10)
            if (r10 == 0) goto L_0x005c
            r10 = r7
            goto L_0x005d
        L_0x0026:
            boolean r10 = r5.g(r6)
            if (r10 == 0) goto L_0x005c
            p9 r10 = r5.x
            n9 r10 = r10.a(r6)
            long r10 = r10.a
            long r12 = r5.o
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x005c
            p9 r10 = r5.x
            n9 r10 = r10.a(r6)
            int r11 = r10.b
            if (r11 != r9) goto L_0x0046
        L_0x0044:
            r10 = r7
            goto L_0x0056
        L_0x0046:
            r12 = r8
        L_0x0047:
            if (r12 >= r11) goto L_0x0055
            int[] r13 = r10.o
            r13 = r13[r12]
            if (r13 == 0) goto L_0x0044
            if (r13 != r7) goto L_0x0052
            goto L_0x0044
        L_0x0052:
            int r12 = r12 + 1
            goto L_0x0047
        L_0x0055:
            r10 = r8
        L_0x0056:
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x005c
            r10 = r7
            r6 = r9
            goto L_0x005d
        L_0x005c:
            r10 = r8
        L_0x005d:
            mz8 r12 = new mz8
            r13 = r32
            r12.<init>(r2, r13, r6)
            boolean r2 = r12.a()
            if (r2 != 0) goto L_0x006e
            if (r6 != r9) goto L_0x006e
            r2 = r7
            goto L_0x006f
        L_0x006e:
            r2 = r8
        L_0x006f:
            boolean r23 = r0.i(r1, r12)
            boolean r24 = r0.h(r1, r12, r2)
            if (r6 == r9) goto L_0x0082
            boolean r0 = r5.g(r6)
            if (r0 == 0) goto L_0x0082
            r21 = r7
            goto L_0x0084
        L_0x0082:
            r21 = r8
        L_0x0084:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L_0x0096
            p9 r7 = r5.x
            n9 r6 = r7.a(r6)
            long r6 = r6.a
        L_0x0093:
            r17 = r6
            goto L_0x009d
        L_0x0096:
            if (r10 == 0) goto L_0x009b
            long r6 = r5.o
            goto L_0x0093
        L_0x009b:
            r17 = r0
        L_0x009d:
            int r6 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x00ab
            r6 = -9223372036854775808
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00a8
            goto L_0x00ab
        L_0x00a8:
            r19 = r17
            goto L_0x00af
        L_0x00ab:
            long r5 = r5.o
            r19 = r5
        L_0x00af:
            int r0 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00c3
            int r0 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r0 < 0) goto L_0x00c3
            r0 = 1
            long r0 = r19 - r0
            r3 = 0
            long r0 = java.lang.Math.max(r3, r0)
            r13 = r0
            goto L_0x00c4
        L_0x00c3:
            r13 = r3
        L_0x00c4:
            qt8 r0 = new qt8
            r11 = r0
            r15 = r30
            r22 = r2
            r11.<init>(r12, r13, r15, r17, r19, r21, r22, r23, r24)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st8.f(ikf, java.lang.Object, long, long, long):qt8");
    }

    public final qt8 g(ikf ikf, qt8 qt8) {
        ikf ikf2 = ikf;
        qt8 qt82 = qt8;
        mz8 mz8 = qt82.a;
        boolean a2 = mz8.a();
        int i2 = mz8.e;
        boolean z = !a2 && i2 == -1;
        boolean i3 = i(ikf2, mz8);
        boolean h2 = h(ikf2, mz8, z);
        Object obj = qt82.a.a;
        dkf dkf = this.a;
        ikf2.h(obj, dkf);
        long j2 = (mz8.a() || i2 == -1) ? -9223372036854775807L : dkf.x.a(i2).a;
        boolean a3 = mz8.a();
        int i4 = mz8.b;
        return new qt8(mz8, qt82.b, qt82.c, j2, a3 ? dkf.a(i4, mz8.c) : (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? dkf.o : j2, mz8.a() ? dkf.g(i4) : i2 != -1 && dkf.g(i2), z, i3, h2);
    }

    public final boolean h(ikf ikf, mz8 mz8, boolean z) {
        int b2 = ikf.b(mz8.a);
        if (ikf.n(ikf.g(b2, this.a, false).c, this.b, 0).z) {
            return false;
        }
        return ikf.d(b2, this.a, this.b, this.f, this.g) == -1 && z;
    }

    public final boolean i(ikf ikf, mz8 mz8) {
        if (!(!mz8.a() && mz8.e == -1)) {
            return false;
        }
        Object obj = mz8.a;
        return ikf.n(ikf.h(obj, this.a).c, this.b, 0).y0 == ikf.b(obj);
    }

    public final void j() {
        qb7 o = tb7.o();
        for (nt8 nt8 = this.h; nt8 != null; nt8 = nt8.l) {
            o.a(nt8.f.a);
        }
        nt8 nt82 = this.i;
        this.d.post(new x55((Object) this, (Object) o, (Object) nt82 == null ? null : nt82.f.a, 13));
    }

    public final boolean k(nt8 nt8) {
        boolean z = false;
        y64.j(nt8 != null);
        if (nt8.equals(this.j)) {
            return false;
        }
        this.j = nt8;
        while (true) {
            nt8 = nt8.l;
            if (nt8 == null) {
                break;
            }
            if (nt8 == this.i) {
                this.i = this.h;
                z = true;
            }
            nt8.f();
            this.k--;
        }
        nt8 nt82 = this.j;
        if (nt82.l != null) {
            nt82.b();
            nt82.l = null;
            nt82.c();
        }
        j();
        return z;
    }

    public final mz8 m(ikf ikf, Object obj, long j2) {
        long j3;
        int b2;
        ikf ikf2 = ikf;
        Object obj2 = obj;
        dkf dkf = this.a;
        int i2 = ikf2.h(obj2, dkf).c;
        Object obj3 = this.l;
        if (obj3 == null || (b2 = ikf2.b(obj3)) == -1 || ikf2.g(b2, dkf, false).c != i2) {
            nt8 nt8 = this.h;
            while (true) {
                if (nt8 == null) {
                    nt8 nt82 = this.h;
                    while (true) {
                        if (nt82 != null) {
                            int b3 = ikf2.b(nt82.b);
                            if (b3 != -1 && ikf2.g(b3, dkf, false).c == i2) {
                                j3 = nt82.f.a.d;
                                break;
                            }
                            nt82 = nt82.l;
                        } else {
                            j3 = this.e;
                            this.e = 1 + j3;
                            if (this.h == null) {
                                this.l = obj2;
                                this.m = j3;
                            }
                        }
                    }
                } else if (nt8.b.equals(obj2)) {
                    j3 = nt8.f.a.d;
                    break;
                } else {
                    nt8 = nt8.l;
                }
            }
        } else {
            j3 = this.m;
        }
        ikf2.h(obj2, dkf);
        int i3 = dkf.c;
        gkf gkf = this.b;
        ikf2.o(i3, gkf);
        boolean z = false;
        for (int b4 = ikf.b(obj); b4 >= gkf.x0; b4--) {
            boolean z2 = true;
            ikf2.g(b4, dkf, true);
            if (dkf.x.a <= 0) {
                z2 = false;
            }
            z |= z2;
            if (dkf.c(dkf.o) != -1) {
                obj2 = dkf.b;
                obj2.getClass();
            }
            if (z && (!z2 || dkf.o != 0)) {
                break;
            }
        }
        return l(ikf, obj2, j2, j3, this.b, this.a);
    }

    public final boolean n(ikf ikf) {
        nt8 nt8;
        nt8 nt82 = this.h;
        if (nt82 == null) {
            return true;
        }
        int b2 = ikf.b(nt82.b);
        while (true) {
            ikf ikf2 = ikf;
            b2 = ikf2.d(b2, this.a, this.b, this.f, this.g);
            while (true) {
                nt8 = nt82.l;
                if (nt8 != null && !nt82.f.g) {
                    nt82 = nt8;
                }
            }
            if (b2 == -1 || nt8 == null || ikf.b(nt8.b) != b2) {
                boolean k2 = k(nt82);
                nt82.f = g(ikf, nt82.f);
            } else {
                nt82 = nt8;
            }
        }
        boolean k22 = k(nt82);
        nt82.f = g(ikf, nt82.f);
        return !k22;
    }

    public final boolean o(ikf ikf, long j2, long j3) {
        qt8 qt8;
        nt8 nt8 = this.h;
        nt8 nt82 = null;
        while (nt8 != null) {
            qt8 qt82 = nt8.f;
            if (nt82 == null) {
                qt8 = g(ikf, qt82);
            } else {
                qt8 c2 = c(ikf, nt82, j2);
                if (c2 == null) {
                    return !k(nt82);
                }
                if (qt82.b != c2.b || !qt82.a.equals(c2.a)) {
                    return !k(nt82);
                }
                qt8 = c2;
            }
            nt8.f = qt8.a(qt82.c);
            long j4 = qt82.e;
            if (j4 != -9223372036854775807L) {
                long j5 = qt8.e;
                if (j4 != j5) {
                    nt8.h();
                    return !k(nt8) && !(nt8 == this.i && !nt8.f.f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : nt8.o + j5) ? 1 : (j3 == ((j5 > -9223372036854775807L ? 1 : (j5 == -9223372036854775807L ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : nt8.o + j5) ? 0 : -1)) >= 0));
                }
            }
            nt82 = nt8;
            nt8 = nt8.l;
        }
        return true;
    }
}
