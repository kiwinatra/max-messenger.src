package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dac  reason: default package */
public final class dac extends gh3 {
    public static final cac[] c = new cac[0];
    public static final cac[] o = new cac[0];
    public final AtomicReference a = new AtomicReference(o);
    public Throwable b;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: cac[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: cac} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(defpackage.cac r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.a
            java.lang.Object r1 = r0.get()
            cac[] r1 = (defpackage.cac[]) r1
            cac[] r2 = c
            if (r1 == r2) goto L_0x0042
            cac[] r2 = o
            if (r1 != r2) goto L_0x0011
            goto L_0x0042
        L_0x0011:
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L_0x0014:
            if (r5 >= r3) goto L_0x001e
            r6 = r1[r5]
            if (r6 != r8) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x001e:
            r5 = -1
        L_0x001f:
            if (r5 >= 0) goto L_0x0022
            return
        L_0x0022:
            r6 = 1
            if (r3 != r6) goto L_0x0026
            goto L_0x0034
        L_0x0026:
            int r2 = r3 + -1
            cac[] r2 = new defpackage.cac[r2]
            java.lang.System.arraycopy(r1, r4, r2, r4, r5)
            int r4 = r5 + 1
            int r3 = r3 - r5
            int r3 = r3 - r6
            java.lang.System.arraycopy(r1, r4, r2, r5, r3)
        L_0x0034:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x003b
            return
        L_0x003b:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0034
            goto L_0x0000
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dac.H(cac):void");
    }

    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj != obj2) {
            for (cac cac : (cac[]) atomicReference.getAndSet(obj2)) {
                if (!cac.get()) {
                    cac.a.b();
                }
            }
        }
    }

    public final void c(mq4 mq4) {
        if (this.a.get() == c) {
            mq4.dispose();
        }
    }

    public final void d(Object obj) {
        p95.c(obj, "onNext called with a null value.");
        for (cac cac : (cac[]) this.a.get()) {
            if (!cac.get()) {
                cac.a.d(obj);
            }
        }
    }

    public final void onError(Throwable th) {
        p95.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = c;
        if (obj == obj2) {
            n54.D(th);
            return;
        }
        this.b = th;
        for (cac cac : (cac[]) atomicReference.getAndSet(obj2)) {
            if (cac.get()) {
                n54.D(th);
            } else {
                cac.a.onError(th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: cac[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(defpackage.cla r7) {
        /*
            r6 = this;
            cac r0 = new cac
            r0.<init>(r7, r6)
            r7.c(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.a
            java.lang.Object r2 = r1.get()
            cac[] r2 = (defpackage.cac[]) r2
            cac[] r3 = c
            if (r2 != r3) goto L_0x0020
            java.lang.Throwable r6 = r6.b
            if (r6 == 0) goto L_0x001c
            r7.onError(r6)
            goto L_0x003a
        L_0x001c:
            r7.b()
            goto L_0x003a
        L_0x0020:
            int r3 = r2.length
            int r4 = r3 + 1
            cac[] r4 = new defpackage.cac[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x002b:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x003b
            boolean r7 = r0.get()
            if (r7 == 0) goto L_0x003a
            r6.H(r0)
        L_0x003a:
            return
        L_0x003b:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x002b
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dac.w(cla):void");
    }
}
