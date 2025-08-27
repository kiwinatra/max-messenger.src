package defpackage;

import java.util.Set;

/* renamed from: p52  reason: default package */
public final /* synthetic */ class p52 implements qk3 {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Set o;
    public final /* synthetic */ int v;
    public final /* synthetic */ bd2 w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    public /* synthetic */ p52(r62 r62, int i, int i2, Set set, int i3, bd2 bd2, long j, long j2) {
        this.a = r62;
        this.b = i;
        this.c = i2;
        this.o = set;
        this.v = i3;
        this.w = bd2;
        this.x = j;
        this.y = j2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            w62 r1 = (defpackage.w62) r1
            r62 r2 = r0.a
            r2.getClass()
            int r3 = r0.b
            int r4 = r0.c
            java.util.Set r5 = r0.o
            int r6 = r0.v
            java.lang.String r7 = "r62"
            if (r3 != r4) goto L_0x0031
            if (r4 != 0) goto L_0x0031
            java.lang.String r0 = "onChatMedia: requsetMediaCount"
            defpackage.z68.c(r7, r0, new java.lang.Object[0])
            z62 r0 = defpackage.r62.M(r1, r5)
            y62 r0 = r0.a()
            r0.a = r6
            z62 r0 = r0.a()
            defpackage.r62.l0(r1, r5, r0)
            goto L_0x01d7
        L_0x0031:
            if (r4 <= 0) goto L_0x003e
            if (r3 > 0) goto L_0x0036
            goto L_0x003e
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "current implementation supports only forward or only backward due to Chunks.extendFromChatMedia"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            bd2 r8 = r0.w
            java.util.List r9 = r8.d()
            int r9 = r9.size()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10, r11}
            java.lang.String r10 = "onChatMedia: count=%d, forward=%d, backward=%d"
            defpackage.z68.c(r7, r10, r9)
            hs7 r2 = r2.s
            java.lang.Object r7 = r2.get()
            fa9 r7 = (defpackage.fa9) r7
            long r9 = r0.x
            ha9 r7 = r7.r(r9)
            z62 r9 = defpackage.r62.M(r1, r5)
            y62 r9 = r9.a()
            java.lang.Object r10 = r9.o
            f72 r10 = (defpackage.f72) r10
            r11 = 0
            if (r10 == 0) goto L_0x008a
            long r13 = r10.a
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x008a
            long r13 = r10.b
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x008a
            r10 = 0
            r9.o = r10
        L_0x008a:
            java.util.List r10 = r8.d()
            int r10 = r10.size()
            long r13 = r0.y
            if (r10 <= 0) goto L_0x017d
            java.util.List r0 = r8.d()
            r10 = 0
            java.lang.Object r0 = r0.get(r10)
            b89 r0 = (defpackage.b89) r0
            java.util.List r10 = r8.d()
            java.util.List r15 = r8.d()
            int r15 = r15.size()
            int r15 = r15 + -1
            java.lang.Object r10 = r10.get(r15)
            b89 r10 = (defpackage.b89) r10
            java.lang.Object r15 = r9.o
            f72 r15 = (defpackage.f72) r15
            if (r15 == 0) goto L_0x0101
            if (r7 != 0) goto L_0x00c8
            long r11 = r0.b
            r19 = r11
            long r10 = r10.b
            r16 = r5
        L_0x00c5:
            r4 = r19
            goto L_0x0120
        L_0x00c8:
            if (r4 <= 0) goto L_0x00fa
            long r11 = r15.a
            java.util.List r7 = r8.d()
            int r7 = r7.size()
            if (r7 >= r4) goto L_0x00f3
            java.lang.Object r4 = r2.get()
            fa9 r4 = (defpackage.fa9) r4
            ha9 r4 = r4.p(r13)
            r19 = r11
            if (r4 == 0) goto L_0x00e9
            long r11 = r4.o
        L_0x00e6:
            r16 = r5
            goto L_0x00ec
        L_0x00e9:
            long r11 = r10.b
            goto L_0x00e6
        L_0x00ec:
            long r4 = r10.b
            long r10 = java.lang.Math.max(r11, r4)
            goto L_0x00c5
        L_0x00f3:
            r16 = r5
            r19 = r11
            long r10 = r10.b
            goto L_0x00c5
        L_0x00fa:
            r16 = r5
            long r10 = r15.b
            long r4 = r0.b
            goto L_0x0120
        L_0x0101:
            r16 = r5
            long r11 = r0.b
            java.lang.Object r4 = r2.get()
            fa9 r4 = (defpackage.fa9) r4
            ha9 r4 = r4.p(r13)
            if (r4 == 0) goto L_0x0116
            long r4 = r4.o
        L_0x0113:
            r19 = r11
            goto L_0x0119
        L_0x0116:
            long r4 = r10.b
            goto L_0x0113
        L_0x0119:
            long r10 = r10.b
            long r10 = java.lang.Math.max(r4, r10)
            goto L_0x00c5
        L_0x0120:
            r17 = -1
            int r7 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            java.lang.String r12 = ""
            java.lang.String r15 = "Chunk.Builder"
            if (r7 != 0) goto L_0x0137
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r20 = r1
            java.lang.String r1 = "start time is -1"
            r7.<init>(r1)
            defpackage.z68.o(r15, r12, r7)
            goto L_0x0139
        L_0x0137:
            r20 = r1
        L_0x0139:
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x0147
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r7 = "end time is -1"
            r1.<init>(r7)
            defpackage.z68.o(r15, r12, r1)
        L_0x0147:
            f72 r1 = new f72
            r1.<init>(r4, r10)
            r9.o = r1
            r9.a = r6
            if (r3 <= 0) goto L_0x0171
            java.util.List r1 = r8.d()
            int r1 = r1.size()
            if (r1 >= r3) goto L_0x0171
            java.lang.Object r1 = r2.get()
            fa9 r1 = (defpackage.fa9) r1
            long r2 = r0.a
            ha9 r0 = r1.k(r13, r2)
            if (r0 == 0) goto L_0x016d
            long r11 = r0.b
            goto L_0x016f
        L_0x016d:
            r11 = 0
        L_0x016f:
            r9.b = r11
        L_0x0171:
            z62 r0 = r9.a()
            r1 = r20
            r3 = r16
            defpackage.r62.l0(r1, r3, r0)
            goto L_0x01d7
        L_0x017d:
            r3 = r5
            if (r4 <= 0) goto L_0x01b4
            java.lang.Object r0 = r2.get()
            fa9 r0 = (defpackage.fa9) r0
            ha9 r0 = r0.p(r13)
            java.lang.Object r2 = r9.o
            f72 r2 = (defpackage.f72) r2
            if (r2 == 0) goto L_0x01ce
            if (r7 == 0) goto L_0x01ce
            if (r0 == 0) goto L_0x01ce
            long r4 = r0.o
            boolean r0 = defpackage.hd8.G(r4, r2)
            if (r0 != 0) goto L_0x01ce
            java.lang.Object r0 = r9.o
            f72 r0 = (defpackage.f72) r0
            long r7 = r0.b
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ce
            ap0 r0 = r0.c()
            r0.b(r4)
            f72 r0 = r0.a()
            r9.o = r0
            goto L_0x01ce
        L_0x01b4:
            java.lang.Object r0 = r9.o
            f72 r0 = (defpackage.f72) r0
            if (r0 == 0) goto L_0x01ce
            java.lang.Object r0 = r2.get()
            fa9 r0 = (defpackage.fa9) r0
            r4 = 0
            ha9 r0 = r0.s(r13, r4)
            if (r0 == 0) goto L_0x01cb
            long r11 = r0.b
            goto L_0x01cc
        L_0x01cb:
            r11 = r4
        L_0x01cc:
            r9.b = r11
        L_0x01ce:
            r9.a = r6
            z62 r0 = r9.a()
            defpackage.r62.l0(r1, r3, r0)
        L_0x01d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p52.accept(java.lang.Object):void");
    }
}
