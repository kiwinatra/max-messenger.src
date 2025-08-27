package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: ibf  reason: default package */
public abstract class ibf extends o9f {
    public static final hbf b = new ibf();

    public ibf() {
    }

    /* JADX WARNING: type inference failed for: r0v64, types: [ibf, ovc] */
    /* JADX WARNING: type inference failed for: r0v74, types: [k7g, ibf] */
    /* JADX WARNING: type inference failed for: r0v76, types: [bw9, ibf] */
    /* JADX WARNING: type inference failed for: r0v77, types: [ibf, mp2] */
    /* JADX WARNING: type inference failed for: r0v79, types: [ibf, l6f] */
    /* JADX WARNING: type inference failed for: r0v102, types: [ibf, mr3] */
    /* JADX WARNING: type inference failed for: r0v103, types: [br3, ibf] */
    /* JADX WARNING: type inference failed for: r0v104, types: [as3, ibf] */
    /* JADX WARNING: type inference failed for: r0v105, types: [to3, ibf] */
    /* JADX WARNING: type inference failed for: r0v106, types: [pr3, ibf] */
    /* JADX WARNING: type inference failed for: r0v113, types: [va2, ibf] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ibf b(short r25, byte[] r26) {
        /*
            r0 = r25
            java.lang.String r1 = "messageIds"
            r2 = 3
            r3 = 2
            r8 = 1
            pf9 r9 = defpackage.fd9.a(r26)
            s9a r10 = defpackage.x3b.c
            r10 = 18
            java.lang.String r11 = "token"
            java.lang.String r12 = "ServerPayload/PayloadCatching"
            java.lang.String r13 = "payloadCatching catch error"
            if (r0 != r10) goto L_0x0291
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x0020
        L_0x001d:
            r4 = 0
            goto L_0x0290
        L_0x0020:
            int r0 = defpackage.ryg.e0(r9)     // Catch:{ all -> 0x0026 }
            r1 = r0
            goto L_0x0058
        L_0x0026:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r12, r13, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0031:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0041
            java.lang.Object r2 = r0.next()
            xm r2 = (defpackage.xm) r2
            r2.a(r1)
            goto L_0x0031
        L_0x0041:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0057
            if (r0 == r8) goto L_0x0056
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0056:
            throw r1
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 != 0) goto L_0x005b
            goto L_0x001d
        L_0x005b:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10 = 0
        L_0x0066:
            if (r10 >= r1) goto L_0x028b
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x006d }
            goto L_0x009f
        L_0x006d:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r12, r13, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0078:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0088
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x0078
        L_0x0088:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x009e
            if (r0 == r8) goto L_0x009d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x009d:
            throw r14
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 != 0) goto L_0x00a6
        L_0x00a1:
            r25 = r1
            r1 = r8
            goto L_0x0285
        L_0x00a6:
            java.lang.String r14 = "tokenAttrs"
            boolean r14 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r14)
            if (r14 == 0) goto L_0x023e
            int r0 = defpackage.ryg.e0(r9)     // Catch:{ all -> 0x00b7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x00e8
        L_0x00b7:
            r0 = move-exception
            defpackage.z68.o(r12, r13, r0)
            java.util.concurrent.CopyOnWriteArraySet r14 = defpackage.ytd.a
            java.util.Iterator r14 = r14.iterator()
        L_0x00c1:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00d1
            java.lang.Object r15 = r14.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r0)
            goto L_0x00c1
        L_0x00d1:
            gga r14 = defpackage.xtd.a
            r14.getClass()
            xtd r14 = defpackage.xtd.b
            int r14 = r14.ordinal()
            if (r14 == 0) goto L_0x00e7
            if (r14 == r8) goto L_0x00e6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00e6:
            throw r0
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            if (r0 == 0) goto L_0x00a1
            int r14 = r0.intValue()
            r15 = 0
        L_0x00ef:
            if (r15 >= r14) goto L_0x023b
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x00f7 }
            r4 = r0
            goto L_0x012b
        L_0x00f7:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r12, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0102:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x0114
            java.lang.Object r16 = r0.next()
            r7 = r16
            xm r7 = (defpackage.xm) r7
            r7.a(r4)
            goto L_0x0102
        L_0x0114:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x012a
            if (r0 == r8) goto L_0x0129
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0129:
            throw r4
        L_0x012a:
            r4 = 0
        L_0x012b:
            if (r4 != 0) goto L_0x0132
            r25 = r1
            r1 = r8
            goto L_0x0235
        L_0x0132:
            int r7 = r9.y0()
            r5 = 0
            r6 = 0
        L_0x0138:
            if (r5 >= r7) goto L_0x022b
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x0141 }
            r25 = r1
            goto L_0x017c
        L_0x0141:
            r0 = move-exception
            r8 = r0
            defpackage.z68.o(r12, r13, r8)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x014c:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x0162
            java.lang.Object r17 = r0.next()
            r25 = r0
            r0 = r17
            xm r0 = (defpackage.xm) r0
            r0.a(r8)
            r0 = r25
            goto L_0x014c
        L_0x0162:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0179
            r1 = 1
            if (r0 == r1) goto L_0x0178
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0178:
            throw r8
        L_0x0179:
            r25 = r1
            r0 = 0
        L_0x017c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r11)
            if (r1 == 0) goto L_0x01bf
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x0188 }
            r6 = r0
            goto L_0x01bb
        L_0x0188:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r12, r13, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0193:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x01a3
            java.lang.Object r6 = r0.next()
            xm r6 = (defpackage.xm) r6
            r6.a(r1)
            goto L_0x0193
        L_0x01a3:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01ba
            r6 = 1
            if (r0 == r6) goto L_0x01b9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b9:
            throw r1
        L_0x01ba:
            r6 = 0
        L_0x01bb:
            r26 = r7
        L_0x01bd:
            r1 = 1
            goto L_0x0223
        L_0x01bf:
            java.lang.String r1 = "tokenTtl"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x021d
            boolean r0 = r9.m()
            if (r0 == 0) goto L_0x0217
            org.msgpack.core.buffer.MessageBuffer r0 = r9.y
            int r1 = r9.z
            byte r0 = r0.getByte(r1)
            r1 = -64
            if (r0 != r1) goto L_0x01dd
            r9.readByte()
            goto L_0x01bb
        L_0x01dd:
            r26 = r7
            r7 = 0
            defpackage.ryg.d0(r9, r7)     // Catch:{ all -> 0x01e5 }
            goto L_0x01bd
        L_0x01e5:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r12, r13, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01f0:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0200
            java.lang.Object r7 = r0.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r1)
            goto L_0x01f0
        L_0x0200:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01bd
            r7 = 1
            if (r0 == r7) goto L_0x0216
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0216:
            throw r1
        L_0x0217:
            org.msgpack.core.MessageInsufficientBufferException r0 = new org.msgpack.core.MessageInsufficientBufferException
            r0.<init>()
            throw r0
        L_0x021d:
            r26 = r7
            r9.A()
            goto L_0x01bd
        L_0x0223:
            int r5 = r5 + r1
            r7 = r26
            r8 = r1
            r1 = r25
            goto L_0x0138
        L_0x022b:
            r25 = r1
            r1 = r8
            if (r6 != 0) goto L_0x0232
            java.lang.String r6 = ""
        L_0x0232:
            r2.put(r4, r6)
        L_0x0235:
            int r15 = r15 + r1
            r8 = r1
            r1 = r25
            goto L_0x00ef
        L_0x023b:
            r25 = r1
            goto L_0x0284
        L_0x023e:
            r25 = r1
            java.lang.String r1 = "presetAvatars"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x0281
            hb9 r0 = r9.n()
            int r0 = r0.a()
            r1 = 7
            if (r0 != r1) goto L_0x0269
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r9.t0()
            r4 = 0
        L_0x025d:
            if (r4 >= r1) goto L_0x026d
            x7a r5 = defpackage.w7a.a(r9)
            r0.add(r5)
            r5 = 1
            int r4 = r4 + r5
            goto L_0x025d
        L_0x0269:
            r9.A()
            r0 = 0
        L_0x026d:
            if (r0 == 0) goto L_0x0274
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r0)
            goto L_0x0275
        L_0x0274:
            r0 = 0
        L_0x0275:
            if (r0 != 0) goto L_0x027b
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x027b:
            java.util.Collection r0 = (java.util.Collection) r0
            r3.addAll(r0)
            goto L_0x0284
        L_0x0281:
            r9.A()
        L_0x0284:
            r1 = 1
        L_0x0285:
            int r10 = r10 + r1
            r8 = r1
            r1 = r25
            goto L_0x0066
        L_0x028b:
            j80 r4 = new j80
            r4.<init>(r2, r3)
        L_0x0290:
            return r4
        L_0x0291:
            r4 = 23
            if (r0 != r4) goto L_0x0485
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x029e
        L_0x029b:
            r4 = 0
            goto L_0x0484
        L_0x029e:
            int r0 = defpackage.ryg.e0(r9)     // Catch:{ all -> 0x02a4 }
            r1 = r0
            goto L_0x02d7
        L_0x02a4:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r12, r13, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02af:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02bf
            java.lang.Object r4 = r0.next()
            xm r4 = (defpackage.xm) r4
            r4.a(r1)
            goto L_0x02af
        L_0x02bf:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x02d6
            r4 = 1
            if (r0 == r4) goto L_0x02d5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02d5:
            throw r1
        L_0x02d6:
            r1 = 0
        L_0x02d7:
            if (r1 != 0) goto L_0x02da
            goto L_0x029b
        L_0x02da:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            h98 r6 = defpackage.h98.LOGIN
            r5.element = r6
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r8 = 0
            r10 = 0
        L_0x02ef:
            if (r8 >= r1) goto L_0x046c
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x02f6 }
            goto L_0x0329
        L_0x02f6:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r12, r13, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0301:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0311
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x0301
        L_0x0311:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0328
            r15 = 1
            if (r0 == r15) goto L_0x0327
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0327:
            throw r14
        L_0x0328:
            r0 = 0
        L_0x0329:
            if (r0 != 0) goto L_0x032e
        L_0x032b:
            r14 = 1
            goto L_0x0469
        L_0x032e:
            int r14 = r0.hashCode()
            switch(r14) {
                case -309425751: goto L_0x0456;
                case 110541305: goto L_0x0414;
                case 141498579: goto L_0x037c;
                case 329221358: goto L_0x0337;
                default: goto L_0x0335;
            }
        L_0x0335:
            goto L_0x045e
        L_0x0337:
            java.lang.String r14 = "userToken"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x0341
            goto L_0x045e
        L_0x0341:
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x0346 }
            goto L_0x0379
        L_0x0346:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r12, r13, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0351:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x0361
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x0351
        L_0x0361:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0378
            r15 = 1
            if (r0 == r15) goto L_0x0377
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0377:
            throw r14
        L_0x0378:
            r0 = 0
        L_0x0379:
            r7.element = r0
            goto L_0x032b
        L_0x037c:
            java.lang.String r14 = "tokenType"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x0386
            goto L_0x045e
        L_0x0386:
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x038b }
            goto L_0x03be
        L_0x038b:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r12, r13, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0396:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x03a6
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x0396
        L_0x03a6:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x03bd
            r15 = 1
            if (r0 == r15) goto L_0x03bc
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03bc:
            throw r14
        L_0x03bd:
            r0 = 0
        L_0x03be:
            r0.getClass()
            r14 = -1
            int r15 = r0.hashCode()
            switch(r15) {
                case -1154090892: goto L_0x03eb;
                case -94752593: goto L_0x03e0;
                case -16486507: goto L_0x03d5;
                case 72611657: goto L_0x03ca;
                default: goto L_0x03c9;
            }
        L_0x03c9:
            goto L_0x03f5
        L_0x03ca:
            java.lang.String r15 = "LOGIN"
            boolean r15 = r0.equals(r15)
            if (r15 != 0) goto L_0x03d3
            goto L_0x03f5
        L_0x03d3:
            r14 = r2
            goto L_0x03f5
        L_0x03d5:
            java.lang.String r15 = "RECOVERY"
            boolean r15 = r0.equals(r15)
            if (r15 != 0) goto L_0x03de
            goto L_0x03f5
        L_0x03de:
            r14 = r3
            goto L_0x03f5
        L_0x03e0:
            java.lang.String r15 = "PHONE_CONFIRM"
            boolean r15 = r0.equals(r15)
            if (r15 != 0) goto L_0x03e9
            goto L_0x03f5
        L_0x03e9:
            r14 = 1
            goto L_0x03f5
        L_0x03eb:
            java.lang.String r15 = "PHONE_BINDING"
            boolean r15 = r0.equals(r15)
            if (r15 != 0) goto L_0x03f4
            goto L_0x03f5
        L_0x03f4:
            r14 = 0
        L_0x03f5:
            switch(r14) {
                case 0: goto L_0x040e;
                case 1: goto L_0x040b;
                case 2: goto L_0x0408;
                case 3: goto L_0x0406;
                default: goto L_0x03f8;
            }
        L_0x03f8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "No such value "
            java.lang.String r3 = " for LoginTokenType"
            java.lang.String r0 = defpackage.wj6.k(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x0406:
            r0 = r6
            goto L_0x0410
        L_0x0408:
            h98 r0 = defpackage.h98.RECOVERY
            goto L_0x0410
        L_0x040b:
            h98 r0 = defpackage.h98.PHONE_CONFIRM
            goto L_0x0410
        L_0x040e:
            h98 r0 = defpackage.h98.PHONE_BINDING
        L_0x0410:
            r5.element = r0
            goto L_0x032b
        L_0x0414:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x045e
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x041f }
            goto L_0x0452
        L_0x041f:
            r0 = move-exception
            r14 = r0
            defpackage.z68.o(r12, r13, r14)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x042a:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x043a
            java.lang.Object r15 = r0.next()
            xm r15 = (defpackage.xm) r15
            r15.a(r14)
            goto L_0x042a
        L_0x043a:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0451
            r15 = 1
            if (r0 == r15) goto L_0x0450
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0450:
            throw r14
        L_0x0451:
            r0 = 0
        L_0x0452:
            r4.element = r0
            goto L_0x032b
        L_0x0456:
            java.lang.String r14 = "profile"
            boolean r0 = r0.equals(r14)
            if (r0 != 0) goto L_0x0463
        L_0x045e:
            r9.A()
            goto L_0x032b
        L_0x0463:
            fo3 r10 = defpackage.fo3.e(r9)
            goto L_0x032b
        L_0x0469:
            int r8 = r8 + r14
            goto L_0x02ef
        L_0x046c:
            T r0 = r4.element
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x029b
            l80 r1 = new l80
            T r2 = r5.element
            h98 r2 = (defpackage.h98) r2
            T r3 = r7.element
            java.lang.String r3 = (java.lang.String) r3
            if (r10 != 0) goto L_0x0480
            goto L_0x029b
        L_0x0480:
            r1.<init>(r0, r2, r3, r10)
            r4 = r1
        L_0x0484:
            return r4
        L_0x0485:
            r4 = 17
            if (r0 != r4) goto L_0x069b
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x0492
        L_0x048f:
            r4 = 0
            goto L_0x069a
        L_0x0492:
            int r0 = defpackage.ryg.e0(r9)     // Catch:{ all -> 0x0498 }
            r1 = r0
            goto L_0x04cb
        L_0x0498:
            r0 = move-exception
            r1 = r0
            defpackage.z68.o(r12, r13, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x04a3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04b3
            java.lang.Object r2 = r0.next()
            xm r2 = (defpackage.xm) r2
            r2.a(r1)
            goto L_0x04a3
        L_0x04b3:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x04ca
            r2 = 1
            if (r0 == r2) goto L_0x04c9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04c9:
            throw r1
        L_0x04ca:
            r1 = 0
        L_0x04cb:
            if (r1 != 0) goto L_0x04ce
            goto L_0x048f
        L_0x04ce:
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            r3 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
        L_0x04dc:
            if (r3 >= r1) goto L_0x068b
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x04e3 }
            goto L_0x0516
        L_0x04e3:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r12, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x04ee:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x04fe
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r4)
            goto L_0x04ee
        L_0x04fe:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0515
            r5 = 1
            if (r0 == r5) goto L_0x0514
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0514:
            throw r4
        L_0x0515:
            r0 = 0
        L_0x0516:
            if (r0 != 0) goto L_0x051a
            goto L_0x05ab
        L_0x051a:
            int r4 = r0.hashCode()
            switch(r4) {
                case -1135546573: goto L_0x063f;
                case -1007074317: goto L_0x05f7;
                case 6808551: goto L_0x05b1;
                case 110541305: goto L_0x056b;
                case 575768841: goto L_0x0523;
                default: goto L_0x0521;
            }
        L_0x0521:
            goto L_0x0647
        L_0x0523:
            java.lang.String r4 = "requestMaxDuration"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x052d
            goto L_0x0647
        L_0x052d:
            r4 = 0
            long r6 = defpackage.ryg.d0(r9, r4)     // Catch:{ all -> 0x0534 }
            goto L_0x0568
        L_0x0534:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r12, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x053f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x054f
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r4)
            goto L_0x053f
        L_0x054f:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0566
            r5 = 1
            if (r0 == r5) goto L_0x0565
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0565:
            throw r4
        L_0x0566:
            r6 = 0
        L_0x0568:
            r22 = r6
            goto L_0x05ab
        L_0x056b:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0647
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x0576 }
            goto L_0x05a9
        L_0x0576:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r12, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0581:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0591
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r4)
            goto L_0x0581
        L_0x0591:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x05a8
            r5 = 1
            if (r0 == r5) goto L_0x05a7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05a7:
            throw r4
        L_0x05a8:
            r0 = 0
        L_0x05a9:
            if (r0 != 0) goto L_0x05ae
        L_0x05ab:
            r5 = 1
            goto L_0x0688
        L_0x05ae:
            r2.element = r0
            goto L_0x05ab
        L_0x05b1:
            java.lang.String r4 = "requestCountLeft"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x05bb
            goto L_0x0647
        L_0x05bb:
            int r0 = defpackage.ryg.c0(r9)     // Catch:{ all -> 0x05c2 }
            r24 = r0
            goto L_0x05ab
        L_0x05c2:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r12, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05cd:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05dd
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r4)
            goto L_0x05cd
        L_0x05dd:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x05f4
            r5 = 1
            if (r0 == r5) goto L_0x05f3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05f3:
            throw r4
        L_0x05f4:
            r24 = 0
            goto L_0x05ab
        L_0x05f7:
            java.lang.String r4 = "altActionDuration"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0600
            goto L_0x0647
        L_0x0600:
            r4 = 0
            long r7 = defpackage.ryg.d0(r9, r4)     // Catch:{ all -> 0x0607 }
            goto L_0x063b
        L_0x0607:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r12, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0612:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0622
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r4)
            goto L_0x0612
        L_0x0622:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0639
            r5 = 1
            if (r0 == r5) goto L_0x0638
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0638:
            throw r4
        L_0x0639:
            r7 = 0
        L_0x063b:
            r20 = r7
            goto L_0x05ab
        L_0x063f:
            java.lang.String r4 = "codeLength"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x064c
        L_0x0647:
            r9.A()
            goto L_0x05ab
        L_0x064c:
            int r0 = defpackage.ryg.c0(r9)     // Catch:{ all -> 0x0654 }
            r19 = r0
            goto L_0x05ab
        L_0x0654:
            r0 = move-exception
            r4 = r0
            defpackage.z68.o(r12, r13, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x065f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x066f
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r4)
            goto L_0x065f
        L_0x066f:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            r5 = 1
            if (r0 == 0) goto L_0x0686
            if (r0 == r5) goto L_0x0685
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0685:
            throw r4
        L_0x0686:
            r19 = 0
        L_0x0688:
            int r3 = r3 + r5
            goto L_0x04dc
        L_0x068b:
            T r0 = r2.element
            r18 = r0
            java.lang.String r18 = (java.lang.String) r18
            if (r18 == 0) goto L_0x048f
            v80 r4 = new v80
            r17 = r4
            r17.<init>(r18, r19, r20, r22, r24)
        L_0x069a:
            return r4
        L_0x069b:
            r4 = 49
            if (r0 != r4) goto L_0x07bd
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x06a8
        L_0x06a5:
            r4 = 0
            goto L_0x07bc
        L_0x06a8:
            int r0 = defpackage.ryg.e0(r9)     // Catch:{ all -> 0x06ae }
            r2 = r0
            goto L_0x06e1
        L_0x06ae:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r12, r13, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06b9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06c9
            java.lang.Object r3 = r0.next()
            xm r3 = (defpackage.xm) r3
            r3.a(r2)
            goto L_0x06b9
        L_0x06c9:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x06e0
            r3 = 1
            if (r0 == r3) goto L_0x06df
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06df:
            throw r2
        L_0x06e0:
            r2 = 0
        L_0x06e1:
            if (r2 != 0) goto L_0x06e4
            goto L_0x06a5
        L_0x06e4:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r4 = r0
            r5 = 0
            r6 = 0
        L_0x06f0:
            if (r5 >= r2) goto L_0x07b4
            java.lang.String r0 = defpackage.ryg.g0(r9)     // Catch:{ all -> 0x06f7 }
            goto L_0x072a
        L_0x06f7:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r12, r13, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0702:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0712
            java.lang.Object r8 = r0.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r7)
            goto L_0x0702
        L_0x0712:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0729
            r8 = 1
            if (r0 == r8) goto L_0x0728
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0728:
            throw r7
        L_0x0729:
            r0 = 0
        L_0x072a:
            if (r0 != 0) goto L_0x072f
        L_0x072c:
            r8 = 1
            goto L_0x07b1
        L_0x072f:
            int r7 = r0.hashCode()
            r8 = -1690743503(0xffffffff9b394d31, float:-1.5327783E-22)
            if (r7 == r8) goto L_0x075e
            r8 = -462094004(0xffffffffe475014c, float:-1.8078183E22)
            if (r7 == r8) goto L_0x0751
            r8 = 3052376(0x2e9358, float:4.27729E-39)
            if (r7 == r8) goto L_0x0743
            goto L_0x0764
        L_0x0743:
            java.lang.String r7 = "chat"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x074c
            goto L_0x0764
        L_0x074c:
            b32 r6 = defpackage.b32.a(r9)
            goto L_0x072c
        L_0x0751:
            java.lang.String r7 = "messages"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0764
            a00 r4 = defpackage.a00.g(r9)
            goto L_0x072c
        L_0x075e:
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x079c
        L_0x0764:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r9.A()     // Catch:{ all -> 0x076a }
            goto L_0x072c
        L_0x076a:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r12, r13, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0775:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0785
            java.lang.Object r8 = r0.next()
            xm r8 = (defpackage.xm) r8
            r8.a(r7)
            goto L_0x0775
        L_0x0785:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x072c
            r8 = 1
            if (r0 == r8) goto L_0x079b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x079b:
            throw r7
        L_0x079c:
            int r0 = defpackage.ryg.X(r9)
            r7 = 0
        L_0x07a1:
            if (r7 >= r0) goto L_0x072c
            long r10 = r9.x0()
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r3.add(r8)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x07a1
        L_0x07b1:
            int r5 = r5 + r8
            goto L_0x06f0
        L_0x07b4:
            ma2 r0 = new ma2
            java.util.List r4 = (java.util.List) r4
            r0.<init>(r4, r6, r3)
            r4 = r0
        L_0x07bc:
            return r4
        L_0x07bd:
            r4 = 48
            if (r0 != r4) goto L_0x07d1
            va2 r0 = new va2
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x07d0
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x07d0:
            return r0
        L_0x07d1:
            r4 = 50
            if (r0 != r4) goto L_0x07db
            oc2 r0 = new oc2
            r0.<init>(r9)
            return r0
        L_0x07db:
            r4 = 34
            if (r0 != r4) goto L_0x07e5
            us3 r0 = new us3
            r0.<init>(r9)
            return r0
        L_0x07e5:
            r4 = 32
            if (r0 != r4) goto L_0x07f0
            ko3 r0 = defpackage.ko3.a
            ibf r0 = r0.p(r9)
            return r0
        L_0x07f0:
            r4 = 46
            if (r0 != r4) goto L_0x07fb
            io3 r0 = defpackage.io3.a
            ibf r0 = r0.p(r9)
            return r0
        L_0x07fb:
            r4 = 35
            if (r0 != r4) goto L_0x080f
            pr3 r0 = new pr3
            r0.<init>(r9)
            java.util.Map r1 = r0.c
            if (r1 != 0) goto L_0x080e
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.c = r1
        L_0x080e:
            return r0
        L_0x080f:
            r4 = 36
            if (r0 != r4) goto L_0x0823
            to3 r0 = new to3
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x0822
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x0822:
            return r0
        L_0x0823:
            r4 = 37
            if (r0 != r4) goto L_0x0837
            as3 r0 = new as3
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x0836
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x0836:
            return r0
        L_0x0837:
            r4 = 38
            if (r0 != r4) goto L_0x084b
            br3 r0 = new br3
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x084a
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x084a:
            return r0
        L_0x084b:
            s9a r4 = defpackage.x3b.c
            r4 = 39
            if (r0 != r4) goto L_0x086b
            mr3 r0 = new mr3
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x0860
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x0860:
            java.util.List r1 = r0.o
            if (r1 != 0) goto L_0x086a
            java.util.List r1 = java.util.Collections.emptyList()
            r0.o = r1
        L_0x086a:
            return r0
        L_0x086b:
            s9a r4 = defpackage.x3b.c
            r4 = 19
            if (r0 != r4) goto L_0x0878
            m88 r0 = defpackage.m88.a
            ibf r0 = r0.p(r9)
            return r0
        L_0x0878:
            s9a r4 = defpackage.x3b.c
            r4 = 20
            hbf r5 = b
            if (r0 != r4) goto L_0x0881
            return r5
        L_0x0881:
            s9a r4 = defpackage.x3b.c
            r4 = 66
            if (r0 != r4) goto L_0x08e2
            boolean r0 = r9.m()
            if (r0 != 0) goto L_0x088f
        L_0x088d:
            r4 = 0
            goto L_0x08e1
        L_0x088f:
            int r0 = defpackage.ryg.e0(r9)
            if (r0 != 0) goto L_0x0896
            goto L_0x088d
        L_0x0896:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r3 = 0
            r7 = 0
        L_0x089e:
            if (r3 >= r0) goto L_0x08dc
            java.lang.String r4 = defpackage.ryg.g0(r9)
            if (r4 != 0) goto L_0x08aa
            r5 = 0
        L_0x08a8:
            r11 = 1
            goto L_0x08da
        L_0x08aa:
            java.lang.String r5 = "chatId"
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r5 == 0) goto L_0x08b9
            r5 = 0
            long r7 = defpackage.ryg.d0(r9, r5)
            goto L_0x08a8
        L_0x08b9:
            r5 = 0
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)
            if (r4 == 0) goto L_0x08d6
            int r4 = defpackage.ryg.X(r9)
            r10 = 0
        L_0x08c6:
            if (r10 >= r4) goto L_0x08a8
            long r11 = r9.x0()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r2.add(r11)
            r11 = 1
            int r10 = r10 + r11
            goto L_0x08c6
        L_0x08d6:
            r11 = 1
            r9.A()
        L_0x08da:
            int r3 = r3 + r11
            goto L_0x089e
        L_0x08dc:
            jv9 r4 = new jv9
            r4.<init>(r7, r2)
        L_0x08e1:
            return r4
        L_0x08e2:
            s9a r1 = defpackage.x3b.c
            r1 = 64
            if (r0 != r1) goto L_0x08ed
            fw9 r0 = defpackage.fw9.d(r9)
            return r0
        L_0x08ed:
            s9a r1 = defpackage.x3b.c
            r1 = 65
            if (r0 != r1) goto L_0x08f4
            return r5
        L_0x08f4:
            s9a r1 = defpackage.x3b.c
            r1 = 67
            if (r0 != r1) goto L_0x08ff
            pv9 r0 = defpackage.pv9.d(r9)
            return r0
        L_0x08ff:
            s9a r1 = defpackage.x3b.c
            r1 = 178(0xb2, float:2.5E-43)
            if (r0 != r1) goto L_0x090a
            zv9 r0 = defpackage.zv9.d(r9)
            return r0
        L_0x090a:
            s9a r1 = defpackage.x3b.c
            r1 = 179(0xb3, float:2.51E-43)
            if (r0 != r1) goto L_0x0916
            gv9 r0 = new gv9
            r0.<init>(r9)
            return r0
        L_0x0916:
            s9a r1 = defpackage.x3b.c
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L_0x0923
            o9a r0 = defpackage.o9a.v
            ibf r0 = r0.p(r9)
            return r0
        L_0x0923:
            s9a r1 = defpackage.x3b.c
            r1 = 181(0xb5, float:2.54E-43)
            if (r0 != r1) goto L_0x092f
            rv9 r0 = new rv9
            r0.<init>(r9)
            return r0
        L_0x092f:
            s9a r1 = defpackage.x3b.c
            r1 = 52
            if (r0 != r1) goto L_0x0936
            return r5
        L_0x0936:
            s9a r1 = defpackage.x3b.c
            r1 = 54
            if (r0 != r1) goto L_0x093d
            return r5
        L_0x093d:
            x3b r1 = defpackage.x3b.NOTIF_CONTACT
            short r1 = r1.a
            if (r0 != r1) goto L_0x0949
            zaa r0 = new zaa
            r0.<init>(r9)
            return r0
        L_0x0949:
            x3b r1 = defpackage.x3b.NOTIF_MARK
            short r1 = r1.a
            if (r0 != r1) goto L_0x0955
            iba r0 = new iba
            r0.<init>(r9)
            return r0
        L_0x0955:
            x3b r1 = defpackage.x3b.NOTIF_MESSAGE
            short r4 = r1.a
            if (r0 != r4) goto L_0x0962
            c43 r0 = r1.b
            ibf r0 = r0.p(r9)
            return r0
        L_0x0962:
            x3b r1 = defpackage.x3b.NOTIF_PRESENCE
            short r1 = r1.a
            if (r0 != r1) goto L_0x096e
            cca r0 = new cca
            r0.<init>(r9)
            return r0
        L_0x096e:
            x3b r1 = defpackage.x3b.NOTIF_CONFIG
            short r1 = r1.a
            if (r0 != r1) goto L_0x097a
            xaa r0 = new xaa
            r0.<init>(r9)
            return r0
        L_0x097a:
            x3b r1 = defpackage.x3b.NOTIF_TYPING
            short r1 = r1.a
            if (r0 != r1) goto L_0x0986
            dca r0 = new dca
            r0.<init>(r9)
            return r0
        L_0x0986:
            x3b r1 = defpackage.x3b.NOTIF_CHAT
            short r1 = r1.a
            if (r0 != r1) goto L_0x0992
            vaa r0 = new vaa
            r0.<init>(r9)
            return r0
        L_0x0992:
            x3b r1 = defpackage.x3b.NOTIF_ATTACH
            short r1 = r1.a
            if (r0 != r1) goto L_0x099e
            raa r0 = new raa
            r0.<init>(r9)
            return r0
        L_0x099e:
            s9a r1 = defpackage.x3b.c
            r1 = 80
            if (r0 != r1) goto L_0x09aa
            jfb r0 = new jfb
            r0.<init>(r9)
            return r0
        L_0x09aa:
            s9a r1 = defpackage.x3b.c
            r1 = 1
            if (r0 != r1) goto L_0x09b0
            return r5
        L_0x09b0:
            s9a r1 = defpackage.x3b.c
            r1 = 16
            if (r0 != r1) goto L_0x09bc
            ixb r0 = new ixb
            r0.<init>(r9)
            return r0
        L_0x09bc:
            s9a r1 = defpackage.x3b.c
            r1 = 21
            if (r0 != r1) goto L_0x09dc
            l6f r0 = new l6f
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x09d1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x09d1:
            java.util.Map r1 = r0.o
            if (r1 != 0) goto L_0x09db
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.o = r1
        L_0x09db:
            return r0
        L_0x09dc:
            s9a r1 = defpackage.x3b.c
            r1 = 22
            if (r0 != r1) goto L_0x09e8
            me3 r0 = new me3
            r0.<init>(r9)
            return r0
        L_0x09e8:
            s9a r1 = defpackage.x3b.c
            r1 = 68
            if (r0 != r1) goto L_0x09fe
            mp2 r0 = new mp2
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x09fd
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x09fd:
            return r0
        L_0x09fe:
            s9a r1 = defpackage.x3b.c
            r1 = 73
            if (r0 != r1) goto L_0x0a14
            bw9 r0 = new bw9
            r0.<init>(r9)
            java.util.List r1 = r0.c
            if (r1 != 0) goto L_0x0a13
            java.util.List r1 = java.util.Collections.emptyList()
            r0.c = r1
        L_0x0a13:
            return r0
        L_0x0a14:
            s9a r1 = defpackage.x3b.c
            r1 = 31
            if (r0 != r1) goto L_0x0a1b
            return r5
        L_0x0a1b:
            s9a r1 = defpackage.x3b.c
            r1 = 70
            if (r0 != r1) goto L_0x0a27
            kw9 r0 = new kw9
            r0.<init>(r9)
            return r0
        L_0x0a27:
            s9a r1 = defpackage.x3b.c
            r1 = 83
            if (r0 != r1) goto L_0x0a3d
            k7g r0 = new k7g
            r0.<init>(r9)
            java.util.Map r1 = r0.c
            if (r1 != 0) goto L_0x0a3c
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.c = r1
        L_0x0a3c:
            return r0
        L_0x0a3d:
            s9a r1 = defpackage.x3b.c
            r1 = 86
            if (r0 != r1) goto L_0x0a49
            tl2 r0 = new tl2
            r0.<init>(r9)
            return r0
        L_0x0a49:
            s9a r1 = defpackage.x3b.c
            r1 = 82
            if (r0 != r1) goto L_0x0a55
            b9g r0 = new b9g
            r0.<init>(r9)
            return r0
        L_0x0a55:
            s9a r1 = defpackage.x3b.c
            r1 = 51
            if (r0 != r1) goto L_0x0a61
            bd2 r0 = new bd2
            r0.<init>(r9)
            return r0
        L_0x0a61:
            s9a r1 = defpackage.x3b.c
            r1 = 96
            if (r0 != r1) goto L_0x0a6d
            uxd r0 = new uxd
            r0.<init>(r9)
            return r0
        L_0x0a6d:
            s9a r1 = defpackage.x3b.c
            r1 = 97
            if (r0 != r1) goto L_0x0a79
            sxd r0 = new sxd
            r0.<init>(r9)
            return r0
        L_0x0a79:
            s9a r1 = defpackage.x3b.c
            r1 = 98
            if (r0 != r1) goto L_0x0a85
            tdb r0 = new tdb
            r0.<init>(r9)
            return r0
        L_0x0a85:
            s9a r1 = defpackage.x3b.c
            r1 = 99
            if (r0 != r1) goto L_0x0a91
            sdb r0 = new sdb
            r0.<init>(r9)
            return r0
        L_0x0a91:
            s9a r1 = defpackage.x3b.c
            r1 = 25
            if (r0 != r1) goto L_0x0a9e
            mz4 r0 = defpackage.mz4.v
            ibf r0 = r0.p(r9)
            return r0
        L_0x0a9e:
            s9a r1 = defpackage.x3b.c
            if (r0 != r2) goto L_0x0aab
            ovc r0 = new ovc
            r0.<init>(r9)
            r1 = 1
            r0.o = r1
            return r0
        L_0x0aab:
            s9a r1 = defpackage.x3b.c
            if (r0 != r3) goto L_0x0ab5
            g94 r0 = new g94
            r0.<init>(r9)
            return r0
        L_0x0ab5:
            s9a r1 = defpackage.x3b.c
            r1 = 5
            if (r0 != r1) goto L_0x0abb
            return r5
        L_0x0abb:
            s9a r1 = defpackage.x3b.c
            r1 = 53
            if (r0 != r1) goto L_0x0ac7
            ys2 r0 = new ys2
            r0.<init>(r9)
            return r0
        L_0x0ac7:
            s9a r1 = defpackage.x3b.c
            r1 = 26
            if (r0 != r1) goto L_0x0ad3
            fu r0 = new fu
            r0.<init>(r9)
            return r0
        L_0x0ad3:
            s9a r1 = defpackage.x3b.c
            r1 = 27
            if (r0 != r1) goto L_0x0adf
            qu r0 = new qu
            r0.<init>(r9)
            return r0
        L_0x0adf:
            s9a r1 = defpackage.x3b.c
            r1 = 28
            if (r0 != r1) goto L_0x0aeb
            du r0 = new du
            r0.<init>(r9)
            return r0
        L_0x0aeb:
            s9a r1 = defpackage.x3b.c
            r1 = 71
            if (r0 != r1) goto L_0x0af7
            qv9 r0 = new qv9
            r0.<init>(r9)
            return r0
        L_0x0af7:
            s9a r1 = defpackage.x3b.c
            r1 = 74
            if (r0 != r1) goto L_0x0b03
            uq6 r0 = new uq6
            r0.<init>(r9)
            return r0
        L_0x0b03:
            s9a r1 = defpackage.x3b.c
            r1 = 6
            if (r0 != r1) goto L_0x0b0e
            nwd r0 = new nwd
            r0.<init>(r9)
            return r0
        L_0x0b0e:
            s9a r1 = defpackage.x3b.c
            r1 = 56
            if (r0 != r1) goto L_0x0b15
            return r5
        L_0x0b15:
            s9a r1 = defpackage.x3b.c
            r1 = 55
            if (r0 != r1) goto L_0x0b21
            xr2 r0 = new xr2
            r0.<init>(r9)
            return r0
        L_0x0b21:
            s9a r1 = defpackage.x3b.c
            r1 = 57
            if (r0 != r1) goto L_0x0b2d
            za2 r0 = new za2
            r0.<init>(r9)
            return r0
        L_0x0b2d:
            s9a r1 = defpackage.x3b.c
            r1 = 59
            if (r0 != r1) goto L_0x0b39
            jj2 r0 = new jj2
            r0.<init>(r9)
            return r0
        L_0x0b39:
            s9a r1 = defpackage.x3b.c
            r1 = 60
            if (r0 != r1) goto L_0x0b45
            aac r0 = new aac
            r0.<init>(r9)
            return r0
        L_0x0b45:
            s9a r1 = defpackage.x3b.c
            r1 = 58
            if (r0 != r1) goto L_0x0b4c
            return r5
        L_0x0b4c:
            s9a r1 = defpackage.x3b.c
            r1 = 61
            if (r0 != r1) goto L_0x0b53
            return r5
        L_0x0b53:
            s9a r1 = defpackage.x3b.c
            r1 = 63
            if (r0 != r1) goto L_0x0b5f
            t62 r0 = new t62
            r0.<init>(r9)
            return r0
        L_0x0b5f:
            s9a r1 = defpackage.x3b.c
            r1 = 77
            if (r0 != r1) goto L_0x0b6b
            ck2 r0 = new ck2
            r0.<init>(r9)
            return r0
        L_0x0b6b:
            s9a r1 = defpackage.x3b.c
            r1 = 75
            if (r0 != r1) goto L_0x0b72
            return r5
        L_0x0b72:
            x3b r1 = defpackage.x3b.VIDEO_CHAT_START
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0b80
            uk1 r0 = new uk1
            r0.<init>(r9)
            return r0
        L_0x0b80:
            x3b r1 = defpackage.x3b.NOTIF_CALL_START
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0b8e
            saa r0 = new saa
            r0.<init>(r9)
            return r0
        L_0x0b8e:
            x3b r1 = defpackage.x3b.FILE_UPLOAD
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0b9c
            rn5 r0 = new rn5
            r0.<init>(r9)
            return r0
        L_0x0b9c:
            x3b r1 = defpackage.x3b.FILE_DOWNLOAD
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0baa
            am5 r0 = new am5
            r0.<init>(r9)
            return r0
        L_0x0baa:
            x3b r1 = defpackage.x3b.NOTIF_CONTACT_SORT
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0bb8
            aba r0 = new aba
            r0.<init>(r9)
            return r0
        L_0x0bb8:
            x3b r1 = defpackage.x3b.LINK_INFO
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0bc6
            mw7 r0 = new mw7
            r0.<init>(r9)
            return r0
        L_0x0bc6:
            x3b r1 = defpackage.x3b.CONTACT_VERIFY
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0bd4
            vs3 r0 = new vs3
            r0.<init>(r9)
            return r0
        L_0x0bd4:
            x3b r1 = defpackage.x3b.REMOVE_CONTACT_PHOTO
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0be2
            h1d r0 = new h1d
            r0.<init>(r9)
            return r0
        L_0x0be2:
            x3b r1 = defpackage.x3b.VIDEO_CHAT_HISTORY
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0bf0
            u3g r0 = new u3g
            r0.<init>(r9)
            return r0
        L_0x0bf0:
            x3b r1 = defpackage.x3b.NOTIF_MSG_DELETE_RANGE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0bfe
            xba r0 = new xba
            r0.<init>(r9)
            return r0
        L_0x0bfe:
            x3b r1 = defpackage.x3b.MSG_DELETE_RANGE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c0b
            mv9 r0 = defpackage.mv9.d(r9)
            return r0
        L_0x0c0b:
            x3b r1 = defpackage.x3b.NOTIF_MSG_DELETE
            short r2 = r1.c()
            if (r0 != r2) goto L_0x0c1c
            c43 r0 = r1.a()
            ibf r0 = r0.p(r9)
            return r0
        L_0x0c1c:
            x3b r1 = defpackage.x3b.NOTIF_MSG_REACTIONS_CHANGED
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c29
            zba r0 = defpackage.zba.d(r9)
            return r0
        L_0x0c29:
            x3b r1 = defpackage.x3b.NOTIF_MSG_YOU_REACTED
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c37
            bca r0 = new bca
            r0.<init>(r9)
            return r0
        L_0x0c37:
            x3b r1 = defpackage.x3b.CONFIRM_PRESENT
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c40
            return r5
        L_0x0c40:
            x3b r1 = defpackage.x3b.CHAT_COMPLAIN
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c49
            return r5
        L_0x0c49:
            x3b r1 = defpackage.x3b.MSG_SEND_CALLBACK
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c57
            ew9 r0 = new ew9
            r0.<init>(r9)
            return r0
        L_0x0c57:
            x3b r1 = defpackage.x3b.NOTIF_CALLBACK_ANSWER
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c65
            taa r0 = new taa
            r0.<init>(r9)
            return r0
        L_0x0c65:
            x3b r1 = defpackage.x3b.CHAT_BOT_COMMANDS
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c73
            d42 r0 = new d42
            r0.<init>(r9)
            return r0
        L_0x0c73:
            x3b r1 = defpackage.x3b.BOT_INFO
            short r2 = r1.c()
            if (r0 != r2) goto L_0x0c84
            c43 r0 = r1.a()
            ibf r0 = r0.p(r9)
            return r0
        L_0x0c84:
            x3b r1 = defpackage.x3b.LOCATION_SEND
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c8d
            return r5
        L_0x0c8d:
            x3b r1 = defpackage.x3b.LOCATION_STOP
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0c9b
            n68 r0 = new n68
            r0.<init>(r9)
            return r0
        L_0x0c9b:
            x3b r1 = defpackage.x3b.LOCATION_REQUEST
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0ca9
            a68 r0 = new a68
            r0.<init>(r9)
            return r0
        L_0x0ca9:
            x3b r1 = defpackage.x3b.NOTIF_LOCATION_REQUEST
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0cb2
            return r5
        L_0x0cb2:
            x3b r1 = defpackage.x3b.NOTIF_LOCATION
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0cc0
            gba r0 = new gba
            r0.<init>(r9)
            return r0
        L_0x0cc0:
            x3b r1 = defpackage.x3b.GET_LAST_MENTIONS
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0ccf
            uq6 r0 = new uq6
            r1 = 1
            r0.<init>(r9, r1)
            return r0
        L_0x0ccf:
            x3b r1 = defpackage.x3b.GET_INBOUND_CALLS
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0cde
            uq6 r0 = new uq6
            r1 = 0
            r0.<init>(r9, r1)
            return r0
        L_0x0cde:
            x3b r1 = defpackage.x3b.CALLS_TOKEN
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0ceb
            ml1 r0 = defpackage.nl1.a(r9)
            return r0
        L_0x0ceb:
            x3b r1 = defpackage.x3b.NOTIF_ASSETS_UPDATE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0cf9
            qaa r0 = new qaa
            r0.<init>(r9)
            return r0
        L_0x0cf9:
            x3b r1 = defpackage.x3b.ASSETS_LIST_MODIFY
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d07
            hu r0 = new hu
            r0.<init>(r9)
            return r0
        L_0x0d07:
            x3b r1 = defpackage.x3b.ASSETS_REMOVE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d15
            nu r0 = new nu
            r0.<init>(r9)
            return r0
        L_0x0d15:
            x3b r1 = defpackage.x3b.ASSETS_MOVE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d23
            ku r0 = new ku
            r0.<init>(r9)
            return r0
        L_0x0d23:
            x3b r1 = defpackage.x3b.ASSETS_ADD
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d31
            zt r0 = new zt
            r0.<init>(r9)
            return r0
        L_0x0d31:
            x3b r1 = defpackage.x3b.STICKER_CREATE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d3f
            noe r0 = new noe
            r0.<init>(r9)
            return r0
        L_0x0d3f:
            x3b r1 = defpackage.x3b.STICKER_UPLOAD
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d4d
            wre r0 = new wre
            r0.<init>(r9)
            return r0
        L_0x0d4d:
            x3b r1 = defpackage.x3b.STICKER_SUGGEST
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d5b
            tre r0 = new tre
            r0.<init>(r9)
            return r0
        L_0x0d5b:
            x3b r1 = defpackage.x3b.NOTIF_DRAFT
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d69
            cba r0 = new cba
            r0.<init>(r9)
            return r0
        L_0x0d69:
            x3b r1 = defpackage.x3b.NOTIF_DRAFT_DISCARD
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d77
            dba r0 = new dba
            r0.<init>(r9)
            return r0
        L_0x0d77:
            x3b r1 = defpackage.x3b.DRAFT_SAVE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d85
            wt4 r0 = new wt4
            r0.<init>(r9)
            return r0
        L_0x0d85:
            x3b r1 = defpackage.x3b.DRAFT_DISCARD
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d8e
            return r5
        L_0x0d8e:
            x3b r1 = defpackage.x3b.CHAT_HIDE
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0d97
            return r5
        L_0x0d97:
            x3b r1 = defpackage.x3b.VIDEO_CHAT_MEMBERS
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0da5
            w3g r0 = new w3g
            r0.<init>(r9)
            return r0
        L_0x0da5:
            x3b r1 = defpackage.x3b.CHAT_SEARCH_COMMON_PARTICIPANTS
            short r1 = r1.c()
            if (r0 != r1) goto L_0x0db2
            op2 r0 = defpackage.op2.d(r9)
            return r0
        L_0x0db2:
            x3b r1 = defpackage.x3b.NOTIF_MSG_DELAYED
            short r2 = r1.c()
            if (r0 != r2) goto L_0x0dc3
            c43 r0 = r1.a()
            ibf r0 = r0.p(r9)
            return r0
        L_0x0dc3:
            x3b r1 = defpackage.x3b.PROFILE_DELETE
            short r2 = r1.c()
            if (r0 != r2) goto L_0x0dd4
            c43 r0 = r1.a()
            ibf r0 = r0.p(r9)
            return r0
        L_0x0dd4:
            x3b r1 = defpackage.x3b.PROFILE_DELETE_TIME
            short r2 = r1.c()
            if (r0 != r2) goto L_0x0de5
            c43 r0 = r1.a()
            ibf r0 = r0.p(r9)
            return r0
        L_0x0de5:
            x3b r1 = defpackage.x3b.WEB_APP_INIT_DATA
            short r2 = r1.c()
            if (r0 != r2) goto L_0x0df6
            c43 r0 = r1.a()
            ibf r0 = r0.p(r9)
            return r0
        L_0x0df6:
            x3b r1 = defpackage.x3b.EXTERNAL_CALLBACK
            short r2 = r1.c()
            if (r0 != r2) goto L_0x0e07
            c43 r0 = r1.a()
            ibf r0 = r0.p(r9)
            return r0
        L_0x0e07:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibf.b(short, byte[]):ibf");
    }

    public void c(pf9 pf9, String str) {
    }

    public ibf(pf9 pf9) {
        try {
            long nanoTime = System.nanoTime();
            if (pf9.m()) {
                int y0 = pf9.y0();
                for (int i = 0; i < y0; i++) {
                    c(pf9, pf9.A0());
                }
            }
            this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - nanoTime));
        } catch (Exception e) {
            z68.f("ibf", "failed to parse unpacker response: ", e);
            throw new RuntimeException(e);
        }
    }
}
