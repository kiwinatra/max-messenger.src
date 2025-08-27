package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pja  reason: default package */
public final class pja extends gh3 {
    public final oka a;
    public final AtomicReference b = new AtomicReference();

    public pja(rha rha) {
        this.a = rha;
    }

    public final void D(qk3 qk3) {
        oja oja;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            oja = (oja) atomicReference.get();
            if (oja != null && !oja.f()) {
                break;
            }
            oja oja2 = new oja(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(oja, oja2)) {
                    oja = oja2;
                    break loop0;
                } else if (atomicReference.get() != oja) {
                }
            }
        }
        AtomicBoolean atomicBoolean = oja.a;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            qk3.accept(oja);
            if (z) {
                this.a.a(oja);
            }
        } catch (Throwable th) {
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
            oja r0 = (defpackage.oja) r0
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pja.F():void");
    }

    public final void w(cla cla) {
        oja oja;
        nja[] njaArr;
        nja[] njaArr2;
        loop0:
        while (true) {
            AtomicReference atomicReference = this.b;
            oja = (oja) atomicReference.get();
            if (oja != null) {
                break;
            }
            oja oja2 = new oja(atomicReference);
            while (true) {
                if (atomicReference.compareAndSet(oja, oja2)) {
                    oja = oja2;
                    break loop0;
                } else if (atomicReference.get() != oja) {
                }
            }
        }
        nja nja = new nja(cla, oja);
        cla.c(nja);
        do {
            njaArr = (nja[]) oja.get();
            if (njaArr == oja.w) {
                Throwable th = oja.o;
                if (th != null) {
                    cla.onError(th);
                    return;
                } else {
                    cla.b();
                    return;
                }
            } else {
                int length = njaArr.length;
                njaArr2 = new nja[(length + 1)];
                System.arraycopy(njaArr, 0, njaArr2, 0, length);
                njaArr2[length] = nja;
            }
        } while (!oja.compareAndSet(njaArr, njaArr2));
        if (nja.f()) {
            oja.a(nja);
        }
    }
}
