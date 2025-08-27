package defpackage;

/* renamed from: pae  reason: default package */
public abstract class pae extends jj0 {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pae(java.util.concurrent.Executor r4) {
        /*
            r3 = this;
            w63 r0 = new w63
            r1 = 19
            r0.<init>(r1)
            if (r4 != 0) goto L_0x0020
            java.lang.Object r1 = defpackage.n79.c
            monitor-enter(r1)
            java.util.concurrent.ExecutorService r4 = defpackage.n79.d     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x001a
            r4 = 2
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newFixedThreadPool(r4)     // Catch:{ all -> 0x0018 }
            defpackage.n79.d = r4     // Catch:{ all -> 0x0018 }
            goto L_0x001a
        L_0x0018:
            r3 = move-exception
            goto L_0x001e
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            java.util.concurrent.ExecutorService r4 = defpackage.n79.d
            goto L_0x0020
        L_0x001e:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r3
        L_0x0020:
            dm4 r1 = new dm4
            r2 = 3
            r1.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r0)
            r3.<init>((defpackage.dm4) r1)
            r4 = 1
            super.C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pae.<init>(java.util.concurrent.Executor):void");
    }

    public final lz7 I(int i) {
        if (i < 0 || i >= ((ov) this.o).f.size()) {
            return null;
        }
        return (lz7) E(i);
    }

    /* renamed from: J */
    public void s(kbe kbe, int i) {
        kbe.M((lz7) E(i));
    }

    /* renamed from: K */
    public void z(kbe kbe) {
        kbe.O();
    }

    public long k(int i) {
        return ((lz7) E(i)).getItemId();
    }

    public int l(int i) {
        return ((lz7) E(i)).i();
    }
}
