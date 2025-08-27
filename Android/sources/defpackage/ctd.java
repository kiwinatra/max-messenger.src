package defpackage;

/* renamed from: ctd  reason: default package */
public final class ctd extends vw5 {
    public final vw5 b;
    public boolean c;
    public cs o;
    public volatile boolean v;

    public ctd(lvf lvf) {
        this.b = lvf;
    }

    public final void b() {
        if (!this.v) {
            synchronized (this) {
                try {
                    if (!this.v) {
                        this.v = true;
                        if (this.c) {
                            cs csVar = this.o;
                            if (csVar == null) {
                                csVar = new cs();
                                this.o = csVar;
                            }
                            csVar.c(lea.a);
                            return;
                        }
                        this.c = true;
                        this.b.b();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void d(Object obj) {
        if (!this.v) {
            synchronized (this) {
                try {
                    if (!this.v) {
                        if (this.c) {
                            cs csVar = this.o;
                            if (csVar == null) {
                                csVar = new cs();
                                this.o = csVar;
                            }
                            csVar.c(obj);
                            return;
                        }
                        this.c = true;
                        this.b.d(obj);
                        h();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void e(rye rye) {
        boolean z = true;
        if (!this.v) {
            synchronized (this) {
                try {
                    if (!this.v) {
                        if (this.c) {
                            cs csVar = this.o;
                            if (csVar == null) {
                                csVar = new cs();
                                this.o = csVar;
                            }
                            csVar.c(new kea(rye));
                            return;
                        }
                        this.c = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            rye.cancel();
            return;
        }
        this.b.e(rye);
        h();
    }

    public final void g(pye pye) {
        this.b.f(pye);
    }

    public final void h() {
        cs csVar;
        while (true) {
            synchronized (this) {
                try {
                    csVar = this.o;
                    if (csVar == null) {
                        this.c = false;
                        return;
                    }
                    this.o = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            csVar.b(this.b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (r1 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        defpackage.n54.D(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        r3.b.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.v
            if (r0 == 0) goto L_0x0008
            defpackage.n54.D(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.v     // Catch:{ all -> 0x0022 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            r3.v = r1     // Catch:{ all -> 0x0022 }
            boolean r0 = r3.c     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r0 == 0) goto L_0x0031
            cs r0 = r3.o     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0024
            cs r0 = new cs     // Catch:{ all -> 0x0022 }
            r0.<init>()     // Catch:{ all -> 0x0022 }
            r3.o = r0     // Catch:{ all -> 0x0022 }
            goto L_0x0024
        L_0x0022:
            r4 = move-exception
            goto L_0x0041
        L_0x0024:
            jea r1 = new jea     // Catch:{ all -> 0x0022 }
            r1.<init>(r4)     // Catch:{ all -> 0x0022 }
            java.lang.Object r4 = r0.c     // Catch:{ all -> 0x0022 }
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch:{ all -> 0x0022 }
            r4[r2] = r1     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            return
        L_0x0031:
            r3.c = r1     // Catch:{ all -> 0x0022 }
            r1 = r2
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x003b
            defpackage.n54.D(r4)
            return
        L_0x003b:
            vw5 r3 = r3.b
            r3.onError(r4)
            return
        L_0x0041:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.onError(java.lang.Throwable):void");
    }
}
