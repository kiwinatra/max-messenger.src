package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: yja  reason: default package */
public final class yja implements oka {
    public final AtomicReference a;
    public final tja b;

    public yja(AtomicReference atomicReference, tja tja) {
        this.a = atomicReference;
        this.b = tja;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: uja[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.cla r6) {
        /*
            r5 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r5.a
            java.lang.Object r0 = r0.get()
            xja r0 = (defpackage.xja) r0
            if (r0 != 0) goto L_0x0029
            tja r0 = r5.b
            wja r0 = r0.call()
            xja r1 = new xja
            java.util.concurrent.atomic.AtomicReference r2 = r5.a
            r1.<init>(r0, r2)
            java.util.concurrent.atomic.AtomicReference r2 = r5.a
        L_0x0019:
            r0 = 0
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0022
            r0 = r1
            goto L_0x0029
        L_0x0022:
            java.lang.Object r0 = r2.get()
            if (r0 == 0) goto L_0x0019
            goto L_0x0000
        L_0x0029:
            uja r5 = new uja
            r5.<init>(r0, r6)
            r6.c(r5)
        L_0x0031:
            java.util.concurrent.atomic.AtomicReference r6 = r0.c
            java.lang.Object r1 = r6.get()
            uja[] r1 = (defpackage.uja[]) r1
            uja[] r2 = defpackage.xja.x
            if (r1 != r2) goto L_0x003e
            goto L_0x004f
        L_0x003e:
            int r2 = r1.length
            int r3 = r2 + 1
            uja[] r3 = new defpackage.uja[r3]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r3, r4, r2)
            r3[r2] = r5
        L_0x0049:
            boolean r2 = r6.compareAndSet(r1, r3)
            if (r2 == 0) goto L_0x005d
        L_0x004f:
            boolean r6 = r5.o
            if (r6 == 0) goto L_0x0057
            r0.a(r5)
            return
        L_0x0057:
            wja r6 = r0.a
            r6.d(r5)
            return
        L_0x005d:
            java.lang.Object r2 = r6.get()
            if (r2 == r1) goto L_0x0049
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yja.a(cla):void");
    }
}
