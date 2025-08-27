package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xja  reason: default package */
public final class xja extends AtomicReference implements cla, mq4 {
    public static final uja[] w = new uja[0];
    public static final uja[] x = new uja[0];
    public final wja a;
    public boolean b;
    public final AtomicReference c = new AtomicReference(w);
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicReference v;

    public xja(wja wja, AtomicReference atomicReference) {
        this.a = wja;
        this.v = atomicReference;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: uja[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: uja} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.uja r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.c
            java.lang.Object r1 = r0.get()
            uja[] r1 = (defpackage.uja[]) r1
            int r2 = r1.length
            if (r2 != 0) goto L_0x000c
            return
        L_0x000c:
            r3 = 0
            r4 = r3
        L_0x000e:
            if (r4 >= r2) goto L_0x001c
            r5 = r1[r4]
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L_0x0019
            goto L_0x001d
        L_0x0019:
            int r4 = r4 + 1
            goto L_0x000e
        L_0x001c:
            r4 = -1
        L_0x001d:
            if (r4 >= 0) goto L_0x0020
            return
        L_0x0020:
            r5 = 1
            if (r2 != r5) goto L_0x0026
            uja[] r2 = w
            goto L_0x0035
        L_0x0026:
            int r6 = r2 + -1
            uja[] r6 = new defpackage.uja[r6]
            java.lang.System.arraycopy(r1, r3, r6, r3, r4)
            int r3 = r4 + 1
            int r2 = r2 - r4
            int r2 = r2 - r5
            java.lang.System.arraycopy(r1, r3, r6, r4, r2)
            r2 = r6
        L_0x0035:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x003c
            return
        L_0x003c:
            java.lang.Object r3 = r0.get()
            if (r3 == r1) goto L_0x0035
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xja.a(uja):void");
    }

    public final void b() {
        if (!this.b) {
            this.b = true;
            wja wja = this.a;
            wja.e();
            for (uja d : (uja[]) this.c.getAndSet(x)) {
                wja.d(d);
            }
        }
    }

    public final void c(mq4 mq4) {
        if (qq4.e(this, mq4)) {
            for (uja d : (uja[]) this.c.get()) {
                this.a.d(d);
            }
        }
    }

    public final void d(Object obj) {
        if (!this.b) {
            wja wja = this.a;
            wja.b(obj);
            for (uja d : (uja[]) this.c.get()) {
                wja.d(d);
            }
        }
    }

    public final void dispose() {
        AtomicReference atomicReference;
        this.c.set(x);
        do {
            atomicReference = this.v;
            if (atomicReference.compareAndSet(this, (Object) null) || atomicReference.get() != this) {
                qq4.a(this);
            }
            atomicReference = this.v;
            break;
        } while (atomicReference.get() != this);
        qq4.a(this);
    }

    public final boolean f() {
        return this.c.get() == x;
    }

    public final void onError(Throwable th) {
        if (!this.b) {
            this.b = true;
            wja wja = this.a;
            wja.f(th);
            for (uja d : (uja[]) this.c.getAndSet(x)) {
                wja.d(d);
            }
            return;
        }
        n54.D(th);
    }
}
