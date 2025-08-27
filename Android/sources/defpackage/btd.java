package defpackage;

/* renamed from: btd  reason: default package */
public final class btd implements cla, mq4 {
    public final cla a;
    public mq4 b;
    public boolean c;
    public cs o;
    public volatile boolean v;

    public btd(cla cla) {
        this.a = cla;
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

    public final void c(mq4 mq4) {
        if (qq4.g(this.b, mq4)) {
            this.b = mq4;
            this.a.c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0037, code lost:
        r5.a.d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6 = r5.o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0040, code lost:
        if (r6 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0046, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0048, code lost:
        r5.o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004b, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004c, code lost:
        r1 = r5.a;
        r6 = (java.lang.Object[]) r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0052, code lost:
        if (r6 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0054, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0056, code lost:
        if (r2 >= 4) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0058, code lost:
        r4 = r6[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005a, code lost:
        if (r4 != null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0061, code lost:
        if (defpackage.lea.b(r1, r4) == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0064, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0067, code lost:
        r6 = r6[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x006d, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r5.v
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r6 != 0) goto L_0x0016
            mq4 r6 = r5.b
            r6.dispose()
            java.lang.String r6 = "onNext called with a null value."
            java.lang.NullPointerException r6 = defpackage.p95.b(r6)
            r5.onError(r6)
            return
        L_0x0016:
            monitor-enter(r5)
            boolean r0 = r5.v     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x001f
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r6 = move-exception
            goto L_0x006e
        L_0x001f:
            boolean r0 = r5.c     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0033
            cs r0 = r5.o     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x002e
            cs r0 = new cs     // Catch:{ all -> 0x001d }
            r0.<init>()     // Catch:{ all -> 0x001d }
            r5.o = r0     // Catch:{ all -> 0x001d }
        L_0x002e:
            r0.c(r6)     // Catch:{ all -> 0x001d }
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            return
        L_0x0033:
            r0 = 1
            r5.c = r0     // Catch:{ all -> 0x001d }
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            cla r0 = r5.a
            r0.d(r6)
        L_0x003c:
            monitor-enter(r5)
            cs r6 = r5.o     // Catch:{ all -> 0x0046 }
            r0 = 0
            if (r6 != 0) goto L_0x0048
            r5.c = r0     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0063
        L_0x0046:
            r6 = move-exception
            goto L_0x006c
        L_0x0048:
            r1 = 0
            r5.o = r1     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            cla r1 = r5.a
            java.lang.Object r6 = r6.c
            java.lang.Object[] r6 = (java.lang.Object[]) r6
        L_0x0052:
            if (r6 == 0) goto L_0x003c
            r2 = r0
        L_0x0055:
            r3 = 4
            if (r2 >= r3) goto L_0x0067
            r4 = r6[r2]
            if (r4 != 0) goto L_0x005d
            goto L_0x0067
        L_0x005d:
            boolean r3 = defpackage.lea.b(r1, r4)
            if (r3 == 0) goto L_0x0064
        L_0x0063:
            return
        L_0x0064:
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0067:
            r6 = r6[r3]
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            goto L_0x0052
        L_0x006c:
            monitor-exit(r5)     // Catch:{ all -> 0x0046 }
            throw r6
        L_0x006e:
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btd.d(java.lang.Object):void");
    }

    public final void dispose() {
        this.v = true;
        this.b.dispose();
    }

    public final boolean f() {
        return this.b.f();
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
            cla r3 = r3.a
            r3.onError(r4)
            return
        L_0x0043:
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btd.onError(java.lang.Throwable):void");
    }
}
