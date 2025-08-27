package defpackage;

import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w22  reason: default package */
public final class w22 {
    public final w22 a;
    public final AtomicReference b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public u22[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public BitSet m;

    public w22(int i2) {
        this.a = null;
        this.c = i2;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference(new v22(new String[64], new u22[32]));
    }

    public final int a(int i2) {
        int i3 = i2 + (i2 >>> 15);
        int i4 = i3 ^ (i3 << 7);
        return this.j & (i4 + (i4 >>> 3));
    }

    public final int b(String str) {
        int length = str.length();
        int i2 = this.c;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 * 33) + str.charAt(i3);
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0085 A[EDGE_INSN: B:108:0x0085->B:42:0x0085 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0081 A[LOOP:2: B:30:0x0062->B:40:0x0081, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(char[] r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = 1
            if (r3 >= r4) goto L_0x000e
            java.lang.String r0 = ""
            return r0
        L_0x000e:
            boolean r5 = r0.e
            if (r5 != 0) goto L_0x0018
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2, r3)
            return r0
        L_0x0018:
            r5 = r21
            int r5 = r0.a(r5)
            java.lang.String[] r6 = r0.f
            r6 = r6[r5]
            r7 = 0
            if (r6 == 0) goto L_0x0088
            int r9 = r6.length()
            if (r9 != r3) goto L_0x003b
            r9 = r7
        L_0x002c:
            char r10 = r6.charAt(r9)
            int r11 = r2 + r9
            char r11 = r1[r11]
            if (r10 != r11) goto L_0x003b
            int r9 = r9 + 1
            if (r9 != r3) goto L_0x002c
            return r6
        L_0x003b:
            u22[] r6 = r0.g
            int r9 = r5 >> 1
            r6 = r6[r9]
            if (r6 == 0) goto L_0x0088
            java.lang.String r9 = r6.a
            int r10 = r9.length()
            if (r10 == r3) goto L_0x004d
        L_0x004b:
            r9 = 0
            goto L_0x005d
        L_0x004d:
            r10 = r7
        L_0x004e:
            char r11 = r9.charAt(r10)
            int r12 = r2 + r10
            char r12 = r1[r12]
            if (r11 == r12) goto L_0x0059
            goto L_0x004b
        L_0x0059:
            int r10 = r10 + 1
            if (r10 < r3) goto L_0x004e
        L_0x005d:
            if (r9 == 0) goto L_0x0060
            return r9
        L_0x0060:
            u22 r6 = r6.b
        L_0x0062:
            if (r6 == 0) goto L_0x0084
            java.lang.String r9 = r6.a
            int r10 = r9.length()
            if (r10 == r3) goto L_0x006e
        L_0x006c:
            r9 = 0
            goto L_0x007e
        L_0x006e:
            r10 = r7
        L_0x006f:
            char r11 = r9.charAt(r10)
            int r12 = r2 + r10
            char r12 = r1[r12]
            if (r11 == r12) goto L_0x007a
            goto L_0x006c
        L_0x007a:
            int r10 = r10 + 1
            if (r10 < r3) goto L_0x006f
        L_0x007e:
            if (r9 == 0) goto L_0x0081
            goto L_0x0085
        L_0x0081:
            u22 r6 = r6.b
            goto L_0x0062
        L_0x0084:
            r9 = 0
        L_0x0085:
            if (r9 == 0) goto L_0x0088
            return r9
        L_0x0088:
            boolean r6 = r0.l
            if (r6 == 0) goto L_0x00a6
            java.lang.String[] r6 = r0.f
            int r9 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r9)
            java.lang.String[] r6 = (java.lang.String[]) r6
            r0.f = r6
            u22[] r6 = r0.g
            int r9 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r9)
            u22[] r6 = (defpackage.u22[]) r6
            r0.g = r6
            r0.l = r7
            goto L_0x0186
        L_0x00a6:
            int r6 = r0.h
            int r9 = r0.i
            if (r6 < r9) goto L_0x0186
            java.lang.String[] r5 = r0.f
            int r6 = r5.length
            int r9 = r6 + r6
            r10 = 65536(0x10000, float:9.18355E-41)
            if (r9 <= r10) goto L_0x00cd
            r0.h = r7
            r0.e = r7
            r5 = 64
            java.lang.String[] r5 = new java.lang.String[r5]
            r0.f = r5
            r5 = 32
            u22[] r5 = new defpackage.u22[r5]
            r0.g = r5
            r5 = 63
            r0.j = r5
            r0.l = r7
            goto L_0x0155
        L_0x00cd:
            u22[] r10 = r0.g
            java.lang.String[] r11 = new java.lang.String[r9]
            r0.f = r11
            int r11 = r9 >> 1
            u22[] r11 = new defpackage.u22[r11]
            r0.g = r11
            int r11 = r9 + -1
            r0.j = r11
            int r11 = r9 >> 2
            int r9 = r9 - r11
            r0.i = r9
            r9 = r7
            r11 = r9
            r12 = r11
        L_0x00e5:
            if (r9 >= r6) goto L_0x0115
            r13 = r5[r9]
            if (r13 == 0) goto L_0x0111
            int r11 = r11 + 1
            int r14 = r0.b(r13)
            int r14 = r0.a(r14)
            java.lang.String[] r15 = r0.f
            r16 = r15[r14]
            if (r16 != 0) goto L_0x00fe
            r15[r14] = r13
            goto L_0x0111
        L_0x00fe:
            int r14 = r14 >> 1
            u22 r15 = new u22
            u22[] r7 = r0.g
            r8 = r7[r14]
            r15.<init>(r13, r8)
            r7[r14] = r15
            int r7 = r15.c
            int r12 = java.lang.Math.max(r12, r7)
        L_0x0111:
            int r9 = r9 + 1
            r7 = 0
            goto L_0x00e5
        L_0x0115:
            int r5 = r6 >> 1
            r6 = 0
        L_0x0118:
            if (r6 >= r5) goto L_0x014c
            r7 = r10[r6]
        L_0x011c:
            if (r7 == 0) goto L_0x0149
            int r11 = r11 + 1
            java.lang.String r8 = r7.a
            int r9 = r0.b(r8)
            int r9 = r0.a(r9)
            java.lang.String[] r13 = r0.f
            r14 = r13[r9]
            if (r14 != 0) goto L_0x0133
            r13[r9] = r8
            goto L_0x0146
        L_0x0133:
            int r9 = r9 >> 1
            u22 r13 = new u22
            u22[] r14 = r0.g
            r15 = r14[r9]
            r13.<init>(r8, r15)
            r14[r9] = r13
            int r8 = r13.c
            int r12 = java.lang.Math.max(r12, r8)
        L_0x0146:
            u22 r7 = r7.b
            goto L_0x011c
        L_0x0149:
            int r6 = r6 + 1
            goto L_0x0118
        L_0x014c:
            r0.k = r12
            r5 = 0
            r0.m = r5
            int r5 = r0.h
            if (r11 != r5) goto L_0x016c
        L_0x0155:
            int r5 = r2 + r3
            int r6 = r0.c
            r7 = r2
        L_0x015a:
            if (r7 >= r5) goto L_0x0164
            int r6 = r6 * 33
            char r8 = r1[r7]
            int r6 = r6 + r8
            int r7 = r7 + 1
            goto L_0x015a
        L_0x0164:
            if (r6 != 0) goto L_0x0167
            r6 = r4
        L_0x0167:
            int r5 = r0.a(r6)
            goto L_0x0186
        L_0x016c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r0 = r0.h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "Internal error on SymbolTable.rehash(): had %d entries; now have %d"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x0186:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2, r3)
            int r1 = r0.d
            boolean r2 = defpackage.wj6.a(r4, r1)
            if (r2 == 0) goto L_0x0199
            wi7 r2 = defpackage.wi7.b
            java.lang.String r6 = r2.a(r6)
        L_0x0199:
            int r2 = r0.h
            int r2 = r2 + r4
            r0.h = r2
            java.lang.String[] r2 = r0.f
            r3 = r2[r5]
            if (r3 != 0) goto L_0x01a7
            r2[r5] = r6
            goto L_0x020e
        L_0x01a7:
            int r2 = r5 >> 1
            u22 r3 = new u22
            u22[] r4 = r0.g
            r7 = r4[r2]
            r3.<init>(r6, r7)
            r7 = 100
            int r8 = r3.c
            if (r8 <= r7) goto L_0x0204
            java.util.BitSet r3 = r0.m
            if (r3 != 0) goto L_0x01c7
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r0.m = r1
            r1.set(r2)
            goto L_0x01f2
        L_0x01c7:
            boolean r3 = r3.get(r2)
            if (r3 == 0) goto L_0x01ed
            r3 = 3
            boolean r1 = defpackage.wj6.a(r3, r1)
            if (r1 != 0) goto L_0x01d8
            r1 = 0
            r0.e = r1
            goto L_0x01f2
        L_0x01d8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Longest collision chain in symbol table (of size "
            r2.<init>(r3)
            int r0 = r0.h
            java.lang.String r3 = ") now exceeds maximum, 100 -- suspect a DoS attack based on hash collisions"
            java.lang.String r0 = defpackage.wj6.l(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x01ed:
            java.util.BitSet r1 = r0.m
            r1.set(r2)
        L_0x01f2:
            java.lang.String[] r1 = r0.f
            r1[r5] = r6
            u22[] r1 = r0.g
            r3 = 0
            r1[r2] = r3
            int r1 = r0.h
            int r1 = r1 - r8
            r0.h = r1
            r1 = -1
            r0.k = r1
            goto L_0x020e
        L_0x0204:
            r4[r2] = r3
            int r1 = r0.k
            int r1 = java.lang.Math.max(r8, r1)
            r0.k = r1
        L_0x020e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w22.c(char[], int, int, int):java.lang.String");
    }

    public w22(w22 w22, int i2, int i3, v22 v22) {
        this.a = w22;
        this.c = i3;
        this.b = null;
        this.d = i2;
        this.e = wj6.a(2, i2);
        String[] strArr = v22.c;
        this.f = strArr;
        this.g = v22.d;
        this.h = v22.a;
        this.k = v22.b;
        int length = strArr.length;
        this.i = length - (length >> 2);
        this.j = length - 1;
        this.l = true;
    }
}
