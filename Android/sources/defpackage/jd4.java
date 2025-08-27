package defpackage;

/* renamed from: jd4  reason: default package */
public final class jd4 extends y33 {
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = r5.b.b();
        r3 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r5));
        r4 = java.lang.Integer.valueOf(java.lang.System.identityHashCode(r5.b));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r0 = r0.getClass().getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        defpackage.bg5.o("DefaultCloseableReference", "Finalized without closing: %x %x (type = %s)", r3, r4, r0);
        r0 = r5.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r0 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        r0.e(r5.b, r5.o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finalize() {
        /*
            r5 = this;
            monitor-enter(r5)     // Catch:{ all -> 0x0048 }
            boolean r0 = r5.a     // Catch:{ all -> 0x000a }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r5)     // Catch:{ all -> 0x000a }
            super.finalize()
            return
        L_0x000a:
            r0 = move-exception
            goto L_0x0051
        L_0x000c:
            monitor-exit(r5)     // Catch:{ all -> 0x000a }
            w6e r0 = r5.b     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r0.b()     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = "DefaultCloseableReference"
            java.lang.String r2 = "Finalized without closing: %x %x (type = %s)"
            int r3 = java.lang.System.identityHashCode(r5)     // Catch:{ all -> 0x0048 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0048 }
            w6e r4 = r5.b     // Catch:{ all -> 0x0048 }
            int r4 = java.lang.System.identityHashCode(r4)     // Catch:{ all -> 0x0048 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x002d
            r0 = 0
            goto L_0x0035
        L_0x002d:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0048 }
        L_0x0035:
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r4, r0}     // Catch:{ all -> 0x0048 }
            defpackage.bg5.o(r1, r2, r0)     // Catch:{ all -> 0x0048 }
            x33 r0 = r5.c     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x004a
            w6e r1 = r5.b     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r2 = r5.o     // Catch:{ all -> 0x0048 }
            r0.e(r1, r2)     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r0 = move-exception
            goto L_0x0053
        L_0x004a:
            r5.close()     // Catch:{ all -> 0x0048 }
            super.finalize()
            return
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x000a }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0053:
            super.finalize()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd4.finalize():void");
    }

    /* renamed from: m */
    public final y33 clone() {
        cvg.q(k0());
        return new y33(this.b, this.c, this.o != null ? new Throwable() : null);
    }
}
