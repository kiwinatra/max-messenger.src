package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: t95  reason: default package */
public final class t95 {
    public kk3 a;
    public sb0 b;
    public int c;
    public int d;
    public int e;
    public c9d f;
    public final ntc g;
    public final za h;
    public final jtc i;
    public final bk3 j;

    public t95(ntc ntc, za zaVar, jtc jtc) {
        bk3 bk3 = bk3.o;
        this.g = ntc;
        this.h = zaVar;
        this.i = jtc;
        this.j = bk3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v38, types: [sb0, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0335 A[SYNTHETIC] */
    public final defpackage.mtc a(int r15, int r16, int r17, int r18, boolean r19, boolean r20) {
        /*
            r14 = this;
            r1 = r14
            r0 = 0
            r2 = 1
        L_0x0003:
            jtc r3 = r1.i
            boolean r3 = r3.v0
            if (r3 != 0) goto L_0x0383
            jtc r3 = r1.i
            mtc r3 = r3.x
            r4 = 0
            if (r3 == 0) goto L_0x0066
            monitor-enter(r3)
            boolean r5 = r3.i     // Catch:{ all -> 0x0063 }
            if (r5 != 0) goto L_0x0037
            c9d r5 = r3.q     // Catch:{ all -> 0x0063 }
            za r5 = r5.a     // Catch:{ all -> 0x0063 }
            m57 r5 = r5.a     // Catch:{ all -> 0x0063 }
            za r6 = r1.h     // Catch:{ all -> 0x0063 }
            m57 r6 = r6.a     // Catch:{ all -> 0x0063 }
            int r7 = r5.f     // Catch:{ all -> 0x0063 }
            int r8 = r6.f     // Catch:{ all -> 0x0063 }
            if (r7 != r8) goto L_0x0031
            java.lang.String r5 = r5.e     // Catch:{ all -> 0x0063 }
            java.lang.String r6 = r6.e     // Catch:{ all -> 0x0063 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x0063 }
            if (r5 == 0) goto L_0x0031
            r5 = r2
            goto L_0x0032
        L_0x0031:
            r5 = r0
        L_0x0032:
            if (r5 != 0) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r5 = r4
            goto L_0x003d
        L_0x0037:
            jtc r5 = r1.i     // Catch:{ all -> 0x0063 }
            java.net.Socket r5 = r5.m()     // Catch:{ all -> 0x0063 }
        L_0x003d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0063 }
            monitor-exit(r3)
            jtc r6 = r1.i
            mtc r6 = r6.x
            if (r6 == 0) goto L_0x0058
            if (r5 != 0) goto L_0x004c
        L_0x0048:
            r4 = r20
            goto L_0x032f
        L_0x004c:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0058:
            if (r5 == 0) goto L_0x005d
            defpackage.u0g.d(r5)
        L_0x005d:
            bk3 r3 = r1.j
            r3.getClass()
            goto L_0x0066
        L_0x0063:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0066:
            r1.c = r0
            r1.d = r0
            r1.e = r0
            ntc r3 = r1.g
            za r5 = r1.h
            jtc r6 = r1.i
            boolean r3 = r3.b(r5, r6, r4, r0)
            if (r3 == 0) goto L_0x0082
            jtc r3 = r1.i
            mtc r3 = r3.x
            bk3 r4 = r1.j
            r4.getClass()
            goto L_0x0048
        L_0x0082:
            c9d r3 = r1.f
            if (r3 == 0) goto L_0x008b
            r1.f = r4
        L_0x0088:
            r5 = r4
            goto L_0x02b9
        L_0x008b:
            kk3 r3 = r1.a
            if (r3 == 0) goto L_0x00b2
            boolean r3 = r3.f()
            if (r3 == 0) goto L_0x00b2
            kk3 r3 = r1.a
            boolean r5 = r3.f()
            if (r5 == 0) goto L_0x00ac
            int r5 = r3.b
            int r6 = r5 + 1
            r3.b = r6
            java.util.List r3 = r3.c
            java.lang.Object r3 = r3.get(r5)
            c9d r3 = (defpackage.c9d) r3
            goto L_0x0088
        L_0x00ac:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x00b2:
            sb0 r3 = r1.b
            if (r3 != 0) goto L_0x00f5
            sb0 r3 = new sb0
            za r5 = r1.h
            jtc r6 = r1.i
            rla r6 = r6.y0
            d6a r6 = r6.L0
            bk3 r7 = r1.j
            r3.<init>()
            r3.e = r5
            r3.f = r6
            r3.g = r7
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            r3.b = r6
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            r3.c = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.d = r6
            m57 r6 = r5.a
            vy1 r8 = new vy1
            java.net.Proxy r5 = r5.j
            r9 = 2
            r8.<init>(r3, r5, r6, r9)
            r7.getClass()
            java.util.List r5 = r8.a()
            r3.b = r5
            r3.a = r0
            r1.b = r3
        L_0x00f5:
            boolean r5 = r3.c()
            if (r5 == 0) goto L_0x037d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x0100:
            int r6 = r3.a
            java.lang.Object r7 = r3.b
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x026f
            int r6 = r3.a
            java.lang.Object r7 = r3.b
            java.util.List r7 = (java.util.List) r7
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x011a
            r6 = r2
            goto L_0x011b
        L_0x011a:
            r6 = r0
        L_0x011b:
            java.lang.Object r7 = r3.e
            za r7 = (defpackage.za) r7
            java.lang.String r8 = "No route to "
            if (r6 == 0) goto L_0x024d
            java.lang.Object r6 = r3.b
            java.util.List r6 = (java.util.List) r6
            int r9 = r3.a
            int r10 = r9 + 1
            r3.a = r10
            java.lang.Object r6 = r6.get(r9)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r3.c = r9
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.DIRECT
            if (r10 == r11) goto L_0x0185
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r11 = java.net.Proxy.Type.SOCKS
            if (r10 != r11) goto L_0x014b
            goto L_0x0185
        L_0x014b:
            java.net.SocketAddress r10 = r6.address()
            boolean r11 = r10 instanceof java.net.InetSocketAddress
            if (r11 == 0) goto L_0x0169
            java.net.InetSocketAddress r10 = (java.net.InetSocketAddress) r10
            java.net.InetAddress r11 = r10.getAddress()
            if (r11 == 0) goto L_0x0160
            java.lang.String r11 = r11.getHostAddress()
            goto L_0x0164
        L_0x0160:
            java.lang.String r11 = r10.getHostName()
        L_0x0164:
            int r10 = r10.getPort()
            goto L_0x018b
        L_0x0169:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Proxy.address() is not an InetSocketAddress: "
            r0.<init>(r1)
            java.lang.Class r1 = r10.getClass()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0185:
            m57 r10 = r7.a
            java.lang.String r11 = r10.e
            int r10 = r10.f
        L_0x018b:
            if (r2 > r10) goto L_0x022e
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r12 < r10) goto L_0x022e
            java.net.Proxy$Type r8 = r6.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r8 != r12) goto L_0x01a2
            java.net.InetSocketAddress r7 = java.net.InetSocketAddress.createUnresolved(r11, r10)
            r9.add(r7)
            goto L_0x01ce
        L_0x01a2:
            java.lang.Object r8 = r3.g
            bk3 r8 = (defpackage.bk3) r8
            r8.getClass()
            o9a r8 = r7.d
            java.util.List r8 = r8.n(r11)
            boolean r12 = r8.isEmpty()
            if (r12 != 0) goto L_0x0212
            java.util.Iterator r7 = r8.iterator()
        L_0x01b9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x01ce
            java.lang.Object r8 = r7.next()
            java.net.InetAddress r8 = (java.net.InetAddress) r8
            java.net.InetSocketAddress r11 = new java.net.InetSocketAddress
            r11.<init>(r8, r10)
            r9.add(r11)
            goto L_0x01b9
        L_0x01ce:
            java.lang.Object r7 = r3.c
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x01d6:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x020a
            java.lang.Object r8 = r7.next()
            java.net.InetSocketAddress r8 = (java.net.InetSocketAddress) r8
            c9d r9 = new c9d
            java.lang.Object r10 = r3.e
            za r10 = (defpackage.za) r10
            r9.<init>(r10, r6, r8)
            java.lang.Object r8 = r3.f
            d6a r8 = (defpackage.d6a) r8
            monitor-enter(r8)
            java.lang.Object r10 = r8.b     // Catch:{ all -> 0x0207 }
            java.util.LinkedHashSet r10 = (java.util.LinkedHashSet) r10     // Catch:{ all -> 0x0207 }
            boolean r10 = r10.contains(r9)     // Catch:{ all -> 0x0207 }
            monitor-exit(r8)
            if (r10 == 0) goto L_0x0203
            java.lang.Object r8 = r3.d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.add(r9)
            goto L_0x01d6
        L_0x0203:
            r5.add(r9)
            goto L_0x01d6
        L_0x0207:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0207 }
            throw r0
        L_0x020a:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x0100
            goto L_0x026f
        L_0x0212:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            o9a r2 = r7.d
            r1.append(r2)
            java.lang.String r2 = " returned no addresses for "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x022e:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r1.append(r11)
            r2 = 58
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = "; port is out of range"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x024d:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            m57 r2 = r7.a
            java.lang.String r2 = r2.e
            r1.append(r2)
            java.lang.String r2 = "; exhausted proxy configurations: "
            r1.append(r2)
            java.lang.Object r2 = r3.b
            java.util.List r2 = (java.util.List) r2
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x026f:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0283
            java.lang.Object r6 = r3.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r5, r6)
            java.lang.Object r3 = r3.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
        L_0x0283:
            kk3 r3 = new kk3
            r3.<init>((java.util.ArrayList) r5)
            r1.a = r3
            jtc r6 = r1.i
            boolean r6 = r6.v0
            if (r6 != 0) goto L_0x0375
            ntc r6 = r1.g
            za r7 = r1.h
            jtc r8 = r1.i
            boolean r6 = r6.b(r7, r8, r5, r0)
            if (r6 == 0) goto L_0x02a7
            jtc r3 = r1.i
            mtc r3 = r3.x
            bk3 r4 = r1.j
            r4.getClass()
            goto L_0x0048
        L_0x02a7:
            boolean r6 = r3.f()
            if (r6 == 0) goto L_0x036f
            int r6 = r3.b
            int r7 = r6 + 1
            r3.b = r7
            java.lang.Object r3 = r5.get(r6)
            c9d r3 = (defpackage.c9d) r3
        L_0x02b9:
            mtc r13 = new mtc
            r13.<init>(r3)
            jtc r6 = r1.i
            r6.x0 = r13
            bk3 r12 = r1.j     // Catch:{ all -> 0x0369 }
            r6 = r13
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r6.c(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0369 }
            jtc r6 = r1.i
            r6.x0 = r4
            jtc r4 = r1.i
            rla r4 = r4.y0
            d6a r6 = r4.L0
            monitor-enter(r6)
            java.lang.Object r4 = r6.b     // Catch:{ all -> 0x0366 }
            java.util.LinkedHashSet r4 = (java.util.LinkedHashSet) r4     // Catch:{ all -> 0x0366 }
            r4.remove(r3)     // Catch:{ all -> 0x0366 }
            monitor-exit(r6)
            ntc r4 = r1.g
            za r6 = r1.h
            jtc r7 = r1.i
            boolean r4 = r4.b(r6, r7, r5, r2)
            if (r4 == 0) goto L_0x0303
            jtc r4 = r1.i
            mtc r4 = r4.x
            r1.f = r3
            java.net.Socket r3 = r13.c
            defpackage.u0g.d(r3)
            bk3 r3 = r1.j
            r3.getClass()
            r3 = r4
            goto L_0x0048
        L_0x0303:
            monitor-enter(r13)
            ntc r3 = r1.g     // Catch:{ all -> 0x0363 }
            r3.getClass()     // Catch:{ all -> 0x0363 }
            byte[] r4 = defpackage.u0g.a     // Catch:{ all -> 0x0363 }
            java.lang.Object r4 = r3.e     // Catch:{ all -> 0x0363 }
            java.util.concurrent.ConcurrentLinkedQueue r4 = (java.util.concurrent.ConcurrentLinkedQueue) r4     // Catch:{ all -> 0x0363 }
            r4.add(r13)     // Catch:{ all -> 0x0363 }
            java.lang.Object r4 = r3.c     // Catch:{ all -> 0x0363 }
            cef r4 = (defpackage.cef) r4     // Catch:{ all -> 0x0363 }
            java.lang.Object r3 = r3.d     // Catch:{ all -> 0x0363 }
            y37 r3 = (defpackage.y37) r3     // Catch:{ all -> 0x0363 }
            r5 = 0
            r4.c(r3, r5)     // Catch:{ all -> 0x0363 }
            jtc r3 = r1.i     // Catch:{ all -> 0x0363 }
            r3.b(r13)     // Catch:{ all -> 0x0363 }
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0363 }
            monitor-exit(r13)
            bk3 r3 = r1.j
            r3.getClass()
            r4 = r20
            r3 = r13
        L_0x032f:
            boolean r5 = r3.i(r4)
            if (r5 == 0) goto L_0x0336
            return r3
        L_0x0336:
            r3.k()
            c9d r3 = r1.f
            if (r3 == 0) goto L_0x033f
            goto L_0x0003
        L_0x033f:
            kk3 r3 = r1.a
            if (r3 == 0) goto L_0x0348
            boolean r3 = r3.f()
            goto L_0x0349
        L_0x0348:
            r3 = r2
        L_0x0349:
            if (r3 == 0) goto L_0x034d
            goto L_0x0003
        L_0x034d:
            sb0 r3 = r1.b
            if (r3 == 0) goto L_0x0356
            boolean r3 = r3.c()
            goto L_0x0357
        L_0x0356:
            r3 = r2
        L_0x0357:
            if (r3 == 0) goto L_0x035b
            goto L_0x0003
        L_0x035b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "exhausted all routes"
            r0.<init>(r1)
            throw r0
        L_0x0363:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x0366:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0366 }
            throw r0
        L_0x0369:
            r0 = move-exception
            jtc r1 = r1.i
            r1.x0 = r4
            throw r0
        L_0x036f:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0375:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        L_0x037d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0383:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t95.a(int, int, int, int, boolean, boolean):mtc");
    }

    public final void b(IOException iOException) {
        this.f = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).a == 8) {
            this.c++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.d++;
        } else {
            this.e++;
        }
    }
}
