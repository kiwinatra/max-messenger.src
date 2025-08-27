package defpackage;

/* renamed from: qd9  reason: default package */
public abstract class qd9 {
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        if (r9 == null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010d, code lost:
        r9 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x010e, code lost:
        r8 = new defpackage.nd9(r8, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.rd9 a(defpackage.pf9 r13) {
        /*
            r0 = 1
            java.lang.String r1 = ""
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r4 = 0
            int r5 = defpackage.ryg.e0(r13)     // Catch:{ all -> 0x000d }
            goto L_0x003e
        L_0x000d:
            r5 = move-exception
            defpackage.z68.o(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r6 = defpackage.ytd.a
            java.util.Iterator r6 = r6.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0027
            java.lang.Object r7 = r6.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r5)
            goto L_0x0017
        L_0x0027:
            gga r6 = defpackage.xtd.a
            r6.getClass()
            xtd r6 = defpackage.xtd.b
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x003d
            if (r6 == r0) goto L_0x003c
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x003c:
            throw r5
        L_0x003d:
            r5 = r4
        L_0x003e:
            kotlin.jvm.internal.Ref$LongRef r6 = new kotlin.jvm.internal.Ref$LongRef
            r6.<init>()
            r7 = 0
            r8 = r7
        L_0x0045:
            if (r4 >= r5) goto L_0x014e
            java.lang.String r9 = defpackage.ryg.g0(r13)     // Catch:{ all -> 0x004c }
            goto L_0x007d
        L_0x004c:
            r9 = move-exception
            defpackage.z68.o(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a
            java.util.Iterator r10 = r10.iterator()
        L_0x0056:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0066
            java.lang.Object r11 = r10.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r9)
            goto L_0x0056
        L_0x0066:
            gga r10 = defpackage.xtd.a
            r10.getClass()
            xtd r10 = defpackage.xtd.b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x007c
            if (r10 == r0) goto L_0x007b
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x007b:
            throw r9
        L_0x007c:
            r9 = r7
        L_0x007d:
            java.lang.String r10 = "userId"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x00cc
            r9 = 0
            java.lang.Long r11 = java.lang.Long.valueOf(r9)
            long r9 = defpackage.ryg.d0(r13, r9)     // Catch:{ all -> 0x0094 }
            java.lang.Long r11 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0094 }
            goto L_0x00c4
        L_0x0094:
            r9 = move-exception
            defpackage.z68.o(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a
            java.util.Iterator r10 = r10.iterator()
        L_0x009e:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00ae
            java.lang.Object r12 = r10.next()
            xm r12 = (defpackage.xm) r12
            r12.a(r9)
            goto L_0x009e
        L_0x00ae:
            gga r10 = defpackage.xtd.a
            r10.getClass()
            xtd r10 = defpackage.xtd.b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x00c4
            if (r10 == r0) goto L_0x00c3
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x00c3:
            throw r9
        L_0x00c4:
            long r9 = r11.longValue()
            r6.element = r9
            goto L_0x014b
        L_0x00cc:
            java.lang.String r10 = "reaction"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0115
            vd9 r8 = defpackage.vd9.EMOJI
            java.lang.String r9 = defpackage.ryg.g0(r13)     // Catch:{ all -> 0x00dd }
            if (r9 != 0) goto L_0x010e
            goto L_0x010d
        L_0x00dd:
            r9 = move-exception
            defpackage.z68.o(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a
            java.util.Iterator r10 = r10.iterator()
        L_0x00e7:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f7
            java.lang.Object r11 = r10.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r9)
            goto L_0x00e7
        L_0x00f7:
            gga r10 = defpackage.xtd.a
            r10.getClass()
            xtd r10 = defpackage.xtd.b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x010d
            if (r10 == r0) goto L_0x010c
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x010c:
            throw r9
        L_0x010d:
            r9 = r1
        L_0x010e:
            nd9 r10 = new nd9
            r10.<init>(r8, r9)
            r8 = r10
            goto L_0x014b
        L_0x0115:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            r13.A()     // Catch:{ all -> 0x011b }
            goto L_0x014b
        L_0x011b:
            r9 = move-exception
            defpackage.z68.o(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r10 = defpackage.ytd.a
            java.util.Iterator r10 = r10.iterator()
        L_0x0125:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0135
            java.lang.Object r11 = r10.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r9)
            goto L_0x0125
        L_0x0135:
            gga r10 = defpackage.xtd.a
            r10.getClass()
            xtd r10 = defpackage.xtd.b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L_0x014b
            if (r10 == r0) goto L_0x014a
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        L_0x014a:
            throw r9
        L_0x014b:
            int r4 = r4 + r0
            goto L_0x0045
        L_0x014e:
            rd9 r13 = new rd9
            long r0 = r6.element
            if (r8 == 0) goto L_0x0158
            r13.<init>(r0, r8)
            return r13
        L_0x0158:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "reaction is null"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd9.a(pf9):rd9");
    }
}
