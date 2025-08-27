package defpackage;

/* renamed from: v4d  reason: default package */
public final class v4d extends i0 {
    public i0 h;

    public static void o(i0 i0Var) {
        if (i0Var != null) {
            i0Var.a();
        }
    }

    public final boolean a() {
        synchronized (this) {
            try {
                if (!super.a()) {
                    return false;
                }
                i0 i0Var = this.h;
                this.h = null;
                o(i0Var);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized Object e() {
        i0 i0Var;
        i0Var = this.h;
        return i0Var != null ? i0Var.e() : null;
    }

    public final synchronized boolean f() {
        i0 i0Var;
        i0Var = this.h;
        return i0Var != null && i0Var.f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        if (r4 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        r4.m(new defpackage.fk5(1, r3), defpackage.io1.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        o(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(defpackage.r2f r4) {
        /*
            r3 = this;
            boolean r0 = r3.g()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            if (r4 == 0) goto L_0x0010
            java.lang.Object r4 = r4.get()
            i0 r4 = (defpackage.i0) r4
            goto L_0x0011
        L_0x0010:
            r4 = 0
        L_0x0011:
            monitor-enter(r3)
            boolean r0 = r3.g()     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001f
            o(r4)     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r4 = move-exception
            goto L_0x0035
        L_0x001f:
            i0 r0 = r3.h     // Catch:{ all -> 0x001d }
            r3.h = r4     // Catch:{ all -> 0x001d }
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            if (r4 == 0) goto L_0x0031
            fk5 r1 = new fk5
            r2 = 1
            r1.<init>(r2, r3)
            io1 r3 = defpackage.io1.a
            r4.m(r1, r3)
        L_0x0031:
            o(r0)
            return
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v4d.p(r2f):void");
    }
}
