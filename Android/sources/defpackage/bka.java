package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bka  reason: default package */
public final class bka extends gh3 {
    public final oka a;
    public final AtomicReference b;
    public final tja c;
    public final oka o;

    public bka(yja yja, oka oka, AtomicReference atomicReference, tja tja) {
        this.o = yja;
        this.a = oka;
        this.b = atomicReference;
        this.c = tja;
    }

    public final void D(qk3 qk3) {
        xja xja;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            xja = (xja) atomicReference.get();
            if (xja != null && !xja.f()) {
                break;
            }
            xja xja2 = new xja(this.c.call(), atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(xja, xja2)) {
                    xja = xja2;
                    break loop0;
                } else if (atomicReference.get() != xja) {
                }
            }
        }
        AtomicBoolean atomicBoolean = xja.o;
        boolean z = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
        try {
            qk3.accept(xja);
            if (z) {
                this.a.a(xja);
            }
        } catch (Throwable th) {
            hd8.Z(th);
            if (z) {
                atomicBoolean.compareAndSet(true, false);
            }
            hd8.Z(th);
            throw p95.f(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0010 A[LOOP:0: B:4:0x0010->B:7:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F() {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r2 = r2.b
            java.lang.Object r0 = r2.get()
            xja r0 = (defpackage.xja) r0
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.f()
            if (r1 == 0) goto L_0x001e
        L_0x0010:
            r1 = 0
            boolean r1 = r2.compareAndSet(r0, r1)
            if (r1 == 0) goto L_0x0018
            goto L_0x001e
        L_0x0018:
            java.lang.Object r1 = r2.get()
            if (r1 == r0) goto L_0x0010
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bka.F():void");
    }

    public final void w(cla cla) {
        this.o.a(cla);
    }
}
