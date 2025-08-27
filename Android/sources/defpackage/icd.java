package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import java.io.EOFException;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: icd  reason: default package */
public class icd implements ypf {
    public ca6 A;
    public ca6 B;
    public int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public final ccd a;
    public final gv1 b = new Object();
    public final cs c = new cs(new qbb(24));
    public final ow4 d;
    public final fw4 e;
    public gcd f;
    public ca6 g;
    public zv4 h;
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public int[] l = new int[1000];
    public int[] m = new int[1000];
    public long[] n = new long[1000];
    public wpf[] o = new wpf[1000];
    public int p;
    public int q;
    public int r;
    public int s;
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean w;
    public boolean x = true;
    public boolean y = true;
    public boolean z;

    /* JADX WARNING: type inference failed for: r1v1, types: [gv1, java.lang.Object] */
    public icd(cb4 cb4, ow4 ow4, fw4 fw4) {
        this.d = ow4;
        this.e = fw4;
        this.a = new ccd(cb4);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized boolean A(long r10, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            monitor-enter(r9)     // Catch:{ all -> 0x0045 }
            r0 = 0
            r9.s = r0     // Catch:{ all -> 0x0049 }
            ccd r1 = r9.a     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r1.f     // Catch:{ all -> 0x0049 }
            vy r2 = (defpackage.vy) r2     // Catch:{ all -> 0x0049 }
            r1.g = r2     // Catch:{ all -> 0x0049 }
            monitor-exit(r9)     // Catch:{ all -> 0x0045 }
            int r6 = r9.p(r0)     // Catch:{ all -> 0x0045 }
            boolean r1 = r9.s()     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0047
            long[] r1 = r9.n     // Catch:{ all -> 0x0045 }
            r1 = r1[r6]     // Catch:{ all -> 0x0045 }
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0047
            long r1 = r9.v     // Catch:{ all -> 0x0045 }
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0029
            if (r12 != 0) goto L_0x0029
            goto L_0x0047
        L_0x0029:
            int r12 = r9.p     // Catch:{ all -> 0x0045 }
            int r1 = r9.s     // Catch:{ all -> 0x0045 }
            int r7 = r12 - r1
            r8 = 1
            r3 = r9
            r4 = r10
            int r12 = r3.l(r4, r6, r7, r8)     // Catch:{ all -> 0x0045 }
            r1 = -1
            if (r12 != r1) goto L_0x003b
            monitor-exit(r9)
            return r0
        L_0x003b:
            r9.t = r10     // Catch:{ all -> 0x0045 }
            int r10 = r9.s     // Catch:{ all -> 0x0045 }
            int r10 = r10 + r12
            r9.s = r10     // Catch:{ all -> 0x0045 }
            monitor-exit(r9)
            r9 = 1
            return r9
        L_0x0045:
            r10 = move-exception
            goto L_0x004c
        L_0x0047:
            monitor-exit(r9)
            return r0
        L_0x0049:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0049 }
            throw r10     // Catch:{ all -> 0x0045 }
        L_0x004c:
            monitor-exit(r9)     // Catch:{ all -> 0x0045 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.A(long, boolean):boolean");
    }

    public final synchronized void B(int i2) {
        boolean z2;
        if (i2 >= 0) {
            try {
                if (this.s + i2 <= this.p) {
                    z2 = true;
                    y64.g(z2);
                    this.s += i2;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        z2 = false;
        y64.g(z2);
        this.s += i2;
    }

    public final int a(b74 b74, int i2, boolean z2) {
        ccd ccd = this.a;
        int d2 = ccd.d(i2);
        vy vyVar = (vy) ccd.h;
        gd gdVar = (gd) vyVar.o;
        int read = b74.read(gdVar.a, ((int) (ccd.c - vyVar.b)) + gdVar.b, d2);
        if (read != -1) {
            long j2 = ccd.c + ((long) read);
            ccd.c = j2;
            vy vyVar2 = (vy) ccd.h;
            if (j2 != vyVar2.c) {
                return read;
            }
            ccd.h = (vy) vyVar2.v;
            return read;
        } else if (z2) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void b(long r17, int r19, int r20, int r21, defpackage.wpf r22) {
        /*
            r16 = this;
            r1 = r16
            r0 = r20
            boolean r2 = r1.z
            if (r2 == 0) goto L_0x0010
            ca6 r2 = r1.A
            defpackage.y64.k(r2)
            r1.d(r2)
        L_0x0010:
            r2 = r19 & 1
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0018
            r5 = r4
            goto L_0x0019
        L_0x0018:
            r5 = r3
        L_0x0019:
            boolean r6 = r1.x
            if (r6 == 0) goto L_0x0022
            if (r5 != 0) goto L_0x0020
            return
        L_0x0020:
            r1.x = r3
        L_0x0022:
            long r6 = r1.F
            long r6 = r17 + r6
            boolean r8 = r1.D
            if (r8 == 0) goto L_0x004d
            long r8 = r1.t
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0031
            return
        L_0x0031:
            if (r2 != 0) goto L_0x004d
            boolean r2 = r1.E
            if (r2 != 0) goto L_0x004a
            ca6 r2 = r1.B
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r2 = r2.length()
            int r2 = r2 + 50
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            r1.E = r4
        L_0x004a:
            r2 = r19 | 1
            goto L_0x004f
        L_0x004d:
            r2 = r19
        L_0x004f:
            boolean r8 = r1.G
            r9 = -1
            if (r8 == 0) goto L_0x00af
            if (r5 == 0) goto L_0x00ae
            monitor-enter(r16)
            int r5 = r1.p     // Catch:{ all -> 0x0066 }
            if (r5 != 0) goto L_0x0068
            long r10 = r1.u     // Catch:{ all -> 0x0066 }
            int r5 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x0063
            r5 = r4
            goto L_0x0064
        L_0x0063:
            r5 = r3
        L_0x0064:
            monitor-exit(r16)
            goto L_0x00a3
        L_0x0066:
            r0 = move-exception
            goto L_0x00ac
        L_0x0068:
            monitor-enter(r16)     // Catch:{ all -> 0x0066 }
            long r10 = r1.u     // Catch:{ all -> 0x00a9 }
            int r5 = r1.s     // Catch:{ all -> 0x00a9 }
            long r12 = r1.n(r5)     // Catch:{ all -> 0x00a9 }
            long r10 = java.lang.Math.max(r10, r12)     // Catch:{ all -> 0x00a9 }
            monitor-exit(r16)     // Catch:{ all -> 0x0066 }
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x007d
            monitor-exit(r16)
            r5 = r3
            goto L_0x00a3
        L_0x007d:
            int r5 = r1.p     // Catch:{ all -> 0x0066 }
            int r8 = r5 + -1
            int r8 = r1.p(r8)     // Catch:{ all -> 0x0066 }
        L_0x0085:
            int r10 = r1.s     // Catch:{ all -> 0x0066 }
            if (r5 <= r10) goto L_0x009b
            long[] r10 = r1.n     // Catch:{ all -> 0x0066 }
            r10 = r10[r8]     // Catch:{ all -> 0x0066 }
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x009b
            int r5 = r5 + -1
            int r8 = r8 + -1
            if (r8 != r9) goto L_0x0085
            int r8 = r1.i     // Catch:{ all -> 0x0066 }
            int r8 = r8 - r4
            goto L_0x0085
        L_0x009b:
            int r8 = r1.q     // Catch:{ all -> 0x0066 }
            int r8 = r8 + r5
            r1.j(r8)     // Catch:{ all -> 0x0066 }
            monitor-exit(r16)
            r5 = r4
        L_0x00a3:
            if (r5 != 0) goto L_0x00a6
            goto L_0x00ae
        L_0x00a6:
            r1.G = r3
            goto L_0x00af
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x00ac:
            monitor-exit(r16)     // Catch:{ all -> 0x0066 }
            throw r0
        L_0x00ae:
            return
        L_0x00af:
            ccd r5 = r1.a
            long r10 = r5.c
            long r12 = (long) r0
            long r10 = r10 - r12
            r5 = r21
            long r12 = (long) r5
            long r10 = r10 - r12
            monitor-enter(r16)
            int r5 = r1.p     // Catch:{ all -> 0x00d8 }
            if (r5 <= 0) goto L_0x00db
            int r5 = r5 - r4
            int r5 = r1.p(r5)     // Catch:{ all -> 0x00d8 }
            long[] r8 = r1.k     // Catch:{ all -> 0x00d8 }
            r12 = r8[r5]     // Catch:{ all -> 0x00d8 }
            int[] r8 = r1.l     // Catch:{ all -> 0x00d8 }
            r5 = r8[r5]     // Catch:{ all -> 0x00d8 }
            long r14 = (long) r5     // Catch:{ all -> 0x00d8 }
            long r12 = r12 + r14
            int r5 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x00d3
            r5 = r4
            goto L_0x00d4
        L_0x00d3:
            r5 = r3
        L_0x00d4:
            defpackage.y64.g(r5)     // Catch:{ all -> 0x00d8 }
            goto L_0x00db
        L_0x00d8:
            r0 = move-exception
            goto L_0x020f
        L_0x00db:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r5 & r2
            if (r5 == 0) goto L_0x00e2
            r5 = r4
            goto L_0x00e3
        L_0x00e2:
            r5 = r3
        L_0x00e3:
            r1.w = r5     // Catch:{ all -> 0x00d8 }
            long r12 = r1.v     // Catch:{ all -> 0x00d8 }
            long r12 = java.lang.Math.max(r12, r6)     // Catch:{ all -> 0x00d8 }
            r1.v = r12     // Catch:{ all -> 0x00d8 }
            int r5 = r1.p     // Catch:{ all -> 0x00d8 }
            int r5 = r1.p(r5)     // Catch:{ all -> 0x00d8 }
            long[] r8 = r1.n     // Catch:{ all -> 0x00d8 }
            r8[r5] = r6     // Catch:{ all -> 0x00d8 }
            long[] r6 = r1.k     // Catch:{ all -> 0x00d8 }
            r6[r5] = r10     // Catch:{ all -> 0x00d8 }
            int[] r6 = r1.l     // Catch:{ all -> 0x00d8 }
            r6[r5] = r0     // Catch:{ all -> 0x00d8 }
            int[] r0 = r1.m     // Catch:{ all -> 0x00d8 }
            r0[r5] = r2     // Catch:{ all -> 0x00d8 }
            wpf[] r0 = r1.o     // Catch:{ all -> 0x00d8 }
            r0[r5] = r22     // Catch:{ all -> 0x00d8 }
            int[] r0 = r1.j     // Catch:{ all -> 0x00d8 }
            int r2 = r1.C     // Catch:{ all -> 0x00d8 }
            r0[r5] = r2     // Catch:{ all -> 0x00d8 }
            cs r0 = r1.c     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00d8 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x00d8 }
            int r0 = r0.size()     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x011b
            r0 = r4
            goto L_0x011c
        L_0x011b:
            r0 = r3
        L_0x011c:
            if (r0 != 0) goto L_0x0139
            cs r0 = r1.c     // Catch:{ all -> 0x00d8 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x00d8 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x00d8 }
            int r2 = r0.size()     // Catch:{ all -> 0x00d8 }
            int r2 = r2 - r4
            java.lang.Object r0 = r0.valueAt(r2)     // Catch:{ all -> 0x00d8 }
            ecd r0 = (defpackage.ecd) r0     // Catch:{ all -> 0x00d8 }
            ca6 r0 = r0.a     // Catch:{ all -> 0x00d8 }
            ca6 r2 = r1.B     // Catch:{ all -> 0x00d8 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x019b
        L_0x0139:
            ow4 r0 = r1.d     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0146
            fw4 r2 = r1.e     // Catch:{ all -> 0x00d8 }
            ca6 r5 = r1.B     // Catch:{ all -> 0x00d8 }
            mw4 r0 = r0.d(r2, r5)     // Catch:{ all -> 0x00d8 }
            goto L_0x0148
        L_0x0146:
            tb4 r0 = defpackage.mw4.p     // Catch:{ all -> 0x00d8 }
        L_0x0148:
            cs r2 = r1.c     // Catch:{ all -> 0x00d8 }
            int r5 = r1.q     // Catch:{ all -> 0x00d8 }
            int r6 = r1.p     // Catch:{ all -> 0x00d8 }
            int r5 = r5 + r6
            ecd r6 = new ecd     // Catch:{ all -> 0x00d8 }
            ca6 r7 = r1.B     // Catch:{ all -> 0x00d8 }
            r7.getClass()     // Catch:{ all -> 0x00d8 }
            r6.<init>(r7, r0)     // Catch:{ all -> 0x00d8 }
            int r0 = r2.b     // Catch:{ all -> 0x00d8 }
            java.lang.Object r7 = r2.c     // Catch:{ all -> 0x00d8 }
            android.util.SparseArray r7 = (android.util.SparseArray) r7     // Catch:{ all -> 0x00d8 }
            if (r0 != r9) goto L_0x016f
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            if (r0 != 0) goto L_0x0169
            r0 = r4
            goto L_0x016a
        L_0x0169:
            r0 = r3
        L_0x016a:
            defpackage.y64.j(r0)     // Catch:{ all -> 0x00d8 }
            r2.b = r3     // Catch:{ all -> 0x00d8 }
        L_0x016f:
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            if (r0 <= 0) goto L_0x0198
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            int r0 = r0 - r4
            int r0 = r7.keyAt(r0)     // Catch:{ all -> 0x00d8 }
            if (r5 < r0) goto L_0x0182
            r8 = r4
            goto L_0x0183
        L_0x0182:
            r8 = r3
        L_0x0183:
            defpackage.y64.g(r8)     // Catch:{ all -> 0x00d8 }
            if (r0 != r5) goto L_0x0198
            int r0 = r7.size()     // Catch:{ all -> 0x00d8 }
            int r0 = r0 - r4
            java.lang.Object r0 = r7.valueAt(r0)     // Catch:{ all -> 0x00d8 }
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x00d8 }
            qbb r2 = (defpackage.qbb) r2     // Catch:{ all -> 0x00d8 }
            r2.accept(r0)     // Catch:{ all -> 0x00d8 }
        L_0x0198:
            r7.append(r5, r6)     // Catch:{ all -> 0x00d8 }
        L_0x019b:
            int r0 = r1.p     // Catch:{ all -> 0x00d8 }
            int r0 = r0 + r4
            r1.p = r0     // Catch:{ all -> 0x00d8 }
            int r2 = r1.i     // Catch:{ all -> 0x00d8 }
            if (r0 != r2) goto L_0x020d
            int r0 = r2 + 1000
            int[] r4 = new int[r0]     // Catch:{ all -> 0x00d8 }
            long[] r5 = new long[r0]     // Catch:{ all -> 0x00d8 }
            long[] r6 = new long[r0]     // Catch:{ all -> 0x00d8 }
            int[] r7 = new int[r0]     // Catch:{ all -> 0x00d8 }
            int[] r8 = new int[r0]     // Catch:{ all -> 0x00d8 }
            wpf[] r9 = new defpackage.wpf[r0]     // Catch:{ all -> 0x00d8 }
            int r10 = r1.r     // Catch:{ all -> 0x00d8 }
            int r2 = r2 - r10
            long[] r11 = r1.k     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r10, r5, r3, r2)     // Catch:{ all -> 0x00d8 }
            long[] r10 = r1.n     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r6, r3, r2)     // Catch:{ all -> 0x00d8 }
            int[] r10 = r1.m     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r7, r3, r2)     // Catch:{ all -> 0x00d8 }
            int[] r10 = r1.l     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r8, r3, r2)     // Catch:{ all -> 0x00d8 }
            wpf[] r10 = r1.o     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r9, r3, r2)     // Catch:{ all -> 0x00d8 }
            int[] r10 = r1.j     // Catch:{ all -> 0x00d8 }
            int r11 = r1.r     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r10, r11, r4, r3, r2)     // Catch:{ all -> 0x00d8 }
            int r10 = r1.r     // Catch:{ all -> 0x00d8 }
            long[] r11 = r1.k     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r5, r2, r10)     // Catch:{ all -> 0x00d8 }
            long[] r11 = r1.n     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r6, r2, r10)     // Catch:{ all -> 0x00d8 }
            int[] r11 = r1.m     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r7, r2, r10)     // Catch:{ all -> 0x00d8 }
            int[] r11 = r1.l     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r8, r2, r10)     // Catch:{ all -> 0x00d8 }
            wpf[] r11 = r1.o     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r9, r2, r10)     // Catch:{ all -> 0x00d8 }
            int[] r11 = r1.j     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r11, r3, r4, r2, r10)     // Catch:{ all -> 0x00d8 }
            r1.k = r5     // Catch:{ all -> 0x00d8 }
            r1.n = r6     // Catch:{ all -> 0x00d8 }
            r1.m = r7     // Catch:{ all -> 0x00d8 }
            r1.l = r8     // Catch:{ all -> 0x00d8 }
            r1.o = r9     // Catch:{ all -> 0x00d8 }
            r1.j = r4     // Catch:{ all -> 0x00d8 }
            r1.r = r3     // Catch:{ all -> 0x00d8 }
            r1.i = r0     // Catch:{ all -> 0x00d8 }
        L_0x020d:
            monitor-exit(r16)
            return
        L_0x020f:
            monitor-exit(r16)     // Catch:{ all -> 0x00d8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.b(long, int, int, int, wpf):void");
    }

    public final void c(int i2, g1g g1g) {
        while (true) {
            ccd ccd = this.a;
            if (i2 > 0) {
                int d2 = ccd.d(i2);
                vy vyVar = (vy) ccd.h;
                gd gdVar = (gd) vyVar.o;
                g1g.g(((int) (ccd.c - vyVar.b)) + gdVar.b, gdVar.a, d2);
                i2 -= d2;
                long j2 = ccd.c + ((long) d2);
                ccd.c = j2;
                vy vyVar2 = (vy) ccd.h;
                if (j2 == vyVar2.c) {
                    ccd.h = (vy) vyVar2.v;
                }
            } else {
                ccd.getClass();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010f, code lost:
        if (r6 != 16) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0111, code lost:
        r6 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.ca6 r6) {
        /*
            r5 = this;
            r0 = 1
            ca6 r1 = r5.m(r6)
            r2 = 0
            r5.z = r2
            r5.A = r6
            monitor-enter(r5)
            r5.y = r2     // Catch:{ all -> 0x0059 }
            ca6 r6 = r5.B     // Catch:{ all -> 0x0059 }
            boolean r6 = defpackage.t0g.a(r1, r6)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0019
            monitor-exit(r5)
            r0 = r2
            goto L_0x0117
        L_0x0019:
            cs r6 = r5.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x0059 }
            int r6 = r6.size()     // Catch:{ all -> 0x0059 }
            if (r6 != 0) goto L_0x0027
            r6 = r0
            goto L_0x0028
        L_0x0027:
            r6 = r2
        L_0x0028:
            if (r6 != 0) goto L_0x005c
            cs r6 = r5.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x0059 }
            int r3 = r6.size()     // Catch:{ all -> 0x0059 }
            int r3 = r3 - r0
            java.lang.Object r6 = r6.valueAt(r3)     // Catch:{ all -> 0x0059 }
            ecd r6 = (defpackage.ecd) r6     // Catch:{ all -> 0x0059 }
            ca6 r6 = r6.a     // Catch:{ all -> 0x0059 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x005c
            cs r6 = r5.c     // Catch:{ all -> 0x0059 }
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0059 }
            android.util.SparseArray r6 = (android.util.SparseArray) r6     // Catch:{ all -> 0x0059 }
            int r1 = r6.size()     // Catch:{ all -> 0x0059 }
            int r1 = r1 - r0
            java.lang.Object r6 = r6.valueAt(r1)     // Catch:{ all -> 0x0059 }
            ecd r6 = (defpackage.ecd) r6     // Catch:{ all -> 0x0059 }
            ca6 r6 = r6.a     // Catch:{ all -> 0x0059 }
            r5.B = r6     // Catch:{ all -> 0x0059 }
            goto L_0x005e
        L_0x0059:
            r6 = move-exception
            goto L_0x0121
        L_0x005c:
            r5.B = r1     // Catch:{ all -> 0x0059 }
        L_0x005e:
            ca6 r6 = r5.B     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = r6.Z     // Catch:{ all -> 0x0059 }
            java.lang.String r6 = r6.z     // Catch:{ all -> 0x0059 }
            java.util.ArrayList r3 = defpackage.uq9.a     // Catch:{ all -> 0x0059 }
            if (r1 != 0) goto L_0x006b
        L_0x0068:
            r6 = r2
            goto L_0x0112
        L_0x006b:
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -2123537834: goto L_0x00ec;
                case -432837260: goto L_0x00e1;
                case -432837259: goto L_0x00d6;
                case -53558318: goto L_0x00cb;
                case 187078296: goto L_0x00c0;
                case 187094639: goto L_0x00b5;
                case 1504578661: goto L_0x00aa;
                case 1504619009: goto L_0x009f;
                case 1504831518: goto L_0x0091;
                case 1903231877: goto L_0x0083;
                case 1903589369: goto L_0x0075;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x00f6
        L_0x0075:
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x007f
            goto L_0x00f6
        L_0x007f:
            r3 = 10
            goto L_0x00f6
        L_0x0083:
            java.lang.String r4 = "audio/g711-alaw"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x008d
            goto L_0x00f6
        L_0x008d:
            r3 = 9
            goto L_0x00f6
        L_0x0091:
            java.lang.String r4 = "audio/mpeg"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x009b
            goto L_0x00f6
        L_0x009b:
            r3 = 8
            goto L_0x00f6
        L_0x009f:
            java.lang.String r4 = "audio/flac"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00a8
            goto L_0x00f6
        L_0x00a8:
            r3 = 7
            goto L_0x00f6
        L_0x00aa:
            java.lang.String r4 = "audio/eac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00b3
            goto L_0x00f6
        L_0x00b3:
            r3 = 6
            goto L_0x00f6
        L_0x00b5:
            java.lang.String r4 = "audio/raw"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00be
            goto L_0x00f6
        L_0x00be:
            r3 = 5
            goto L_0x00f6
        L_0x00c0:
            java.lang.String r4 = "audio/ac3"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00c9
            goto L_0x00f6
        L_0x00c9:
            r3 = 4
            goto L_0x00f6
        L_0x00cb:
            java.lang.String r4 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00d4
            goto L_0x00f6
        L_0x00d4:
            r3 = 3
            goto L_0x00f6
        L_0x00d6:
            java.lang.String r4 = "audio/mpeg-L2"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00df
            goto L_0x00f6
        L_0x00df:
            r3 = 2
            goto L_0x00f6
        L_0x00e1:
            java.lang.String r4 = "audio/mpeg-L1"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00ea
            goto L_0x00f6
        L_0x00ea:
            r3 = r0
            goto L_0x00f6
        L_0x00ec:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r3 = r2
        L_0x00f6:
            switch(r3) {
                case 0: goto L_0x0111;
                case 1: goto L_0x0111;
                case 2: goto L_0x0111;
                case 3: goto L_0x00fb;
                case 4: goto L_0x0111;
                case 5: goto L_0x0111;
                case 6: goto L_0x0111;
                case 7: goto L_0x0111;
                case 8: goto L_0x0111;
                case 9: goto L_0x0111;
                case 10: goto L_0x0111;
                default: goto L_0x00f9;
            }
        L_0x00f9:
            goto L_0x0068
        L_0x00fb:
            if (r6 != 0) goto L_0x00ff
            goto L_0x0068
        L_0x00ff:
            ft r6 = defpackage.uq9.e(r6)     // Catch:{ all -> 0x0059 }
            if (r6 != 0) goto L_0x0107
            goto L_0x0068
        L_0x0107:
            int r6 = r6.b()     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0068
            r1 = 16
            if (r6 == r1) goto L_0x0068
        L_0x0111:
            r6 = r0
        L_0x0112:
            r5.D = r6     // Catch:{ all -> 0x0059 }
            r5.E = r2     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)
        L_0x0117:
            gcd r5 = r5.f
            if (r5 == 0) goto L_0x0120
            if (r0 == 0) goto L_0x0120
            r5.b()
        L_0x0120:
            return
        L_0x0121:
            monitor-exit(r5)     // Catch:{ all -> 0x0059 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.d(ca6):void");
    }

    public final long g(int i2) {
        this.u = Math.max(this.u, n(i2));
        this.p -= i2;
        int i3 = this.q + i2;
        this.q = i3;
        int i4 = this.r + i2;
        this.r = i4;
        int i5 = this.i;
        if (i4 >= i5) {
            this.r = i4 - i5;
        }
        int i6 = this.s - i2;
        this.s = i6;
        int i7 = 0;
        if (i6 < 0) {
            this.s = 0;
        }
        while (true) {
            cs csVar = this.c;
            SparseArray sparseArray = (SparseArray) csVar.c;
            if (i7 >= sparseArray.size() - 1) {
                break;
            }
            int i8 = i7 + 1;
            if (i3 < sparseArray.keyAt(i8)) {
                break;
            }
            ((qbb) csVar.o).accept(sparseArray.valueAt(i7));
            sparseArray.removeAt(i7);
            int i9 = csVar.b;
            if (i9 > 0) {
                csVar.b = i9 - 1;
            }
            i7 = i8;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i10 = this.r;
        if (i10 == 0) {
            i10 = this.i;
        }
        int i11 = i10 - 1;
        return this.k[i11] + ((long) this.l[i11]);
    }

    public final void h(long j2, boolean z2, boolean z3) {
        long j3;
        int i2;
        ccd ccd = this.a;
        synchronized (this) {
            try {
                int i3 = this.p;
                j3 = -1;
                if (i3 != 0) {
                    long[] jArr = this.n;
                    int i4 = this.r;
                    if (j2 >= jArr[i4]) {
                        if (z3 && (i2 = this.s) != i3) {
                            i3 = i2 + 1;
                        }
                        int l2 = l(j2, i4, i3, z2);
                        if (l2 != -1) {
                            j3 = g(l2);
                        }
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ccd.c(j3);
    }

    public final void i() {
        long g2;
        ccd ccd = this.a;
        synchronized (this) {
            int i2 = this.p;
            g2 = i2 == 0 ? -1 : g(i2);
        }
        ccd.c(g2);
    }

    public final long j(int i2) {
        int i3 = this.q;
        int i4 = this.p;
        int i5 = (i3 + i4) - i2;
        boolean z2 = false;
        y64.g(i5 >= 0 && i5 <= i4 - this.s);
        int i6 = this.p - i5;
        this.p = i6;
        this.v = Math.max(this.u, n(i6));
        if (i5 == 0 && this.w) {
            z2 = true;
        }
        this.w = z2;
        cs csVar = this.c;
        SparseArray sparseArray = (SparseArray) csVar.c;
        int size = sparseArray.size() - 1;
        while (size >= 0 && i2 < sparseArray.keyAt(size)) {
            ((qbb) csVar.o).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
            size--;
        }
        csVar.b = sparseArray.size() > 0 ? Math.min(csVar.b, sparseArray.size() - 1) : -1;
        int i7 = this.p;
        if (i7 == 0) {
            return 0;
        }
        int p2 = p(i7 - 1);
        return this.k[p2] + ((long) this.l[p2]);
    }

    public final void k(int i2) {
        long j2 = j(i2);
        ccd ccd = this.a;
        y64.g(j2 <= ccd.c);
        ccd.c = j2;
        int i3 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        int i4 = ccd.b;
        if (i3 != 0) {
            vy vyVar = (vy) ccd.f;
            if (j2 != vyVar.b) {
                while (ccd.c > vyVar.c) {
                    vyVar = (vy) vyVar.v;
                }
                vy vyVar2 = (vy) vyVar.v;
                vyVar2.getClass();
                ccd.a(vyVar2);
                vy vyVar3 = new vy(i4, 4, vyVar.c);
                vyVar.v = vyVar3;
                if (ccd.c == vyVar.c) {
                    vyVar = vyVar3;
                }
                ccd.h = vyVar;
                if (((vy) ccd.g) == vyVar2) {
                    ccd.g = vyVar3;
                    return;
                }
                return;
            }
        }
        ccd.a((vy) ccd.f);
        vy vyVar4 = new vy(i4, 4, ccd.c);
        ccd.f = vyVar4;
        ccd.g = vyVar4;
        ccd.h = vyVar4;
    }

    public final int l(long j2, int i2, int i3, boolean z2) {
        int i4 = -1;
        for (int i5 = 0; i5 < i3; i5++) {
            long j3 = this.n[i2];
            if (j3 > j2) {
                return i4;
            }
            if (!z2 || (this.m[i2] & 1) != 0) {
                if (j3 == j2) {
                    return i5;
                }
                i4 = i5;
            }
            i2++;
            if (i2 == this.i) {
                i2 = 0;
            }
        }
        return i4;
    }

    public ca6 m(ca6 ca6) {
        if (this.F == 0 || ca6.y0 == LongCompanionObject.MAX_VALUE) {
            return ca6;
        }
        aa6 a2 = ca6.a();
        a2.o = ca6.y0 + this.F;
        return a2.a();
    }

    public final long n(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int p2 = p(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = Math.max(j2, this.n[p2]);
            if ((this.m[p2] & 1) != 0) {
                break;
            }
            p2--;
            if (p2 == -1) {
                p2 = this.i - 1;
            }
        }
        return j2;
    }

    public final int o() {
        return this.q + this.s;
    }

    public final int p(int i2) {
        int i3 = this.r + i2;
        int i4 = this.i;
        return i3 < i4 ? i3 : i3 - i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int q(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.s     // Catch:{ all -> 0x0026 }
            int r4 = r8.p(r0)     // Catch:{ all -> 0x0026 }
            boolean r0 = r8.s()     // Catch:{ all -> 0x0026 }
            r7 = 0
            if (r0 == 0) goto L_0x003c
            long[] r0 = r8.n     // Catch:{ all -> 0x0026 }
            r0 = r0[r4]     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0017
            goto L_0x003c
        L_0x0017:
            long r0 = r8.v     // Catch:{ all -> 0x0026 }
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            if (r11 == 0) goto L_0x0028
            int r9 = r8.p     // Catch:{ all -> 0x0026 }
            int r10 = r8.s     // Catch:{ all -> 0x0026 }
            int r9 = r9 - r10
            monitor-exit(r8)
            return r9
        L_0x0026:
            r9 = move-exception
            goto L_0x003e
        L_0x0028:
            int r11 = r8.p     // Catch:{ all -> 0x0026 }
            int r0 = r8.s     // Catch:{ all -> 0x0026 }
            int r5 = r11 - r0
            r6 = 1
            r1 = r8
            r2 = r9
            int r9 = r1.l(r2, r4, r5, r6)     // Catch:{ all -> 0x0026 }
            r10 = -1
            if (r9 != r10) goto L_0x003a
            monitor-exit(r8)
            return r7
        L_0x003a:
            monitor-exit(r8)
            return r9
        L_0x003c:
            monitor-exit(r8)
            return r7
        L_0x003e:
            monitor-exit(r8)     // Catch:{ all -> 0x0026 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.q(long, boolean):int");
    }

    public final synchronized ca6 r() {
        return this.y ? null : this.B;
    }

    public final boolean s() {
        return this.s != this.p;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean t(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.s()     // Catch:{ all -> 0x0017 }
            r1 = 1
            if (r0 != 0) goto L_0x001c
            if (r3 != 0) goto L_0x001a
            boolean r3 = r2.w     // Catch:{ all -> 0x0017 }
            if (r3 != 0) goto L_0x001a
            ca6 r3 = r2.B     // Catch:{ all -> 0x0017 }
            if (r3 == 0) goto L_0x0019
            ca6 r0 = r2.g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0019
            goto L_0x001a
        L_0x0017:
            r3 = move-exception
            goto L_0x003c
        L_0x0019:
            r1 = 0
        L_0x001a:
            monitor-exit(r2)
            return r1
        L_0x001c:
            cs r3 = r2.c     // Catch:{ all -> 0x0017 }
            int r0 = r2.o()     // Catch:{ all -> 0x0017 }
            java.lang.Object r3 = r3.q(r0)     // Catch:{ all -> 0x0017 }
            ecd r3 = (defpackage.ecd) r3     // Catch:{ all -> 0x0017 }
            ca6 r3 = r3.a     // Catch:{ all -> 0x0017 }
            ca6 r0 = r2.g     // Catch:{ all -> 0x0017 }
            if (r3 == r0) goto L_0x0030
            monitor-exit(r2)
            return r1
        L_0x0030:
            int r3 = r2.s     // Catch:{ all -> 0x0017 }
            int r3 = r2.p(r3)     // Catch:{ all -> 0x0017 }
            boolean r3 = r2.u(r3)     // Catch:{ all -> 0x0017 }
            monitor-exit(r2)
            return r3
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.icd.t(boolean):boolean");
    }

    public final boolean u(int i2) {
        zv4 zv4 = this.h;
        return zv4 == null || zv4.getState() == 4 || ((this.m[i2] & 1073741824) == 0 && this.h.b());
    }

    public final void v() {
        zv4 zv4 = this.h;
        if (zv4 != null && zv4.getState() == 1) {
            DrmSession$DrmSessionException d2 = this.h.d();
            d2.getClass();
            throw d2;
        }
    }

    public final void w(ca6 ca6, xe8 xe8) {
        ca6 ca62;
        ca6 ca63 = this.g;
        boolean z2 = ca63 == null;
        xv4 xv4 = z2 ? null : ca63.x0;
        this.g = ca6;
        xv4 xv42 = ca6.x0;
        ow4 ow4 = this.d;
        if (ow4 != null) {
            int b2 = ow4.b(ca6);
            aa6 a2 = ca6.a();
            a2.D = b2;
            ca62 = a2.a();
        } else {
            ca62 = ca6;
        }
        xe8.c = ca62;
        xe8.b = this.h;
        if (ow4 != null) {
            if (z2 || !t0g.a(xv4, xv42)) {
                zv4 zv4 = this.h;
                fw4 fw4 = this.e;
                zv4 a3 = ow4.a(fw4, ca6);
                this.h = a3;
                xe8.b = a3;
                if (zv4 != null) {
                    zv4.f(fw4);
                }
            }
        }
    }

    public final synchronized int x() {
        try {
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return s() ? this.j[p(this.s)] : this.C;
    }

    public final int y(xe8 xe8, aa4 aa4, int i2, boolean z2) {
        int i3;
        boolean z3 = false;
        boolean z4 = (i2 & 2) != 0;
        gv1 gv1 = this.b;
        synchronized (this) {
            try {
                aa4.v = false;
                i3 = -3;
                if (!s()) {
                    if (!z2) {
                        if (!this.w) {
                            ca6 ca6 = this.B;
                            if (ca6 != null) {
                                if (!z4) {
                                    if (ca6 != this.g) {
                                    }
                                }
                                w(ca6, xe8);
                            }
                        }
                    }
                    aa4.b = 4;
                    i3 = -4;
                } else {
                    ca6 ca62 = ((ecd) this.c.q(o())).a;
                    if (!z4) {
                        if (ca62 == this.g) {
                            int p2 = p(this.s);
                            if (!u(p2)) {
                                aa4.v = true;
                            } else {
                                aa4.b = this.m[p2];
                                long j2 = this.n[p2];
                                aa4.w = j2;
                                if (j2 < this.t) {
                                    aa4.a(IntCompanionObject.MIN_VALUE);
                                }
                                gv1.a = this.l[p2];
                                gv1.b = this.k[p2];
                                gv1.c = this.o[p2];
                                i3 = -4;
                            }
                        }
                    }
                    w(ca62, xe8);
                }
                i3 = -5;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (i3 == -4 && !aa4.h(4)) {
            if ((i2 & 1) != 0) {
                z3 = true;
            }
            if ((i2 & 4) == 0) {
                if (z3) {
                    ccd ccd = this.a;
                    ccd.i((vy) ccd.g, aa4, this.b, (g1g) ccd.e);
                } else {
                    ccd ccd2 = this.a;
                    ccd2.g = ccd.i((vy) ccd2.g, aa4, this.b, (g1g) ccd2.e);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i3;
    }

    public final void z(boolean z2) {
        cs csVar;
        SparseArray sparseArray;
        ccd ccd = this.a;
        ccd.a((vy) ccd.f);
        vy vyVar = (vy) ccd.f;
        int i2 = 0;
        y64.j(((gd) vyVar.o) == null);
        vyVar.b = 0;
        vyVar.c = (long) ccd.b;
        vy vyVar2 = (vy) ccd.f;
        ccd.g = vyVar2;
        ccd.h = vyVar2;
        ccd.c = 0;
        ((cb4) ccd.d).c();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        while (true) {
            csVar = this.c;
            sparseArray = (SparseArray) csVar.c;
            if (i2 >= sparseArray.size()) {
                break;
            }
            ((qbb) csVar.o).accept(sparseArray.valueAt(i2));
            i2++;
        }
        csVar.b = -1;
        sparseArray.clear();
        if (z2) {
            this.A = null;
            this.B = null;
            this.y = true;
        }
    }
}
