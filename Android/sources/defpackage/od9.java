package defpackage;

/* renamed from: od9  reason: default package */
public abstract class od9 {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        if (r10 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        r9 = new defpackage.nd9(r9, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.pd9 a(defpackage.pf9 r14) {
        /*
            r0 = 1
            java.lang.String r1 = ""
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            int r4 = defpackage.ryg.e0(r14)
            kotlin.jvm.internal.Ref$IntRef r5 = new kotlin.jvm.internal.Ref$IntRef
            r5.<init>()
            r6 = 0
            r7 = 0
            r9 = r6
            r8 = r7
        L_0x0014:
            if (r8 >= r4) goto L_0x011b
            java.lang.String r10 = defpackage.ryg.g0(r14)     // Catch:{ all -> 0x001b }
            goto L_0x004c
        L_0x001b:
            r10 = move-exception
            defpackage.z68.o(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.ytd.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0025:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0035
            java.lang.Object r12 = r11.next()
            xm r12 = (defpackage.xm) r12
            r12.a(r10)
            goto L_0x0025
        L_0x0035:
            gga r11 = defpackage.xtd.a
            r11.getClass()
            xtd r11 = defpackage.xtd.b
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x004b
            if (r11 == r0) goto L_0x004a
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x004a:
            throw r10
        L_0x004b:
            r10 = r6
        L_0x004c:
            java.lang.String r11 = "reaction"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r11 == 0) goto L_0x0096
            vd9 r9 = defpackage.vd9.EMOJI
            java.lang.String r10 = defpackage.ryg.g0(r14)     // Catch:{ all -> 0x005d }
            if (r10 != 0) goto L_0x008e
            goto L_0x008d
        L_0x005d:
            r10 = move-exception
            defpackage.z68.o(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.ytd.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0067:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0077
            java.lang.Object r12 = r11.next()
            xm r12 = (defpackage.xm) r12
            r12.a(r10)
            goto L_0x0067
        L_0x0077:
            gga r11 = defpackage.xtd.a
            r11.getClass()
            xtd r11 = defpackage.xtd.b
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x008d
            if (r11 == r0) goto L_0x008c
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x008c:
            throw r10
        L_0x008d:
            r10 = r1
        L_0x008e:
            nd9 r11 = new nd9
            r11.<init>(r9, r10)
            r9 = r11
            goto L_0x0118
        L_0x0096:
            java.lang.String r11 = "count"
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x00e2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            int r11 = defpackage.ryg.c0(r14)     // Catch:{ all -> 0x00ab }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00ab }
            goto L_0x00db
        L_0x00ab:
            r11 = move-exception
            defpackage.z68.o(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r12 = defpackage.ytd.a
            java.util.Iterator r12 = r12.iterator()
        L_0x00b5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r12.next()
            xm r13 = (defpackage.xm) r13
            r13.a(r11)
            goto L_0x00b5
        L_0x00c5:
            gga r12 = defpackage.xtd.a
            r12.getClass()
            xtd r12 = defpackage.xtd.b
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x00db
            if (r12 == r0) goto L_0x00da
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x00da:
            throw r11
        L_0x00db:
            int r10 = r10.intValue()
            r5.element = r10
            goto L_0x0118
        L_0x00e2:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            r14.A()     // Catch:{ all -> 0x00e8 }
            goto L_0x0118
        L_0x00e8:
            r10 = move-exception
            defpackage.z68.o(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r11 = defpackage.ytd.a
            java.util.Iterator r11 = r11.iterator()
        L_0x00f2:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0102
            java.lang.Object r12 = r11.next()
            xm r12 = (defpackage.xm) r12
            r12.a(r10)
            goto L_0x00f2
        L_0x0102:
            gga r11 = defpackage.xtd.a
            r11.getClass()
            xtd r11 = defpackage.xtd.b
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x0118
            if (r11 == r0) goto L_0x0117
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L_0x0117:
            throw r10
        L_0x0118:
            int r8 = r8 + r0
            goto L_0x0014
        L_0x011b:
            pd9 r14 = new pd9
            if (r9 == 0) goto L_0x0125
            int r0 = r5.element
            r14.<init>(r9, r0)
            return r14
        L_0x0125:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "reaction is null"
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od9.a(pf9):pd9");
    }
}
