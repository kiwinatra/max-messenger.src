package defpackage;

import android.os.Handler;

/* renamed from: ag8  reason: default package */
public final class ag8 extends rc3 {
    public final xj0 k;
    public final boolean l;
    public final gkf m;
    public final dkf n;
    public wf8 o;
    public uf8 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public ag8(xj0 xj0, boolean z) {
        boolean z2;
        this.k = xj0;
        if (z) {
            xj0.getClass();
            z2 = true;
        } else {
            z2 = false;
        }
        this.l = z2;
        this.m = new gkf();
        this.n = new dkf();
        xj0.getClass();
        this.o = new wf8(new yf8(xj0.f()), gkf.A0, wf8.v);
    }

    public final gr8 f() {
        return this.k.f();
    }

    public final void g() {
    }

    public final void i(arf arf) {
        this.j = arf;
        this.i = t0g.m((Handler.Callback) null);
        if (!this.l) {
            this.q = true;
            r((Integer) null, this.k);
        }
    }

    public final void k(lt8 lt8) {
        uf8 uf8 = (uf8) lt8;
        if (uf8.v != null) {
            xj0 xj0 = uf8.o;
            xj0.getClass();
            xj0.k(uf8.v);
        }
        if (lt8 == this.p) {
            this.p = null;
        }
    }

    public final void m() {
        this.r = false;
        this.q = false;
        super.m();
    }

    public final mz8 p(Object obj, mz8 mz8) {
        Void voidR = (Void) obj;
        Object obj2 = mz8.a;
        Object obj3 = this.o.o;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = wf8.v;
        }
        return mz8.b(obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(java.lang.Integer r15, defpackage.xj0 r16, defpackage.ikf r17) {
        /*
            r14 = this;
            r0 = r14
            r7 = r17
            r1 = r15
            java.lang.Void r1 = (java.lang.Void) r1
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x0022
            wf8 r1 = r0.o
            wf8 r2 = new wf8
            java.lang.Object r3 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r3, r1)
            r0.o = r2
            uf8 r1 = r0.p
            if (r1 == 0) goto L_0x00c0
            long r1 = r1.x
            r14.t(r1)
            goto L_0x00c0
        L_0x0022:
            boolean r1 = r17.q()
            java.lang.Object r8 = defpackage.wf8.v
            if (r1 == 0) goto L_0x0045
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x003a
            wf8 r1 = r0.o
            wf8 r2 = new wf8
            java.lang.Object r3 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r3, r1)
            goto L_0x0041
        L_0x003a:
            java.lang.Object r1 = defpackage.gkf.A0
            wf8 r2 = new wf8
            r2.<init>(r7, r1, r8)
        L_0x0041:
            r0.o = r2
            goto L_0x00c0
        L_0x0045:
            r1 = 0
            gkf r2 = r0.m
            r7.o(r1, r2)
            long r3 = r2.v0
            java.lang.Object r9 = r2.a
            uf8 r5 = r0.p
            if (r5 == 0) goto L_0x0072
            wf8 r6 = r0.o
            mz8 r10 = r5.a
            java.lang.Object r10 = r10.a
            dkf r11 = r0.n
            r6.h(r10, r11)
            long r10 = r11.v
            long r5 = r5.b
            long r10 = r10 + r5
            wf8 r5 = r0.o
            r12 = 0
            r5.n(r1, r2, r12)
            long r1 = r2.v0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0072
            r5 = r10
            goto L_0x0073
        L_0x0072:
            r5 = r3
        L_0x0073:
            gkf r2 = r0.m
            dkf r3 = r0.n
            r4 = 0
            r1 = r17
            android.util.Pair r1 = r1.j(r2, r3, r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x0098
            wf8 r1 = r0.o
            wf8 r2 = new wf8
            java.lang.Object r5 = r1.c
            java.lang.Object r1 = r1.o
            r2.<init>(r7, r5, r1)
            goto L_0x009e
        L_0x0098:
            wf8 r1 = new wf8
            r1.<init>(r7, r9, r2)
            r2 = r1
        L_0x009e:
            r0.o = r2
            uf8 r1 = r0.p
            if (r1 == 0) goto L_0x00c0
            r14.t(r3)
            mz8 r1 = r1.a
            java.lang.Object r2 = r1.a
            wf8 r3 = r0.o
            java.lang.Object r3 = r3.o
            if (r3 == 0) goto L_0x00bb
            boolean r3 = r2.equals(r8)
            if (r3 == 0) goto L_0x00bb
            wf8 r2 = r0.o
            java.lang.Object r2 = r2.o
        L_0x00bb:
            mz8 r1 = r1.b(r2)
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            r2 = 1
            r0.s = r2
            r0.r = r2
            wf8 r2 = r0.o
            r14.j(r2)
            if (r1 == 0) goto L_0x00f4
            uf8 r0 = r0.p
            r0.getClass()
            long r2 = r0.x
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00de
            goto L_0x00e0
        L_0x00de:
            long r2 = r0.b
        L_0x00e0:
            xj0 r4 = r0.o
            r4.getClass()
            cb4 r5 = r0.c
            lt8 r1 = r4.a(r1, r5, r2)
            r0.v = r1
            jt8 r4 = r0.w
            if (r4 == 0) goto L_0x00f4
            r1.S(r0, r2)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ag8.q(java.lang.Integer, xj0, ikf):void");
    }

    /* renamed from: s */
    public final uf8 a(mz8 mz8, cb4 cb4, long j) {
        uf8 uf8 = new uf8(mz8, cb4, j);
        y64.j(uf8.o == null);
        xj0 xj0 = this.k;
        uf8.o = xj0;
        if (this.r) {
            Object obj = this.o.o;
            Object obj2 = mz8.a;
            if (obj != null && obj2.equals(wf8.v)) {
                obj2 = this.o.o;
            }
            mz8 b = mz8.b(obj2);
            long a = uf8.a(j);
            xj0 xj02 = uf8.o;
            xj02.getClass();
            lt8 a2 = xj02.a(b, cb4, a);
            uf8.v = a2;
            if (uf8.w != null) {
                a2.S(uf8, a);
            }
        } else {
            this.p = uf8;
            if (!this.q) {
                this.q = true;
                r((Integer) null, xj0);
            }
        }
        return uf8;
    }

    public final void t(long j) {
        uf8 uf8 = this.p;
        int b = this.o.b(uf8.a.a);
        if (b != -1) {
            wf8 wf8 = this.o;
            dkf dkf = this.n;
            wf8.g(b, dkf, false);
            long j2 = dkf.o;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            uf8.x = j;
        }
    }
}
