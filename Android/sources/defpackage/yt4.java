package defpackage;

/* renamed from: yt4  reason: default package */
public abstract class yt4 {
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r0.isEmpty() == false) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0176, code lost:
        if (r0.isEmpty() == false) goto L_0x01a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.zt4 a(defpackage.pf9 r18) {
        /*
            r1 = r18
            r2 = 1
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            int r0 = defpackage.ryg.e0(r18)     // Catch:{ all -> 0x000d }
            r6 = r0
            goto L_0x003f
        L_0x000d:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0028
            java.lang.Object r7 = r0.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r6)
            goto L_0x0018
        L_0x0028:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x003e
            if (r0 == r2) goto L_0x003d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003d:
            throw r6
        L_0x003e:
            r6 = 0
        L_0x003f:
            r7 = 0
            if (r6 != 0) goto L_0x0043
            return r7
        L_0x0043:
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r10 = 0
        L_0x004e:
            if (r10 >= r6) goto L_0x01e6
            java.lang.String r0 = defpackage.ryg.g0(r18)     // Catch:{ all -> 0x0055 }
            goto L_0x0087
        L_0x0055:
            r0 = move-exception
            r11 = r0
            defpackage.z68.o(r4, r3, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0060:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0070
            java.lang.Object r12 = r0.next()
            xm r12 = (defpackage.xm) r12
            r12.a(r11)
            goto L_0x0060
        L_0x0070:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0086
            if (r0 == r2) goto L_0x0085
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0085:
            throw r11
        L_0x0086:
            r0 = r7
        L_0x0087:
            if (r0 != 0) goto L_0x008b
            goto L_0x01e3
        L_0x008b:
            java.lang.String r11 = "discarded"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r11)
            r12 = 8
            r13 = 0
            if (r11 == 0) goto L_0x0104
            hb9 r0 = r18.n()     // Catch:{ all -> 0x00cf }
            int r0 = r0.a()     // Catch:{ all -> 0x00cf }
            if (r0 != r12) goto L_0x00c2
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            int r11 = r18.y0()     // Catch:{ all -> 0x00cf }
            r12 = 0
        L_0x00ab:
            if (r12 >= r11) goto L_0x00c6
            long r15 = defpackage.ryg.d0(r1, r13)     // Catch:{ all -> 0x00cf }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00cf }
            long r16 = defpackage.ryg.d0(r1, r13)     // Catch:{ all -> 0x00cf }
            java.lang.Long r5 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x00cf }
            r0.put(r15, r5)     // Catch:{ all -> 0x00cf }
            int r12 = r12 + r2
            goto L_0x00ab
        L_0x00c2:
            r18.A()     // Catch:{ all -> 0x00cf }
            r0 = r7
        L_0x00c6:
            if (r0 == 0) goto L_0x00ff
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x00cf }
            if (r5 == 0) goto L_0x0100
            goto L_0x00ff
        L_0x00cf:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ytd.a
            java.util.Iterator r5 = r5.iterator()
        L_0x00d9:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x00e9
            java.lang.Object r11 = r5.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r0)
            goto L_0x00d9
        L_0x00e9:
            gga r5 = defpackage.xtd.a
            r5.getClass()
            xtd r5 = defpackage.xtd.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x00ff
            if (r5 == r2) goto L_0x00fe
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00fe:
            throw r0
        L_0x00ff:
            r0 = r7
        L_0x0100:
            r8.element = r0
            goto L_0x01e3
        L_0x0104:
            java.lang.String r5 = "saved"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 == 0) goto L_0x01ac
            hb9 r0 = r18.n()     // Catch:{ all -> 0x016a }
            int r0 = r0.a()     // Catch:{ all -> 0x016a }
            if (r0 != r12) goto L_0x0133
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x016a }
            r0.<init>()     // Catch:{ all -> 0x016a }
            int r5 = r18.y0()     // Catch:{ all -> 0x016a }
            r11 = 0
        L_0x0120:
            if (r11 >= r5) goto L_0x0137
            long r15 = defpackage.ryg.d0(r1, r13)     // Catch:{ all -> 0x016a }
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x016a }
            qtd r15 = defpackage.ptd.a(r18)     // Catch:{ all -> 0x016a }
            r0.put(r12, r15)     // Catch:{ all -> 0x016a }
            int r11 = r11 + r2
            goto L_0x0120
        L_0x0133:
            r18.A()     // Catch:{ all -> 0x016a }
            r0 = r7
        L_0x0137:
            if (r0 == 0) goto L_0x01a8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x016a }
            r5.<init>()     // Catch:{ all -> 0x016a }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x016a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x016a }
        L_0x0146:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x016a }
            if (r11 == 0) goto L_0x016c
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x016a }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x016a }
            java.lang.Object r12 = r11.getValue()     // Catch:{ all -> 0x016a }
            qtd r12 = (defpackage.qtd) r12     // Catch:{ all -> 0x016a }
            if (r12 != 0) goto L_0x015c
            r11 = r7
            goto L_0x0164
        L_0x015c:
            java.lang.Object r11 = r11.getKey()     // Catch:{ all -> 0x016a }
            kotlin.Pair r11 = kotlin.TuplesKt.to(r11, r12)     // Catch:{ all -> 0x016a }
        L_0x0164:
            if (r11 == 0) goto L_0x0146
            r5.add(r11)     // Catch:{ all -> 0x016a }
            goto L_0x0146
        L_0x016a:
            r0 = move-exception
            goto L_0x0179
        L_0x016c:
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r5)     // Catch:{ all -> 0x016a }
            if (r0 == 0) goto L_0x01a8
            boolean r5 = r0.isEmpty()     // Catch:{ all -> 0x016a }
            if (r5 == 0) goto L_0x01a9
            goto L_0x01a8
        L_0x0179:
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ytd.a
            java.util.Iterator r5 = r5.iterator()
        L_0x0182:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0192
            java.lang.Object r11 = r5.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r0)
            goto L_0x0182
        L_0x0192:
            gga r5 = defpackage.xtd.a
            r5.getClass()
            xtd r5 = defpackage.xtd.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x01a8
            if (r5 == r2) goto L_0x01a7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01a7:
            throw r0
        L_0x01a8:
            r0 = r7
        L_0x01a9:
            r9.element = r0
            goto L_0x01e3
        L_0x01ac:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r18.A()     // Catch:{ all -> 0x01b2 }
            goto L_0x01e3
        L_0x01b2:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01bd:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x01cd
            java.lang.Object r11 = r0.next()
            xm r11 = (defpackage.xm) r11
            r11.a(r5)
            goto L_0x01bd
        L_0x01cd:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01e3
            if (r0 == r2) goto L_0x01e2
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01e2:
            throw r5
        L_0x01e3:
            int r10 = r10 + r2
            goto L_0x004e
        L_0x01e6:
            zt4 r0 = new zt4
            T r1 = r8.element
            java.util.Map r1 = (java.util.Map) r1
            T r2 = r9.element
            java.util.Map r2 = (java.util.Map) r2
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt4.a(pf9):zt4");
    }
}
