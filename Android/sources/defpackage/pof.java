package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.ArraysKt;
import kotlin.text.Charsets;

/* renamed from: pof  reason: default package */
public final class pof {
    public static final pof a = new Object();
    public static c24 b;

    public static final void a(String str) {
        if (!kof.b) {
            try {
                c24 c24 = b;
                if (c24 != null) {
                    b88 b88 = c24.d;
                    b88.getClass();
                    long currentTimeMillis = System.currentTimeMillis() - b88.i;
                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                    int i = 65506;
                    if (bytes.length > 65506) {
                        if ((bytes[65506] & 192) == 128) {
                            do {
                                i--;
                                if (i < 0) {
                                    break;
                                }
                            } while ((bytes[i] & 192) != 128);
                        }
                        bytes = ArraysKt.copyOfRange(bytes, 0, i);
                    }
                    o78 o78 = new o78(currentTimeMillis, bytes);
                    ConcurrentLinkedQueue concurrentLinkedQueue = b88.h;
                    concurrentLinkedQueue.add(o78);
                    b88.g += o78.c;
                    while (b88.g > 65536) {
                        o78 o782 = (o78) concurrentLinkedQueue.poll();
                        if (o782 != null) {
                            b88.g -= o782.c;
                        } else {
                            b88.g = 0;
                        }
                    }
                    ipf.a(new uo5(b88, str, o78, 24));
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (IllegalStateException unused) {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final void b(defpackage.e4e r9, java.lang.Throwable r10, java.lang.String r11) {
        /*
            r0 = 1
            boolean r1 = defpackage.kof.b
            if (r1 == 0) goto L_0x0006
            return
        L_0x0006:
            c24 r1 = b     // Catch:{ IllegalStateException -> 0x014a }
            if (r1 == 0) goto L_0x013e
            r2 = 0
            if (r11 == 0) goto L_0x0028
            java.lang.CharSequence r11 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r11)
            java.lang.String r11 = r11.toString()
            if (r11 == 0) goto L_0x0028
            int r3 = r11.length()
            if (r3 <= 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r11 = r2
        L_0x001f:
            if (r11 == 0) goto L_0x0028
            r3 = 32
            java.lang.String r11 = kotlin.text.StringsKt.take((java.lang.String) r11, (int) r3)
            goto L_0x0029
        L_0x0028:
            r11 = r2
        L_0x0029:
            boolean r3 = defpackage.kof.b
            if (r3 == 0) goto L_0x002f
            goto L_0x0130
        L_0x002f:
            kxd r3 = r1.b
            java.lang.Object r4 = r3.b
            monitor-enter(r4)
            r3.b()     // Catch:{ all -> 0x0059 }
            fxd r5 = r3.k     // Catch:{ all -> 0x0059 }
            if (r5 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r2 = r5
        L_0x003d:
            e4e r2 = r2.g     // Catch:{ all -> 0x0059 }
            r5 = 0
            if (r9 != 0) goto L_0x0046
            if (r2 != 0) goto L_0x0046
            r2 = r5
            goto L_0x0052
        L_0x0046:
            if (r9 != 0) goto L_0x004a
            r2 = -1
            goto L_0x0052
        L_0x004a:
            if (r2 != 0) goto L_0x004e
            r2 = r0
            goto L_0x0052
        L_0x004e:
            int r2 = r9.compareTo(r2)     // Catch:{ all -> 0x0059 }
        L_0x0052:
            r6 = 3
            if (r2 <= 0) goto L_0x005c
            defpackage.kxd.d(r3, r5, r5, r9, r6)     // Catch:{ all -> 0x0059 }
            goto L_0x005c
        L_0x0059:
            r9 = move-exception
            goto L_0x013c
        L_0x005c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0059 }
            monitor-exit(r4)
            abe r2 = defpackage.pf6.o
            if (r2 == 0) goto L_0x0134
            java.lang.String r3 = "system.shutdown.until.ts"
            boolean r3 = defpackage.vzg.a(r2, r3)
            if (r3 == 0) goto L_0x006d
        L_0x006b:
            r2 = r0
            goto L_0x008a
        L_0x006d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "system."
            r3.<init>(r4)
            java.lang.String r4 = "CRASH_REPORT"
            r3.append(r4)
            java.lang.String r4 = ".shutdown.until.ts"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r2 = defpackage.vzg.a(r2, r3)
            if (r2 == 0) goto L_0x0089
            goto L_0x006b
        L_0x0089:
            r2 = r5
        L_0x008a:
            if (r2 == 0) goto L_0x008e
            goto L_0x0130
        L_0x008e:
            int r2 = r1.g
            int r0 = r0 + r2
            r1.g = r0
            r0 = 8
            if (r2 <= r0) goto L_0x00a3
            pr1 r9 = new pr1
            r10 = 24
            r9.<init>(r10, r1)
            defpackage.ipf.b(r9)
            goto L_0x0130
        L_0x00a3:
            f24 r2 = r1.a
            e4e r3 = defpackage.e4e.c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x00af
        L_0x00ad:
            r3 = r6
            goto L_0x00e3
        L_0x00af:
            e4e r3 = defpackage.e4e.o
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x00b9
            r6 = 4
            goto L_0x00ad
        L_0x00b9:
            e4e r3 = defpackage.e4e.v
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x00c3
            r6 = 5
            goto L_0x00ad
        L_0x00c3:
            e4e r3 = defpackage.e4e.w
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x00cd
            r6 = 6
            goto L_0x00ad
        L_0x00cd:
            e4e r3 = defpackage.e4e.x
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r3 == 0) goto L_0x00d7
            r6 = 7
            goto L_0x00ad
        L_0x00d7:
            e4e r3 = defpackage.e4e.y
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r3)
            if (r9 == 0) goto L_0x00e1
            r3 = r0
            goto L_0x00e3
        L_0x00e1:
            r6 = 2
            goto L_0x00ad
        L_0x00e3:
            kxd r9 = r1.b
            g8f r9 = r9.c()
            if (r11 == 0) goto L_0x0104
            int r0 = r11.length()
            if (r0 != 0) goto L_0x00f2
            goto L_0x0104
        L_0x00f2:
            java.util.Map r0 = r9.m
            java.lang.String r4 = "issueKey"
            kotlin.Pair r11 = kotlin.TuplesKt.to(r4, r11)
            java.util.Map r11 = kotlin.collections.MapsKt.plus(r0, r11)
            r0 = 12287(0x2fff, float:1.7218E-41)
            g8f r9 = defpackage.g8f.a(r9, r5, r11, r0)
        L_0x0104:
            r5 = r9
            c9f r9 = r1.c
            java.util.ArrayList r11 = r9.e
            monitor-enter(r11)
            java.util.ArrayList r9 = r9.e     // Catch:{ all -> 0x0131 }
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r9)     // Catch:{ all -> 0x0131 }
            monitor-exit(r11)
            b88 r9 = r1.d
            java.util.concurrent.ConcurrentLinkedQueue r9 = r9.h
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r9)
            cx4 r9 = defpackage.f24.b
            java.util.Map r7 = kotlin.collections.MapsKt.emptyMap()
            r4 = r10
            a24 r9 = r2.b(r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L_0x0130
            ir1 r10 = new ir1
            r11 = 18
            r10.<init>(r11, r1, r9)
            defpackage.ipf.b(r10)
        L_0x0130:
            return
        L_0x0131:
            r9 = move-exception
            monitor-exit(r11)
            throw r9
        L_0x0134:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Tracer settings are not initialized."
            r9.<init>(r10)
            throw r9
        L_0x013c:
            monitor-exit(r4)
            throw r9
        L_0x013e:
            java.lang.String r9 = "Required value was null."
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x014a }
            java.lang.String r9 = r9.toString()     // Catch:{ IllegalStateException -> 0x014a }
            r10.<init>(r9)     // Catch:{ IllegalStateException -> 0x014a }
            throw r10     // Catch:{ IllegalStateException -> 0x014a }
        L_0x014a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pof.b(e4e, java.lang.Throwable, java.lang.String):void");
    }
}
