package defpackage;

import sun.misc.Unsafe;

/* renamed from: k1  reason: default package */
public final class k1 extends hi7 {
    public static final Unsafe k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r3 = (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new defpackage.j1());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000b */
    static {
        /*
            java.lang.String r0 = "a"
            java.lang.String r1 = "b"
            java.lang.Class<l1> r2 = defpackage.l1.class
            sun.misc.Unsafe r3 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x000b }
            goto L_0x0016
        L_0x000b:
            j1 r3 = new j1     // Catch:{ PrivilegedActionException -> 0x0056 }
            r3.<init>()     // Catch:{ PrivilegedActionException -> 0x0056 }
            java.lang.Object r3 = java.security.AccessController.doPrivileged(r3)     // Catch:{ PrivilegedActionException -> 0x0056 }
            sun.misc.Unsafe r3 = (sun.misc.Unsafe) r3     // Catch:{ PrivilegedActionException -> 0x0056 }
        L_0x0016:
            java.lang.Class<n1> r4 = defpackage.n1.class
            java.lang.String r5 = "c"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r5 = r3.objectFieldOffset(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
            m = r5     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r5 = r4.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r5 = r3.objectFieldOffset(r5)     // Catch:{ NoSuchFieldException -> 0x004f }
            l = r5     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r4 = r4.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r4 = r3.objectFieldOffset(r4)     // Catch:{ NoSuchFieldException -> 0x004f }
            n = r4     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r4 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            o = r4     // Catch:{ NoSuchFieldException -> 0x004f }
            java.lang.reflect.Field r0 = r2.getDeclaredField(r1)     // Catch:{ NoSuchFieldException -> 0x004f }
            long r0 = r3.objectFieldOffset(r0)     // Catch:{ NoSuchFieldException -> 0x004f }
            p = r0     // Catch:{ NoSuchFieldException -> 0x004f }
            k = r3     // Catch:{ NoSuchFieldException -> 0x004f }
            return
        L_0x004f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0056:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Could not initialize intrinsics"
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.<clinit>():void");
    }

    public final void H(l1 l1Var, l1 l1Var2) {
        k.putObject(l1Var, p, l1Var2);
    }

    public final void I(l1 l1Var, Thread thread) {
        k.putObject(l1Var, o, thread);
    }

    public final boolean d(n1 n1Var, y0 y0Var, y0 y0Var2) {
        return i1.a(k, n1Var, l, y0Var, y0Var2);
    }

    public final boolean e(n1 n1Var, Object obj, Object obj2) {
        return i1.a(k, n1Var, n, obj, obj2);
    }

    public final boolean f(n1 n1Var, l1 l1Var, l1 l1Var2) {
        return i1.a(k, n1Var, m, l1Var, l1Var2);
    }

    public final y0 p(n1 n1Var) {
        y0 y0Var;
        y0 y0Var2 = y0.d;
        do {
            y0Var = n1Var.b;
            if (y0Var2 == y0Var || d(n1Var, y0Var, y0Var2)) {
                return y0Var;
            }
            y0Var = n1Var.b;
            return y0Var;
        } while (d(n1Var, y0Var, y0Var2));
        return y0Var;
    }

    public final l1 q(n1 n1Var) {
        l1 l1Var;
        l1 l1Var2 = l1.c;
        do {
            l1Var = n1Var.c;
            if (l1Var2 == l1Var || f(n1Var, l1Var, l1Var2)) {
                return l1Var;
            }
            l1Var = n1Var.c;
            return l1Var;
        } while (f(n1Var, l1Var, l1Var2));
        return l1Var;
    }
}
