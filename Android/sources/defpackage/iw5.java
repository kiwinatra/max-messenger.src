package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: iw5  reason: default package */
public final class iw5 extends AtomicInteger implements gx5, rye {
    public static final hw5[] A0 = new hw5[0];
    public static final hw5[] B0 = new hw5[0];
    public final AtomicReference X;
    public final AtomicLong Y;
    public rye Z;
    public final pye a;
    public final zi6 b;
    public final boolean c;
    public final int o;
    public final int v;
    public long v0;
    public volatile ebe w;
    public long w0;
    public volatile boolean x;
    public int x0;
    public final fz y = new AtomicReference();
    public int y0;
    public volatile boolean z;
    public final int z0;

    /* JADX WARNING: type inference failed for: r0v0, types: [fz, java.util.concurrent.atomic.AtomicReference] */
    public iw5(pye pye, zi6 zi6, boolean z2, int i, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.X = atomicReference;
        this.Y = new AtomicLong();
        this.a = pye;
        this.b = zi6;
        this.c = z2;
        this.o = i;
        this.v = i2;
        this.z0 = Math.max(1, i >> 1);
        atomicReference.lazySet(A0);
    }

    public final boolean a() {
        if (this.z) {
            ebe ebe = this.w;
            if (ebe != null) {
                ebe.clear();
            }
            return true;
        } else if (this.c || this.y.get() == null) {
            return false;
        } else {
            ebe ebe2 = this.w;
            if (ebe2 != null) {
                ebe2.clear();
            }
            this.y.e(this.a);
            return true;
        }
    }

    public final void b() {
        if (!this.x) {
            this.x = true;
            c();
        }
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            f();
        }
    }

    public final void cancel() {
        ebe ebe;
        if (!this.z) {
            this.z = true;
            this.Z.cancel();
            AtomicReference atomicReference = this.X;
            hw5[] hw5Arr = B0;
            hw5[] hw5Arr2 = (hw5[]) atomicReference.getAndSet(hw5Arr);
            if (hw5Arr2 != hw5Arr) {
                for (hw5 hw5 : hw5Arr2) {
                    hw5.getClass();
                    tye.a(hw5);
                }
                this.y.b();
            }
            if (getAndIncrement() == 0 && (ebe = this.w) != null) {
                ebe.clear();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: hw5[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r8.x
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            zi6 r0 = r8.b     // Catch:{ all -> 0x010e }
            java.lang.Object r9 = r0.apply(r9)     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "The mapper returned a null Publisher"
            java.util.Objects.requireNonNull(r9, r0)     // Catch:{ all -> 0x010e }
            eac r9 = (defpackage.eac) r9     // Catch:{ all -> 0x010e }
            boolean r0 = r9 instanceof defpackage.t2f
            r1 = 0
            if (r0 == 0) goto L_0x00d3
            t2f r9 = (defpackage.t2f) r9     // Catch:{ all -> 0x00c6 }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x00c6 }
            r0 = 1
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == 0) goto L_0x00ac
            int r3 = r8.get()
            if (r3 != 0) goto L_0x008e
            boolean r3 = r8.compareAndSet(r1, r0)
            if (r3 == 0) goto L_0x008e
            java.util.concurrent.atomic.AtomicLong r3 = r8.Y
            long r3 = r3.get()
            ebe r5 = r8.w
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0072
            if (r5 == 0) goto L_0x0045
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0072
        L_0x0045:
            pye r5 = r8.a
            r5.d(r9)
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0058
            java.util.concurrent.atomic.AtomicLong r9 = r8.Y
            r9.decrementAndGet()
        L_0x0058:
            int r9 = r8.o
            if (r9 == r2) goto L_0x0086
            boolean r9 = r8.z
            if (r9 != 0) goto L_0x0086
            int r9 = r8.y0
            int r9 = r9 + r0
            r8.y0 = r9
            int r0 = r8.z0
            if (r9 != r0) goto L_0x0086
            r8.y0 = r1
            rye r9 = r8.Z
            long r0 = (long) r0
            r9.g(r0)
            goto L_0x0086
        L_0x0072:
            if (r5 != 0) goto L_0x0078
            ebe r5 = r8.h()
        L_0x0078:
            boolean r9 = r5.offer(r9)
            if (r9 != 0) goto L_0x0086
            io.reactivex.rxjava3.exceptions.QueueOverflowException r9 = new io.reactivex.rxjava3.exceptions.QueueOverflowException
            r9.<init>()
            r8.onError(r9)
        L_0x0086:
            int r9 = r8.decrementAndGet()
            if (r9 != 0) goto L_0x00a8
            goto L_0x0106
        L_0x008e:
            ebe r0 = r8.h()
            boolean r9 = r0.offer(r9)
            if (r9 != 0) goto L_0x00a1
            io.reactivex.rxjava3.exceptions.QueueOverflowException r9 = new io.reactivex.rxjava3.exceptions.QueueOverflowException
            r9.<init>()
            r8.onError(r9)
            goto L_0x0106
        L_0x00a1:
            int r9 = r8.getAndIncrement()
            if (r9 == 0) goto L_0x00a8
            goto L_0x0106
        L_0x00a8:
            r8.f()
            goto L_0x0106
        L_0x00ac:
            int r9 = r8.o
            if (r9 == r2) goto L_0x0106
            boolean r9 = r8.z
            if (r9 != 0) goto L_0x0106
            int r9 = r8.y0
            int r9 = r9 + r0
            r8.y0 = r9
            int r0 = r8.z0
            if (r9 != r0) goto L_0x0106
            r8.y0 = r1
            rye r8 = r8.Z
            long r0 = (long) r0
            r8.g(r0)
            goto L_0x0106
        L_0x00c6:
            r9 = move-exception
            defpackage.hd8.Z(r9)
            fz r0 = r8.y
            r0.a(r9)
            r8.c()
            return
        L_0x00d3:
            hw5 r0 = new hw5
            int r2 = r8.v
            long r3 = r8.v0
            r5 = 1
            long r5 = r5 + r3
            r8.v0 = r5
            r0.<init>(r8, r2, r3)
        L_0x00e1:
            java.util.concurrent.atomic.AtomicReference r2 = r8.X
            java.lang.Object r3 = r2.get()
            hw5[] r3 = (defpackage.hw5[]) r3
            hw5[] r4 = B0
            if (r3 != r4) goto L_0x00f1
            defpackage.tye.a(r0)
            goto L_0x0106
        L_0x00f1:
            int r4 = r3.length
            int r5 = r4 + 1
            hw5[] r5 = new defpackage.hw5[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
        L_0x00fb:
            boolean r4 = r2.compareAndSet(r3, r5)
            if (r4 == 0) goto L_0x0107
            wv5 r9 = (defpackage.wv5) r9
            r9.f(r0)
        L_0x0106:
            return
        L_0x0107:
            java.lang.Object r4 = r2.get()
            if (r4 == r3) goto L_0x00fb
            goto L_0x00e1
        L_0x010e:
            r9 = move-exception
            defpackage.hd8.Z(r9)
            rye r0 = r8.Z
            r0.cancel()
            r8.onError(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw5.d(java.lang.Object):void");
    }

    public final void e(rye rye) {
        if (tye.e(this.Z, rye)) {
            this.Z = rye;
            this.a.e(this);
            if (!this.z) {
                int i = this.o;
                if (i == Integer.MAX_VALUE) {
                    rye.g(LongCompanionObject.MAX_VALUE);
                } else {
                    rye.g((long) i);
                }
            }
        }
    }

    public final void f() {
        long j;
        long j2;
        boolean z2;
        long j3;
        long j4;
        int i;
        int i2;
        long j5;
        long j6;
        pye pye = this.a;
        int i3 = 1;
        while (!a()) {
            ebe ebe = this.w;
            long j7 = this.Y.get();
            boolean z3 = j7 == LongCompanionObject.MAX_VALUE;
            long j8 = 0;
            if (ebe != null) {
                long j9 = 0;
                j = 0;
                while (j7 != 0) {
                    Object poll = ebe.poll();
                    if (!a()) {
                        if (poll == null) {
                            break;
                        }
                        pye.d(poll);
                        j++;
                        j9++;
                        j7--;
                    } else {
                        return;
                    }
                }
                if (j9 != 0) {
                    j7 = z3 ? LongCompanionObject.MAX_VALUE : this.Y.addAndGet(-j9);
                }
            } else {
                j = 0;
            }
            boolean z4 = this.x;
            ebe ebe2 = this.w;
            hw5[] hw5Arr = (hw5[]) this.X.get();
            int length = hw5Arr.length;
            if (!z4 || ((ebe2 != null && !ebe2.isEmpty()) || length != 0)) {
                int i4 = i3;
                if (length != 0) {
                    long j10 = this.w0;
                    int i5 = this.x0;
                    if (length <= i5 || hw5Arr[i5].a != j10) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        for (int i6 = 0; i6 < length && hw5Arr[i5].a != j10; i6++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.x0 = i5;
                        this.w0 = hw5Arr[i5].a;
                    }
                    int i7 = i5;
                    boolean z5 = false;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            z2 = z5;
                            break;
                        } else if (!a()) {
                            hw5 hw5 = hw5Arr[i7];
                            Object obj = null;
                            while (true) {
                                gbe gbe = hw5.w;
                                if (gbe != null) {
                                    i = length;
                                    Object obj2 = obj;
                                    long j11 = j8;
                                    while (true) {
                                        if (j2 == j8) {
                                            j5 = j8;
                                            break;
                                        } else if (!a()) {
                                            try {
                                                Object poll2 = gbe.poll();
                                                if (poll2 == null) {
                                                    obj2 = poll2;
                                                    j5 = 0;
                                                    break;
                                                }
                                                pye.d(poll2);
                                                j2--;
                                                j11++;
                                                obj2 = poll2;
                                                j8 = 0;
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                hd8.Z(th2);
                                                tye.a(hw5);
                                                this.y.a(th2);
                                                if (!this.c) {
                                                    this.Z.cancel();
                                                }
                                                if (!a()) {
                                                    i(hw5);
                                                    i8++;
                                                    i2 = i;
                                                    z5 = true;
                                                } else {
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j11 != j5) {
                                        j2 = !z3 ? this.Y.addAndGet(-j11) : LongCompanionObject.MAX_VALUE;
                                        hw5.a(j11);
                                        j6 = 0;
                                    } else {
                                        j6 = j5;
                                    }
                                    if (j2 == j6 || obj2 == null) {
                                        break;
                                    }
                                    length = i;
                                    obj = obj2;
                                    j8 = 0;
                                } else {
                                    i = length;
                                    break;
                                }
                                i8++;
                                length = i2;
                                j8 = 0;
                            }
                            boolean z6 = hw5.v;
                            gbe gbe2 = hw5.w;
                            if (z6 && (gbe2 == null || gbe2.isEmpty())) {
                                i(hw5);
                                if (!a()) {
                                    j++;
                                    z5 = true;
                                } else {
                                    return;
                                }
                            }
                            if (j2 == 0) {
                                z2 = z5;
                                break;
                            }
                            i7++;
                            i2 = i;
                            if (i7 == i2) {
                                i7 = 0;
                            }
                            i8++;
                            length = i2;
                            j8 = 0;
                        } else {
                            return;
                        }
                    }
                    this.x0 = i7;
                    this.w0 = hw5Arr[i7].a;
                    j4 = j;
                    j3 = 0;
                } else {
                    j3 = 0;
                    j4 = j;
                    z2 = false;
                }
                if (j4 != j3 && !this.z) {
                    this.Z.g(j4);
                }
                if (z2) {
                    i3 = i4;
                } else {
                    i3 = addAndGet(-i4);
                    if (i3 == 0) {
                        return;
                    }
                }
            } else {
                this.y.e(this.a);
                return;
            }
        }
    }

    public final void g(long j) {
        if (tye.d(j)) {
            h88.c(this.Y, j);
            c();
        }
    }

    public final ebe h() {
        ebe ebe = this.w;
        if (ebe == null) {
            ebe = this.o == Integer.MAX_VALUE ? new the(this.v) : new she(this.o);
            this.w = ebe;
        }
        return ebe;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: hw5[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: hw5} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.hw5 r8) {
        /*
            r7 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference r0 = r7.X
            java.lang.Object r1 = r0.get()
            hw5[] r1 = (defpackage.hw5[]) r1
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
            hw5[] r2 = A0
            goto L_0x0031
        L_0x0022:
            int r6 = r2 + -1
            hw5[] r6 = new defpackage.hw5[r6]
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw5.i(hw5):void");
    }

    public final void onError(Throwable th) {
        if (this.x) {
            n54.D(th);
        } else if (this.y.a(th)) {
            this.x = true;
            if (!this.c) {
                for (hw5 hw5 : (hw5[]) this.X.getAndSet(B0)) {
                    hw5.getClass();
                    tye.a(hw5);
                }
            }
            c();
        }
    }
}
