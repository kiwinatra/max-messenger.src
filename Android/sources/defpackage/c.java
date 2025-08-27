package defpackage;

/* renamed from: c  reason: default package */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            r1 = 1012(0x3f4, float:1.418E-42)
            r2 = 3
            r3 = 2
            r6 = 0
            r7 = 5
            r8 = 0
            r9 = 0
            r11 = 1
            int r12 = r0.a
            switch(r12) {
                case 0: goto L_0x093f;
                case 1: goto L_0x0927;
                case 2: goto L_0x0900;
                case 3: goto L_0x08f1;
                case 4: goto L_0x08d8;
                case 5: goto L_0x08b3;
                case 6: goto L_0x0855;
                case 7: goto L_0x0831;
                case 8: goto L_0x080f;
                case 9: goto L_0x07f8;
                case 10: goto L_0x07d2;
                case 11: goto L_0x0798;
                case 12: goto L_0x0787;
                case 13: goto L_0x0775;
                case 14: goto L_0x070c;
                case 15: goto L_0x06ed;
                case 16: goto L_0x0677;
                case 17: goto L_0x0646;
                case 18: goto L_0x063a;
                case 19: goto L_0x062e;
                case 20: goto L_0x05bf;
                case 21: goto L_0x057d;
                case 22: goto L_0x0327;
                case 23: goto L_0x028a;
                case 24: goto L_0x0223;
                case 25: goto L_0x010d;
                case 26: goto L_0x00e4;
                case 27: goto L_0x0043;
                case 28: goto L_0x002a;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Object r1 = r0.b
            lr1 r1 = (defpackage.lr1) r1
            long r2 = r1.A()
            dr1 r4 = new dr1
            r4.<init>((java.lang.Object) r1, (long) r2, (int) r8)
            go1 r1 = defpackage.m5a.F(r4)
            java.lang.Object r0 = r0.c
            do1 r0 = (defpackage.do1) r0
            defpackage.hd8.N(r1, r0)
            return
        L_0x002a:
            java.lang.Object r1 = r0.b
            lr1 r1 = (defpackage.lr1) r1
            hr1 r1 = r1.z
            java.lang.Object r2 = r1.b
            java.util.HashSet r2 = (java.util.HashSet) r2
            java.lang.Object r0 = r0.c
            bt1 r0 = (defpackage.bt1) r0
            r2.remove(r0)
            java.lang.Object r1 = r1.c
            android.util.ArrayMap r1 = (android.util.ArrayMap) r1
            r1.remove(r0)
            return
        L_0x0043:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            kv9 r0 = (defpackage.kv9) r0
            long r2 = r0.b
            boolean r4 = r1.a
            if (r4 != 0) goto L_0x0056
            goto L_0x00e3
        L_0x0056:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.concurrent.CopyOnWriteArrayList r5 = r1.o
            java.util.List r6 = r0.v
            if (r6 == 0) goto L_0x0089
            int r7 = r6.size()
            if (r7 <= 0) goto L_0x0089
            java.util.Iterator r7 = r5.iterator()
        L_0x006b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0089
            java.lang.Object r8 = r7.next()
            a89 r8 = (defpackage.a89) r8
            ha9 r11 = r8.a
            long r11 = r11.b
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            boolean r11 = r6.contains(r11)
            if (r11 == 0) goto L_0x006b
            r4.add(r8)
            goto L_0x006b
        L_0x0089:
            long r6 = r0.c
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            long r11 = r0.o
            if (r8 > 0) goto L_0x0095
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bb
        L_0x0095:
            java.util.Iterator r0 = r5.iterator()
        L_0x0099:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x00bb
            java.lang.Object r8 = r0.next()
            a89 r8 = (defpackage.a89) r8
            ha9 r9 = r8.a
            long r13 = r9.z
            int r10 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r10 != 0) goto L_0x0099
            long r9 = r9.o
            int r13 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x0099
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x0099
            r4.add(r8)
            goto L_0x0099
        L_0x00bb:
            int r0 = r4.size()
            if (r0 <= 0) goto L_0x00e3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "MsgDeleteEvent: remove "
            r0.<init>(r2)
            int r2 = r4.size()
            r0.append(r2)
            java.lang.String r2 = " messages"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "zp1"
            defpackage.z68.c(r2, r0, new java.lang.Object[0])
            r5.removeAll(r4)
            r1.h()
        L_0x00e3:
            return
        L_0x00e4:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            java.lang.Object r0 = r0.c
            xy2 r0 = (defpackage.xy2) r0
            yp1 r2 = r1.c
            if (r2 == 0) goto L_0x010c
            boolean r2 = r1.a
            if (r2 == 0) goto L_0x010c
            yp1 r2 = r1.c
            ak3 r2 = r2.w
            java.lang.Object r2 = r2.a
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.util.Set r2 = r2.keySet()
            java.util.Set r0 = r0.y
            boolean r0 = java.util.Collections.disjoint(r2, r0)
            if (r0 == 0) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r1.c()
        L_0x010c:
            return
        L_0x010d:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            java.lang.Object r0 = r0.c
            tv9 r0 = (defpackage.tv9) r0
            long r2 = r1.z
            long r4 = r0.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0222
            long r2 = r0.b
            java.util.List r4 = r0.o
            java.util.List r0 = r0.v
            r1.z = r9
            r62 r5 = r1.w0
            a32 r5 = r5.D(r2)
            if (r5 == 0) goto L_0x020d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "onMsgGet: insert "
            r6.<init>(r7)
            int r4 = r4.size()
            r6.append(r4)
            java.lang.String r4 = " messages"
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "zp1"
            defpackage.z68.c(r6, r4, new java.lang.Object[0])
            yp1 r4 = r1.c
            f72 r4 = r4.a
            long r6 = r4.a
            yp1 r4 = r1.c
            f72 r4 = r4.a
            long r8 = r4.b
            gb9 r4 = r1.B0
            fa9 r10 = r1.v0
            long r12 = r5.a
            java.util.ArrayList r5 = r10.l(r12, r0)
            java.util.ArrayList r4 = r4.b(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0167:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01b1
            java.lang.Object r5 = r4.next()
            a89 r5 = (defpackage.a89) r5
            java.util.concurrent.CopyOnWriteArrayList r10 = r1.o
            v00 r12 = new v00
            r13 = 6
            r12.<init>(r13)
            int r10 = java.util.Collections.binarySearch(r10, r5, r12)
            if (r10 >= 0) goto L_0x0186
            int r10 = java.lang.Math.abs(r10)
            int r10 = r10 - r11
        L_0x0186:
            long r12 = r5.h()
            int r12 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x0192
            long r6 = r5.h()
        L_0x0192:
            long r12 = r5.h()
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x019e
            long r8 = r5.h()
        L_0x019e:
            java.util.concurrent.CopyOnWriteArrayList r12 = r1.o
            r12.add(r10, r5)
            java.util.HashSet r10 = r1.v
            ha9 r5 = r5.a
            long r12 = r5.b
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r10.add(r5)
            goto L_0x0167
        L_0x01b1:
            yp1 r4 = r1.c
            f72 r5 = new f72
            r5.<init>(r6, r8)
            r4.a = r5
            java.util.Iterator r0 = r0.iterator()
        L_0x01be:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0209
            java.lang.Object r4 = r0.next()
            java.lang.Long r4 = (java.lang.Long) r4
            yp1 r5 = r1.c
            ak3 r5 = r5.w
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.lang.Object r5 = r5.a
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r6)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x01e1
            r5.remove(r4)
        L_0x01e1:
            yp1 r4 = r1.c
            ak3 r4 = r4.w
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r4.a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01be
            yp1 r4 = r1.c
            ak3 r4 = r4.w
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            java.lang.Object r4 = r4.a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            r4.remove(r5)
            goto L_0x01be
        L_0x0209:
            r1.h()
            goto L_0x021c
        L_0x020d:
            yp1 r0 = r1.c
            ak3 r0 = r0.w
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r0.a
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            r0.remove(r2)
        L_0x021c:
            r1.j()
            r1.c()
        L_0x0222:
            return
        L_0x0223:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            java.lang.Object r0 = r0.c
            w88 r0 = (defpackage.w88) r0
            r1.getClass()
            boolean r0 = r0.o
            r1.g()
            jtb r2 = r1.A0
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            ls7 r2 = r2.g
            java.lang.String r3 = "user.callsLastSync"
            long r2 = r2.getLong(r3, r9)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onLogin: hasNewCalls: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = " callsLastSync: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "zp1"
            defpackage.z68.c(r5, r4, new java.lang.Object[0])
            if (r0 == 0) goto L_0x026b
            yp1 r0 = r1.c
            r0.v = r11
            xp1 r0 = new xp1
            r0.<init>(r1, r11)
            r1.i(r0)
            goto L_0x0286
        L_0x026b:
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x027b
            yp1 r0 = r1.c
            r0.v = r8
            yp1 r0 = r1.c
            r0.o = r8
            r1.k()
            goto L_0x0286
        L_0x027b:
            xp1 r0 = new xp1
            r0.<init>(r1, r7)
            r1.i(r0)
            r1.c()
        L_0x0286:
            r1.j()
            return
        L_0x028a:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            java.lang.Object r0 = r0.c
            ke7 r0 = (defpackage.ke7) r0
            r1.getClass()
            long r2 = r0.c
            r1.g()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "onNewMessage hasPrev="
            r0.<init>(r4)
            yp1 r4 = r1.c
            boolean r4 = r4.v
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "zp1"
            defpackage.z68.c(r4, r0, new java.lang.Object[0])
            yp1 r0 = r1.c
            boolean r0 = r0.v
            if (r0 != 0) goto L_0x0326
            c48 r0 = r1.Y
            mka r0 = r0.a(r2, r11)
            java.lang.Object r0 = r0.f()
            a89 r0 = (defpackage.a89) r0
            ha9 r2 = r0.a
            boolean r2 = r2.x()
            if (r2 == 0) goto L_0x0326
            f72 r2 = new f72
            yp1 r3 = r1.c
            f72 r3 = r3.a
            long r5 = r3.a
            int r3 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x02dc
            ha9 r3 = r0.a
            long r5 = r3.o
            goto L_0x02e2
        L_0x02dc:
            yp1 r3 = r1.c
            f72 r3 = r3.a
            long r5 = r3.a
        L_0x02e2:
            ha9 r3 = r0.a
            long r9 = r3.o
            r2.<init>(r5, r9)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "inIncomingMessage: chunk change \nfrom: "
            r3.<init>(r5)
            yp1 r5 = r1.c
            f72 r5 = r5.a
            java.lang.String r5 = defpackage.hd8.L(r5)
            r3.append(r5)
            java.lang.String r5 = "\n  to: "
            r3.append(r5)
            java.lang.String r5 = defpackage.hd8.L(r2)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            defpackage.z68.c(r4, r3, new java.lang.Object[0])
            yp1 r3 = r1.c
            r3.a = r2
            r1.j()
            boolean r2 = r1.a
            if (r2 == 0) goto L_0x0323
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.b(r8, r0)
            r1.h()
        L_0x0323:
            r1.k()
        L_0x0326:
            return
        L_0x0327:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            java.lang.Object r0 = r0.c
            v3g r0 = (defpackage.v3g) r0
            long r2 = r1.x
            long r12 = r0.a
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            java.lang.String r3 = "zp1"
            if (r2 == 0) goto L_0x033f
            long r14 = r1.y
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 != 0) goto L_0x03af
        L_0x033f:
            ak3 r2 = r0.x
            int r2 = r2.a()
            if (r2 <= 0) goto L_0x03af
            ak3 r2 = r0.x
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r12 = "onMissedMessages size: "
            r6.<init>(r12)
            int r12 = r2.a()
            r6.append(r12)
            java.lang.String r6 = r6.toString()
            defpackage.z68.c(r3, r6, new java.lang.Object[0])
            yp1 r6 = r1.c
            ak3 r6 = r6.w
            r6.getClass()
            java.lang.Object r2 = r2.a
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0371:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x03ac
            java.lang.Object r12 = r2.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getValue()
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x0387:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0371
            java.lang.Object r14 = r13.next()
            java.lang.Object r15 = r12.getKey()
            java.lang.Object r11 = r6.a
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.lang.Object r16 = r11.get(r15)
            java.util.List r16 = (java.util.List) r16
            if (r16 != 0) goto L_0x03a5
            java.util.ArrayList r16 = defpackage.tr1.q(r11, r15)
        L_0x03a5:
            r11 = r16
            r11.add(r14)
            r11 = 1
            goto L_0x0387
        L_0x03ac:
            r1.j()
        L_0x03af:
            long r11 = r1.x
            long r13 = r0.a
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            java.lang.String r6 = " to: "
            java.lang.String r11 = "\n  to: "
            if (r2 != 0) goto L_0x04e6
            long r12 = r0.b
            long r14 = r0.c
            long r4 = r0.o
            long r7 = r0.v
            boolean r0 = r0.w
            r1.x = r9
            f72 r2 = new f72
            yp1 r9 = r1.c
            f72 r9 = r9.a
            long r9 = r9.a
            r17 = 0
            int r9 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r9 != 0) goto L_0x03d6
            goto L_0x03dc
        L_0x03d6:
            yp1 r9 = r1.c
            f72 r9 = r9.a
            long r12 = r9.a
        L_0x03dc:
            yp1 r9 = r1.c
            f72 r9 = r9.a
            long r9 = r9.b
            int r9 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x03e7
            goto L_0x03ed
        L_0x03e7:
            yp1 r9 = r1.c
            f72 r9 = r9.a
            long r14 = r9.b
        L_0x03ed:
            r2.<init>(r12, r14)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "onSync: chunk change \nfrom: "
            r9.<init>(r10)
            yp1 r10 = r1.c
            f72 r10 = r10.a
            java.lang.String r10 = defpackage.hd8.L(r10)
            r9.append(r10)
            r9.append(r11)
            java.lang.String r10 = defpackage.hd8.L(r2)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            defpackage.z68.c(r3, r9, new java.lang.Object[0])
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "onSync: hasPrev change from: "
            r9.<init>(r10)
            yp1 r10 = r1.c
            boolean r10 = r10.v
            r9.append(r10)
            r9.append(r6)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            defpackage.z68.c(r3, r9, new java.lang.Object[0])
            yp1 r9 = r1.c
            r9.a = r2
            yp1 r2 = r1.c
            r2.v = r0
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0440
            yp1 r0 = r1.c
            r0.b = r4
        L_0x0440:
            yp1 r0 = r1.c
            long r4 = r0.c
            r9 = 0
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x045f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onSync: set backwardMarker to: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            yp1 r0 = r1.c
            r0.c = r7
        L_0x045f:
            r1.j()
            boolean r0 = r1.a
            if (r0 != 0) goto L_0x0470
            xp1 r0 = new xp1
            r2 = 5
            r0.<init>(r1, r2)
            r1.i(r0)
            goto L_0x04c8
        L_0x0470:
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.o
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
        L_0x0478:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x048e
            java.lang.Object r2 = r0.next()
            a89 r2 = (defpackage.a89) r2
            ha9 r2 = r2.a
            long r4 = r2.o
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0478
            r9 = r4
            goto L_0x0478
        L_0x048e:
            r4 = 1
            long r9 = r9 + r4
            yp1 r0 = r1.c
            f72 r0 = r0.a
            long r4 = r0.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onSync: load from db"
            r0.<init>(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            java.lang.String r2 = defpackage.iq.U(r2)
            r0.append(r2)
            r0.append(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r2 = defpackage.iq.U(r2)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            fa9 r0 = r1.v0
            java.util.ArrayList r0 = r0.n(r9, r4)
            r2 = 0
            r1.b(r2, r0)
        L_0x04c8:
            r1.h()
            yp1 r0 = r1.c
            boolean r0 = r0.v
            if (r0 == 0) goto L_0x04e1
            java.lang.String r0 = "onSync: hasPrev == true, load one more page"
            defpackage.z68.c(r3, r0, new java.lang.Object[0])
            xp1 r0 = new xp1
            r2 = 1
            r0.<init>(r1, r2)
            r1.i(r0)
            goto L_0x057c
        L_0x04e1:
            r1.k()
            goto L_0x057c
        L_0x04e6:
            long r4 = r1.y
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x057c
            long r4 = r0.b
            long r7 = r0.c
            long r9 = r0.v
            boolean r0 = r0.w
            r12 = 0
            r1.y = r12
            f72 r2 = new f72
            int r14 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0509
            yp1 r12 = r1.c
            f72 r12 = r12.a
            long r12 = r12.a
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0509
            goto L_0x050f
        L_0x0509:
            yp1 r4 = r1.c
            f72 r4 = r4.a
            long r4 = r4.a
        L_0x050f:
            yp1 r12 = r1.c
            f72 r12 = r12.a
            long r12 = r12.b
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x051c
            goto L_0x0522
        L_0x051c:
            yp1 r7 = r1.c
            f72 r7 = r7.a
            long r7 = r7.b
        L_0x0522:
            r2.<init>(r4, r7)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onLoadNext: chunk change \nfrom: "
            r4.<init>(r5)
            yp1 r5 = r1.c
            f72 r5 = r5.a
            java.lang.String r5 = defpackage.hd8.L(r5)
            r4.append(r5)
            r4.append(r11)
            java.lang.String r5 = defpackage.hd8.L(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onLoadNext: hasNext change from: "
            r4.<init>(r5)
            yp1 r5 = r1.c
            boolean r5 = r5.o
            r4.append(r5)
            r4.append(r6)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            yp1 r3 = r1.c
            r3.a = r2
            yp1 r2 = r1.c
            r2.o = r0
            yp1 r0 = r1.c
            r0.c = r9
            r1.j()
            c70 r0 = new c70
            r2 = 0
            r3 = 5
            r0.<init>((java.lang.Object) r1, (boolean) r2, (int) r3)
            r1.i(r0)
        L_0x057c:
            return
        L_0x057d:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            hj0 r0 = (defpackage.hj0) r0
            long r2 = r0.a
            long r4 = r1.x
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x05a7
            r4 = 0
            r1.x = r4
            java.util.HashSet r0 = r1.w
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x05be
            xp1 r0 = new xp1
            r0.<init>(r1, r2)
            r1.i(r0)
            goto L_0x05be
        L_0x05a7:
            long r4 = r1.y
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x05be
            r2 = 0
            r1.y = r2
            java.util.HashSet r0 = r1.w
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x05be
            r1.d()
        L_0x05be:
            return
        L_0x05bf:
            java.lang.Object r1 = r0.b
            zp1 r1 = (defpackage.zp1) r1
            java.lang.Object r0 = r0.c
            sv9 r0 = (defpackage.sv9) r0
            r1.getClass()
            long r2 = r0.a
            long r4 = r1.z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x062d
            r2 = 0
            r1.z = r2
            qaf r2 = r0.b
            java.lang.String r2 = r2.b
            boolean r2 = defpackage.m58.A(r2)
            if (r2 != 0) goto L_0x062d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onEvent: MsgGetErrorEvent, remove "
            r2.<init>(r3)
            java.util.List r3 = r0.o
            int r3 = r3.size()
            r2.append(r3)
            java.lang.String r3 = " messagesIds from state"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "zp1"
            defpackage.z68.c(r3, r2, new java.lang.Object[0])
            java.util.List r2 = r0.o
            java.util.Iterator r2 = r2.iterator()
        L_0x0604:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x062a
            java.lang.Object r3 = r2.next()
            java.lang.Long r3 = (java.lang.Long) r3
            yp1 r4 = r1.c
            ak3 r4 = r4.w
            long r5 = r0.c
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r4 = r4.a
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0604
            r4.remove(r3)
            goto L_0x0604
        L_0x062a:
            r1.j()
        L_0x062d:
            return
        L_0x062e:
            java.lang.Object r1 = r0.b
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl r1 = (ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl) r1
            java.lang.Object r0 = r0.c
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r0 = (ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo) r0
            ru.ok.android.externcalls.sdk.audio.internal.impl.CallsAudioManagerV2Impl.b(r1, r0)
            return
        L_0x063a:
            java.lang.Object r1 = r0.b
            rk1 r1 = (defpackage.rk1) r1
            java.lang.Object r0 = r0.c
            java.util.List r0 = (java.util.List) r0
            defpackage.rk1.O(r1, r0)
            return
        L_0x0646:
            java.lang.Object r1 = r0.b
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.c
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startForegroundService(r0)     // Catch:{ all -> 0x0652 }
            goto L_0x0676
        L_0x0652:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = r1.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cant start foreground service... handle exception: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "CallServiceTag"
            defpackage.z68.f(r1, r0, r6)
            m21 r0 = defpackage.m21.a
            dp1 r0 = r0.c()
            mp1 r0 = (defpackage.mp1) r0
            r0.u(r6)
        L_0x0676:
            return
        L_0x0677:
            java.lang.Object r1 = r0.b
            ld1 r1 = (defpackage.ld1) r1
            java.lang.Object r0 = r0.c
            r2 = r0
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2
            java.lang.String r3 = "Released, notify awaiting..."
            voc r0 = r1.a     // Catch:{ all -> 0x06da }
            java.lang.String r4 = r1.j
            java.lang.String r5 = "Starting release process"
            r0.log(r4, r5)     // Catch:{ all -> 0x06da }
            android.opengl.EGLContext r5 = r1.d     // Catch:{ all -> 0x06da }
            voc r7 = r1.a
            if (r5 != 0) goto L_0x0698
            r7.log(r4, r3)
            r2.countDown()
            goto L_0x06d9
        L_0x0698:
            java.lang.String r0 = "Not yet released, continue"
            r7.log(r4, r0)     // Catch:{ all -> 0x06da }
            android.opengl.EGLDisplay r8 = r1.e     // Catch:{ all -> 0x06da }
            if (r8 == 0) goto L_0x06dc
            r9 = 0
            android.opengl.GLES20.glUseProgram(r9)     // Catch:{ all -> 0x06da }
            kotlin.jvm.functions.Function1 r0 = r1.b     // Catch:{ all -> 0x06ab }
            r0.invoke(r1)     // Catch:{ all -> 0x06ab }
            goto L_0x06b1
        L_0x06ab:
            r0 = move-exception
            java.lang.String r9 = "Error on call dependent release callback"
            r7.reportException(r4, r9, r0)     // Catch:{ all -> 0x06da }
        L_0x06b1:
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch:{ all -> 0x06da }
            r1.g = r0     // Catch:{ all -> 0x06da }
            android.opengl.EGLContext r9 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch:{ all -> 0x06da }
            android.opengl.EGL14.eglMakeCurrent(r8, r0, r0, r9)     // Catch:{ all -> 0x06da }
            android.opengl.EGL14.eglDestroyContext(r8, r5)     // Catch:{ all -> 0x06da }
            android.opengl.EGL14.eglReleaseThread()     // Catch:{ all -> 0x06da }
            android.opengl.EGL14.eglTerminate(r8)     // Catch:{ all -> 0x06da }
            r1.d = r6     // Catch:{ all -> 0x06da }
            r1.e = r6     // Catch:{ all -> 0x06da }
            r1.f = r6     // Catch:{ all -> 0x06da }
            java.lang.String r0 = "Quitting handler thread"
            r7.log(r4, r0)     // Catch:{ all -> 0x06da }
            android.os.HandlerThread r0 = r1.c     // Catch:{ all -> 0x06da }
            r0.quit()     // Catch:{ all -> 0x06da }
            r7.log(r4, r3)
            r2.countDown()
        L_0x06d9:
            return
        L_0x06da:
            r0 = move-exception
            goto L_0x06e2
        L_0x06dc:
            ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized r0 = new ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized     // Catch:{ all -> 0x06da }
            r0.<init>()     // Catch:{ all -> 0x06da }
            throw r0     // Catch:{ all -> 0x06da }
        L_0x06e2:
            voc r4 = r1.a
            java.lang.String r1 = r1.j
            r4.log(r1, r3)
            r2.countDown()
            throw r0
        L_0x06ed:
            java.lang.Object r1 = r0.b
            r11 r1 = (defpackage.r11) r1
            java.lang.Object r0 = r0.c
            zz7 r0 = (defpackage.zz7) r0
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x06fe }
            cvb r0 = (defpackage.cvb) r0     // Catch:{ all -> 0x06fe }
            r1.b = r0     // Catch:{ all -> 0x06fe }
            goto L_0x070b
        L_0x06fe:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "CameraPreviewHelper"
            defpackage.z68.h(r3, r0, r1, r2)
        L_0x070b:
            return
        L_0x070c:
            java.lang.String r1 = "OKRTCCall"
            java.lang.Object r2 = r0.b
            hz0 r2 = (defpackage.hz0) r2
            ox0 r2 = r2.K1
            java.lang.Object r4 = r2.c
            voc r4 = (defpackage.voc) r4
            java.lang.Object r2 = r2.b     // Catch:{ JSONException -> 0x0749 }
            woc r2 = (defpackage.woc) r2     // Catch:{ JSONException -> 0x0749 }
            boolean r2 = r2.shouldHideSensitiveInformation()     // Catch:{ JSONException -> 0x0749 }
            java.lang.Object r0 = r0.c
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r5 = "handleSignalingNotification, "
            if (r2 == 0) goto L_0x074b
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0749 }
            java.lang.String r0 = defpackage.hi7.n(r0)     // Catch:{ JSONException -> 0x0749 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0749 }
            r2.<init>((java.lang.String) r0)     // Catch:{ JSONException -> 0x0749 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0749 }
            r0.<init>(r5)     // Catch:{ JSONException -> 0x0749 }
            java.lang.String r2 = r2.toString(r3)     // Catch:{ JSONException -> 0x0749 }
            r0.append(r2)     // Catch:{ JSONException -> 0x0749 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0749 }
            r4.log(r1, r0)     // Catch:{ JSONException -> 0x0749 }
            goto L_0x0774
        L_0x0749:
            r0 = move-exception
            goto L_0x075f
        L_0x074b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0749 }
            r2.<init>(r5)     // Catch:{ JSONException -> 0x0749 }
            java.lang.String r0 = r0.toString(r3)     // Catch:{ JSONException -> 0x0749 }
            r2.append(r0)     // Catch:{ JSONException -> 0x0749 }
            java.lang.String r0 = r2.toString()     // Catch:{ JSONException -> 0x0749 }
            r4.log(r1, r0)     // Catch:{ JSONException -> 0x0749 }
            goto L_0x0774
        L_0x075f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "error during notification logging: "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r4.log(r1, r0)
        L_0x0774:
            return
        L_0x0775:
            java.lang.Object r1 = r0.b
            kj0 r1 = (defpackage.kj0) r1
            cs6 r1 = r1.d
            java.lang.Object r0 = r0.c
            java.lang.Exception r0 = (java.lang.Exception) r0
            androidx.media3.common.VideoFrameProcessingException r0 = androidx.media3.common.VideoFrameProcessingException.a(r0)
            r1.a(r0)
            return
        L_0x0787:
            java.lang.Object r1 = r0.b
            m70 r1 = (defpackage.m70) r1
            double r1 = r1.t
            java.lang.Object r0 = r0.c
            wsb r0 = (defpackage.wsb) r0
            java.lang.Object r0 = r0.b
            lyc r0 = (defpackage.lyc) r0
            r0.c0 = r1
            return
        L_0x0798:
            java.lang.Object r1 = r0.c
            do1 r1 = (defpackage.do1) r1
            java.lang.Object r0 = r0.b
            m70 r0 = (defpackage.m70) r0
            r0.getClass()
            iu0 r3 = r0.d
            int r4 = r0.g     // Catch:{ all -> 0x07cd }
            int r4 = defpackage.tr1.y(r4)     // Catch:{ all -> 0x07cd }
            if (r4 == 0) goto L_0x07b1
            r5 = 1
            if (r4 == r5) goto L_0x07b1
            goto L_0x07c9
        L_0x07b1:
            r0.b(r6)     // Catch:{ all -> 0x07cd }
            jae r4 = r0.e     // Catch:{ all -> 0x07cd }
            r4.release()     // Catch:{ all -> 0x07cd }
            r3.release()     // Catch:{ all -> 0x07cd }
            boolean r4 = r0.i     // Catch:{ all -> 0x07cd }
            if (r4 != 0) goto L_0x07c1
            goto L_0x07c7
        L_0x07c1:
            r4 = 0
            r0.i = r4     // Catch:{ all -> 0x07cd }
            r3.stop()     // Catch:{ all -> 0x07cd }
        L_0x07c7:
            r0.g = r2     // Catch:{ all -> 0x07cd }
        L_0x07c9:
            r1.b(r6)     // Catch:{ all -> 0x07cd }
            goto L_0x07d1
        L_0x07cd:
            r0 = move-exception
            r1.d(r0)
        L_0x07d1:
            return
        L_0x07d2:
            java.lang.Object r1 = r0.b
            m70 r1 = (defpackage.m70) r1
            int r2 = r1.g
            int r2 = defpackage.tr1.y(r2)
            if (r2 == 0) goto L_0x07ec
            r4 = 1
            if (r2 == r4) goto L_0x07ec
            if (r2 == r3) goto L_0x07e4
            goto L_0x07f7
        L_0x07e4:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "AudioSource is released"
            r0.<init>(r1)
            throw r0
        L_0x07ec:
            c65 r2 = r1.l
            java.lang.Object r0 = r0.c
            c65 r0 = (defpackage.c65) r0
            if (r2 == r0) goto L_0x07f7
            r1.b(r0)
        L_0x07f7:
            return
        L_0x07f8:
            java.lang.Object r1 = r0.b
            wsb r1 = (defpackage.wsb) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r2 = r0 instanceof androidx.camera.video.internal.audio.AudioSourceAccessException
            if (r2 == 0) goto L_0x080e
            java.lang.Object r1 = r1.a
            tk3 r1 = (defpackage.tk3) r1
            r1.accept(r0)
        L_0x080e:
            return
        L_0x080f:
            java.lang.Object r3 = r0.b
            p7d r3 = (defpackage.p7d) r3
            r3.getClass()
            int r4 = defpackage.v0g.a
            java.lang.Object r3 = r3.c
            nc5 r3 = (defpackage.nc5) r3
            tc5 r3 = r3.a
            wb4 r3 = r3.A0
            td r4 = r3.J()
            gb4 r5 = new gb4
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            r5.<init>(r4, r0, r2)
            r3.K(r4, r1, r5)
            return
        L_0x0831:
            java.lang.Object r2 = r0.b
            wsb r2 = (defpackage.wsb) r2
            r2.getClass()
            int r3 = defpackage.t0g.a
            java.lang.Object r2 = r2.b
            mc5 r2 = (defpackage.mc5) r2
            sc5 r2 = r2.a
            vb4 r2 = r2.z0
            sd r3 = r2.P()
            db4 r4 = new db4
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            r5 = 28
            r4.<init>((int) r5, (java.lang.Object) r3, (java.lang.Object) r0)
            r2.Q(r3, r1, r4)
            return
        L_0x0855:
            java.lang.Object r1 = r0.b
            my r1 = (defpackage.my) r1
            java.lang.Object r0 = r0.c
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            java.lang.Object r2 = r1.a
            monitor-enter(r2)
            boolean r3 = r1.l     // Catch:{ all -> 0x0866 }
            if (r3 == 0) goto L_0x0868
            monitor-exit(r2)     // Catch:{ all -> 0x0866 }
            goto L_0x08b0
        L_0x0866:
            r0 = move-exception
            goto L_0x08b1
        L_0x0868:
            long r3 = r1.k     // Catch:{ all -> 0x0866 }
            r5 = 1
            long r3 = r3 - r5
            r1.k = r3     // Catch:{ all -> 0x0866 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0877
            monitor-exit(r2)     // Catch:{ all -> 0x0866 }
            goto L_0x08b0
        L_0x0877:
            if (r3 >= 0) goto L_0x0889
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0866 }
            r0.<init>()     // Catch:{ all -> 0x0866 }
            java.lang.Object r3 = r1.a     // Catch:{ all -> 0x0866 }
            monitor-enter(r3)     // Catch:{ all -> 0x0866 }
            r1.m = r0     // Catch:{ all -> 0x0886 }
            monitor-exit(r3)     // Catch:{ all -> 0x0886 }
            monitor-exit(r2)     // Catch:{ all -> 0x0866 }
            goto L_0x08b0
        L_0x0886:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0886 }
            throw r0     // Catch:{ all -> 0x0866 }
        L_0x0889:
            r1.b()     // Catch:{ all -> 0x0866 }
            if (r0 == 0) goto L_0x08af
            r0.start()     // Catch:{ IllegalStateException -> 0x08a3, Exception -> 0x0892 }
            goto L_0x08af
        L_0x0892:
            r0 = move-exception
            r3 = r0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0866 }
            r0.<init>(r3)     // Catch:{ all -> 0x0866 }
            java.lang.Object r3 = r1.a     // Catch:{ all -> 0x0866 }
            monitor-enter(r3)     // Catch:{ all -> 0x0866 }
            r1.m = r0     // Catch:{ all -> 0x08a0 }
            monitor-exit(r3)     // Catch:{ all -> 0x08a0 }
            goto L_0x08af
        L_0x08a0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x08a0 }
            throw r0     // Catch:{ all -> 0x0866 }
        L_0x08a3:
            r0 = move-exception
            r3 = r0
            java.lang.Object r4 = r1.a     // Catch:{ all -> 0x0866 }
            monitor-enter(r4)     // Catch:{ all -> 0x0866 }
            r1.m = r3     // Catch:{ all -> 0x08ac }
            monitor-exit(r4)     // Catch:{ all -> 0x08ac }
            goto L_0x08af
        L_0x08ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x08ac }
            throw r0     // Catch:{ all -> 0x0866 }
        L_0x08af:
            monitor-exit(r2)     // Catch:{ all -> 0x0866 }
        L_0x08b0:
            return
        L_0x08b1:
            monitor-exit(r2)     // Catch:{ all -> 0x0866 }
            throw r0
        L_0x08b3:
            java.lang.Object r1 = r0.c
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r0.b
            r2 = r0
            se2 r2 = (defpackage.se2) r2
            r2.getClass()
            zz6 r0 = r2.b     // Catch:{ Exception -> 0x08c5 }
            r0.c(r1)     // Catch:{ Exception -> 0x08c5 }
            goto L_0x08d7
        L_0x08c5:
            r0 = move-exception
            java.lang.String r1 = r2.a
            java.lang.String r3 = "deleteHistoryItem: exception"
            defpackage.z68.f(r1, r3, r0)
            ru.ok.tamtam.util.HandledException r1 = new ru.ok.tamtam.util.HandledException
            r1.<init>(r0)
            m95 r0 = r2.w
            r0.a(r1)
        L_0x08d7:
            return
        L_0x08d8:
            java.lang.Object r1 = r0.c
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r0 = r0.b
            r2 = r0
            qn r2 = (defpackage.qn) r2
            r2.getClass()
            r1.run()     // Catch:{ all -> 0x08eb }
            r2.a()
            return
        L_0x08eb:
            r0 = move-exception
            r1 = r0
            r2.a()
            throw r1
        L_0x08f1:
            java.lang.Object r1 = r0.b
            he r1 = (defpackage.he) r1
            r1.getClass()
            java.lang.Object r0 = r0.c
            ia7 r0 = (defpackage.ia7) r0
            r0.i(r1)
            return
        L_0x0900:
            java.lang.Object r1 = r0.c
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r0 = r0.b
            ru.ok.messages.contacts.picker.ActAdminPicker r0 = (ru.ok.messages.contacts.picker.ActAdminPicker) r0
            if (r1 == 0) goto L_0x0921
            jkd r1 = r0.L0
            ru.ok.messages.search.KeyboardHandlerSearchView r1 = r1.e()
            if (r1 == 0) goto L_0x0917
            java.lang.CharSequence r1 = r1.getQuery()
            goto L_0x0919
        L_0x0917:
            java.lang.String r1 = ""
        L_0x0919:
            java.lang.String r1 = r1.toString()
            r0.Y0(r1)
            goto L_0x0926
        L_0x0921:
            int r1 = ru.ok.messages.contacts.picker.ActAdminPicker.N0
            r0.getClass()
        L_0x0926:
            return
        L_0x0927:
            java.lang.Object r1 = r0.b
            d r1 = (defpackage.d) r1
            qr0 r1 = r1.a()
            boolean r2 = r1.a
            if (r2 != 0) goto L_0x093e
            java.lang.Object r1 = r1.b
            v48 r1 = (defpackage.v48) r1
            java.lang.Object r0 = r0.c
            mz9 r0 = (defpackage.mz9) r0
            r1.d(r0)
        L_0x093e:
            return
        L_0x093f:
            java.lang.Object r1 = r0.b
            d r1 = (defpackage.d) r1
            java.lang.Object r0 = r0.c
            dv1 r0 = (defpackage.dv1) r0
            v48 r2 = r1.x0
            if (r2 == 0) goto L_0x0951
            v48 r1 = r1.x0
            r1.l(r0)
            goto L_0x0953
        L_0x0951:
            r1.E0 = r0
        L_0x0953:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.run():void");
    }
}
