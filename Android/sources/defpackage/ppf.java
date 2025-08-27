package defpackage;

/* renamed from: ppf  reason: default package */
public final class ppf {
    public final boolean a;
    public final String b;
    public final xpf c;
    public final int d;
    public final byte[] e;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r7.equals("cbc1") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ppf(boolean r6, java.lang.String r7, int r8, byte[] r9, int r10, int r11, byte[] r12) {
        /*
            r5 = this;
            r0 = 2
            r5.<init>()
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L_0x000a
            r3 = r2
            goto L_0x000b
        L_0x000a:
            r3 = r1
        L_0x000b:
            if (r12 != 0) goto L_0x000f
            r4 = r2
            goto L_0x0010
        L_0x000f:
            r4 = r1
        L_0x0010:
            r3 = r3 ^ r4
            defpackage.n79.g(r3)
            r5.a = r6
            r5.b = r7
            r5.d = r8
            r5.e = r12
            xpf r6 = new xpf
            if (r7 != 0) goto L_0x0022
        L_0x0020:
            r0 = r2
            goto L_0x0070
        L_0x0022:
            r8 = -1
            int r12 = r7.hashCode()
            switch(r12) {
                case 3046605: goto L_0x004d;
                case 3046671: goto L_0x0042;
                case 3049879: goto L_0x0037;
                case 3049895: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            r1 = r8
            goto L_0x0056
        L_0x002c:
            java.lang.String r12 = "cens"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x0035
            goto L_0x002a
        L_0x0035:
            r1 = 3
            goto L_0x0056
        L_0x0037:
            java.lang.String r12 = "cenc"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x0040
            goto L_0x002a
        L_0x0040:
            r1 = r0
            goto L_0x0056
        L_0x0042:
            java.lang.String r12 = "cbcs"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x004b
            goto L_0x002a
        L_0x004b:
            r1 = r2
            goto L_0x0056
        L_0x004d:
            java.lang.String r12 = "cbc1"
            boolean r12 = r7.equals(r12)
            if (r12 != 0) goto L_0x0056
            goto L_0x002a
        L_0x0056:
            switch(r1) {
                case 0: goto L_0x0070;
                case 1: goto L_0x0070;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported protection scheme type '"
            r8.<init>(r12)
            r8.append(r7)
            java.lang.String r7 = "'. Assuming AES-CTR crypto mode."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            defpackage.i8b.V(r7)
            goto L_0x0020
        L_0x0070:
            r6.<init>(r0, r10, r11, r9)
            r5.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppf.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
