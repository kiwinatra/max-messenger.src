package defpackage;

import java.util.ArrayList;

/* renamed from: l0  reason: default package */
public final class l0 implements jy3 {
    public final ArrayList a = new ArrayList(2);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final synchronized void a(java.lang.String r4, defpackage.k97 r5, android.graphics.drawable.Animatable r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = r3.a     // Catch:{ all -> 0x0018 }
            int r0 = r0.size()     // Catch:{ all -> 0x0018 }
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x001f
            java.util.ArrayList r2 = r3.a     // Catch:{ Exception -> 0x001a }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x001a }
            jy3 r2 = (defpackage.jy3) r2     // Catch:{ Exception -> 0x001a }
            if (r2 == 0) goto L_0x001c
            r2.a(r4, r5, r6)     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x0018:
            r4 = move-exception
            goto L_0x0021
        L_0x001a:
            monitor-enter(r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
        L_0x001c:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.a(java.lang.String, k97, android.graphics.drawable.Animatable):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final synchronized void b(java.lang.String r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = r3.a     // Catch:{ all -> 0x0018 }
            int r0 = r0.size()     // Catch:{ all -> 0x0018 }
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x001f
            java.util.ArrayList r2 = r3.a     // Catch:{ Exception -> 0x001a }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x001a }
            jy3 r2 = (defpackage.jy3) r2     // Catch:{ Exception -> 0x001a }
            if (r2 == 0) goto L_0x001c
            r2.b(r4, r5)     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x0018:
            r4 = move-exception
            goto L_0x0021
        L_0x001a:
            monitor-enter(r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
        L_0x001c:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.b(java.lang.String, java.lang.Throwable):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final synchronized void c(java.lang.Object r4, java.lang.String r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = r3.a     // Catch:{ all -> 0x0018 }
            int r0 = r0.size()     // Catch:{ all -> 0x0018 }
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x001f
            java.util.ArrayList r2 = r3.a     // Catch:{ Exception -> 0x001a }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x001a }
            jy3 r2 = (defpackage.jy3) r2     // Catch:{ Exception -> 0x001a }
            if (r2 == 0) goto L_0x001c
            r2.c(r4, r5)     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x0018:
            r4 = move-exception
            goto L_0x0021
        L_0x001a:
            monitor-enter(r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
        L_0x001c:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.c(java.lang.Object, java.lang.String):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final synchronized void d(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList r0 = r3.a     // Catch:{ all -> 0x0018 }
            int r0 = r0.size()     // Catch:{ all -> 0x0018 }
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x001f
            java.util.ArrayList r2 = r3.a     // Catch:{ Exception -> 0x001a }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ Exception -> 0x001a }
            jy3 r2 = (defpackage.jy3) r2     // Catch:{ Exception -> 0x001a }
            if (r2 == 0) goto L_0x001c
            r2.d(r4)     // Catch:{ Exception -> 0x001a }
            goto L_0x001c
        L_0x0018:
            r4 = move-exception
            goto L_0x0021
        L_0x001a:
            monitor-enter(r3)     // Catch:{ all -> 0x0018 }
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
        L_0x001c:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001f:
            monitor-exit(r3)
            return
        L_0x0021:
            monitor-exit(r3)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.d(java.lang.String):void");
    }

    public final void e(String str, k97 k97) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                jy3 jy3 = (jy3) this.a.get(i);
                if (jy3 != null) {
                    jy3.e(str, k97);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    public final void f(String str, Throwable th) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                jy3 jy3 = (jy3) this.a.get(i);
                if (jy3 != null) {
                    jy3.f(str, th);
                }
            } catch (Exception unused) {
                synchronized (this) {
                }
            }
        }
    }

    public final synchronized void g(jy3 jy3) {
        this.a.add(jy3);
    }
}
