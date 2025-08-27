package defpackage;

import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: csb  reason: default package */
public final class csb extends hl4 {
    public final bwb c;
    public final yvb d;
    public final bsb e;
    public boolean f;
    public y33 g = null;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public final /* synthetic */ u6a k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public csb(u6a u6a, zi0 zi0, bwb bwb, bsb bsb, yvb yvb) {
        super(zi0);
        this.k = u6a;
        this.c = bwb;
        this.e = bsb;
        this.d = yvb;
        ((ik0) yvb).a(new mp4(1, this));
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [y33] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(defpackage.csb r7, defpackage.y33 r8, int r9) {
        /*
            java.lang.String r0 = "Postprocessor"
            bsb r1 = r7.e
            boolean r2 = defpackage.y33.m0(r8)
            if (r2 == 0) goto L_0x006e
            java.lang.Object r2 = r8.e0()
            v33 r2 = (defpackage.v33) r2
            boolean r2 = r2 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
            if (r2 != 0) goto L_0x0018
            r7.o(r9, r8)
            goto L_0x0069
        L_0x0018:
            bwb r2 = r7.c
            yvb r3 = r7.d
            java.lang.String r4 = "PostprocessorProducer"
            r2.j(r3, r4)
            r5 = 0
            java.lang.Object r8 = r8.e0()     // Catch:{ Exception -> 0x004a }
            v33 r8 = (defpackage.v33) r8     // Catch:{ Exception -> 0x004a }
            jd4 r8 = r7.p(r8)     // Catch:{ Exception -> 0x004a }
            boolean r6 = r2.i(r3, r4)     // Catch:{ all -> 0x0045 }
            if (r6 != 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0045 }
            java.util.Map r5 = defpackage.xb7.a(r0, r1)     // Catch:{ all -> 0x0045 }
        L_0x003b:
            r2.a(r3, r4, r5)     // Catch:{ all -> 0x0045 }
            r7.o(r9, r8)     // Catch:{ all -> 0x0045 }
            defpackage.y33.U(r8)
            goto L_0x0069
        L_0x0045:
            r7 = move-exception
            r5 = r8
            goto L_0x006a
        L_0x0048:
            r7 = move-exception
            goto L_0x006a
        L_0x004a:
            r8 = move-exception
            boolean r9 = r2.i(r3, r4)     // Catch:{ all -> 0x0048 }
            if (r9 != 0) goto L_0x0053
            r9 = r5
            goto L_0x005b
        L_0x0053:
            java.lang.String r9 = r1.getName()     // Catch:{ all -> 0x0048 }
            java.util.Map r9 = defpackage.xb7.a(r0, r9)     // Catch:{ all -> 0x0048 }
        L_0x005b:
            r2.d(r3, r4, r8, r9)     // Catch:{ all -> 0x0048 }
            boolean r9 = r7.n()     // Catch:{ all -> 0x0048 }
            if (r9 == 0) goto L_0x0069
            zi0 r7 = r7.b     // Catch:{ all -> 0x0048 }
            r7.e(r8)     // Catch:{ all -> 0x0048 }
        L_0x0069:
            return
        L_0x006a:
            defpackage.y33.U(r5)
            throw r7
        L_0x006e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csb.m(csb, y33, int):void");
    }

    public final void d() {
        if (n()) {
            this.b.c();
        }
    }

    public final void f(Throwable th) {
        if (n()) {
            this.b.e(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        defpackage.y33.U(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        ((java.util.concurrent.Executor) r1.k.d).execute(new defpackage.tj7(18, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r2, java.lang.Object r3) {
        /*
            r1 = this;
            y33 r3 = (defpackage.y33) r3
            boolean r0 = defpackage.y33.m0(r3)
            if (r0 != 0) goto L_0x0013
            boolean r3 = defpackage.zi0.a(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 0
            r1.o(r2, r3)
            goto L_0x0043
        L_0x0013:
            monitor-enter(r1)
            boolean r0 = r1.f     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001c
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x0043
        L_0x001a:
            r2 = move-exception
            goto L_0x0044
        L_0x001c:
            y33 r0 = r1.g     // Catch:{ all -> 0x001a }
            y33 r3 = defpackage.y33.o(r3)     // Catch:{ all -> 0x001a }
            r1.g = r3     // Catch:{ all -> 0x001a }
            r1.h = r2     // Catch:{ all -> 0x001a }
            r2 = 1
            r1.i = r2     // Catch:{ all -> 0x001a }
            boolean r2 = r1.q()     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            defpackage.y33.U(r0)
            if (r2 == 0) goto L_0x0043
            u6a r2 = r1.k
            java.lang.Object r2 = r2.d
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            tj7 r3 = new tj7
            r0 = 18
            r3.<init>(r0, r1)
            r2.execute(r3)
        L_0x0043:
            return
        L_0x0044:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csb.h(int, java.lang.Object):void");
    }

    public final boolean n() {
        synchronized (this) {
            try {
                if (this.f) {
                    return false;
                }
                y33 y33 = this.g;
                this.g = null;
                this.f = true;
                y33.U(y33);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r1 != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(int r3, defpackage.y33 r4) {
        /*
            r2 = this;
            boolean r0 = defpackage.zi0.a(r3)
            if (r0 != 0) goto L_0x0010
            monitor-enter(r2)
            boolean r1 = r2.f     // Catch:{ all -> 0x000d }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0018
            goto L_0x0010
        L_0x000d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000d }
            throw r3
        L_0x0010:
            if (r0 == 0) goto L_0x001d
            boolean r0 = r2.n()
            if (r0 == 0) goto L_0x001d
        L_0x0018:
            zi0 r2 = r2.b
            r2.g(r3, r4)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csb.o(int, y33):void");
    }

    public final jd4 p(v33 v33) {
        CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) v33;
        y33 a = this.e.a(closeableStaticBitmap.getUnderlyingBitmap(), (ynb) this.k.c);
        try {
            CloseableStaticBitmap of = CloseableStaticBitmap.of(a, v33.getQualityInfo(), closeableStaticBitmap.getRotationAngle(), closeableStaticBitmap.getExifOrientation());
            of.putExtras(closeableStaticBitmap.getExtras());
            return y33.p0(of);
        } finally {
            y33.U(a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean q() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1.i     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.j     // Catch:{ all -> 0x001a }
            if (r0 != 0) goto L_0x001c
            y33 r0 = r1.g     // Catch:{ all -> 0x001a }
            boolean r0 = defpackage.y33.m0(r0)     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x001c
            r0 = 1
            r1.j = r0     // Catch:{ all -> 0x001a }
            monitor-exit(r1)
            return r0
        L_0x001a:
            r0 = move-exception
            goto L_0x001f
        L_0x001c:
            monitor-exit(r1)
            r1 = 0
            return r1
        L_0x001f:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csb.q():boolean");
    }
}
