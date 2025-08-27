package defpackage;

/* renamed from: nm0  reason: default package */
public final class nm0 implements mq4, bs {
    public final cla a;
    public final om0 b;
    public boolean c;
    public boolean o;
    public cs v;
    public boolean w;
    public volatile boolean x;
    public long y;

    public nm0(cla cla, om0 om0) {
        this.a = cla;
        this.b = om0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0032, code lost:
        r2.w = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r3, java.lang.Object r5) {
        /*
            r2 = this;
            boolean r0 = r2.x
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r2.w
            if (r0 != 0) goto L_0x0037
            monitor-enter(r2)
            boolean r0 = r2.x     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r3 = move-exception
            goto L_0x0035
        L_0x0012:
            long r0 = r2.y     // Catch:{ all -> 0x0010 }
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x001a
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            return
        L_0x001a:
            boolean r3 = r2.o     // Catch:{ all -> 0x0010 }
            if (r3 == 0) goto L_0x002e
            cs r3 = r2.v     // Catch:{ all -> 0x0010 }
            if (r3 != 0) goto L_0x0029
            cs r3 = new cs     // Catch:{ all -> 0x0010 }
            r3.<init>()     // Catch:{ all -> 0x0010 }
            r2.v = r3     // Catch:{ all -> 0x0010 }
        L_0x0029:
            r3.c(r5)     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            return
        L_0x002e:
            r3 = 1
            r2.c = r3     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            r2.w = r3
            goto L_0x0037
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            throw r3
        L_0x0037:
            r2.test(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm0.a(long, java.lang.Object):void");
    }

    public final void dispose() {
        if (!this.x) {
            this.x = true;
            this.b.K(this);
        }
    }

    public final boolean f() {
        return this.x;
    }

    public final boolean test(Object obj) {
        return this.x || lea.a(this.a, obj);
    }
}
