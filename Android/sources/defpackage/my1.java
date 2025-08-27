package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: my1  reason: default package */
public final class my1 extends sy1 {
    public final l8b h = new l8b();
    public final ky1 i = new ky1(2);
    public int j = -1;
    public final int k;
    public final jy1[] l;
    public jy1 m;
    public List n;
    public List o;
    public ky1 p;
    public int q;

    public my1(int i2, List list) {
        this.k = i2 == -1 ? 1 : i2;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.l = new jy1[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.l[i3] = new jy1();
        }
        this.m = this.l[0];
    }

    public final b8d e() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new b8d((Object) list);
    }

    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    public final void g(oy1 oy1) {
        ByteBuffer byteBuffer = oy1.v;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        l8b l8b = this.h;
        l8b.E(limit, array);
        while (l8b.a() >= 3) {
            int u = l8b.u();
            int i2 = u & 3;
            boolean z = false;
            boolean z2 = (u & 4) == 4;
            byte u2 = (byte) l8b.u();
            byte u3 = (byte) l8b.u();
            if ((i2 == 2 || i2 == 3) && z2) {
                if (i2 == 3) {
                    j();
                    int i3 = (u2 & 192) >> 6;
                    int i4 = this.j;
                    if (!(i4 == -1 || i3 == (i4 + 1) % 4)) {
                        l();
                        i8b.V("Sequence number discontinuity. previous=" + this.j + " current=" + i3);
                    }
                    this.j = i3;
                    byte b = u2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    ky1 ky1 = new ky1(i3, (int) b);
                    this.p = ky1;
                    ky1.e = 1;
                    ky1.b[0] = u3;
                } else {
                    if (i2 == 2) {
                        z = true;
                    }
                    n79.g(z);
                    ky1 ky12 = this.p;
                    if (ky12 == null) {
                        i8b.o("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        int i5 = ky12.e;
                        int i6 = i5 + 1;
                        ky12.e = i6;
                        byte[] bArr = ky12.b;
                        bArr[i5] = u2;
                        ky12.e = i5 + 2;
                        bArr[i6] = u3;
                    }
                }
                ky1 ky13 = this.p;
                if (ky13.e == (ky13.d * 2) - 1) {
                    j();
                }
            }
        }
    }

    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014d, code lost:
        r3 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014e, code lost:
        r9 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r16 = this;
            r0 = r16
            ky1 r1 = r0.p
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r1.e
            int r1 = r1.d
            r3 = 2
            int r1 = r1 * r3
            r4 = 1
            int r1 = r1 - r4
            if (r2 == r1) goto L_0x0045
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DtvCcPacket ended prematurely; size is "
            r1.<init>(r2)
            ky1 r2 = r0.p
            int r2 = r2.d
            int r2 = r2 * r3
            int r2 = r2 - r4
            r1.append(r2)
            java.lang.String r2 = ", but current index is "
            r1.append(r2)
            ky1 r2 = r0.p
            int r2 = r2.e
            r1.append(r2)
            java.lang.String r2 = " (sequence number "
            r1.append(r2)
            ky1 r2 = r0.p
            int r2 = r2.c
            r1.append(r2)
            java.lang.String r2 = ");"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.m(r1)
        L_0x0045:
            ky1 r1 = r0.p
            byte[] r2 = r1.b
            int r1 = r1.e
            ky1 r5 = r0.i
            r5.o(r1, r2)
            r2 = 0
        L_0x0051:
            int r6 = r5.b()
            if (r6 <= 0) goto L_0x0535
            r6 = 3
            int r7 = r5.i(r6)
            r8 = 5
            int r8 = r5.i(r8)
            r9 = 6
            r10 = 7
            if (r7 != r10) goto L_0x0073
            r5.t(r3)
            int r7 = r5.i(r9)
            if (r7 >= r10) goto L_0x0073
            java.lang.String r11 = "Invalid extended service number: "
            defpackage.i2a.m(r7, r11)
        L_0x0073:
            if (r8 != 0) goto L_0x008f
            if (r7 == 0) goto L_0x0535
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "serviceNumber is non-zero ("
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r3 = ") when blockSize is 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
            goto L_0x0535
        L_0x008f:
            int r11 = r0.k
            if (r7 == r11) goto L_0x0097
            r5.u(r8)
            goto L_0x0051
        L_0x0097:
            int r7 = r5.g()
            int r8 = r8 * 8
            int r8 = r8 + r7
        L_0x009e:
            int r7 = r5.g()
            if (r7 >= r8) goto L_0x0532
            r7 = 8
            int r11 = r5.i(r7)
            r14 = 23
            r12 = 159(0x9f, float:2.23E-43)
            r15 = 127(0x7f, float:1.78E-43)
            r1 = 24
            r13 = 31
            r4 = 16
            if (r11 == r4) goto L_0x03a5
            r9 = 10
            if (r11 > r13) goto L_0x0123
            if (r11 == 0) goto L_0x011f
            if (r11 == r6) goto L_0x0119
            if (r11 == r7) goto L_0x0109
            switch(r11) {
                case 12: goto L_0x0105;
                case 13: goto L_0x00ff;
                case 14: goto L_0x011f;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            r9 = 17
            if (r11 < r9) goto L_0x00e0
            if (r11 > r14) goto L_0x00e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Currently unsupported COMMAND_EXT1 Command: "
            r1.<init>(r4)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
            r5.t(r7)
            goto L_0x011f
        L_0x00e0:
            if (r11 < r1) goto L_0x00f9
            if (r11 > r13) goto L_0x00f9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "Currently unsupported COMMAND_P16 Command: "
            r1.<init>(r7)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.V(r1)
            r5.t(r4)
            goto L_0x011f
        L_0x00f9:
            java.lang.String r1 = "Invalid C0 command: "
            defpackage.i2a.m(r11, r1)
            goto L_0x011f
        L_0x00ff:
            jy1 r1 = r0.m
            r1.a(r9)
            goto L_0x011f
        L_0x0105:
            r16.l()
            goto L_0x011f
        L_0x0109:
            jy1 r1 = r0.m
            android.text.SpannableStringBuilder r1 = r1.b
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x011f
            int r7 = r4 + -1
            r1.delete(r7, r4)
            goto L_0x011f
        L_0x0119:
            java.util.List r1 = r16.k()
            r0.n = r1
        L_0x011f:
            r4 = r3
            r3 = r6
            r11 = r10
            goto L_0x013b
        L_0x0123:
            if (r11 > r15) goto L_0x0140
            if (r11 != r15) goto L_0x012f
            jy1 r1 = r0.m
            r2 = 9835(0x266b, float:1.3782E-41)
            r1.a(r2)
            goto L_0x0137
        L_0x012f:
            jy1 r1 = r0.m
            r2 = r11 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r1.a(r2)
        L_0x0137:
            r4 = r3
            r3 = r6
            r11 = r10
            r2 = 1
        L_0x013b:
            r9 = 1
            r10 = 0
        L_0x013d:
            r12 = 6
            goto L_0x052b
        L_0x0140:
            if (r11 > r12) goto L_0x038f
            r2 = 4
            jy1[] r12 = r0.l
            switch(r11) {
                case 128: goto L_0x037b;
                case 129: goto L_0x037b;
                case 130: goto L_0x037b;
                case 131: goto L_0x037b;
                case 132: goto L_0x037b;
                case 133: goto L_0x037b;
                case 134: goto L_0x037b;
                case 135: goto L_0x037b;
                case 136: goto L_0x0351;
                case 137: goto L_0x033b;
                case 138: goto L_0x0327;
                case 139: goto L_0x0310;
                case 140: goto L_0x02fc;
                case 141: goto L_0x02f6;
                case 142: goto L_0x014d;
                case 143: goto L_0x02f0;
                case 144: goto L_0x02c5;
                case 145: goto L_0x0278;
                case 146: goto L_0x0253;
                case 147: goto L_0x0148;
                case 148: goto L_0x0148;
                case 149: goto L_0x0148;
                case 150: goto L_0x0148;
                case 151: goto L_0x0205;
                case 152: goto L_0x0152;
                case 153: goto L_0x0152;
                case 154: goto L_0x0152;
                case 155: goto L_0x0152;
                case 156: goto L_0x0152;
                case 157: goto L_0x0152;
                case 158: goto L_0x0152;
                case 159: goto L_0x0152;
                default: goto L_0x0148;
            }
        L_0x0148:
            java.lang.String r1 = "Invalid C1 command: "
            defpackage.i2a.m(r11, r1)
        L_0x014d:
            r3 = r6
        L_0x014e:
            r9 = 1
        L_0x014f:
            r10 = 0
            goto L_0x038a
        L_0x0152:
            int r11 = r11 + -152
            r1 = r12[r11]
            r5.t(r3)
            boolean r4 = r5.h()
            r5.t(r3)
            int r9 = r5.i(r6)
            boolean r13 = r5.h()
            int r14 = r5.i(r10)
            int r7 = r5.i(r7)
            int r15 = r5.i(r2)
            int r2 = r5.i(r2)
            r5.t(r3)
            r10 = 6
            r5.t(r10)
            r5.t(r3)
            int r10 = r5.i(r6)
            int r3 = r5.i(r6)
            r6 = 1
            r1.c = r6
            r1.d = r4
            r1.e = r9
            r1.f = r13
            r1.g = r14
            r1.h = r7
            r1.i = r15
            int r4 = r1.j
            int r2 = r2 + r6
            if (r4 == r2) goto L_0x01b7
            r1.j = r2
        L_0x01a0:
            java.util.ArrayList r2 = r1.a
            int r4 = r2.size()
            int r6 = r1.j
            if (r4 >= r6) goto L_0x01b2
            int r4 = r2.size()
            r6 = 15
            if (r4 < r6) goto L_0x01b7
        L_0x01b2:
            r4 = 0
            r2.remove(r4)
            goto L_0x01a0
        L_0x01b7:
            if (r10 == 0) goto L_0x01d9
            int r2 = r1.l
            if (r2 == r10) goto L_0x01d9
            r1.l = r10
            int r10 = r10 + -1
            int[] r2 = defpackage.jy1.B
            r2 = r2[r10]
            boolean[] r4 = defpackage.jy1.A
            boolean r4 = r4[r10]
            int[] r4 = defpackage.jy1.y
            r4 = r4[r10]
            int[] r4 = defpackage.jy1.z
            r4 = r4[r10]
            int[] r4 = defpackage.jy1.x
            r4 = r4[r10]
            r1.n = r2
            r1.k = r4
        L_0x01d9:
            if (r3 == 0) goto L_0x01f8
            int r2 = r1.m
            if (r2 == r3) goto L_0x01f8
            r1.m = r3
            int r3 = r3 + -1
            int[] r2 = defpackage.jy1.D
            r2 = r2[r3]
            int[] r2 = defpackage.jy1.C
            r2 = r2[r3]
            r2 = 0
            r1.e(r2, r2)
            int[] r2 = defpackage.jy1.E
            r2 = r2[r3]
            int r3 = defpackage.jy1.v
            r1.f(r3, r2)
        L_0x01f8:
            int r1 = r0.q
            if (r1 == r11) goto L_0x0202
            r0.q = r11
            r1 = r12[r11]
            r0.m = r1
        L_0x0202:
            r3 = 3
            goto L_0x014e
        L_0x0205:
            jy1 r1 = r0.m
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x0211
            r1 = 32
            r5.t(r1)
            goto L_0x0202
        L_0x0211:
            r1 = 2
            int r2 = r5.i(r1)
            int r3 = r5.i(r1)
            int r4 = r5.i(r1)
            int r6 = r5.i(r1)
            int r2 = defpackage.jy1.c(r3, r4, r6, r2)
            r5.i(r1)
            int r3 = r5.i(r1)
            int r4 = r5.i(r1)
            int r6 = r5.i(r1)
            r9 = 0
            defpackage.jy1.c(r3, r4, r6, r9)
            r5.h()
            r5.h()
            r5.i(r1)
            r5.i(r1)
            int r3 = r5.i(r1)
            r5.t(r7)
            jy1 r1 = r0.m
            r1.n = r2
            r1.k = r3
            goto L_0x0202
        L_0x0253:
            jy1 r1 = r0.m
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x025d
            r5.t(r4)
            goto L_0x0202
        L_0x025d:
            r5.t(r2)
            int r1 = r5.i(r2)
            r2 = 2
            r5.t(r2)
            r2 = 6
            r5.i(r2)
            jy1 r2 = r0.m
            int r3 = r2.u
            if (r3 == r1) goto L_0x0275
            r2.a(r9)
        L_0x0275:
            r2.u = r1
            goto L_0x0202
        L_0x0278:
            jy1 r2 = r0.m
            boolean r2 = r2.c
            if (r2 != 0) goto L_0x0282
            r5.t(r1)
            goto L_0x0202
        L_0x0282:
            r1 = 2
            int r2 = r5.i(r1)
            int r3 = r5.i(r1)
            int r4 = r5.i(r1)
            int r6 = r5.i(r1)
            int r2 = defpackage.jy1.c(r3, r4, r6, r2)
            int r3 = r5.i(r1)
            int r4 = r5.i(r1)
            int r6 = r5.i(r1)
            int r7 = r5.i(r1)
            int r3 = defpackage.jy1.c(r4, r6, r7, r3)
            r5.t(r1)
            int r4 = r5.i(r1)
            int r6 = r5.i(r1)
            int r7 = r5.i(r1)
            r1 = 0
            defpackage.jy1.c(r4, r6, r7, r1)
            jy1 r1 = r0.m
            r1.f(r2, r3)
            goto L_0x0202
        L_0x02c5:
            jy1 r1 = r0.m
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x02d0
            r5.t(r4)
            goto L_0x0202
        L_0x02d0:
            r5.i(r2)
            r1 = 2
            r5.i(r1)
            r5.i(r1)
            boolean r1 = r5.h()
            boolean r2 = r5.h()
            r3 = 3
            r5.i(r3)
            r5.i(r3)
            jy1 r4 = r0.m
            r4.e(r1, r2)
            goto L_0x014e
        L_0x02f0:
            r3 = r6
            r16.l()
            goto L_0x014e
        L_0x02f6:
            r3 = r6
            r5.t(r7)
            goto L_0x014e
        L_0x02fc:
            r3 = r6
            r1 = 1
        L_0x02fe:
            if (r1 > r7) goto L_0x014e
            boolean r2 = r5.h()
            if (r2 == 0) goto L_0x030d
            int r2 = 8 - r1
            r2 = r12[r2]
            r2.d()
        L_0x030d:
            int r1 = r1 + 1
            goto L_0x02fe
        L_0x0310:
            r3 = r6
            r6 = 1
        L_0x0312:
            if (r6 > r7) goto L_0x014e
            boolean r1 = r5.h()
            if (r1 == 0) goto L_0x0324
            int r1 = 8 - r6
            r1 = r12[r1]
            boolean r2 = r1.d
            r4 = 1
            r2 = r2 ^ r4
            r1.d = r2
        L_0x0324:
            int r6 = r6 + 1
            goto L_0x0312
        L_0x0327:
            r3 = r6
            r6 = 1
        L_0x0329:
            if (r6 > r7) goto L_0x014e
            boolean r1 = r5.h()
            if (r1 == 0) goto L_0x0338
            int r1 = 8 - r6
            r1 = r12[r1]
            r2 = 0
            r1.d = r2
        L_0x0338:
            int r6 = r6 + 1
            goto L_0x0329
        L_0x033b:
            r3 = r6
            r6 = 1
        L_0x033d:
            if (r6 > r7) goto L_0x014e
            boolean r1 = r5.h()
            if (r1 == 0) goto L_0x034d
            int r1 = 8 - r6
            r1 = r12[r1]
            r9 = 1
            r1.d = r9
            goto L_0x034e
        L_0x034d:
            r9 = 1
        L_0x034e:
            int r6 = r6 + 1
            goto L_0x033d
        L_0x0351:
            r3 = r6
            r9 = 1
            r6 = r9
        L_0x0354:
            if (r6 > r7) goto L_0x014f
            boolean r1 = r5.h()
            if (r1 == 0) goto L_0x0377
            int r1 = 8 - r6
            r1 = r12[r1]
            java.util.ArrayList r2 = r1.a
            r2.clear()
            android.text.SpannableStringBuilder r2 = r1.b
            r2.clear()
            r2 = -1
            r1.o = r2
            r1.p = r2
            r1.q = r2
            r1.s = r2
            r10 = 0
            r1.u = r10
            goto L_0x0378
        L_0x0377:
            r10 = 0
        L_0x0378:
            int r6 = r6 + 1
            goto L_0x0354
        L_0x037b:
            r3 = r6
            r9 = 1
            r10 = 0
            int r11 = r11 + -128
            int r1 = r0.q
            if (r1 == r11) goto L_0x038a
            r0.q = r11
            r1 = r12[r11]
            r0.m = r1
        L_0x038a:
            r2 = r9
        L_0x038b:
            r4 = 2
            r11 = 7
            goto L_0x013d
        L_0x038f:
            r3 = r6
            r1 = 255(0xff, float:3.57E-43)
            r9 = 1
            r10 = 0
            if (r11 > r1) goto L_0x039f
            jy1 r1 = r0.m
            r2 = r11 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r1.a(r2)
            goto L_0x038a
        L_0x039f:
            java.lang.String r1 = "Invalid base command: "
            defpackage.i2a.m(r11, r1)
            goto L_0x038b
        L_0x03a5:
            r3 = r6
            r9 = 1
            r10 = 0
            int r6 = r5.i(r7)
            if (r6 > r13) goto L_0x03ca
            r11 = 7
            if (r6 > r11) goto L_0x03b3
            goto L_0x04df
        L_0x03b3:
            r12 = 15
            if (r6 > r12) goto L_0x03bc
            r5.t(r7)
            goto L_0x04df
        L_0x03bc:
            if (r6 > r14) goto L_0x03c3
            r5.t(r4)
            goto L_0x04df
        L_0x03c3:
            if (r6 > r13) goto L_0x04df
            r5.t(r1)
            goto L_0x04df
        L_0x03ca:
            r11 = 7
            r1 = 160(0xa0, float:2.24E-43)
            if (r6 > r15) goto L_0x04e2
            r4 = 32
            if (r6 == r4) goto L_0x04d7
            r2 = 33
            if (r6 == r2) goto L_0x04d1
            r1 = 37
            if (r6 == r1) goto L_0x04c9
            r1 = 42
            if (r6 == r1) goto L_0x04c1
            r1 = 44
            if (r6 == r1) goto L_0x04b9
            r1 = 63
            if (r6 == r1) goto L_0x04b1
            r1 = 57
            if (r6 == r1) goto L_0x04a9
            r1 = 58
            if (r6 == r1) goto L_0x04a1
            r1 = 60
            if (r6 == r1) goto L_0x0499
            r1 = 61
            if (r6 == r1) goto L_0x0491
            switch(r6) {
                case 48: goto L_0x0489;
                case 49: goto L_0x0481;
                case 50: goto L_0x0479;
                case 51: goto L_0x0470;
                case 52: goto L_0x0467;
                case 53: goto L_0x045e;
                default: goto L_0x03fa;
            }
        L_0x03fa:
            switch(r6) {
                case 118: goto L_0x0455;
                case 119: goto L_0x044c;
                case 120: goto L_0x0443;
                case 121: goto L_0x043a;
                case 122: goto L_0x0431;
                case 123: goto L_0x0428;
                case 124: goto L_0x041f;
                case 125: goto L_0x0416;
                case 126: goto L_0x040d;
                case 127: goto L_0x0404;
                default: goto L_0x03fd;
            }
        L_0x03fd:
            java.lang.String r1 = "Invalid G2 character: "
            defpackage.i2a.m(r6, r1)
            goto L_0x04de
        L_0x0404:
            jy1 r1 = r0.m
            r2 = 9484(0x250c, float:1.329E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x040d:
            jy1 r1 = r0.m
            r2 = 9496(0x2518, float:1.3307E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0416:
            jy1 r1 = r0.m
            r2 = 9472(0x2500, float:1.3273E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x041f:
            jy1 r1 = r0.m
            r2 = 9492(0x2514, float:1.3301E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0428:
            jy1 r1 = r0.m
            r2 = 9488(0x2510, float:1.3296E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0431:
            jy1 r1 = r0.m
            r2 = 9474(0x2502, float:1.3276E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x043a:
            jy1 r1 = r0.m
            r2 = 8542(0x215e, float:1.197E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0443:
            jy1 r1 = r0.m
            r2 = 8541(0x215d, float:1.1968E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x044c:
            jy1 r1 = r0.m
            r2 = 8540(0x215c, float:1.1967E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0455:
            jy1 r1 = r0.m
            r2 = 8539(0x215b, float:1.1966E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x045e:
            jy1 r1 = r0.m
            r2 = 8226(0x2022, float:1.1527E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0467:
            jy1 r1 = r0.m
            r2 = 8221(0x201d, float:1.152E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0470:
            jy1 r1 = r0.m
            r2 = 8220(0x201c, float:1.1519E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0479:
            jy1 r1 = r0.m
            r2 = 8217(0x2019, float:1.1514E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0481:
            jy1 r1 = r0.m
            r2 = 8216(0x2018, float:1.1513E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0489:
            jy1 r1 = r0.m
            r2 = 9608(0x2588, float:1.3464E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0491:
            jy1 r1 = r0.m
            r2 = 8480(0x2120, float:1.1883E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x0499:
            jy1 r1 = r0.m
            r2 = 339(0x153, float:4.75E-43)
            r1.a(r2)
            goto L_0x04de
        L_0x04a1:
            jy1 r1 = r0.m
            r2 = 353(0x161, float:4.95E-43)
            r1.a(r2)
            goto L_0x04de
        L_0x04a9:
            jy1 r1 = r0.m
            r2 = 8482(0x2122, float:1.1886E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x04b1:
            jy1 r1 = r0.m
            r2 = 376(0x178, float:5.27E-43)
            r1.a(r2)
            goto L_0x04de
        L_0x04b9:
            jy1 r1 = r0.m
            r2 = 338(0x152, float:4.74E-43)
            r1.a(r2)
            goto L_0x04de
        L_0x04c1:
            jy1 r1 = r0.m
            r2 = 352(0x160, float:4.93E-43)
            r1.a(r2)
            goto L_0x04de
        L_0x04c9:
            jy1 r1 = r0.m
            r2 = 8230(0x2026, float:1.1533E-41)
            r1.a(r2)
            goto L_0x04de
        L_0x04d1:
            jy1 r2 = r0.m
            r2.a(r1)
            goto L_0x04de
        L_0x04d7:
            jy1 r1 = r0.m
            r4 = 32
            r1.a(r4)
        L_0x04de:
            r2 = r9
        L_0x04df:
            r4 = 2
            goto L_0x013d
        L_0x04e2:
            r4 = 32
            if (r6 > r12) goto L_0x0508
            r1 = 135(0x87, float:1.89E-43)
            if (r6 > r1) goto L_0x04ee
            r5.t(r4)
            goto L_0x04df
        L_0x04ee:
            r1 = 143(0x8f, float:2.0E-43)
            if (r6 > r1) goto L_0x04f8
            r1 = 40
            r5.t(r1)
            goto L_0x04df
        L_0x04f8:
            if (r6 > r12) goto L_0x04df
            r4 = 2
            r5.t(r4)
            r12 = 6
            int r1 = r5.i(r12)
            int r1 = r1 * r7
            r5.t(r1)
            goto L_0x052b
        L_0x0508:
            r4 = 2
            r7 = 255(0xff, float:3.57E-43)
            r12 = 6
            if (r6 > r7) goto L_0x0526
            if (r6 != r1) goto L_0x0518
            jy1 r1 = r0.m
            r2 = 13252(0x33c4, float:1.857E-41)
            r1.a(r2)
            goto L_0x0524
        L_0x0518:
            java.lang.String r1 = "Invalid G3 character: "
            defpackage.i2a.m(r6, r1)
            jy1 r1 = r0.m
            r2 = 95
            r1.a(r2)
        L_0x0524:
            r2 = r9
            goto L_0x052b
        L_0x0526:
            java.lang.String r1 = "Invalid extended command: "
            defpackage.i2a.m(r6, r1)
        L_0x052b:
            r6 = r3
            r3 = r4
            r4 = r9
            r10 = r11
            r9 = r12
            goto L_0x009e
        L_0x0532:
            r9 = r4
            goto L_0x0051
        L_0x0535:
            if (r2 == 0) goto L_0x053d
            java.util.List r1 = r16.k()
            r0.n = r1
        L_0x053d:
            r1 = 0
            r0.p = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my1.j():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List k() {
        /*
            r17 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L_0x0007:
            r3 = 8
            if (r2 >= r3) goto L_0x00f4
            r3 = r17
            jy1[] r4 = r3.l
            r5 = r4[r2]
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x00f0
            java.util.ArrayList r6 = r5.a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0027
            android.text.SpannableStringBuilder r5 = r5.b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0027
            goto L_0x00f0
        L_0x0027:
            r4 = r4[r2]
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x00f0
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x00ea
            java.util.ArrayList r5 = r4.a
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0043
            android.text.SpannableStringBuilder r6 = r4.b
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0043
            goto L_0x00ea
        L_0x0043:
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            r6 = r1
        L_0x0049:
            int r7 = r5.size()
            if (r6 >= r7) goto L_0x0060
            java.lang.Object r7 = r5.get(r6)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r8.append(r7)
            r7 = 10
            r8.append(r7)
            int r6 = r6 + 1
            goto L_0x0049
        L_0x0060:
            android.text.SpannableString r5 = r4.b()
            r8.append(r5)
            int r5 = r4.k
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x0092
            if (r5 == r6) goto L_0x008f
            if (r5 == r7) goto L_0x008b
            r9 = 3
            if (r5 != r9) goto L_0x0075
            goto L_0x0092
        L_0x0075:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected justification value: "
            r1.<init>(r2)
            int r2 = r4.k
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008b:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x008d:
            r9 = r5
            goto L_0x0095
        L_0x008f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x008d
        L_0x0092:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x008d
        L_0x0095:
            boolean r5 = r4.f
            if (r5 == 0) goto L_0x00a4
            int r5 = r4.h
            float r5 = (float) r5
            r10 = 1120272384(0x42c60000, float:99.0)
            float r5 = r5 / r10
            int r11 = r4.g
            float r11 = (float) r11
            float r11 = r11 / r10
            goto L_0x00b1
        L_0x00a4:
            int r5 = r4.h
            float r5 = (float) r5
            r10 = 1129381888(0x43510000, float:209.0)
            float r5 = r5 / r10
            int r10 = r4.g
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r11 = r10 / r11
        L_0x00b1:
            r10 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r10
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r5 = r5 + r12
            float r11 = r11 * r10
            float r10 = r11 + r12
            int r11 = r4.i
            int r12 = r11 / 3
            if (r12 != 0) goto L_0x00c4
            r12 = r1
            goto L_0x00c9
        L_0x00c4:
            if (r12 != r6) goto L_0x00c8
            r12 = r6
            goto L_0x00c9
        L_0x00c8:
            r12 = r7
        L_0x00c9:
            int r11 = r11 % 3
            if (r11 != 0) goto L_0x00cf
            r13 = r1
            goto L_0x00d4
        L_0x00cf:
            if (r11 != r6) goto L_0x00d3
            r13 = r6
            goto L_0x00d4
        L_0x00d3:
            r13 = r7
        L_0x00d4:
            int r15 = r4.n
            int r7 = defpackage.jy1.w
            if (r15 == r7) goto L_0x00dc
            r14 = r6
            goto L_0x00dd
        L_0x00dc:
            r14 = r1
        L_0x00dd:
            hy1 r6 = new hy1
            int r4 = r4.e
            r7 = r6
            r11 = r12
            r12 = r5
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00eb
        L_0x00ea:
            r6 = 0
        L_0x00eb:
            if (r6 == 0) goto L_0x00f0
            r0.add(r6)
        L_0x00f0:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x00f4:
            v00 r2 = defpackage.hy1.c
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
        L_0x0102:
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x0116
            java.lang.Object r3 = r0.get(r1)
            hy1 r3 = (defpackage.hy1) r3
            n44 r3 = r3.a
            r2.add(r3)
            int r1 = r1 + 1
            goto L_0x0102
        L_0x0116:
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my1.k():java.util.List");
    }

    public final void l() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.l[i2].d();
        }
    }
}
