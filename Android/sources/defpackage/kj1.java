package defpackage;

/* renamed from: kj1  reason: default package */
public final class kj1 implements vi7 {
    public final boolean a;

    public kj1(boolean z) {
        this.a = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0144, code lost:
        if (kotlin.text.StringsKt__StringsJVMKt.equals("close", r2, true) != false) goto L_0x0146;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.k4d a(defpackage.otc r16) {
        /*
            r15 = this;
            r0 = r16
            y2d r1 = r0.f
            hd8 r2 = r1.e
            long r3 = java.lang.System.currentTimeMillis()
            ce r5 = r0.e
            java.lang.Object r0 = r5.o
            r6 = r0
            bk3 r6 = (defpackage.bk3) r6
            java.lang.Object r0 = r5.w
            s95 r0 = (defpackage.s95) r0
            r6.getClass()     // Catch:{ IOException -> 0x0196 }
            r0.g(r1)     // Catch:{ IOException -> 0x0196 }
            java.lang.String r7 = r1.c
            boolean r7 = defpackage.tf6.d0(r7)
            r8 = 1
            r9 = 0
            java.lang.Object r11 = r5.c
            jtc r11 = (defpackage.jtc) r11
            java.lang.Object r12 = r5.o
            bk3 r12 = (defpackage.bk3) r12
            java.lang.Object r13 = r5.b
            mtc r13 = (defpackage.mtc) r13
            if (r7 == 0) goto L_0x0091
            if (r2 == 0) goto L_0x0091
            lx6 r7 = r1.d
            java.lang.String r14 = "Expect"
            java.lang.String r7 = r7.b(r14)
            java.lang.String r14 = "100-continue"
            boolean r7 = kotlin.text.StringsKt__StringsJVMKt.equals(r14, r7, true)
            if (r7 == 0) goto L_0x0058
            r0.h()     // Catch:{ IOException -> 0x004f }
            j4d r7 = r5.n(r8)
            r12.getClass()
            r14 = r9
            goto L_0x005a
        L_0x004f:
            r0 = move-exception
            r1 = r0
            r12.getClass()
            r5.r(r1)
            throw r1
        L_0x0058:
            r14 = r8
            r7 = 0
        L_0x005a:
            if (r7 != 0) goto L_0x007c
            r5.a = r9
            hd8 r8 = r1.e
            long r9 = r8.k()
            r12.getClass()
            nde r8 = r0.c(r1, r9)
            q95 r11 = new q95
            r11.<init>(r5, r8, r9)
            ftc r8 = new ftc
            r8.<init>(r11)
            r2.c0(r8)
            r8.close()
            goto L_0x008d
        L_0x007c:
            r2 = r9
            r9 = 0
            r11.k(r5, r8, r2, r9)
            a47 r2 = r13.f
            if (r2 == 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            mtc r2 = r0.f()
            r2.k()
        L_0x008d:
            r8 = r14
            r2 = 0
            r9 = 0
            goto L_0x0097
        L_0x0091:
            r2 = r9
            r9 = 0
            r11.k(r5, r8, r2, r9)
            r7 = r9
        L_0x0097:
            r0.b()     // Catch:{ IOException -> 0x018d }
            if (r7 != 0) goto L_0x00a7
            j4d r7 = r5.n(r2)
            if (r8 == 0) goto L_0x00a7
            r12.getClass()
            r2 = 0
            goto L_0x00a8
        L_0x00a7:
            r2 = r8
        L_0x00a8:
            r7.a = r1
            jw6 r8 = r13.d
            r7.e = r8
            r7.k = r3
            long r10 = java.lang.System.currentTimeMillis()
            r7.l = r10
            k4d r7 = r7.a()
            r8 = 100
            int r10 = r7.o
            if (r10 != r8) goto L_0x00de
            r8 = 0
            j4d r7 = r5.n(r8)
            if (r2 == 0) goto L_0x00ca
            r12.getClass()
        L_0x00ca:
            r7.a = r1
            jw6 r1 = r13.d
            r7.e = r1
            r7.k = r3
            long r1 = java.lang.System.currentTimeMillis()
            r7.l = r1
            k4d r7 = r7.a()
            int r10 = r7.o
        L_0x00de:
            r6.getClass()
            r1 = r15
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x00f7
            r1 = 101(0x65, float:1.42E-43)
            if (r10 != r1) goto L_0x00f7
            j4d r1 = r7.m()
            ptc r2 = defpackage.u0g.c
            r1.g = r2
            k4d r1 = r1.a()
            goto L_0x0124
        L_0x00f7:
            j4d r1 = r7.m()
            java.lang.String r2 = "Content-Type"
            lx6 r3 = r7.w     // Catch:{ IOException -> 0x0188 }
            java.lang.String r2 = r3.b(r2)     // Catch:{ IOException -> 0x0188 }
            if (r2 == 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r2 = r9
        L_0x0107:
            long r3 = r0.d(r7)     // Catch:{ IOException -> 0x0188 }
            yfe r6 = r0.a(r7)     // Catch:{ IOException -> 0x0188 }
            r95 r7 = new r95     // Catch:{ IOException -> 0x0188 }
            r7.<init>(r5, r6, r3)     // Catch:{ IOException -> 0x0188 }
            ptc r6 = new ptc     // Catch:{ IOException -> 0x0188 }
            gtc r8 = new gtc     // Catch:{ IOException -> 0x0188 }
            r8.<init>(r7)     // Catch:{ IOException -> 0x0188 }
            r6.<init>((java.lang.String) r2, (long) r3, (defpackage.gtc) r8)     // Catch:{ IOException -> 0x0188 }
            r1.g = r6
            k4d r1 = r1.a()
        L_0x0124:
            y2d r2 = r1.a
            lx6 r2 = r2.d
            java.lang.String r3 = "Connection"
            java.lang.String r2 = r2.b(r3)
            java.lang.String r4 = "close"
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.equals(r4, r2, true)
            if (r2 != 0) goto L_0x0146
            lx6 r2 = r1.w
            java.lang.String r2 = r2.b(r3)
            if (r2 == 0) goto L_0x013f
            goto L_0x0140
        L_0x013f:
            r2 = r9
        L_0x0140:
            boolean r2 = kotlin.text.StringsKt__StringsJVMKt.equals(r4, r2, true)
            if (r2 == 0) goto L_0x014d
        L_0x0146:
            mtc r0 = r0.f()
            r0.k()
        L_0x014d:
            r0 = 204(0xcc, float:2.86E-43)
            if (r10 == r0) goto L_0x0155
            r0 = 205(0xcd, float:2.87E-43)
            if (r10 != r0) goto L_0x0187
        L_0x0155:
            ptc r0 = r1.x
            if (r0 == 0) goto L_0x015e
            long r2 = r0.n()
            goto L_0x0160
        L_0x015e:
            r2 = -1
        L_0x0160:
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x0187
            java.net.ProtocolException r1 = new java.net.ProtocolException
            java.lang.String r2 = "HTTP "
            java.lang.String r3 = " had non-zero Content-Length: "
            java.lang.StringBuilder r2 = defpackage.wj6.o(r10, r2, r3)
            if (r0 == 0) goto L_0x017b
            long r3 = r0.n()
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            goto L_0x017c
        L_0x017b:
            r10 = r9
        L_0x017c:
            r2.append(r10)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0187:
            return r1
        L_0x0188:
            r0 = move-exception
            r5.r(r0)
            throw r0
        L_0x018d:
            r0 = move-exception
            r1 = r0
            r6.getClass()
            r5.r(r1)
            throw r1
        L_0x0196:
            r0 = move-exception
            r6.getClass()
            r5.r(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj1.a(otc):k4d");
    }
}
