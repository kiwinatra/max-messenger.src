package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: re7  reason: default package */
public final class re7 extends i0 {
    public ArrayList h;
    public int i;
    public int j;
    public AtomicInteger k;
    public Throwable l;
    public Map m;
    public final /* synthetic */ se7 n;

    public re7(se7 se7) {
        this.n = se7;
        if (!se7.b) {
            p();
        }
    }

    public static void o(re7 re7, int i2, i0 i0Var) {
        i0 q;
        Throwable th;
        synchronized (re7) {
            q = i0Var == re7.s() ? null : i0Var == re7.r(i2) ? re7.q(i2) : i0Var;
        }
        if (q != null) {
            q.a();
        }
        if (i2 == 0) {
            re7.l = i0Var.c();
            re7.m = i0Var.a;
        }
        if (re7.k.incrementAndGet() == re7.j && (th = re7.l) != null) {
            re7.j(th, re7.m);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r1 >= r0.size()) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        r3 = (defpackage.i0) r0.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r3 == null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r3.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r3 = this;
            se7 r0 = r3.n
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x0009
            r3.p()
        L_0x0009:
            monitor-enter(r3)
            boolean r0 = super.a()     // Catch:{ all -> 0x0013 }
            r1 = 0
            if (r0 != 0) goto L_0x0015
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            return r1
        L_0x0013:
            r0 = move-exception
            goto L_0x0033
        L_0x0015:
            java.util.ArrayList r0 = r3.h     // Catch:{ all -> 0x0013 }
            r2 = 0
            r3.h = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x0031
        L_0x001d:
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x0031
            java.lang.Object r3 = r0.get(r1)
            i0 r3 = (defpackage.i0) r3
            if (r3 == 0) goto L_0x002e
            r3.a()
        L_0x002e:
            int r1 = r1 + 1
            goto L_0x001d
        L_0x0031:
            r3 = 1
            return r3
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re7.a():boolean");
    }

    public final synchronized Object e() {
        i0 s;
        try {
            if (this.n.b) {
                p();
            }
            s = s();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return s != null ? s.e() : null;
    }

    public final synchronized boolean f() {
        i0 s;
        try {
            if (this.n.b) {
                p();
            }
            s = s();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return s != null && s.f();
    }

    public final void p() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        int i2 = 0;
                        this.k = new AtomicInteger(0);
                        int size = this.n.a.size();
                        this.j = size;
                        this.i = size;
                        this.h = new ArrayList(size);
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            i0 i0Var = (i0) ((r2f) this.n.a.get(i2)).get();
                            this.h.add(i0Var);
                            i0Var.m(new qe7(this, i2), io1.a);
                            if (i0Var.f()) {
                                break;
                            }
                            i2++;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: i0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.i0 q(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.h     // Catch:{ all -> 0x0016 }
            r1 = 0
            if (r0 == 0) goto L_0x0018
            int r0 = r0.size()     // Catch:{ all -> 0x0016 }
            if (r3 >= r0) goto L_0x0018
            java.util.ArrayList r0 = r2.h     // Catch:{ all -> 0x0016 }
            java.lang.Object r3 = r0.set(r3, r1)     // Catch:{ all -> 0x0016 }
            r1 = r3
            i0 r1 = (defpackage.i0) r1     // Catch:{ all -> 0x0016 }
            goto L_0x0018
        L_0x0016:
            r3 = move-exception
            goto L_0x001a
        L_0x0018:
            monitor-exit(r2)
            return r1
        L_0x001a:
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re7.q(int):i0");
    }

    public final synchronized i0 r(int i2) {
        ArrayList arrayList;
        arrayList = this.h;
        return (arrayList == null || i2 >= arrayList.size()) ? null : (i0) this.h.get(i2);
    }

    public final synchronized i0 s() {
        return r(this.i);
    }
}
