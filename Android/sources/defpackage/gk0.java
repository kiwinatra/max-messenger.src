package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: gk0  reason: default package */
public abstract class gk0 implements mqb {
    public boolean X;
    public final Class a = getClass();
    public final g69 b;
    public final pqb c;
    public final SparseArray o;
    public final Set v;
    public final boolean w;
    public final ft x;
    public final ft y;
    public final qqb z;

    public gk0(g69 g69, pqb pqb, qqb qqb) {
        g69.getClass();
        this.b = g69;
        pqb.getClass();
        this.c = pqb;
        qqb.getClass();
        this.z = qqb;
        SparseArray sparseArray = new SparseArray();
        this.o = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            try {
                sparseArray.clear();
                SparseIntArray sparseIntArray2 = pqb.c;
                if (sparseIntArray2 != null) {
                    for (int i = 0; i < sparseIntArray2.size(); i++) {
                        int keyAt = sparseIntArray2.keyAt(i);
                        int valueAt = sparseIntArray2.valueAt(i);
                        int i2 = sparseIntArray.get(keyAt, 0);
                        SparseArray sparseArray2 = this.o;
                        int h = h(keyAt);
                        this.c.getClass();
                        sparseArray2.put(keyAt, new ft0(h, valueAt, i2));
                    }
                    this.w = false;
                } else {
                    this.w = true;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.v = Collections.newSetFromMap(new IdentityHashMap());
        this.y = new ft(1);
        this.x = new ft(1);
    }

    public abstract Object a(int i);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void b(java.lang.Object r8) {
        /*
            r7 = this;
            r8.getClass()
            int r0 = r7.g(r8)
            int r1 = r7.h(r0)
            monitor-enter(r7)
            monitor-enter(r7)     // Catch:{ all -> 0x003f }
            android.util.SparseArray r2 = r7.o     // Catch:{ all -> 0x00d4 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00d4 }
            ft0 r2 = (defpackage.ft0) r2     // Catch:{ all -> 0x00d4 }
            monitor-exit(r7)     // Catch:{ all -> 0x003f }
            java.util.Set r3 = r7.v     // Catch:{ all -> 0x003f }
            boolean r3 = r3.remove(r8)     // Catch:{ all -> 0x003f }
            if (r3 != 0) goto L_0x0042
            java.lang.Class r1 = r7.a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x003f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003f }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch:{ all -> 0x003f }
            defpackage.bg5.b(r1, r2, r0)     // Catch:{ all -> 0x003f }
            r7.d(r8)     // Catch:{ all -> 0x003f }
            qqb r8 = r7.z     // Catch:{ all -> 0x003f }
            r8.getClass()     // Catch:{ all -> 0x003f }
            goto L_0x00cf
        L_0x003f:
            r8 = move-exception
            goto L_0x00d7
        L_0x0042:
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L_0x0096
            int r5 = r2.e     // Catch:{ all -> 0x003f }
            java.util.LinkedList r6 = r2.c     // Catch:{ all -> 0x003f }
            int r6 = r6.size()     // Catch:{ all -> 0x003f }
            int r6 = r6 + r5
            int r5 = r2.b     // Catch:{ all -> 0x003f }
            if (r6 <= r5) goto L_0x0054
            goto L_0x0096
        L_0x0054:
            boolean r5 = r7.j()     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x0096
            boolean r5 = r7.k(r8)     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x0061
            goto L_0x0096
        L_0x0061:
            r2.c(r8)     // Catch:{ all -> 0x003f }
            ft r2 = r7.y     // Catch:{ all -> 0x003f }
            int r5 = r2.b     // Catch:{ all -> 0x003f }
            int r5 = r5 + r3
            r2.b = r5     // Catch:{ all -> 0x003f }
            int r3 = r2.c     // Catch:{ all -> 0x003f }
            int r3 = r3 + r1
            r2.c = r3     // Catch:{ all -> 0x003f }
            ft r2 = r7.x     // Catch:{ all -> 0x003f }
            r2.a(r1)     // Catch:{ all -> 0x003f }
            qqb r1 = r7.z     // Catch:{ all -> 0x003f }
            r1.getClass()     // Catch:{ all -> 0x003f }
            cg5 r1 = defpackage.bg5.a     // Catch:{ all -> 0x003f }
            boolean r1 = r1.a(r4)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x00cf
            java.lang.Class r1 = r7.a     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "release (reuse) (object, size) = (%x, %s)"
            int r8 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x003f }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x003f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003f }
            defpackage.bg5.g(r1, r2, r8, r0)     // Catch:{ all -> 0x003f }
            goto L_0x00cf
        L_0x0096:
            if (r2 == 0) goto L_0x00a7
            int r5 = r2.e     // Catch:{ all -> 0x003f }
            if (r5 <= 0) goto L_0x009e
            r5 = r3
            goto L_0x009f
        L_0x009e:
            r5 = 0
        L_0x009f:
            defpackage.cvg.q(r5)     // Catch:{ all -> 0x003f }
            int r5 = r2.e     // Catch:{ all -> 0x003f }
            int r5 = r5 - r3
            r2.e = r5     // Catch:{ all -> 0x003f }
        L_0x00a7:
            cg5 r2 = defpackage.bg5.a     // Catch:{ all -> 0x003f }
            boolean r2 = r2.a(r4)     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x00c2
            java.lang.Class r2 = r7.a     // Catch:{ all -> 0x003f }
            java.lang.String r3 = "release (free) (object, size) = (%x, %s)"
            int r4 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x003f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x003f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x003f }
            defpackage.bg5.g(r2, r3, r4, r0)     // Catch:{ all -> 0x003f }
        L_0x00c2:
            r7.d(r8)     // Catch:{ all -> 0x003f }
            ft r8 = r7.x     // Catch:{ all -> 0x003f }
            r8.a(r1)     // Catch:{ all -> 0x003f }
            qqb r8 = r7.z     // Catch:{ all -> 0x003f }
            r8.getClass()     // Catch:{ all -> 0x003f }
        L_0x00cf:
            r7.l()     // Catch:{ all -> 0x003f }
            monitor-exit(r7)     // Catch:{ all -> 0x003f }
            return
        L_0x00d4:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d4 }
            throw r8     // Catch:{ all -> 0x003f }
        L_0x00d7:
            monitor-exit(r7)     // Catch:{ all -> 0x003f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk0.b(java.lang.Object):void");
    }

    public final synchronized boolean c(int i) {
        if (this.X) {
            return true;
        }
        pqb pqb = this.c;
        int i2 = pqb.a;
        int i3 = this.x.c;
        if (i > i2 - i3) {
            this.z.getClass();
            return false;
        }
        int i4 = pqb.b;
        if (i > i4 - (i3 + this.y.c)) {
            n(i4 - i);
        }
        if (i <= i2 - (this.x.c + this.y.c)) {
            return true;
        }
        this.z.getClass();
        return false;
    }

    public abstract void d(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.ft0 e(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray r0 = r3.o     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0025 }
            ft0 r0 = (defpackage.ft0) r0     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0032
            boolean r1 = r3.w     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0010
            goto L_0x0032
        L_0x0010:
            cg5 r0 = defpackage.bg5.a     // Catch:{ all -> 0x0025 }
            r1 = 2
            boolean r0 = r0.a(r1)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0027
            java.lang.Class r0 = r3.a     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0025 }
            defpackage.bg5.f(r0, r2, r1)     // Catch:{ all -> 0x0025 }
            goto L_0x0027
        L_0x0025:
            r4 = move-exception
            goto L_0x0034
        L_0x0027:
            ft0 r0 = r3.m(r4)     // Catch:{ all -> 0x0025 }
            android.util.SparseArray r1 = r3.o     // Catch:{ all -> 0x0025 }
            r1.put(r4, r0)     // Catch:{ all -> 0x0025 }
            monitor-exit(r3)
            return r0
        L_0x0032:
            monitor-exit(r3)
            return r0
        L_0x0034:
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk0.e(int):ft0");
    }

    public abstract int f(int i);

    public abstract int g(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r7.x.a(r4);
        r4 = e(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        if (r4 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r4.e > 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        defpackage.cvg.q(r1);
        r4.e--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        r1 = java.lang.Error.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        if (r1.isInstance(r0) == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bd, code lost:
        r1 = java.lang.RuntimeException.class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c3, code lost:
        if (r1.isInstance(r0) == false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c6, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        defpackage.cvg.q(r7.v.add(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d5, code lost:
        if (j() == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d7, code lost:
        n(r7.c.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e2, code lost:
        r7.z.getClass();
        l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f0, code lost:
        if (defpackage.bg5.a.a(2) != false) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f2, code lost:
        defpackage.bg5.g(r7.a, "get (alloc) (object, size) = (%x, %s)", java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), java.lang.Integer.valueOf(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0106, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0108, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0109, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010d, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0114, code lost:
        throw r1.cast(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x011b, code lost:
        throw r1.cast(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.j()     // Catch:{ all -> 0x0012 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            ft r0 = r7.y     // Catch:{ all -> 0x0012 }
            int r0 = r0.c     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r0 = r1
            goto L_0x0016
        L_0x0012:
            r8 = move-exception
            goto L_0x014c
        L_0x0015:
            r0 = r2
        L_0x0016:
            defpackage.cvg.q(r0)     // Catch:{ all -> 0x0012 }
            monitor-exit(r7)
            int r8 = r7.f(r8)
            monitor-enter(r7)
            ft0 r0 = r7.e(r8)     // Catch:{ all -> 0x0072 }
            r3 = 2
            if (r0 == 0) goto L_0x0077
            java.lang.Object r4 = r7.i(r0)     // Catch:{ all -> 0x0072 }
            if (r4 == 0) goto L_0x0077
            java.util.Set r8 = r7.v     // Catch:{ all -> 0x0072 }
            boolean r8 = r8.add(r4)     // Catch:{ all -> 0x0072 }
            defpackage.cvg.q(r8)     // Catch:{ all -> 0x0072 }
            int r8 = r7.g(r4)     // Catch:{ all -> 0x0072 }
            int r0 = r7.h(r8)     // Catch:{ all -> 0x0072 }
            ft r1 = r7.x     // Catch:{ all -> 0x0072 }
            int r5 = r1.b     // Catch:{ all -> 0x0072 }
            int r5 = r5 + r2
            r1.b = r5     // Catch:{ all -> 0x0072 }
            int r2 = r1.c     // Catch:{ all -> 0x0072 }
            int r2 = r2 + r0
            r1.c = r2     // Catch:{ all -> 0x0072 }
            ft r1 = r7.y     // Catch:{ all -> 0x0072 }
            r1.a(r0)     // Catch:{ all -> 0x0072 }
            qqb r0 = r7.z     // Catch:{ all -> 0x0072 }
            r0.getClass()     // Catch:{ all -> 0x0072 }
            r7.l()     // Catch:{ all -> 0x0072 }
            cg5 r0 = defpackage.bg5.a     // Catch:{ all -> 0x0072 }
            boolean r0 = r0.a(r3)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0075
            java.lang.Class r0 = r7.a     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r2 = java.lang.System.identityHashCode(r4)     // Catch:{ all -> 0x0072 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0072 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0072 }
            defpackage.bg5.g(r0, r1, r2, r8)     // Catch:{ all -> 0x0072 }
            goto L_0x0075
        L_0x0072:
            r8 = move-exception
            goto L_0x014a
        L_0x0075:
            monitor-exit(r7)     // Catch:{ all -> 0x0072 }
            return r4
        L_0x0077:
            int r4 = r7.h(r8)     // Catch:{ all -> 0x0072 }
            boolean r5 = r7.c(r4)     // Catch:{ all -> 0x0072 }
            if (r5 == 0) goto L_0x011f
            ft r5 = r7.x     // Catch:{ all -> 0x0072 }
            int r6 = r5.b     // Catch:{ all -> 0x0072 }
            int r6 = r6 + r2
            r5.b = r6     // Catch:{ all -> 0x0072 }
            int r6 = r5.c     // Catch:{ all -> 0x0072 }
            int r6 = r6 + r4
            r5.c = r6     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0094
            int r5 = r0.e     // Catch:{ all -> 0x0072 }
            int r5 = r5 + r2
            r0.e = r5     // Catch:{ all -> 0x0072 }
        L_0x0094:
            monitor-exit(r7)     // Catch:{ all -> 0x0072 }
            java.lang.Object r0 = r7.a(r8)     // Catch:{ all -> 0x009a }
            goto L_0x00c6
        L_0x009a:
            r0 = move-exception
            monitor-enter(r7)
            ft r5 = r7.x     // Catch:{ all -> 0x011c }
            r5.a(r4)     // Catch:{ all -> 0x011c }
            ft0 r4 = r7.e(r8)     // Catch:{ all -> 0x011c }
            if (r4 == 0) goto L_0x00b4
            int r5 = r4.e     // Catch:{ all -> 0x011c }
            if (r5 <= 0) goto L_0x00ac
            r1 = r2
        L_0x00ac:
            defpackage.cvg.q(r1)     // Catch:{ all -> 0x011c }
            int r1 = r4.e     // Catch:{ all -> 0x011c }
            int r1 = r1 - r2
            r4.e = r1     // Catch:{ all -> 0x011c }
        L_0x00b4:
            monitor-exit(r7)     // Catch:{ all -> 0x011c }
            java.lang.Class<java.lang.Error> r1 = java.lang.Error.class
            boolean r2 = r1.isInstance(r0)
            if (r2 != 0) goto L_0x0115
            java.lang.Class<java.lang.RuntimeException> r1 = java.lang.RuntimeException.class
            boolean r2 = r1.isInstance(r0)
            if (r2 != 0) goto L_0x010e
            r0 = 0
        L_0x00c6:
            monitor-enter(r7)
            java.util.Set r1 = r7.v     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.add(r0)     // Catch:{ all -> 0x0106 }
            defpackage.cvg.q(r1)     // Catch:{ all -> 0x0106 }
            monitor-enter(r7)     // Catch:{ all -> 0x0106 }
            boolean r1 = r7.j()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x00e1
            pqb r1 = r7.c     // Catch:{ all -> 0x00df }
            int r1 = r1.b     // Catch:{ all -> 0x00df }
            r7.n(r1)     // Catch:{ all -> 0x00df }
            goto L_0x00e1
        L_0x00df:
            r8 = move-exception
            goto L_0x010a
        L_0x00e1:
            monitor-exit(r7)     // Catch:{ all -> 0x0106 }
            qqb r1 = r7.z     // Catch:{ all -> 0x0106 }
            r1.getClass()     // Catch:{ all -> 0x0106 }
            r7.l()     // Catch:{ all -> 0x0106 }
            cg5 r1 = defpackage.bg5.a     // Catch:{ all -> 0x0106 }
            boolean r1 = r1.a(r3)     // Catch:{ all -> 0x0106 }
            if (r1 == 0) goto L_0x0108
            java.lang.Class r1 = r7.a     // Catch:{ all -> 0x0106 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0106 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0106 }
            defpackage.bg5.g(r1, r2, r3, r8)     // Catch:{ all -> 0x0106 }
            goto L_0x0108
        L_0x0106:
            r8 = move-exception
            goto L_0x010c
        L_0x0108:
            monitor-exit(r7)     // Catch:{ all -> 0x0106 }
            return r0
        L_0x010a:
            monitor-exit(r7)     // Catch:{ all -> 0x00df }
            throw r8     // Catch:{ all -> 0x0106 }
        L_0x010c:
            monitor-exit(r7)     // Catch:{ all -> 0x0106 }
            throw r8
        L_0x010e:
            java.lang.Object r7 = r1.cast(r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            throw r7
        L_0x0115:
            java.lang.Object r7 = r1.cast(r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            throw r7
        L_0x011c:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x011c }
            throw r8
        L_0x011f:
            com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException r8 = new com.facebook.imagepipeline.memory.BasePool$PoolSizeViolationException     // Catch:{ all -> 0x0072 }
            pqb r0 = r7.c     // Catch:{ all -> 0x0072 }
            int r0 = r0.a     // Catch:{ all -> 0x0072 }
            ft r1 = r7.x     // Catch:{ all -> 0x0072 }
            int r1 = r1.c     // Catch:{ all -> 0x0072 }
            ft r2 = r7.y     // Catch:{ all -> 0x0072 }
            int r2 = r2.c     // Catch:{ all -> 0x0072 }
            java.lang.String r3 = "Pool hard cap violation? Hard cap = "
            java.lang.String r5 = " Used size = "
            java.lang.String r6 = " Free size = "
            java.lang.StringBuilder r0 = defpackage.a81.n(r3, r0, r5, r1, r6)     // Catch:{ all -> 0x0072 }
            r0.append(r2)     // Catch:{ all -> 0x0072 }
            java.lang.String r1 = " Request size = "
            r0.append(r1)     // Catch:{ all -> 0x0072 }
            r0.append(r4)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0072 }
            r8.<init>(r0)     // Catch:{ all -> 0x0072 }
            throw r8     // Catch:{ all -> 0x0072 }
        L_0x014a:
            monitor-exit(r7)     // Catch:{ all -> 0x0072 }
            throw r8
        L_0x014c:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk0.get(int):java.lang.Object");
    }

    public abstract int h(int i);

    /* JADX WARNING: CFG modification limit reached, blocks count: 113 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object i(defpackage.ft0 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r3.b()     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000d
            int r1 = r3.e     // Catch:{ all -> 0x0011 }
            int r1 = r1 + 1
            r3.e = r1     // Catch:{ all -> 0x0011 }
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            monitor-exit(r2)     // Catch:{ all -> 0x0011 }
            throw r3
        L_0x0011:
            r3 = move-exception
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk0.i(ft0):java.lang.Object");
    }

    public final synchronized boolean j() {
        boolean z2;
        z2 = this.x.c + this.y.c > this.c.b;
        if (z2) {
            this.z.getClass();
        }
        return z2;
    }

    public boolean k(Object obj) {
        obj.getClass();
        return true;
    }

    public final void l() {
        if (bg5.a.a(2)) {
            Integer valueOf = Integer.valueOf(this.x.b);
            int i = this.y.b;
            if (bg5.a.a(2)) {
                this.a.getSimpleName();
                new StringBuilder("Used = (").append(valueOf);
            }
        }
    }

    public ft0 m(int i) {
        int h = h(i);
        this.c.getClass();
        return new ft0(h, IntCompanionObject.MAX_VALUE, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void n(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            ft r0 = r7.x     // Catch:{ all -> 0x0039 }
            int r0 = r0.c     // Catch:{ all -> 0x0039 }
            ft r1 = r7.y     // Catch:{ all -> 0x0039 }
            int r1 = r1.c     // Catch:{ all -> 0x0039 }
            int r0 = r0 + r1
            int r0 = r0 - r8
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0039 }
            if (r0 > 0) goto L_0x0013
            monitor-exit(r7)
            return
        L_0x0013:
            cg5 r1 = defpackage.bg5.a     // Catch:{ all -> 0x0039 }
            r2 = 2
            boolean r1 = r1.a(r2)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x003b
            java.lang.Class r1 = r7.a     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0039 }
            ft r5 = r7.x     // Catch:{ all -> 0x0039 }
            int r5 = r5.c     // Catch:{ all -> 0x0039 }
            ft r6 = r7.y     // Catch:{ all -> 0x0039 }
            int r6 = r6.c     // Catch:{ all -> 0x0039 }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0039 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0039 }
            defpackage.bg5.h(r1, r3, r4, r5, r6)     // Catch:{ all -> 0x0039 }
            goto L_0x003b
        L_0x0039:
            r8 = move-exception
            goto L_0x0092
        L_0x003b:
            r7.l()     // Catch:{ all -> 0x0039 }
            r1 = 0
        L_0x003f:
            android.util.SparseArray r3 = r7.o     // Catch:{ all -> 0x0039 }
            int r3 = r3.size()     // Catch:{ all -> 0x0039 }
            if (r1 >= r3) goto L_0x006d
            if (r0 > 0) goto L_0x004a
            goto L_0x006d
        L_0x004a:
            android.util.SparseArray r3 = r7.o     // Catch:{ all -> 0x0039 }
            java.lang.Object r3 = r3.valueAt(r1)     // Catch:{ all -> 0x0039 }
            ft0 r3 = (defpackage.ft0) r3     // Catch:{ all -> 0x0039 }
            r3.getClass()     // Catch:{ all -> 0x0039 }
        L_0x0055:
            if (r0 <= 0) goto L_0x006a
            java.lang.Object r4 = r3.b()     // Catch:{ all -> 0x0039 }
            if (r4 != 0) goto L_0x005e
            goto L_0x006a
        L_0x005e:
            r7.d(r4)     // Catch:{ all -> 0x0039 }
            int r4 = r3.a     // Catch:{ all -> 0x0039 }
            int r0 = r0 - r4
            ft r5 = r7.y     // Catch:{ all -> 0x0039 }
            r5.a(r4)     // Catch:{ all -> 0x0039 }
            goto L_0x0055
        L_0x006a:
            int r1 = r1 + 1
            goto L_0x003f
        L_0x006d:
            r7.l()     // Catch:{ all -> 0x0039 }
            cg5 r0 = defpackage.bg5.a     // Catch:{ all -> 0x0039 }
            boolean r0 = r0.a(r2)     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0090
            java.lang.Class r0 = r7.a     // Catch:{ all -> 0x0039 }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0039 }
            ft r2 = r7.x     // Catch:{ all -> 0x0039 }
            int r2 = r2.c     // Catch:{ all -> 0x0039 }
            ft r3 = r7.y     // Catch:{ all -> 0x0039 }
            int r3 = r3.c     // Catch:{ all -> 0x0039 }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
            defpackage.bg5.g(r0, r1, r8, r2)     // Catch:{ all -> 0x0039 }
        L_0x0090:
            monitor-exit(r7)
            return
        L_0x0092:
            monitor-exit(r7)     // Catch:{ all -> 0x0039 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk0.n(int):void");
    }
}
