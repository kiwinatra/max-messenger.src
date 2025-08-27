package defpackage;

/* renamed from: bg8  reason: default package */
public final class bg8 extends sqg {
    public final boolean l;
    public final hkf m;
    public final ekf n;
    public xf8 o;
    public vf8 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public bg8(yj0 yj0, boolean z) {
        super(yj0);
        this.l = z && yj0.j();
        this.m = new hkf();
        this.n = new ekf();
        jkf h = yj0.h();
        if (h != null) {
            this.o = new xf8(h, (Object) null, (Object) null);
            this.s = true;
            return;
        }
        this.o = new xf8(new zf8(yj0.i()), hkf.q, xf8.h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(defpackage.jkf r15) {
        /*
            r14 = this;
            boolean r0 = r14.r
            if (r0 == 0) goto L_0x001c
            xf8 r0 = r14.o
            xf8 r1 = new xf8
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            r14.o = r1
            vf8 r15 = r14.p
            if (r15 == 0) goto L_0x00bf
            long r0 = r15.x
            r14.D(r0)
            goto L_0x00bf
        L_0x001c:
            boolean r0 = r15.q()
            if (r0 == 0) goto L_0x0040
            boolean r0 = r14.s
            if (r0 == 0) goto L_0x0032
            xf8 r0 = r14.o
            xf8 r1 = new xf8
            java.lang.Object r2 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r2, r0)
            goto L_0x003c
        L_0x0032:
            java.lang.Object r0 = defpackage.hkf.q
            java.lang.Object r1 = defpackage.xf8.h
            xf8 r2 = new xf8
            r2.<init>(r15, r0, r1)
            r1 = r2
        L_0x003c:
            r14.o = r1
            goto L_0x00bf
        L_0x0040:
            r0 = 0
            hkf r1 = r14.m
            r15.o(r0, r1)
            long r2 = r1.l
            java.lang.Object r4 = r1.a
            vf8 r5 = r14.p
            if (r5 == 0) goto L_0x006d
            xf8 r6 = r14.o
            nz8 r7 = r5.a
            java.lang.Object r7 = r7.a
            ekf r8 = r14.n
            r6.h(r7, r8)
            long r6 = r8.e
            long r8 = r5.b
            long r6 = r6 + r8
            xf8 r5 = r14.o
            r8 = 0
            r5.n(r0, r1, r8)
            long r0 = r1.l
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            r12 = r6
            goto L_0x006e
        L_0x006d:
            r12 = r2
        L_0x006e:
            r11 = 0
            hkf r9 = r14.m
            ekf r10 = r14.n
            r8 = r15
            android.util.Pair r0 = r8.j(r9, r10, r11, r12)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r14.s
            if (r0 == 0) goto L_0x0092
            xf8 r0 = r14.o
            xf8 r1 = new xf8
            java.lang.Object r4 = r0.f
            java.lang.Object r0 = r0.g
            r1.<init>(r15, r4, r0)
            goto L_0x0098
        L_0x0092:
            xf8 r0 = new xf8
            r0.<init>(r15, r4, r1)
            r1 = r0
        L_0x0098:
            r14.o = r1
            vf8 r15 = r14.p
            if (r15 == 0) goto L_0x00bf
            boolean r0 = r14.D(r2)
            if (r0 == 0) goto L_0x00bf
            nz8 r15 = r15.a
            java.lang.Object r0 = r15.a
            xf8 r1 = r14.o
            java.lang.Object r1 = r1.g
            if (r1 == 0) goto L_0x00ba
            java.lang.Object r1 = defpackage.xf8.h
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00ba
            xf8 r0 = r14.o
            java.lang.Object r0 = r0.g
        L_0x00ba:
            nz8 r15 = r15.a(r0)
            goto L_0x00c0
        L_0x00bf:
            r15 = 0
        L_0x00c0:
            r0 = 1
            r14.s = r0
            r14.r = r0
            xf8 r0 = r14.o
            r14.n(r0)
            if (r15 == 0) goto L_0x00d4
            vf8 r14 = r14.p
            r14.getClass()
            r14.a(r15)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bg8.A(jkf):void");
    }

    public final void B() {
        if (!this.l) {
            this.q = true;
            y((Object) null, this.k);
        }
    }

    /* renamed from: C */
    public final vf8 c(nz8 nz8, cb4 cb4, long j) {
        vf8 vf8 = new vf8(nz8, cb4, j);
        n79.n(vf8.o == null);
        yj0 yj0 = this.k;
        vf8.o = yj0;
        if (this.r) {
            Object obj = this.o.g;
            Object obj2 = nz8.a;
            if (obj != null && obj2.equals(xf8.h)) {
                obj2 = this.o.g;
            }
            vf8.a(nz8.a(obj2));
        } else {
            this.p = vf8;
            if (!this.q) {
                this.q = true;
                y((Object) null, yj0);
            }
        }
        return vf8;
    }

    public final boolean D(long j) {
        vf8 vf8 = this.p;
        int b = this.o.b(vf8.a.a);
        if (b == -1) {
            return false;
        }
        xf8 xf8 = this.o;
        ekf ekf = this.n;
        xf8.g(b, ekf, false);
        long j2 = ekf.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0, j2 - 1);
        }
        vf8.x = j;
        return true;
    }

    public final boolean a(ir8 ir8) {
        return this.k.a(ir8);
    }

    public final void k() {
    }

    public final void o(mt8 mt8) {
        ((vf8) mt8).e();
        if (mt8 == this.p) {
            this.p = null;
        }
    }

    public final void q() {
        this.r = false;
        this.q = false;
        super.q();
    }

    public final void t(ir8 ir8) {
        if (this.s) {
            xf8 xf8 = this.o;
            this.o = new xf8(new aqb(this.o.e, ir8), xf8.f, xf8.g);
        } else {
            this.o = new xf8(new zf8(ir8), hkf.q, xf8.h);
        }
        this.k.t(ir8);
    }

    public final nz8 z(nz8 nz8) {
        Object obj = nz8.a;
        Object obj2 = this.o.g;
        if (obj2 != null && obj2.equals(obj)) {
            obj = xf8.h;
        }
        return nz8.a(obj);
    }
}
