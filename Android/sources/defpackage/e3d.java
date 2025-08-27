package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: e3d  reason: default package */
public final class e3d {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final x0g a;
    public long b;
    public int c;

    public e3d() {
        if (pf6.X == null) {
            Pattern pattern = x0g.c;
            pf6.X = new pf6(20);
        }
        pf6 pf6 = pf6.X;
        if (x0g.d == null) {
            x0g.d = new x0g(pf6);
        }
        this.a = x0g.d;
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.c != 0) {
            this.a.a.getClass();
            if (System.currentTimeMillis() <= this.b) {
                z = false;
            }
        }
        z = true;
        return z;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void b(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 < r0) goto L_0x0009
            r0 = 300(0x12c, float:4.2E-43)
            if (r7 < r0) goto L_0x0064
        L_0x0009:
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x0064
            r0 = 404(0x194, float:5.66E-43)
            if (r7 != r0) goto L_0x0012
            goto L_0x0064
        L_0x0012:
            int r0 = r6.c     // Catch:{ all -> 0x0060 }
            int r0 = r0 + 1
            r6.c = r0     // Catch:{ all -> 0x0060 }
            monitor-enter(r6)     // Catch:{ all -> 0x0060 }
            r0 = 429(0x1ad, float:6.01E-43)
            if (r7 == r0) goto L_0x002c
            r0 = 500(0x1f4, float:7.0E-43)
            if (r7 < r0) goto L_0x0026
            r0 = 600(0x258, float:8.41E-43)
            if (r7 >= r0) goto L_0x0026
            goto L_0x002c
        L_0x0026:
            long r0 = d     // Catch:{ all -> 0x002a }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0050
        L_0x002a:
            r7 = move-exception
            goto L_0x0062
        L_0x002c:
            int r7 = r6.c     // Catch:{ all -> 0x002a }
            double r0 = (double) r7     // Catch:{ all -> 0x002a }
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r2, r0)     // Catch:{ all -> 0x002a }
            x0g r7 = r6.a     // Catch:{ all -> 0x002a }
            r7.getClass()     // Catch:{ all -> 0x002a }
            double r2 = java.lang.Math.random()     // Catch:{ all -> 0x002a }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 * r4
            long r2 = (long) r2     // Catch:{ all -> 0x002a }
            double r2 = (double) r2     // Catch:{ all -> 0x002a }
            double r0 = r0 + r2
            long r2 = e     // Catch:{ all -> 0x002a }
            double r2 = (double) r2     // Catch:{ all -> 0x002a }
            double r0 = java.lang.Math.min(r0, r2)     // Catch:{ all -> 0x002a }
            long r0 = (long) r0
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
        L_0x0050:
            x0g r7 = r6.a     // Catch:{ all -> 0x0060 }
            pf6 r7 = r7.a     // Catch:{ all -> 0x0060 }
            r7.getClass()     // Catch:{ all -> 0x0060 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0060 }
            long r2 = r2 + r0
            r6.b = r2     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)
            return
        L_0x0060:
            r7 = move-exception
            goto L_0x006e
        L_0x0062:
            monitor-exit(r6)     // Catch:{ all -> 0x002a }
            throw r7     // Catch:{ all -> 0x0060 }
        L_0x0064:
            monitor-enter(r6)     // Catch:{ all -> 0x0060 }
            r7 = 0
            r6.c = r7     // Catch:{ all -> 0x006b }
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            monitor-exit(r6)
            return
        L_0x006b:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006b }
            throw r7     // Catch:{ all -> 0x0060 }
        L_0x006e:
            monitor-exit(r6)     // Catch:{ all -> 0x0060 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e3d.b(int):void");
    }
}
