package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: lvf  reason: default package */
public final class lvf extends vw5 {
    public final kvf X = new kvf(this);
    public final AtomicLong Y = new AtomicLong();
    public boolean Z;
    public final the b = new the(8);
    public final AtomicReference c = new AtomicReference((Object) null);
    public final boolean o = true;
    public volatile boolean v;
    public Throwable w;
    public final AtomicReference x = new AtomicReference();
    public volatile boolean y;
    public final AtomicBoolean z = new AtomicBoolean();

    public final void b() {
        if (!this.v && !this.y) {
            this.v = true;
            Runnable runnable = (Runnable) this.c.getAndSet((Object) null);
            if (runnable != null) {
                runnable.run();
            }
            i();
        }
    }

    public final void d(Object obj) {
        p95.c(obj, "onNext called with a null value.");
        if (!this.v && !this.y) {
            this.b.offer(obj);
            i();
        }
    }

    public final void e(rye rye) {
        if (this.v || this.y) {
            rye.cancel();
        } else {
            rye.g(LongCompanionObject.MAX_VALUE);
        }
    }

    public final void g(pye pye) {
        if (this.z.get() || !this.z.compareAndSet(false, true)) {
            d55.b(new IllegalStateException("This processor allows only a single Subscriber"), pye);
            return;
        }
        pye.e(this.X);
        this.x.set(pye);
        if (this.y) {
            this.x.lazySet((Object) null);
        } else {
            i();
        }
    }

    public final boolean h(boolean z2, boolean z3, boolean z4, pye pye, the the) {
        if (this.y) {
            the.clear();
            this.x.lazySet((Object) null);
            return true;
        } else if (!z3) {
            return false;
        } else {
            if (z2 && this.w != null) {
                the.clear();
                this.x.lazySet((Object) null);
                pye.onError(this.w);
                return true;
            } else if (!z4) {
                return false;
            } else {
                Throwable th = this.w;
                this.x.lazySet((Object) null);
                if (th != null) {
                    pye.onError(th);
                } else {
                    pye.b();
                }
                return true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: pye} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r18 = this;
            r6 = r18
            kvf r0 = r6.X
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference r0 = r6.x
            java.lang.Object r0 = r0.get()
            pye r0 = (defpackage.pye) r0
            r7 = 1
            r8 = r0
            r0 = r7
        L_0x0016:
            if (r8 == 0) goto L_0x00dc
            boolean r0 = r6.Z
            if (r0 == 0) goto L_0x0069
            the r0 = r6.b
            boolean r1 = r6.o
            r1 = r1 ^ r7
        L_0x0021:
            boolean r2 = r6.y
            r3 = 0
            if (r2 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReference r0 = r6.x
            r0.lazySet(r3)
            goto L_0x00d9
        L_0x002d:
            boolean r2 = r6.v
            if (r1 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0046
            java.lang.Throwable r4 = r6.w
            if (r4 == 0) goto L_0x0046
            r0.clear()
            java.util.concurrent.atomic.AtomicReference r0 = r6.x
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.w
            r8.onError(r0)
            goto L_0x00d9
        L_0x0046:
            r8.d(r3)
            if (r2 == 0) goto L_0x005e
            java.util.concurrent.atomic.AtomicReference r0 = r6.x
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.w
            if (r0 == 0) goto L_0x0059
            r8.onError(r0)
            goto L_0x00d9
        L_0x0059:
            r8.b()
            goto L_0x00d9
        L_0x005e:
            kvf r2 = r6.X
            int r3 = -r7
            int r7 = r2.addAndGet(r3)
            if (r7 != 0) goto L_0x0021
            goto L_0x00d9
        L_0x0069:
            the r9 = r6.b
            boolean r0 = r6.o
            r10 = r0 ^ 1
            r11 = r7
        L_0x0070:
            java.util.concurrent.atomic.AtomicLong r0 = r6.Y
            long r12 = r0.get()
            r4 = 0
        L_0x0078:
            int r16 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x00a6
            boolean r2 = r6.v
            java.lang.Object r3 = r9.poll()
            if (r3 != 0) goto L_0x0087
            r17 = r7
            goto L_0x008a
        L_0x0087:
            r0 = 0
            r17 = r0
        L_0x008a:
            r0 = r18
            r1 = r10
            r7 = r3
            r3 = r17
            r14 = r4
            r4 = r8
            r5 = r9
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x009a
            goto L_0x00d9
        L_0x009a:
            if (r17 == 0) goto L_0x009d
            goto L_0x00a7
        L_0x009d:
            r8.d(r7)
            r0 = 1
            long r4 = r14 + r0
            r7 = 1
            goto L_0x0078
        L_0x00a6:
            r14 = r4
        L_0x00a7:
            if (r16 != 0) goto L_0x00bb
            boolean r2 = r6.v
            boolean r3 = r9.isEmpty()
            r0 = r18
            r1 = r10
            r4 = r8
            r5 = r9
            boolean r0 = r0.h(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00bb
            goto L_0x00d9
        L_0x00bb:
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            java.util.concurrent.atomic.AtomicLong r0 = r6.Y
            long r1 = -r14
            r0.addAndGet(r1)
        L_0x00d0:
            kvf r0 = r6.X
            int r1 = -r11
            int r11 = r0.addAndGet(r1)
            if (r11 != 0) goto L_0x00da
        L_0x00d9:
            return
        L_0x00da:
            r7 = 1
            goto L_0x0070
        L_0x00dc:
            kvf r1 = r6.X
            int r0 = -r0
            int r0 = r1.addAndGet(r0)
            if (r0 != 0) goto L_0x00e6
            return
        L_0x00e6:
            java.util.concurrent.atomic.AtomicReference r1 = r6.x
            java.lang.Object r1 = r1.get()
            r8 = r1
            pye r8 = (defpackage.pye) r8
            r7 = 1
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lvf.i():void");
    }

    public final void onError(Throwable th) {
        p95.c(th, "onError called with a null Throwable.");
        if (this.v || this.y) {
            n54.D(th);
            return;
        }
        this.w = th;
        this.v = true;
        Runnable runnable = (Runnable) this.c.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
        i();
    }
}
