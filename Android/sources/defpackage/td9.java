package defpackage;

/* renamed from: td9  reason: default package */
public abstract class td9 {
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0147, code lost:
        if (r11 == null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017a, code lost:
        r11 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x017b, code lost:
        r10 = new defpackage.nd9(r10, r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ud9 a(defpackage.pf9 r15) {
        /*
            r0 = 1
            java.lang.String r1 = ""
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r4 = 0
            int r5 = defpackage.ryg.e0(r15)     // Catch:{ all -> 0x000d }
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
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x003c:
            throw r5
        L_0x003d:
            r5 = r4
        L_0x003e:
            r6 = 0
            if (r5 != 0) goto L_0x0042
            return r6
        L_0x0042:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            kotlin.jvm.internal.Ref$IntRef r8 = new kotlin.jvm.internal.Ref$IntRef
            r8.<init>()
            r9 = r4
            r10 = r6
        L_0x004e:
            if (r9 >= r5) goto L_0x01bb
            java.lang.String r11 = defpackage.ryg.g0(r15)     // Catch:{ all -> 0x0055 }
            goto L_0x0086
        L_0x0055:
            r11 = move-exception
            defpackage.z68.o(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.ytd.a
            java.util.Iterator r12 = r12.iterator()
        L_0x005f:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x006f
            java.lang.Object r13 = r12.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r11)
            goto L_0x005f
        L_0x006f:
            gga r12 = defpackage.xtd.a
            r12.getClass()
            xtd r12 = defpackage.xtd.b
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x0085
            if (r12 == r0) goto L_0x0084
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x0084:
            throw r11
        L_0x0085:
            r11 = r6
        L_0x0086:
            if (r11 == 0) goto L_0x0182
            int r12 = r11.hashCode()
            r13 = -1370485892(0xffffffffae500b7c, float:-4.7303925E-11)
            if (r12 == r13) goto L_0x0138
            r13 = -731385813(0xffffffffd467f02b, float:-3.98466718E12)
            if (r12 == r13) goto L_0x00e9
            r13 = -372020745(0xffffffffe9d369f7, float:-3.194797E25)
            if (r12 == r13) goto L_0x009d
            goto L_0x0182
        L_0x009d:
            java.lang.String r12 = "counters"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00a7
            goto L_0x0182
        L_0x00a7:
            int r11 = defpackage.ryg.X(r15)     // Catch:{ all -> 0x00ac }
            goto L_0x00dd
        L_0x00ac:
            r11 = move-exception
            defpackage.z68.o(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.ytd.a
            java.util.Iterator r12 = r12.iterator()
        L_0x00b6:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c6
            java.lang.Object r13 = r12.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r11)
            goto L_0x00b6
        L_0x00c6:
            gga r12 = defpackage.xtd.a
            r12.getClass()
            xtd r12 = defpackage.xtd.b
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x00dc
            if (r12 == r0) goto L_0x00db
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x00db:
            throw r11
        L_0x00dc:
            r11 = r4
        L_0x00dd:
            r12 = r4
        L_0x00de:
            if (r12 >= r11) goto L_0x01b8
            pd9 r13 = defpackage.od9.a(r15)
            r7.add(r13)
            int r12 = r12 + r0
            goto L_0x00de
        L_0x00e9:
            java.lang.String r12 = "totalCount"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x00f3
            goto L_0x0182
        L_0x00f3:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            int r12 = defpackage.ryg.c0(r15)     // Catch:{ all -> 0x0100 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0100 }
            goto L_0x0130
        L_0x0100:
            r12 = move-exception
            defpackage.z68.o(r3, r2, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.ytd.a
            java.util.Iterator r13 = r13.iterator()
        L_0x010a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x011a
            java.lang.Object r14 = r13.next()
            xm r14 = (defpackage.xm) r14
            r14.a(r12)
            goto L_0x010a
        L_0x011a:
            gga r13 = defpackage.xtd.a
            r13.getClass()
            xtd r13 = defpackage.xtd.b
            int r13 = r13.ordinal()
            if (r13 == 0) goto L_0x0130
            if (r13 == r0) goto L_0x012f
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x012f:
            throw r12
        L_0x0130:
            int r11 = r11.intValue()
            r8.element = r11
            goto L_0x01b8
        L_0x0138:
            java.lang.String r12 = "yourReaction"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0141
            goto L_0x0182
        L_0x0141:
            vd9 r10 = defpackage.vd9.EMOJI
            java.lang.String r11 = defpackage.ryg.g0(r15)     // Catch:{ all -> 0x014a }
            if (r11 != 0) goto L_0x017b
            goto L_0x017a
        L_0x014a:
            r11 = move-exception
            defpackage.z68.o(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.ytd.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0154:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0164
            java.lang.Object r13 = r12.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r11)
            goto L_0x0154
        L_0x0164:
            gga r12 = defpackage.xtd.a
            r12.getClass()
            xtd r12 = defpackage.xtd.b
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x017a
            if (r12 == r0) goto L_0x0179
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x0179:
            throw r11
        L_0x017a:
            r11 = r1
        L_0x017b:
            nd9 r12 = new nd9
            r12.<init>(r10, r11)
            r10 = r12
            goto L_0x01b8
        L_0x0182:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            r15.A()     // Catch:{ all -> 0x0188 }
            goto L_0x01b8
        L_0x0188:
            r11 = move-exception
            defpackage.z68.o(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.ytd.a
            java.util.Iterator r12 = r12.iterator()
        L_0x0192:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x01a2
            java.lang.Object r13 = r12.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r11)
            goto L_0x0192
        L_0x01a2:
            gga r12 = defpackage.xtd.a
            r12.getClass()
            xtd r12 = defpackage.xtd.b
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x01b8
            if (r12 == r0) goto L_0x01b7
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L_0x01b7:
            throw r11
        L_0x01b8:
            int r9 = r9 + r0
            goto L_0x004e
        L_0x01bb:
            ud9 r15 = new ud9
            int r0 = r8.element
            r15.<init>(r7, r0, r10)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.td9.a(pf9):ud9");
    }
}
