package defpackage;

import java.util.LinkedList;

/* renamed from: jz7  reason: default package */
public final class jz7 implements mq4, nq4 {
    public LinkedList a;
    public volatile boolean b;

    public final boolean a(mq4 mq4) {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        LinkedList linkedList = this.a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.a = linkedList;
                        }
                        linkedList.add(mq4);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mq4.dispose();
        return false;
    }

    public final boolean b(mq4 mq4) {
        if (!c(mq4)) {
            return false;
        }
        ((oed) mq4).dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(defpackage.mq4 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            java.util.Objects.requireNonNull(r3, r0)
            boolean r0 = r2.b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.b     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x0012:
            r3 = move-exception
            goto L_0x0024
        L_0x0014:
            java.util.LinkedList r0 = r2.a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0022
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            r2 = 1
            return r2
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x0024:
            monitor-exit(r2)     // Catch:{ all -> 0x0012 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz7.c(mq4):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0017, code lost:
        if (r1 != null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r3 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        if (r3.hasNext() == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        ((defpackage.mq4) r3.next()).dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        defpackage.hd8.Z(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        if (r2 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        r2.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        if (r2.size() != 1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        throw defpackage.p95.f((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        throw new io.reactivex.rxjava3.exceptions.CompositeException((java.util.List) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r3 = this;
            boolean r0 = r3.b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            boolean r0 = r3.b     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            return
        L_0x000c:
            r0 = move-exception
            goto L_0x0058
        L_0x000e:
            r0 = 1
            r3.b = r0     // Catch:{ all -> 0x000c }
            java.util.LinkedList r1 = r3.a     // Catch:{ all -> 0x000c }
            r2 = 0
            r3.a = r2     // Catch:{ all -> 0x000c }
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            if (r1 != 0) goto L_0x001a
            goto L_0x0057
        L_0x001a:
            java.util.Iterator r3 = r1.iterator()
        L_0x001e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r3.next()
            mq4 r1 = (defpackage.mq4) r1
            r1.dispose()     // Catch:{ all -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r1 = move-exception
            defpackage.hd8.Z(r1)
            if (r2 != 0) goto L_0x0039
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0039:
            r2.add(r1)
            goto L_0x001e
        L_0x003d:
            if (r2 == 0) goto L_0x0057
            int r3 = r2.size()
            if (r3 != r0) goto L_0x0051
            r3 = 0
            java.lang.Object r3 = r2.get(r3)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.RuntimeException r3 = defpackage.p95.f(r3)
            throw r3
        L_0x0051:
            io.reactivex.rxjava3.exceptions.CompositeException r3 = new io.reactivex.rxjava3.exceptions.CompositeException
            r3.<init>((java.util.List) r2)
            throw r3
        L_0x0057:
            return
        L_0x0058:
            monitor-exit(r3)     // Catch:{ all -> 0x000c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jz7.dispose():void");
    }

    public final boolean f() {
        return this.b;
    }
}
