package defpackage;

/* renamed from: qba  reason: default package */
public final class qba implements c43 {
    public static final qba a = new Object();

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, wv9] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01f9, code lost:
        r7 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ibf p(defpackage.pf9 r20) {
        /*
            r19 = this;
            r1 = r20
            r2 = 1
            java.lang.String r3 = "payloadCatching catch error"
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            java.lang.String r0 = "NotifMsgDelayedCmd"
            java.lang.String r5 = "response"
            defpackage.z68.c(r0, r5, new java.lang.Object[0])
            int r0 = defpackage.ryg.e0(r20)     // Catch:{ all -> 0x0014 }
            r6 = r0
            goto L_0x0046
        L_0x0014:
            r0 = move-exception
            r6 = r0
            defpackage.z68.o(r4, r3, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x001f:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x002f
            java.lang.Object r7 = r0.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r6)
            goto L_0x001f
        L_0x002f:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0045
            if (r0 == r2) goto L_0x0044
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0044:
            throw r6
        L_0x0045:
            r6 = 0
        L_0x0046:
            r7 = 0
            if (r6 != 0) goto L_0x004a
            return r7
        L_0x004a:
            pba r0 = defpackage.pba.UNKNOWN
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            java.util.Set r9 = kotlin.collections.SetsKt.emptySet()
            r8.element = r9
            r9 = 0
            r16 = r0
            r17 = r7
            r12 = r9
            r14 = r12
            r11 = 0
        L_0x0060:
            if (r11 >= r6) goto L_0x0242
            java.lang.String r0 = defpackage.ryg.g0(r20)     // Catch:{ all -> 0x0067 }
            goto L_0x009c
        L_0x0067:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0072:
            boolean r18 = r0.hasNext()
            if (r18 == 0) goto L_0x0085
            java.lang.Object r18 = r0.next()
            r7 = r18
            xm r7 = (defpackage.xm) r7
            r7.a(r5)
            r7 = 0
            goto L_0x0072
        L_0x0085:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x009b
            if (r0 == r2) goto L_0x009a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x009a:
            throw r5
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r0 != 0) goto L_0x00a1
        L_0x009e:
            r7 = r2
            goto L_0x023d
        L_0x00a1:
            int r5 = r0.hashCode()
            switch(r5) {
                case -1690743503: goto L_0x01b9;
                case -1361631597: goto L_0x0172;
                case -907060194: goto L_0x00fb;
                case -836030906: goto L_0x00b9;
                case 954925063: goto L_0x00aa;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            goto L_0x01c1
        L_0x00aa:
            java.lang.String r5 = "message"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00b4
            goto L_0x01c1
        L_0x00b4:
            b89 r17 = defpackage.z79.a(r20)
            goto L_0x009e
        L_0x00b9:
            java.lang.String r5 = "userId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00c3
            goto L_0x01c1
        L_0x00c3:
            long r14 = defpackage.ryg.d0(r1, r9)     // Catch:{ all -> 0x00c8 }
            goto L_0x009e
        L_0x00c8:
            r0 = move-exception
            r5 = r0
            defpackage.z68.o(r4, r3, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00d3:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x00e3
            java.lang.Object r7 = r0.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r5)
            goto L_0x00d3
        L_0x00e3:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00f9
            if (r0 == r2) goto L_0x00f8
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00f8:
            throw r5
        L_0x00f9:
            r14 = r9
            goto L_0x009e
        L_0x00fb:
            java.lang.String r5 = "updateTypeId"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0105
            goto L_0x01c1
        L_0x0105:
            djd r5 = defpackage.pba.b
            java.lang.Byte r0 = defpackage.ryg.Z(r20)     // Catch:{ all -> 0x010c }
            goto L_0x0142
        L_0x010c:
            r0 = move-exception
            r7 = r0
            defpackage.z68.o(r4, r3, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0117:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x012b
            java.lang.Object r16 = r0.next()
            r9 = r16
            xm r9 = (defpackage.xm) r9
            r9.a(r7)
            r9 = 0
            goto L_0x0117
        L_0x012b:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x0141
            if (r0 == r2) goto L_0x0140
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0140:
            throw r7
        L_0x0141:
            r0 = 0
        L_0x0142:
            r5.getClass()
            if (r0 != 0) goto L_0x014c
            pba r0 = defpackage.pba.UNKNOWN
            r16 = r0
            goto L_0x016d
        L_0x014c:
            pba[] r5 = defpackage.pba.values()
            int r7 = r5.length
            r9 = 0
        L_0x0152:
            if (r9 >= r7) goto L_0x0166
            r10 = r5[r9]
            byte r2 = r10.a
            r16 = r5
            byte r5 = r0.byteValue()
            if (r2 != r5) goto L_0x0161
            goto L_0x0167
        L_0x0161:
            r2 = 1
            int r9 = r9 + r2
            r5 = r16
            goto L_0x0152
        L_0x0166:
            r10 = 0
        L_0x0167:
            if (r10 != 0) goto L_0x016b
            pba r10 = defpackage.pba.UNKNOWN
        L_0x016b:
            r16 = r10
        L_0x016d:
            r7 = 1
            r9 = 0
            goto L_0x023d
        L_0x0172:
            java.lang.String r2 = "chatId"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x017d
            r9 = 0
            goto L_0x01c1
        L_0x017d:
            r9 = 0
            long r12 = defpackage.ryg.d0(r1, r9)     // Catch:{ all -> 0x0185 }
            goto L_0x01f9
        L_0x0185:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0190:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01a0
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r2)
            goto L_0x0190
        L_0x01a0:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01b7
            r5 = 1
            if (r0 == r5) goto L_0x01b6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01b6:
            throw r2
        L_0x01b7:
            r12 = r9
            goto L_0x01f9
        L_0x01b9:
            java.lang.String r2 = "messageIds"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01fb
        L_0x01c1:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r20.A()     // Catch:{ all -> 0x01c7 }
            goto L_0x01f9
        L_0x01c7:
            r0 = move-exception
            r2 = r0
            defpackage.z68.o(r4, r3, r2)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.ytd.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d2:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01e2
            java.lang.Object r5 = r0.next()
            xm r5 = (defpackage.xm) r5
            r5.a(r2)
            goto L_0x01d2
        L_0x01e2:
            gga r0 = defpackage.xtd.a
            r0.getClass()
            xtd r0 = defpackage.xtd.b
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x01f9
            r5 = 1
            if (r0 == r5) goto L_0x01f8
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01f8:
            throw r2
        L_0x01f9:
            r7 = 1
            goto L_0x023d
        L_0x01fb:
            java.util.Set r2 = kotlin.collections.SetsKt.emptySet()
            ejd r0 = new ejd     // Catch:{ all -> 0x020a }
            r0.<init>()     // Catch:{ all -> 0x020a }
            java.util.Set r2 = defpackage.ryg.m0(r1, r0)     // Catch:{ all -> 0x020a }
        L_0x0208:
            r7 = 1
            goto L_0x023b
        L_0x020a:
            r0 = move-exception
            defpackage.z68.o(r4, r3, r0)
            java.util.concurrent.CopyOnWriteArraySet r5 = defpackage.ytd.a
            java.util.Iterator r5 = r5.iterator()
        L_0x0214:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0224
            java.lang.Object r7 = r5.next()
            xm r7 = (defpackage.xm) r7
            r7.a(r0)
            goto L_0x0214
        L_0x0224:
            gga r5 = defpackage.xtd.a
            r5.getClass()
            xtd r5 = defpackage.xtd.b
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x0208
            r7 = 1
            if (r5 == r7) goto L_0x023a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x023a:
            throw r0
        L_0x023b:
            r8.element = r2
        L_0x023d:
            int r11 = r11 + r7
            r2 = r7
            r7 = 0
            goto L_0x0060
        L_0x0242:
            oba r0 = new oba
            T r1 = r8.element
            r18 = r1
            java.util.Set r18 = (java.util.Set) r18
            r11 = r0
            r11.<init>(r12, r14, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qba.p(pf9):ibf");
    }
}
