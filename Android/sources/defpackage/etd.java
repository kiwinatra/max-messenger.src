package defpackage;

/* renamed from: etd  reason: default package */
public final class etd extends gh3 implements bs {
    public final gh3 a;
    public boolean b;
    public cs c;
    public volatile boolean o;

    public etd(dac dac) {
        this.a = dac;
    }

    public final void H() {
        cs csVar;
        while (true) {
            synchronized (this) {
                try {
                    csVar = this.c;
                    if (csVar == null) {
                        this.b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            csVar.o(this);
        }
    }

    public final void b() {
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        this.o = true;
                        if (this.b) {
                            cs csVar = this.c;
                            if (csVar == null) {
                                csVar = new cs();
                                this.c = csVar;
                            }
                            csVar.c(lea.a);
                            return;
                        }
                        this.b = true;
                        this.a.b();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void c(mq4 mq4) {
        boolean z = true;
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.b) {
                            cs csVar = this.c;
                            if (csVar == null) {
                                csVar = new cs();
                                this.c = csVar;
                            }
                            csVar.c(new iea(mq4));
                            return;
                        }
                        this.b = true;
                        z = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            mq4.dispose();
            return;
        }
        this.a.c(mq4);
        H();
    }

    public final void d(Object obj) {
        if (!this.o) {
            synchronized (this) {
                try {
                    if (!this.o) {
                        if (this.b) {
                            cs csVar = this.c;
                            if (csVar == null) {
                                csVar = new cs();
                                this.c = csVar;
                            }
                            csVar.c(obj);
                            return;
                        }
                        this.b = true;
                        this.a.d(obj);
                        H();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
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
        r3.a.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.o
            if (r0 == 0) goto L_0x0008
            defpackage.n54.D(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.o     // Catch:{ all -> 0x0022 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            r3.o = r1     // Catch:{ all -> 0x0022 }
            boolean r0 = r3.b     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r0 == 0) goto L_0x0031
            cs r0 = r3.c     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0024
            cs r0 = new cs     // Catch:{ all -> 0x0022 }
            r0.<init>()     // Catch:{ all -> 0x0022 }
            r3.c = r0     // Catch:{ all -> 0x0022 }
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
            r3.b = r1     // Catch:{ all -> 0x0022 }
            r1 = r2
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x003b
            defpackage.n54.D(r4)
            return
        L_0x003b:
            gh3 r3 = r3.a
            r3.onError(r4)
            return
        L_0x0041:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etd.onError(java.lang.Throwable):void");
    }

    public final boolean test(Object obj) {
        return lea.b(this.a, obj);
    }

    public final void w(cla cla) {
        this.a.a(cla);
    }
}
