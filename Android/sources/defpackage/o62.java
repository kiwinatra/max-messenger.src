package defpackage;

import java.util.List;

/* renamed from: o62  reason: default package */
public final /* synthetic */ class o62 implements qk3 {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;
    public final /* synthetic */ long x;
    public final /* synthetic */ bl4 y;
    public final /* synthetic */ long z;

    public /* synthetic */ o62(r62 r62, List list, long j, int i, long j2, int i2, long j3, bl4 bl4, long j4) {
        this.a = r62;
        this.b = list;
        this.c = j;
        this.o = i;
        this.v = j2;
        this.w = i2;
        this.x = j3;
        this.y = bl4;
        this.z = j4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = 1
            r8 = r27
            w62 r8 = (defpackage.w62) r8
            r62 r9 = r0.a
            r9.getClass()
            g72 r2 = r8.n
            bl4 r15 = r0.y
            java.util.ArrayList r16 = r2.d(r15)
            int r3 = r0.w
            long r4 = r0.x
            java.util.List r6 = r0.b
            long r10 = r0.c
            int r7 = r0.o
            long r12 = r0.v
            r17 = r6
            r18 = r10
            r20 = r7
            r21 = r12
            r23 = r3
            r24 = r4
            java.util.ArrayList r3 = defpackage.hd8.p(r16, r17, r18, r20, r21, r23, r24)
            java.util.ArrayList r4 = r2.d(r15)
            r4.clear()
            defpackage.g72.e(r15)
            java.util.ArrayList r2 = r2.d(r15)
            r2.addAll(r3)
            defpackage.g72.e(r15)
            bl4 r2 = defpackage.bl4.DELAYED
            if (r15 != r2) goto L_0x004a
            goto L_0x0128
        L_0x004a:
            long r3 = r0.z
            hs7 r0 = r9.s
            if (r7 <= 0) goto L_0x00a3
            r16 = 0
            int r2 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r2 != 0) goto L_0x00a3
            java.util.Iterator r2 = r6.iterator()
            r5 = 0
            r7 = r5
        L_0x005c:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0070
            java.lang.Object r12 = r2.next()
            b89 r12 = (defpackage.b89) r12
            long r12 = r12.b
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x005c
            int r7 = r7 + r1
            goto L_0x005c
        L_0x0070:
            r2 = 2
            if (r7 >= r2) goto L_0x00a3
            java.lang.String r2 = "r62"
            java.lang.String r7 = "onChatHistory, history response size is less than one page, delete message before and findAndUpdateFirstMessage"
            defpackage.z68.c(r2, r7, new java.lang.Object[0])
            r12 = 1
            long r10 = r10 - r12
            int r2 = r6.size()
            if (r2 <= 0) goto L_0x008c
            java.lang.Object r2 = r6.get(r5)
            b89 r2 = (defpackage.b89) r2
            long r10 = r2.b
            long r10 = r10 - r12
        L_0x008c:
            r13 = r10
            java.lang.Object r2 = r0.get()
            r10 = r2
            fa9 r10 = (defpackage.fa9) r10
            r11 = r3
            r10.e(r11, r13, r15)
            r10 = 0
            r2 = r9
            r12 = r3
            r5 = r8
            r14 = r6
            r6 = r10
            r2.z(r3, r5, r6)
            goto L_0x00a5
        L_0x00a3:
            r12 = r3
            r14 = r6
        L_0x00a5:
            java.util.Iterator r2 = r14.iterator()
        L_0x00a9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00d6
            java.lang.Object r3 = r2.next()
            b89 r3 = (defpackage.b89) r3
            long r4 = r3.o
            jtb r6 = r9.n
            ltb r6 = (defpackage.ltb) r6
            a33 r6 = r6.a
            long r6 = r6.s()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00a9
            long r4 = r3.c
            long r6 = r3.b
            long r3 = kotlin.ranges.RangesKt.coerceAtLeast((long) r4, (long) r6)
            long r5 = r8.Z
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x00a9
            r8.Z = r3
            goto L_0x00a9
        L_0x00d6:
            a32 r2 = r9.G(r12)
            boolean r3 = defpackage.cjf.B(r14)
            if (r3 != 0) goto L_0x0128
            if (r2 == 0) goto L_0x0128
            boolean r2 = r2.I()
            if (r2 == 0) goto L_0x0128
            java.lang.Object r0 = r0.get()
            fa9 r0 = (defpackage.fa9) r0
            java.lang.Object r1 = defpackage.a81.i(r1, r14)
            b89 r1 = (defpackage.b89) r1
            long r1 = r1.a
            ha9 r0 = r0.k(r12, r1)
            if (r0 == 0) goto L_0x0128
            long r1 = r0.b
            r8.j = r1
            java.util.Map r1 = r8.e()
            hs7 r2 = r9.r
            java.lang.Object r2 = r2.get()
            km3 r2 = (defpackage.km3) r2
            vk3 r2 = r2.r()
            long r2 = r2.r()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r3 = r0.o
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            r1.put(r2, r5)
            g72 r1 = r8.n
            bl4 r0 = r0.S0
            defpackage.hd8.F(r1, r3, r0)
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o62.accept(java.lang.Object):void");
    }
}
