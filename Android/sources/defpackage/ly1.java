package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: ly1  reason: default package */
public final class ly1 extends ry1 {
    public final int X;
    public final iy1[] Y;
    public iy1 Z;
    public List v0;
    public List w0;
    public final g1g x = new g1g(3, false);
    public g1g x0;
    public final ky1 y = new ky1(1);
    public int y0;
    public int z = -1;

    public ly1(int i, List list) {
        this.X = i == -1 ? 1 : i;
        if (list != null && list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
            byte b = ((byte[]) list.get(0))[0];
        }
        this.Y = new iy1[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.Y[i2] = new iy1();
        }
        this.Z = this.Y[0];
    }

    public final ty1 a() {
        List list = this.v0;
        this.w0 = list;
        list.getClass();
        return new ty1(0, list);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, g1g] */
    public final void c(ny1 ny1) {
        ByteBuffer byteBuffer = ny1.o;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        g1g g1g = this.x;
        g1g.F(limit, array);
        while (g1g.c() >= 3) {
            int v = g1g.v();
            int i = v & 3;
            boolean z2 = false;
            boolean z3 = (v & 4) == 4;
            byte v2 = (byte) g1g.v();
            byte v3 = (byte) g1g.v();
            if ((i == 2 || i == 3) && z3) {
                if (i == 3) {
                    h();
                    int i2 = (v2 & 192) >> 6;
                    int i3 = this.z;
                    if (!(i3 == -1 || i2 == (i3 + 1) % 4)) {
                        j();
                    }
                    this.z = i2;
                    byte b = v2 & 63;
                    if (b == 0) {
                        b = 64;
                    }
                    ? obj = new Object();
                    obj.b = b;
                    obj.a = new byte[((b * 2) - 1)];
                    obj.c = 0;
                    this.x0 = obj;
                    obj.c = 1;
                    obj.a[0] = v3;
                } else {
                    if (i == 2) {
                        z2 = true;
                    }
                    y64.g(z2);
                    g1g g1g2 = this.x0;
                    if (g1g2 != null) {
                        int i4 = g1g2.c;
                        int i5 = i4 + 1;
                        g1g2.c = i5;
                        byte[] bArr = g1g2.a;
                        bArr[i4] = v2;
                        g1g2.c = i4 + 2;
                        bArr[i5] = v3;
                    }
                }
                g1g g1g3 = this.x0;
                if (g1g3.c == (g1g3.b * 2) - 1) {
                    h();
                }
            }
        }
    }

    public final void flush() {
        super.flush();
        this.v0 = null;
        this.w0 = null;
        this.y0 = 0;
        this.Z = this.Y[0];
        j();
        this.x0 = null;
    }

    public final boolean g() {
        return this.v0 != this.w0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0189, code lost:
        r5 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r17 = this;
            r0 = r17
            g1g r1 = r0.x0
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r1.c
            byte[] r1 = r1.a
            ky1 r3 = r0.y
            r3.o(r2, r1)
            r1 = 3
            int r2 = r3.i(r1)
            r4 = 5
            int r4 = r3.i(r4)
            r5 = 2
            r6 = 6
            r7 = 7
            if (r2 != r7) goto L_0x0026
            r3.t(r5)
            int r2 = r3.i(r6)
        L_0x0026:
            if (r4 != 0) goto L_0x002a
            goto L_0x04e5
        L_0x002a:
            int r8 = r0.X
            if (r2 == r8) goto L_0x0030
            goto L_0x04e5
        L_0x0030:
            int r2 = r3.g()
            r8 = 8
            int r4 = r4 * r8
            int r4 = r4 + r2
            r9 = 0
        L_0x0039:
            int r10 = r3.b()
            if (r10 <= 0) goto L_0x04dd
            int r10 = r3.g()
            if (r10 >= r4) goto L_0x04dd
            int r10 = r3.i(r8)
            r14 = 23
            r11 = 159(0x9f, float:2.23E-43)
            r15 = 127(0x7f, float:1.78E-43)
            r2 = 24
            r13 = 31
            r12 = 16
            if (r10 == r12) goto L_0x0357
            r6 = 10
            if (r10 > r13) goto L_0x009c
            if (r10 == 0) goto L_0x0096
            if (r10 == r1) goto L_0x0090
            if (r10 == r8) goto L_0x0080
            switch(r10) {
                case 12: goto L_0x007c;
                case 13: goto L_0x0076;
                case 14: goto L_0x0096;
                default: goto L_0x0064;
            }
        L_0x0064:
            r6 = 17
            if (r10 < r6) goto L_0x006e
            if (r10 > r14) goto L_0x006e
            r3.t(r8)
            goto L_0x0096
        L_0x006e:
            if (r10 < r2) goto L_0x0096
            if (r10 > r13) goto L_0x0096
            r3.t(r12)
            goto L_0x0096
        L_0x0076:
            iy1 r2 = r0.Z
            r2.a(r6)
            goto L_0x0096
        L_0x007c:
            r17.j()
            goto L_0x0096
        L_0x0080:
            iy1 r2 = r0.Z
            android.text.SpannableStringBuilder r2 = r2.b
            int r6 = r2.length()
            if (r6 <= 0) goto L_0x0096
            int r10 = r6 + -1
            r2.delete(r10, r6)
            goto L_0x0096
        L_0x0090:
            java.util.List r2 = r17.i()
            r0.v0 = r2
        L_0x0096:
            r16 = r4
            r2 = r5
            r11 = r8
            r6 = 0
            goto L_0x00b6
        L_0x009c:
            if (r10 > r15) goto L_0x00bb
            if (r10 != r15) goto L_0x00a8
            iy1 r2 = r0.Z
            r6 = 9835(0x266b, float:1.3782E-41)
            r2.a(r6)
            goto L_0x00b0
        L_0x00a8:
            iy1 r2 = r0.Z
            r6 = r10 & 255(0xff, float:3.57E-43)
            char r6 = (char) r6
            r2.a(r6)
        L_0x00b0:
            r16 = r4
            r2 = r5
            r11 = r8
            r6 = 0
            r9 = 1
        L_0x00b6:
            r10 = 6
            r4 = r1
            r8 = r7
            goto L_0x04d4
        L_0x00bb:
            if (r10 > r11) goto L_0x0345
            r9 = 4
            iy1[] r11 = r0.Y
            switch(r10) {
                case 128: goto L_0x032c;
                case 129: goto L_0x032c;
                case 130: goto L_0x032c;
                case 131: goto L_0x032c;
                case 132: goto L_0x032c;
                case 133: goto L_0x032c;
                case 134: goto L_0x032c;
                case 135: goto L_0x032c;
                case 136: goto L_0x02fd;
                case 137: goto L_0x02e2;
                case 138: goto L_0x02c9;
                case 139: goto L_0x02ad;
                case 140: goto L_0x0294;
                case 141: goto L_0x028b;
                case 142: goto L_0x00c3;
                case 143: goto L_0x0283;
                case 144: goto L_0x0256;
                case 145: goto L_0x0206;
                case 146: goto L_0x01df;
                case 147: goto L_0x00c3;
                case 148: goto L_0x00c3;
                case 149: goto L_0x00c3;
                case 150: goto L_0x00c3;
                case 151: goto L_0x018d;
                case 152: goto L_0x00ca;
                case 153: goto L_0x00ca;
                case 154: goto L_0x00ca;
                case 155: goto L_0x00ca;
                case 156: goto L_0x00ca;
                case 157: goto L_0x00ca;
                case 158: goto L_0x00ca;
                case 159: goto L_0x00ca;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            r16 = r4
            r5 = 1
            r6 = 0
            r4 = r1
            goto L_0x033d
        L_0x00ca:
            int r10 = r10 + -152
            r2 = r11[r10]
            r3.t(r5)
            boolean r6 = r3.h()
            boolean r12 = r3.h()
            r3.h()
            int r13 = r3.i(r1)
            boolean r14 = r3.h()
            int r15 = r3.i(r7)
            int r7 = r3.i(r8)
            int r8 = r3.i(r9)
            int r9 = r3.i(r9)
            r3.t(r5)
            r1 = 6
            r3.i(r1)
            r3.t(r5)
            r1 = 3
            int r5 = r3.i(r1)
            r16 = r4
            int r4 = r3.i(r1)
            r1 = 1
            r2.c = r1
            r2.d = r6
            r2.k = r12
            r2.e = r13
            r2.f = r14
            r2.g = r15
            r2.h = r7
            r2.i = r8
            int r6 = r2.j
            int r9 = r9 + r1
            if (r6 == r9) goto L_0x013d
            r2.j = r9
        L_0x0121:
            java.util.ArrayList r1 = r2.a
            if (r12 == 0) goto L_0x0130
            int r6 = r1.size()
            int r7 = r2.j
            if (r6 >= r7) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            r6 = 0
            goto L_0x0139
        L_0x0130:
            int r6 = r1.size()
            r7 = 15
            if (r6 < r7) goto L_0x013d
            goto L_0x012e
        L_0x0139:
            r1.remove(r6)
            goto L_0x0121
        L_0x013d:
            if (r5 == 0) goto L_0x015f
            int r1 = r2.m
            if (r1 == r5) goto L_0x015f
            r2.m = r5
            int r5 = r5 + -1
            int[] r1 = defpackage.iy1.C
            r1 = r1[r5]
            boolean[] r6 = defpackage.iy1.B
            boolean r6 = r6[r5]
            int[] r6 = defpackage.iy1.z
            r6 = r6[r5]
            int[] r6 = defpackage.iy1.A
            r6 = r6[r5]
            int[] r6 = defpackage.iy1.y
            r5 = r6[r5]
            r2.o = r1
            r2.l = r5
        L_0x015f:
            if (r4 == 0) goto L_0x017e
            int r1 = r2.n
            if (r1 == r4) goto L_0x017e
            r2.n = r4
            int r4 = r4 + -1
            int[] r1 = defpackage.iy1.E
            r1 = r1[r4]
            int[] r1 = defpackage.iy1.D
            r1 = r1[r4]
            r1 = 0
            r2.e(r1, r1)
            int[] r1 = defpackage.iy1.F
            r1 = r1[r4]
            int r4 = defpackage.iy1.w
            r2.f(r4, r1)
        L_0x017e:
            int r1 = r0.y0
            if (r1 == r10) goto L_0x0188
            r0.y0 = r10
            r1 = r11[r10]
            r0.Z = r1
        L_0x0188:
            r4 = 3
        L_0x0189:
            r5 = 1
        L_0x018a:
            r6 = 0
            goto L_0x033d
        L_0x018d:
            r16 = r4
            iy1 r1 = r0.Z
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x019b
            r1 = 32
            r3.t(r1)
            goto L_0x0188
        L_0x019b:
            r1 = 2
            int r2 = r3.i(r1)
            int r4 = r3.i(r1)
            int r5 = r3.i(r1)
            int r6 = r3.i(r1)
            int r2 = defpackage.iy1.c(r4, r5, r6, r2)
            r3.i(r1)
            int r4 = r3.i(r1)
            int r5 = r3.i(r1)
            int r6 = r3.i(r1)
            r7 = 0
            defpackage.iy1.c(r4, r5, r6, r7)
            r3.h()
            r3.h()
            r3.i(r1)
            r3.i(r1)
            int r4 = r3.i(r1)
            r1 = 8
            r3.t(r1)
            iy1 r1 = r0.Z
            r1.o = r2
            r1.l = r4
            goto L_0x0188
        L_0x01df:
            r16 = r4
            iy1 r1 = r0.Z
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x01eb
            r3.t(r12)
            goto L_0x0188
        L_0x01eb:
            r3.t(r9)
            int r1 = r3.i(r9)
            r2 = 2
            r3.t(r2)
            r2 = 6
            r3.i(r2)
            iy1 r2 = r0.Z
            int r4 = r2.v
            if (r4 == r1) goto L_0x0203
            r2.a(r6)
        L_0x0203:
            r2.v = r1
            goto L_0x0188
        L_0x0206:
            r16 = r4
            iy1 r1 = r0.Z
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x0213
            r3.t(r2)
            goto L_0x0188
        L_0x0213:
            r1 = 2
            int r2 = r3.i(r1)
            int r4 = r3.i(r1)
            int r5 = r3.i(r1)
            int r6 = r3.i(r1)
            int r2 = defpackage.iy1.c(r4, r5, r6, r2)
            int r4 = r3.i(r1)
            int r5 = r3.i(r1)
            int r6 = r3.i(r1)
            int r7 = r3.i(r1)
            int r4 = defpackage.iy1.c(r5, r6, r7, r4)
            r3.t(r1)
            int r5 = r3.i(r1)
            int r6 = r3.i(r1)
            int r7 = r3.i(r1)
            r1 = 0
            defpackage.iy1.c(r5, r6, r7, r1)
            iy1 r1 = r0.Z
            r1.f(r2, r4)
            goto L_0x0188
        L_0x0256:
            r16 = r4
            iy1 r1 = r0.Z
            boolean r1 = r1.c
            if (r1 != 0) goto L_0x0263
            r3.t(r12)
            goto L_0x0188
        L_0x0263:
            r3.i(r9)
            r1 = 2
            r3.i(r1)
            r3.i(r1)
            boolean r1 = r3.h()
            boolean r2 = r3.h()
            r4 = 3
            r3.i(r4)
            r3.i(r4)
            iy1 r5 = r0.Z
            r5.e(r1, r2)
            goto L_0x0189
        L_0x0283:
            r16 = r4
            r4 = r1
            r17.j()
            goto L_0x0189
        L_0x028b:
            r16 = r4
            r4 = r1
            r1 = r8
            r3.t(r1)
            goto L_0x0189
        L_0x0294:
            r16 = r4
            r4 = r1
            r1 = r8
            r2 = 1
        L_0x0299:
            if (r2 > r1) goto L_0x0189
            boolean r1 = r3.h()
            if (r1 == 0) goto L_0x02a8
            int r1 = 8 - r2
            r1 = r11[r1]
            r1.d()
        L_0x02a8:
            int r2 = r2 + 1
            r1 = 8
            goto L_0x0299
        L_0x02ad:
            r16 = r4
            r4 = r1
            r2 = r8
            r1 = 1
        L_0x02b2:
            if (r1 > r2) goto L_0x0189
            boolean r2 = r3.h()
            if (r2 == 0) goto L_0x02c4
            int r2 = 8 - r1
            r2 = r11[r2]
            boolean r5 = r2.d
            r6 = 1
            r5 = r5 ^ r6
            r2.d = r5
        L_0x02c4:
            int r1 = r1 + 1
            r2 = 8
            goto L_0x02b2
        L_0x02c9:
            r16 = r4
            r4 = r1
            r2 = r8
            r1 = 1
        L_0x02ce:
            if (r1 > r2) goto L_0x0189
            boolean r2 = r3.h()
            if (r2 == 0) goto L_0x02dd
            int r2 = 8 - r1
            r2 = r11[r2]
            r5 = 0
            r2.d = r5
        L_0x02dd:
            int r1 = r1 + 1
            r2 = 8
            goto L_0x02ce
        L_0x02e2:
            r16 = r4
            r4 = r1
            r2 = r8
            r1 = 1
        L_0x02e7:
            if (r1 > r2) goto L_0x0189
            boolean r2 = r3.h()
            if (r2 == 0) goto L_0x02f7
            int r2 = 8 - r1
            r2 = r11[r2]
            r5 = 1
            r2.d = r5
            goto L_0x02f8
        L_0x02f7:
            r5 = 1
        L_0x02f8:
            int r1 = r1 + 1
            r2 = 8
            goto L_0x02e7
        L_0x02fd:
            r16 = r4
            r5 = 1
            r4 = r1
            r1 = r5
            r2 = r8
        L_0x0303:
            if (r1 > r2) goto L_0x018a
            boolean r2 = r3.h()
            if (r2 == 0) goto L_0x0326
            int r2 = 8 - r1
            r2 = r11[r2]
            java.util.ArrayList r6 = r2.a
            r6.clear()
            android.text.SpannableStringBuilder r6 = r2.b
            r6.clear()
            r6 = -1
            r2.p = r6
            r2.q = r6
            r2.r = r6
            r2.t = r6
            r6 = 0
            r2.v = r6
            goto L_0x0327
        L_0x0326:
            r6 = 0
        L_0x0327:
            int r1 = r1 + 1
            r2 = 8
            goto L_0x0303
        L_0x032c:
            r16 = r4
            r5 = 1
            r6 = 0
            r4 = r1
            int r10 = r10 + -128
            int r1 = r0.y0
            if (r1 == r10) goto L_0x033d
            r0.y0 = r10
            r1 = r11[r10]
            r0.Z = r1
        L_0x033d:
            r9 = r5
        L_0x033e:
            r2 = 2
            r8 = 7
        L_0x0340:
            r10 = 6
            r11 = 8
            goto L_0x04d4
        L_0x0345:
            r16 = r4
            r5 = 1
            r6 = 0
            r4 = r1
            r1 = 255(0xff, float:3.57E-43)
            if (r10 > r1) goto L_0x033e
            iy1 r1 = r0.Z
            r2 = r10 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            r1.a(r2)
            goto L_0x033d
        L_0x0357:
            r16 = r4
            r5 = 1
            r6 = 0
            r4 = r1
            r1 = r8
            int r7 = r3.i(r1)
            if (r7 > r13) goto L_0x037f
            r8 = 7
            if (r7 > r8) goto L_0x0368
            goto L_0x048f
        L_0x0368:
            r5 = 15
            if (r7 > r5) goto L_0x0371
            r3.t(r1)
            goto L_0x048f
        L_0x0371:
            if (r7 > r14) goto L_0x0378
            r3.t(r12)
            goto L_0x048f
        L_0x0378:
            if (r7 > r13) goto L_0x048f
            r3.t(r2)
            goto L_0x048f
        L_0x037f:
            r8 = 7
            r1 = 160(0xa0, float:2.24E-43)
            if (r7 > r15) goto L_0x0492
            r2 = 32
            if (r7 == r2) goto L_0x0487
            r2 = 33
            if (r7 == r2) goto L_0x0481
            r1 = 37
            if (r7 == r1) goto L_0x0479
            r1 = 42
            if (r7 == r1) goto L_0x0471
            r1 = 44
            if (r7 == r1) goto L_0x0469
            r1 = 63
            if (r7 == r1) goto L_0x0461
            r1 = 57
            if (r7 == r1) goto L_0x0459
            r1 = 58
            if (r7 == r1) goto L_0x0451
            r1 = 60
            if (r7 == r1) goto L_0x0449
            r1 = 61
            if (r7 == r1) goto L_0x0441
            switch(r7) {
                case 48: goto L_0x0439;
                case 49: goto L_0x0431;
                case 50: goto L_0x0429;
                case 51: goto L_0x0420;
                case 52: goto L_0x0417;
                case 53: goto L_0x040e;
                default: goto L_0x03af;
            }
        L_0x03af:
            switch(r7) {
                case 118: goto L_0x0405;
                case 119: goto L_0x03fc;
                case 120: goto L_0x03f3;
                case 121: goto L_0x03ea;
                case 122: goto L_0x03e1;
                case 123: goto L_0x03d8;
                case 124: goto L_0x03cf;
                case 125: goto L_0x03c6;
                case 126: goto L_0x03bd;
                case 127: goto L_0x03b4;
                default: goto L_0x03b2;
            }
        L_0x03b2:
            goto L_0x048e
        L_0x03b4:
            iy1 r1 = r0.Z
            r2 = 9484(0x250c, float:1.329E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03bd:
            iy1 r1 = r0.Z
            r2 = 9496(0x2518, float:1.3307E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03c6:
            iy1 r1 = r0.Z
            r2 = 9472(0x2500, float:1.3273E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03cf:
            iy1 r1 = r0.Z
            r2 = 9492(0x2514, float:1.3301E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03d8:
            iy1 r1 = r0.Z
            r2 = 9488(0x2510, float:1.3296E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03e1:
            iy1 r1 = r0.Z
            r2 = 9474(0x2502, float:1.3276E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03ea:
            iy1 r1 = r0.Z
            r2 = 8542(0x215e, float:1.197E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03f3:
            iy1 r1 = r0.Z
            r2 = 8541(0x215d, float:1.1968E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x03fc:
            iy1 r1 = r0.Z
            r2 = 8540(0x215c, float:1.1967E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0405:
            iy1 r1 = r0.Z
            r2 = 8539(0x215b, float:1.1966E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x040e:
            iy1 r1 = r0.Z
            r2 = 8226(0x2022, float:1.1527E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0417:
            iy1 r1 = r0.Z
            r2 = 8221(0x201d, float:1.152E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0420:
            iy1 r1 = r0.Z
            r2 = 8220(0x201c, float:1.1519E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0429:
            iy1 r1 = r0.Z
            r2 = 8217(0x2019, float:1.1514E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0431:
            iy1 r1 = r0.Z
            r2 = 8216(0x2018, float:1.1513E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0439:
            iy1 r1 = r0.Z
            r2 = 9608(0x2588, float:1.3464E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0441:
            iy1 r1 = r0.Z
            r2 = 8480(0x2120, float:1.1883E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0449:
            iy1 r1 = r0.Z
            r2 = 339(0x153, float:4.75E-43)
            r1.a(r2)
            goto L_0x048e
        L_0x0451:
            iy1 r1 = r0.Z
            r2 = 353(0x161, float:4.95E-43)
            r1.a(r2)
            goto L_0x048e
        L_0x0459:
            iy1 r1 = r0.Z
            r2 = 8482(0x2122, float:1.1886E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0461:
            iy1 r1 = r0.Z
            r2 = 376(0x178, float:5.27E-43)
            r1.a(r2)
            goto L_0x048e
        L_0x0469:
            iy1 r1 = r0.Z
            r2 = 338(0x152, float:4.74E-43)
            r1.a(r2)
            goto L_0x048e
        L_0x0471:
            iy1 r1 = r0.Z
            r2 = 352(0x160, float:4.93E-43)
            r1.a(r2)
            goto L_0x048e
        L_0x0479:
            iy1 r1 = r0.Z
            r2 = 8230(0x2026, float:1.1533E-41)
            r1.a(r2)
            goto L_0x048e
        L_0x0481:
            iy1 r2 = r0.Z
            r2.a(r1)
            goto L_0x048e
        L_0x0487:
            iy1 r1 = r0.Z
            r2 = 32
            r1.a(r2)
        L_0x048e:
            r9 = r5
        L_0x048f:
            r2 = 2
            goto L_0x0340
        L_0x0492:
            r2 = 32
            if (r7 > r11) goto L_0x04ba
            r1 = 135(0x87, float:1.89E-43)
            if (r7 > r1) goto L_0x049e
            r3.t(r2)
            goto L_0x048f
        L_0x049e:
            r1 = 143(0x8f, float:2.0E-43)
            if (r7 > r1) goto L_0x04a8
            r1 = 40
            r3.t(r1)
            goto L_0x048f
        L_0x04a8:
            if (r7 > r11) goto L_0x048f
            r2 = 2
            r3.t(r2)
            r10 = 6
            int r1 = r3.i(r10)
            r11 = 8
            int r1 = r1 * r11
            r3.t(r1)
            goto L_0x04d4
        L_0x04ba:
            r2 = 2
            r10 = 6
            r11 = 8
            r12 = 255(0xff, float:3.57E-43)
            if (r7 > r12) goto L_0x04d4
            if (r7 != r1) goto L_0x04cc
            iy1 r1 = r0.Z
            r7 = 13252(0x33c4, float:1.857E-41)
            r1.a(r7)
            goto L_0x04d3
        L_0x04cc:
            iy1 r1 = r0.Z
            r7 = 95
            r1.a(r7)
        L_0x04d3:
            r9 = r5
        L_0x04d4:
            r5 = r2
            r1 = r4
            r7 = r8
            r6 = r10
            r8 = r11
            r4 = r16
            goto L_0x0039
        L_0x04dd:
            if (r9 == 0) goto L_0x04e5
            java.util.List r1 = r17.i()
            r0.v0 = r1
        L_0x04e5:
            r1 = 0
            r0.x0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly1.h():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ea A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List i() {
        /*
            r17 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
        L_0x0007:
            r3 = 8
            if (r2 >= r3) goto L_0x00ee
            r3 = r17
            iy1[] r4 = r3.Y
            r5 = r4[r2]
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x00ea
            java.util.ArrayList r6 = r5.a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0027
            android.text.SpannableStringBuilder r5 = r5.b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0027
            goto L_0x00ea
        L_0x0027:
            r4 = r4[r2]
            boolean r5 = r4.d
            if (r5 == 0) goto L_0x00ea
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x00e4
            java.util.ArrayList r5 = r4.a
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0043
            android.text.SpannableStringBuilder r6 = r4.b
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0043
            goto L_0x00e4
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
            int r5 = r4.l
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x008c
            if (r5 == r6) goto L_0x0089
            if (r5 == r7) goto L_0x0085
            r9 = 3
            if (r5 != r9) goto L_0x0075
            goto L_0x008c
        L_0x0075:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.l
            r2 = 43
            java.lang.String r3 = "Unexpected justification value: "
            java.lang.String r1 = defpackage.i2a.h(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x0085:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x0087:
            r9 = r5
            goto L_0x008f
        L_0x0089:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0087
        L_0x008c:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0087
        L_0x008f:
            boolean r5 = r4.f
            if (r5 == 0) goto L_0x009e
            int r5 = r4.h
            float r5 = (float) r5
            r10 = 1120272384(0x42c60000, float:99.0)
            float r5 = r5 / r10
            int r11 = r4.g
            float r11 = (float) r11
            float r11 = r11 / r10
            goto L_0x00ab
        L_0x009e:
            int r5 = r4.h
            float r5 = (float) r5
            r10 = 1129381888(0x43510000, float:209.0)
            float r5 = r5 / r10
            int r10 = r4.g
            float r10 = (float) r10
            r11 = 1116995584(0x42940000, float:74.0)
            float r11 = r10 / r11
        L_0x00ab:
            r10 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r10
            r12 = 1028443341(0x3d4ccccd, float:0.05)
            float r5 = r5 + r12
            float r11 = r11 * r10
            float r10 = r11 + r12
            int r11 = r4.i
            int r12 = r11 / 3
            if (r12 != 0) goto L_0x00be
            r12 = r1
            goto L_0x00c3
        L_0x00be:
            if (r12 != r6) goto L_0x00c2
            r12 = r6
            goto L_0x00c3
        L_0x00c2:
            r12 = r7
        L_0x00c3:
            int r11 = r11 % 3
            if (r11 != 0) goto L_0x00c9
            r13 = r1
            goto L_0x00ce
        L_0x00c9:
            if (r11 != r6) goto L_0x00cd
            r13 = r6
            goto L_0x00ce
        L_0x00cd:
            r13 = r7
        L_0x00ce:
            int r15 = r4.o
            int r7 = defpackage.iy1.x
            if (r15 == r7) goto L_0x00d6
            r14 = r6
            goto L_0x00d7
        L_0x00d6:
            r14 = r1
        L_0x00d7:
            gy1 r6 = new gy1
            int r4 = r4.e
            r7 = r6
            r11 = r12
            r12 = r5
            r16 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            if (r6 == 0) goto L_0x00ea
            r0.add(r6)
        L_0x00ea:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x00ee:
            v00 r2 = defpackage.gy1.c
            java.util.Collections.sort(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.size()
            r2.<init>(r3)
        L_0x00fc:
            int r3 = r0.size()
            if (r1 >= r3) goto L_0x0110
            java.lang.Object r3 = r0.get(r1)
            gy1 r3 = (defpackage.gy1) r3
            m44 r3 = r3.a
            r2.add(r3)
            int r1 = r1 + 1
            goto L_0x00fc
        L_0x0110:
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly1.i():java.util.List");
    }

    public final void j() {
        for (int i = 0; i < 8; i++) {
            this.Y[i].d();
        }
    }
}
