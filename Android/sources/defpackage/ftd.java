package defpackage;

/* renamed from: ftd  reason: default package */
public final class ftd implements gx5, rye {
    public final pye a;
    public rye b;
    public boolean c;
    public cs o;
    public volatile boolean v;

    public ftd(pye pye) {
        this.a = pye;
    }

    public final void b() {
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
                            csVar.c(lea.a);
                            return;
                        }
                        this.v = true;
                        this.c = true;
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

    public final void cancel() {
        this.b.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        r1.a.d(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2 = r1.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        if (r2 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        r1.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0048, code lost:
        r1.o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0052, code lost:
        if (r2.b(r1.a) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0056, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r1.v
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r2 != 0) goto L_0x0016
            rye r2 = r1.b
            r2.cancel()
            java.lang.String r2 = "onNext called with a null value."
            java.lang.NullPointerException r2 = defpackage.p95.b(r2)
            r1.onError(r2)
            return
        L_0x0016:
            monitor-enter(r1)
            boolean r0 = r1.v     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r2 = move-exception
            goto L_0x0057
        L_0x001f:
            boolean r0 = r1.c     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0033
            cs r0 = r1.o     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x002e
            cs r0 = new cs     // Catch:{ all -> 0x001d }
            r0.<init>()     // Catch:{ all -> 0x001d }
            r1.o = r0     // Catch:{ all -> 0x001d }
        L_0x002e:
            r0.c(r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            return
        L_0x0033:
            r0 = 1
            r1.c = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            pye r0 = r1.a
            r0.d(r2)
        L_0x003c:
            monitor-enter(r1)
            cs r2 = r1.o     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0048
            r2 = 0
            r1.c = r2     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x0054
        L_0x0046:
            r2 = move-exception
            goto L_0x0055
        L_0x0048:
            r0 = 0
            r1.o = r0     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            pye r0 = r1.a
            boolean r2 = r2.b(r0)
            if (r2 == 0) goto L_0x003c
        L_0x0054:
            return
        L_0x0055:
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            throw r2
        L_0x0057:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftd.d(java.lang.Object):void");
    }

    public final void e(rye rye) {
        if (tye.e(this.b, rye)) {
            this.b = rye;
            this.a.e(this);
        }
    }

    public final void g(long j) {
        this.b.g(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        if (r1 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
        defpackage.n54.D(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        r3.a.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
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
            goto L_0x0036
        L_0x000f:
            boolean r0 = r3.c     // Catch:{ all -> 0x0022 }
            r2 = 0
            if (r0 == 0) goto L_0x0031
            r3.v = r1     // Catch:{ all -> 0x0022 }
            cs r0 = r3.o     // Catch:{ all -> 0x0022 }
            if (r0 != 0) goto L_0x0024
            cs r0 = new cs     // Catch:{ all -> 0x0022 }
            r0.<init>()     // Catch:{ all -> 0x0022 }
            r3.o = r0     // Catch:{ all -> 0x0022 }
            goto L_0x0024
        L_0x0022:
            r4 = move-exception
            goto L_0x0043
        L_0x0024:
            jea r1 = new jea     // Catch:{ all -> 0x0022 }
            r1.<init>(r4)     // Catch:{ all -> 0x0022 }
            java.lang.Object r4 = r0.c     // Catch:{ all -> 0x0022 }
            java.lang.Object[] r4 = (java.lang.Object[]) r4     // Catch:{ all -> 0x0022 }
            r4[r2] = r1     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            return
        L_0x0031:
            r3.v = r1     // Catch:{ all -> 0x0022 }
            r3.c = r1     // Catch:{ all -> 0x0022 }
            r1 = r2
        L_0x0036:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x003d
            defpackage.n54.D(r4)
            return
        L_0x003d:
            pye r3 = r3.a
            r3.onError(r4)
            return
        L_0x0043:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftd.onError(java.lang.Throwable):void");
    }
}
