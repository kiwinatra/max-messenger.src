package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: x68  reason: default package */
public final class x68 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e;
    public static final /* synthetic */ AtomicLongFieldUpdater f;
    public static final bpa g = new bpa(10, "REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Class<x68> cls = x68.class;
        e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next$volatile");
        f = AtomicLongFieldUpdater.newUpdater(cls, "_state$volatile");
    }

    public x68(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        } else if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (f.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    while ((atomicLongFieldUpdater.get(r13) & 1152921504606846976L) != 0) {
                        r13 = r13.c();
                        AtomicReferenceArray atomicReferenceArray2 = r13.d;
                        int i4 = r13.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if (!(obj2 instanceof w68) || ((w68) obj2).a != i2) {
                            r13 = null;
                            continue;
                        } else {
                            atomicReferenceArray2.set(i4, obj);
                            continue;
                        }
                        if (r13 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006a A[LOOP:3: B:16:0x006a->B:19:0x0076, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.x68 c() {
        /*
            r10 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = f
            long r2 = r6.get(r10)
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            long r7 = r2 | r0
            r0 = r6
            r1 = r10
            r4 = r7
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r7
        L_0x001d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = e
            java.lang.Object r1 = r0.get(r10)
            x68 r1 = (defpackage.x68) r1
            if (r1 == 0) goto L_0x0028
            return r1
        L_0x0028:
            x68 r1 = new x68
            int r4 = r10.a
            int r4 = r4 * 2
            boolean r5 = r10.b
            r1.<init>(r4, r5)
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r4 = (int) r4
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0042:
            int r7 = r10.c
            r8 = r4 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x0061
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0056
            w68 r7 = new w68
            r7.<init>(r4)
        L_0x0056:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r1.d
            int r9 = r1.c
            r9 = r9 & r4
            r8.set(r9, r7)
            int r4 = r4 + 1
            goto L_0x0042
        L_0x0061:
            r4 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r4 = r4 & r2
            r6.set(r1, r4)
        L_0x006a:
            r4 = 0
            boolean r4 = r0.compareAndSet(r10, r4, r1)
            if (r4 == 0) goto L_0x0072
            goto L_0x001d
        L_0x0072:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == 0) goto L_0x006a
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x68.c():x68");
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = this.b;
            if (obj == null) {
                if (z) {
                    return null;
                }
            } else if (obj instanceof w68) {
                return null;
            } else {
                long j2 = (long) ((i + 1) & 1073741823);
                Object obj2 = obj;
                boolean z2 = z;
                if (atomicLongFieldUpdater.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    atomicReferenceArray.set(i3, (Object) null);
                    return obj2;
                } else if (z2) {
                    x68 x68 = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                        long j3 = atomicLongFieldUpdater2.get(x68);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            x68 = x68.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(x68, j3, (j3 & -1073741824) | j2)) {
                                x68.d.set(x68.c & i4, (Object) null);
                                x68 = null;
                            } else {
                                continue;
                            }
                        }
                        if (x68 == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}
