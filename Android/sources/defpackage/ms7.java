package defpackage;

import java.util.Set;

/* renamed from: ms7  reason: default package */
public final class ms7 implements m9c {
    public volatile Set a;
    public volatile Set b;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final java.lang.Object get() {
        /*
            r3 = this;
            java.util.Set r0 = r3.b
            if (r0 != 0) goto L_0x0040
            monitor-enter(r3)
            java.util.Set r0 = r3.b     // Catch:{ all -> 0x003a }
            if (r0 != 0) goto L_0x003c
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x003a }
            r0.<init>()     // Catch:{ all -> 0x003a }
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)     // Catch:{ all -> 0x003a }
            r3.b = r0     // Catch:{ all -> 0x003a }
            monitor-enter(r3)     // Catch:{ all -> 0x003a }
            java.util.Set r0 = r3.a     // Catch:{ all -> 0x0031 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0031 }
        L_0x001b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0033
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0031 }
            m9c r1 = (defpackage.m9c) r1     // Catch:{ all -> 0x0031 }
            java.util.Set r2 = r3.b     // Catch:{ all -> 0x0031 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0031 }
            r2.add(r1)     // Catch:{ all -> 0x0031 }
            goto L_0x001b
        L_0x0031:
            r0 = move-exception
            goto L_0x0038
        L_0x0033:
            r0 = 0
            r3.a = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x0038:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            goto L_0x003e
        L_0x003c:
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            goto L_0x0040
        L_0x003e:
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            throw r0
        L_0x0040:
            java.util.Set r3 = r3.b
            java.util.Set r3 = java.util.Collections.unmodifiableSet(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ms7.get():java.lang.Object");
    }
}
