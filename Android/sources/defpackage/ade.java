package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ade  reason: default package */
public final class ade extends lbe implements gce {
    public static final zce[] v = new zce[0];
    public static final zce[] w = new zce[0];
    public final AtomicReference a = new AtomicReference(v);
    public final AtomicBoolean b = new AtomicBoolean();
    public Object c;
    public Throwable o;

    public final void a(Object obj) {
        p95.c(obj, "onSuccess called with a null value.");
        if (this.b.compareAndSet(false, true)) {
            this.c = obj;
            for (zce zce : (zce[]) this.a.getAndSet(w)) {
                zce.a.a(obj);
            }
        }
    }

    public final void c(mq4 mq4) {
        if (this.a.get() == w) {
            mq4.dispose();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: zce[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(defpackage.gce r7) {
        /*
            r6 = this;
            zce r0 = new zce
            r0.<init>(r7, r6)
            r7.c(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.a
            java.lang.Object r2 = r1.get()
            zce[] r2 = (defpackage.zce[]) r2
            zce[] r3 = w
            if (r2 != r3) goto L_0x0022
            java.lang.Throwable r0 = r6.o
            if (r0 == 0) goto L_0x001c
            r7.onError(r0)
            goto L_0x003c
        L_0x001c:
            java.lang.Object r6 = r6.c
            r7.a(r6)
            goto L_0x003c
        L_0x0022:
            int r3 = r2.length
            int r4 = r3 + 1
            zce[] r4 = new defpackage.zce[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x002d:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x003d
            boolean r7 = r0.f()
            if (r7 == 0) goto L_0x003c
            r6.p(r0)
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x002d
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.m(gce):void");
    }

    public final void onError(Throwable th) {
        p95.c(th, "onError called with a null Throwable.");
        if (this.b.compareAndSet(false, true)) {
            this.o = th;
            for (zce zce : (zce[]) this.a.getAndSet(w)) {
                zce.a.onError(th);
            }
            return;
        }
        n54.D(th);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: zce[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: zce} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(defpackage.zce r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.a
            java.lang.Object r1 = r0.get()
            zce[] r1 = (defpackage.zce[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x0018
            r5 = r1[r4]
            if (r5 != r8) goto L_0x0015
            goto L_0x0019
        L_0x0015:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x0018:
            r4 = -1
        L_0x0019:
            if (r4 >= 0) goto L_0x001c
            return
        L_0x001c:
            r5 = 1
            if (r2 != r5) goto L_0x0022
            zce[] r2 = v
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            zce[] r6 = new defpackage.zce[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0031:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x0038
            return
        L_0x0038:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0031
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.p(zce):void");
    }
}
