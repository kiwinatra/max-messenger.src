package defpackage;

/* renamed from: kyg  reason: default package */
public final class kyg extends yxg {
    public static final kyg x = new kyg((Object) null, new Object[0], 0);
    public final transient Object o;
    public final transient Object[] v;
    public final transient int w;

    public kyg(Object obj, Object[] objArr, int i) {
        this.o = obj;
        this.v = objArr;
        this.w = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: vxg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kyg a(int r16, java.lang.Object[] r17, defpackage.cs r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto L_0x000b
            kyg r0 = x
            return r0
        L_0x000b:
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 != r3) goto L_0x0020
            r0 = r1[r5]
            java.util.Objects.requireNonNull(r0)
            r0 = r1[r3]
            java.util.Objects.requireNonNull(r0)
            kyg r0 = new kyg
            r0.<init>(r4, r1, r3)
            return r0
        L_0x0020:
            int r6 = r1.length
            int r6 = r6 >> r3
            defpackage.vzg.O(r0, r6)
            r6 = 2
            int r7 = java.lang.Math.max(r0, r6)
            r8 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r7 >= r8) goto L_0x0043
            int r8 = r7 + -1
            int r8 = java.lang.Integer.highestOneBit(r8)
        L_0x0035:
            int r8 = r8 + r8
            double r9 = (double) r8
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r9 = r9 * r11
            double r11 = (double) r7
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0047
            goto L_0x0035
        L_0x0043:
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r8) goto L_0x01ce
        L_0x0047:
            if (r0 != r3) goto L_0x0058
            r0 = r1[r5]
            java.util.Objects.requireNonNull(r0)
            r0 = r1[r3]
            java.util.Objects.requireNonNull(r0)
            r0 = r3
            r7 = r0
            r3 = r6
            goto L_0x01a2
        L_0x0058:
            int r7 = r8 + -1
            r9 = -1
            r10 = 128(0x80, float:1.794E-43)
            r11 = 3
            if (r8 > r10) goto L_0x00ce
            byte[] r8 = new byte[r8]
            java.util.Arrays.fill(r8, r9)
            r9 = r5
            r10 = r9
        L_0x0067:
            if (r9 >= r0) goto L_0x00b6
            int r12 = r10 + r10
            int r13 = r9 + r9
            r14 = r1[r13]
            java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r3
            r13 = r1[r13]
            java.util.Objects.requireNonNull(r13)
            int r15 = r14.hashCode()
            int r15 = defpackage.q8.T(r15)
        L_0x0080:
            r15 = r15 & r7
            byte r6 = r8[r15]
            r3 = 255(0xff, float:3.57E-43)
            r6 = r6 & r3
            if (r6 != r3) goto L_0x0096
            byte r3 = (byte) r12
            r8[r15] = r3
            if (r10 >= r9) goto L_0x0093
            r1[r12] = r14
            r3 = r12 ^ 1
            r1[r3] = r13
        L_0x0093:
            int r10 = r10 + 1
            goto L_0x00ac
        L_0x0096:
            r3 = r1[r6]
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L_0x00b1
            r3 = r6 ^ 1
            vxg r4 = new vxg
            r6 = r1[r3]
            java.util.Objects.requireNonNull(r6)
            r4.<init>(r14, r13, r6)
            r1[r3] = r13
        L_0x00ac:
            int r9 = r9 + 1
            r3 = 1
            r6 = 2
            goto L_0x0067
        L_0x00b1:
            int r15 = r15 + 1
            r3 = 1
            r6 = 2
            goto L_0x0080
        L_0x00b6:
            if (r10 != r0) goto L_0x00bd
            r4 = r8
        L_0x00b9:
            r3 = 2
        L_0x00ba:
            r7 = 1
            goto L_0x01a2
        L_0x00bd:
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r5] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r7 = 1
            r3[r7] = r6
            r6 = 2
            r3[r6] = r4
            r4 = r3
            r3 = r6
            goto L_0x00ba
        L_0x00ce:
            r3 = 32768(0x8000, float:4.5918E-41)
            if (r8 > r3) goto L_0x013d
            short[] r3 = new short[r8]
            java.util.Arrays.fill(r3, r9)
            r6 = r5
            r8 = r6
        L_0x00da:
            if (r6 >= r0) goto L_0x0128
            int r9 = r8 + r8
            int r10 = r6 + r6
            r12 = r1[r10]
            java.util.Objects.requireNonNull(r12)
            r13 = 1
            r10 = r10 ^ r13
            r10 = r1[r10]
            java.util.Objects.requireNonNull(r10)
            int r13 = r12.hashCode()
            int r13 = defpackage.q8.T(r13)
        L_0x00f4:
            r13 = r13 & r7
            short r14 = r3[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x010b
            short r14 = (short) r9
            r3[r13] = r14
            if (r8 >= r6) goto L_0x0108
            r1[r9] = r12
            r9 = r9 ^ 1
            r1[r9] = r10
        L_0x0108:
            int r8 = r8 + 1
            goto L_0x0122
        L_0x010b:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0125
            r4 = r14 ^ 1
            vxg r9 = new vxg
            r13 = r1[r4]
            java.util.Objects.requireNonNull(r13)
            r9.<init>(r12, r10, r13)
            r1[r4] = r10
            r4 = r9
        L_0x0122:
            int r6 = r6 + 1
            goto L_0x00da
        L_0x0125:
            int r13 = r13 + 1
            goto L_0x00f4
        L_0x0128:
            if (r8 != r0) goto L_0x012c
        L_0x012a:
            r4 = r3
            goto L_0x00b9
        L_0x012c:
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r6[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r10 = 1
            r6[r10] = r3
            r3 = 2
            r6[r3] = r4
            r4 = r6
            r7 = r10
            goto L_0x01a2
        L_0x013d:
            r10 = 1
            int[] r3 = new int[r8]
            java.util.Arrays.fill(r3, r9)
            r6 = r5
            r8 = r6
        L_0x0145:
            if (r6 >= r0) goto L_0x0190
            int r12 = r8 + r8
            int r13 = r6 + r6
            r14 = r1[r13]
            java.util.Objects.requireNonNull(r14)
            r13 = r13 ^ r10
            r10 = r1[r13]
            java.util.Objects.requireNonNull(r10)
            int r13 = r14.hashCode()
            int r13 = defpackage.q8.T(r13)
        L_0x015e:
            r13 = r13 & r7
            r15 = r3[r13]
            if (r15 != r9) goto L_0x0170
            r3[r13] = r12
            if (r8 >= r6) goto L_0x016d
            r1[r12] = r14
            r12 = r12 ^ 1
            r1[r12] = r10
        L_0x016d:
            int r8 = r8 + 1
            goto L_0x0187
        L_0x0170:
            r9 = r1[r15]
            boolean r9 = r14.equals(r9)
            if (r9 == 0) goto L_0x018c
            r4 = r15 ^ 1
            vxg r9 = new vxg
            r12 = r1[r4]
            java.util.Objects.requireNonNull(r12)
            r9.<init>(r14, r10, r12)
            r1[r4] = r10
            r4 = r9
        L_0x0187:
            int r6 = r6 + 1
            r9 = -1
            r10 = 1
            goto L_0x0145
        L_0x018c:
            int r13 = r13 + 1
            r9 = -1
            goto L_0x015e
        L_0x0190:
            if (r8 != r0) goto L_0x0193
            goto L_0x012a
        L_0x0193:
            java.lang.Object[] r6 = new java.lang.Object[r11]
            r6[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r7 = 1
            r6[r7] = r3
            r3 = 2
            r6[r3] = r4
            r4 = r6
        L_0x01a2:
            boolean r6 = r4 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01c8
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = r4[r3]
            vxg r0 = (defpackage.vxg) r0
            if (r2 == 0) goto L_0x01c3
            r2.o = r0
            r0 = r4[r5]
            r2 = r4[r7]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r4 = r0
            r0 = r2
            goto L_0x01c8
        L_0x01c3:
            java.lang.IllegalArgumentException r0 = r0.a()
            throw r0
        L_0x01c8:
            kyg r2 = new kyg
            r2.<init>(r4, r1, r0)
            return r2
        L_0x01ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "collection too large"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyg.a(int, java.lang.Object[], cs):kyg");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0006
        L_0x0003:
            r8 = r0
            goto L_0x009c
        L_0x0006:
            r1 = 1
            int r2 = r8.w
            java.lang.Object[] r3 = r8.v
            if (r2 != r1) goto L_0x0020
            r8 = 0
            r8 = r3[r8]
            java.util.Objects.requireNonNull(r8)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0003
            r8 = r3[r1]
            java.util.Objects.requireNonNull(r8)
            goto L_0x009c
        L_0x0020:
            java.lang.Object r8 = r8.o
            if (r8 != 0) goto L_0x0025
            goto L_0x0003
        L_0x0025:
            boolean r2 = r8 instanceof byte[]
            r4 = -1
            if (r2 == 0) goto L_0x0051
            r2 = r8
            byte[] r2 = (byte[]) r2
            int r8 = r2.length
            int r5 = r8 + -1
            int r8 = r9.hashCode()
            int r8 = defpackage.q8.T(r8)
        L_0x0038:
            r8 = r8 & r5
            byte r4 = r2[r8]
            r6 = 255(0xff, float:3.57E-43)
            r4 = r4 & r6
            if (r4 != r6) goto L_0x0041
            goto L_0x0003
        L_0x0041:
            r6 = r3[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x004e
            r8 = r4 ^ 1
            r8 = r3[r8]
            goto L_0x009c
        L_0x004e:
            int r8 = r8 + 1
            goto L_0x0038
        L_0x0051:
            boolean r2 = r8 instanceof short[]
            if (r2 == 0) goto L_0x007d
            r2 = r8
            short[] r2 = (short[]) r2
            int r8 = r2.length
            int r5 = r8 + -1
            int r8 = r9.hashCode()
            int r8 = defpackage.q8.T(r8)
        L_0x0063:
            r8 = r8 & r5
            short r4 = r2[r8]
            char r4 = (char) r4
            r6 = 65535(0xffff, float:9.1834E-41)
            if (r4 != r6) goto L_0x006d
            goto L_0x0003
        L_0x006d:
            r6 = r3[r4]
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x007a
            r8 = r4 ^ 1
            r8 = r3[r8]
            goto L_0x009c
        L_0x007a:
            int r8 = r8 + 1
            goto L_0x0063
        L_0x007d:
            int[] r8 = (int[]) r8
            int r2 = r8.length
            int r2 = r2 + r4
            int r5 = r9.hashCode()
            int r5 = defpackage.q8.T(r5)
        L_0x0089:
            r5 = r5 & r2
            r6 = r8[r5]
            if (r6 != r4) goto L_0x0090
            goto L_0x0003
        L_0x0090:
            r7 = r3[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x00a0
            r8 = r6 ^ 1
            r8 = r3[r8]
        L_0x009c:
            if (r8 != 0) goto L_0x009f
            return r0
        L_0x009f:
            return r8
        L_0x00a0:
            int r5 = r5 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kyg.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.w;
    }
}
