package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: u68  reason: default package */
public class u68 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b;
    public static final /* synthetic */ AtomicReferenceFieldUpdater c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Class<u68> cls = u68.class;
        Class<Object> cls2 = Object.class;
        a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef$volatile");
    }

    public final boolean c(u68 u68, int i) {
        while (true) {
            u68 d = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            if (d == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    d = (u68) obj;
                    if (!d.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(d);
                }
            }
            if (d instanceof iz7) {
                return (((iz7) d).o & i) == 0 && d.c(u68, i);
            }
            atomicReferenceFieldUpdater.set(u68, d);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a;
            atomicReferenceFieldUpdater2.set(u68, this);
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(d, this, u68)) {
                    u68.e(this);
                    return true;
                } else if (atomicReferenceFieldUpdater2.get(d) != this) {
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: u68} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r6 = ((defpackage.o1d) r6).a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (r5.get(r4) == r3) goto L_0x0035;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.u68 d() {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b
            java.lang.Object r1 = r0.get(r9)
            u68 r1 = (defpackage.u68) r1
            r2 = 0
            r3 = r1
        L_0x000a:
            r4 = r2
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L_0x0024
            if (r1 != r3) goto L_0x0016
            return r3
        L_0x0016:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L_0x001d
            return r3
        L_0x001d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L_0x0016
            goto L_0x0000
        L_0x0024:
            boolean r7 = r9.g()
            if (r7 == 0) goto L_0x002b
            return r2
        L_0x002b:
            boolean r7 = r6 instanceof defpackage.o1d
            if (r7 == 0) goto L_0x004b
            if (r4 == 0) goto L_0x0044
            o1d r6 = (defpackage.o1d) r6
            u68 r6 = r6.a
        L_0x0035:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L_0x003d
            r3 = r4
            goto L_0x000a
        L_0x003d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L_0x0035
            goto L_0x0000
        L_0x0044:
            java.lang.Object r3 = r0.get(r3)
            u68 r3 = (defpackage.u68) r3
            goto L_0x000b
        L_0x004b:
            r4 = r6
            u68 r4 = (defpackage.u68) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u68.d():u68");
    }

    public final void e(u68 u68) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            u68 u682 = (u68) atomicReferenceFieldUpdater.get(u68);
            if (a.get(this) == u68) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(u68, u682, this)) {
                        if (g()) {
                            u68.d();
                            return;
                        }
                        return;
                    } else if (atomicReferenceFieldUpdater.get(u68) != u682) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final u68 f() {
        u68 u68;
        Object obj = a.get(this);
        o1d o1d = obj instanceof o1d ? (o1d) obj : null;
        return (o1d == null || (u68 = o1d.a) == null) ? (u68) obj : u68;
    }

    public boolean g() {
        return a.get(this) instanceof o1d;
    }

    public String toString() {
        return new t68(0, this) + '@' + n79.A(this);
    }
}
