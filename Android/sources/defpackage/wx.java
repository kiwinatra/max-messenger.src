package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wx  reason: default package */
public final class wx extends gh3 {
    public static final vx[] o = new vx[0];
    public static final vx[] v = new vx[0];
    public final AtomicReference a = new AtomicReference(o);
    public Throwable b;
    public Object c;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: vx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: vx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(defpackage.vx r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.a
            java.lang.Object r1 = r0.get()
            vx[] r1 = (defpackage.vx[]) r1
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
            vx[] r2 = o
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            vx[] r6 = new defpackage.vx[r6]
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.H(vx):void");
    }

    public final void b() {
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = v;
        if (obj != obj2) {
            Object obj3 = this.c;
            vx[] vxVarArr = (vx[]) atomicReference.getAndSet(obj2);
            int i = 0;
            if (obj3 == null) {
                int length = vxVarArr.length;
                while (i < length) {
                    vx vxVar = vxVarArr[i];
                    if (!vxVar.f()) {
                        vxVar.a.b();
                    }
                    i++;
                }
                return;
            }
            int length2 = vxVarArr.length;
            while (i < length2) {
                vxVarArr[i].e(obj3);
                i++;
            }
        }
    }

    public final void c(mq4 mq4) {
        if (this.a.get() == v) {
            mq4.dispose();
        }
    }

    public final void d(Object obj) {
        p95.c(obj, "onNext called with a null value.");
        if (this.a.get() != v) {
            this.c = obj;
        }
    }

    public final void onError(Throwable th) {
        p95.c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.a;
        Object obj = atomicReference.get();
        Object obj2 = v;
        if (obj == obj2) {
            n54.D(th);
            return;
        }
        this.c = null;
        this.b = th;
        for (vx vxVar : (vx[]) atomicReference.getAndSet(obj2)) {
            if (vxVar.f()) {
                n54.D(th);
            } else {
                vxVar.a.onError(th);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: vx[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(defpackage.cla r7) {
        /*
            r6 = this;
            vx r0 = new vx
            r0.<init>(r7, r6)
            r7.c(r0)
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r1 = r6.a
            java.lang.Object r2 = r1.get()
            vx[] r2 = (defpackage.vx[]) r2
            vx[] r3 = v
            if (r2 != r3) goto L_0x0030
            java.lang.Throwable r1 = r6.b
            if (r1 == 0) goto L_0x001c
            r7.onError(r1)
            goto L_0x004a
        L_0x001c:
            java.lang.Object r6 = r6.c
            if (r6 == 0) goto L_0x0024
            r0.e(r6)
            goto L_0x004a
        L_0x0024:
            boolean r6 = r0.f()
            if (r6 != 0) goto L_0x004a
            cla r6 = r0.a
            r6.b()
            goto L_0x004a
        L_0x0030:
            int r3 = r2.length
            int r4 = r3 + 1
            vx[] r4 = new defpackage.vx[r4]
            r5 = 0
            java.lang.System.arraycopy(r2, r5, r4, r5, r3)
            r4[r3] = r0
        L_0x003b:
            boolean r3 = r1.compareAndSet(r2, r4)
            if (r3 == 0) goto L_0x004b
            boolean r7 = r0.f()
            if (r7 == 0) goto L_0x004a
            r6.H(r0)
        L_0x004a:
            return
        L_0x004b:
            java.lang.Object r3 = r1.get()
            if (r3 == r2) goto L_0x003b
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.w(cla):void");
    }
}
