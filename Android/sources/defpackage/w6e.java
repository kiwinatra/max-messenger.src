package defpackage;

import java.util.IdentityHashMap;

/* renamed from: w6e  reason: default package */
public final class w6e {
    public static final IdentityHashMap d = new IdentityHashMap();
    public Object a;
    public int b = 1;
    public final b4d c;

    public w6e(Object obj, b4d b4d, boolean z) {
        obj.getClass();
        this.a = obj;
        this.c = b4d;
        if (z) {
            IdentityHashMap identityHashMap = d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
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
    public final void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0066 }
            int r0 = r4.b     // Catch:{ all -> 0x0074 }
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x000a
            r3 = r2
            goto L_0x000b
        L_0x000a:
            r3 = r1
        L_0x000b:
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x006e
            if (r0 <= 0) goto L_0x0011
            r1 = r2
        L_0x0011:
            if (r1 == 0) goto L_0x0068
            int r0 = r4.b     // Catch:{ all -> 0x0066 }
            int r0 = r0 - r2
            r4.b = r0     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)
            if (r0 != 0) goto L_0x0065
            monitor-enter(r4)
            java.lang.Object r0 = r4.a     // Catch:{ all -> 0x0062 }
            r1 = 0
            r4.a = r1     // Catch:{ all -> 0x0062 }
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0065
            b4d r4 = r4.c
            if (r4 == 0) goto L_0x002b
            r4.b(r0)
        L_0x002b:
            java.util.IdentityHashMap r4 = d
            monitor-enter(r4)
            java.lang.Object r1 = r4.get(r0)     // Catch:{ all -> 0x0046 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0048
            java.lang.String r1 = "SharedReference"
            java.lang.String r2 = "No entry in sLiveObjects for value of type %s"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0046 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0046 }
            defpackage.bg5.p(r1, r2, r0)     // Catch:{ all -> 0x0046 }
            goto L_0x005e
        L_0x0046:
            r0 = move-exception
            goto L_0x0060
        L_0x0048:
            int r3 = r1.intValue()     // Catch:{ all -> 0x0046 }
            if (r3 != r2) goto L_0x0052
            r4.remove(r0)     // Catch:{ all -> 0x0046 }
            goto L_0x005e
        L_0x0052:
            int r1 = r1.intValue()     // Catch:{ all -> 0x0046 }
            int r1 = r1 - r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0046 }
            r4.put(r0, r1)     // Catch:{ all -> 0x0046 }
        L_0x005e:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            goto L_0x0065
        L_0x0060:
            monitor-exit(r4)     // Catch:{ all -> 0x0046 }
            throw r0
        L_0x0062:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0062 }
            throw r0
        L_0x0065:
            return
        L_0x0066:
            r0 = move-exception
            goto L_0x0077
        L_0x0068:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x006e:
            com.facebook.common.references.SharedReference$NullReferenceException r0 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch:{ all -> 0x0066 }
            r0.<init>()     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0074:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0077:
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w6e.a():void");
    }

    public final synchronized Object b() {
        return this.a;
    }
}
