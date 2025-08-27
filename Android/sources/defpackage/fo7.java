package defpackage;

/* renamed from: fo7  reason: default package */
public final class fo7 implements tf5 {
    public ou9 X;
    public final l8b a = new l8b(6);
    public xf5 b;
    public int c;
    public int o;
    public int v;
    public long w = -1;
    public ot9 x;
    public vf5 y;
    public jz2 z;

    public final void U(xf5 xf5) {
        this.b = xf5;
    }

    public final void a() {
        xf5 xf5 = this.b;
        xf5.getClass();
        xf5.v();
        this.b.M(new me0(-9223372036854775807L));
        this.c = 6;
    }

    public final void d(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.X = null;
        } else if (this.c == 5) {
            ou9 ou9 = this.X;
            ou9.getClass();
            ou9.d(j, j2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.vf5 r26, defpackage.yl4 r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = -1
            r4 = 1
            r5 = 0
            int r6 = r0.c
            r7 = -1
            l8b r9 = r0.a
            r10 = 4
            r11 = 2
            if (r6 == 0) goto L_0x01ae
            if (r6 == r4) goto L_0x0199
            if (r6 == r11) goto L_0x00d8
            r7 = 5
            if (r6 == r10) goto L_0x0050
            if (r6 == r7) goto L_0x0026
            r0 = 6
            if (r6 != r0) goto L_0x0020
            return r3
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0026:
            jz2 r3 = r0.z
            if (r3 == 0) goto L_0x002e
            vf5 r3 = r0.y
            if (r1 == r3) goto L_0x003b
        L_0x002e:
            r0.y = r1
            jz2 r3 = new jz2
            long r5 = r0.w
            hf4 r1 = (defpackage.hf4) r1
            r3.<init>((defpackage.hf4) r1, (long) r5)
            r0.z = r3
        L_0x003b:
            ou9 r1 = r0.X
            r1.getClass()
            jz2 r3 = r0.z
            int r1 = r1.g(r3, r2)
            if (r1 != r4) goto L_0x004f
            long r3 = r2.b
            long r5 = r0.w
            long r3 = r3 + r5
            r2.b = r3
        L_0x004f:
            return r1
        L_0x0050:
            r3 = r1
            hf4 r3 = (defpackage.hf4) r3
            long r11 = r3.o
            long r13 = r0.w
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L_0x005e
            r2.b = r13
            return r4
        L_0x005e:
            byte[] r2 = r9.a
            hf4 r1 = (defpackage.hf4) r1
            boolean r2 = r1.q(r2, r5, r4, r4)
            if (r2 != 0) goto L_0x006c
            r25.a()
            goto L_0x00d7
        L_0x006c:
            r1.w = r5
            ou9 r2 = r0.X
            if (r2 != 0) goto L_0x007d
            ou9 r2 = new ou9
            nfd r3 = defpackage.gze.d0
            r6 = 8
            r2.<init>(r6, r3)
            r0.X = r2
        L_0x007d:
            jz2 r2 = new jz2
            long r8 = r0.w
            r2.<init>((defpackage.hf4) r1, (long) r8)
            r0.z = r2
            ou9 r1 = r0.X
            boolean r1 = r1.n(r2)
            if (r1 == 0) goto L_0x00d4
            ou9 r1 = r0.X
            jz2 r2 = new jz2
            long r8 = r0.w
            xf5 r3 = r0.b
            r3.getClass()
            r6 = 14
            r2.<init>((long) r8, (java.lang.Object) r3, (int) r6)
            r1.U(r2)
            ot9 r1 = r0.x
            r1.getClass()
            xf5 r2 = r0.b
            r2.getClass()
            r3 = 1024(0x400, float:1.435E-42)
            zpf r2 = r2.B(r3, r10)
            ba6 r3 = new ba6
            r3.<init>()
            java.lang.String r6 = "image/jpeg"
            java.lang.String r6 = defpackage.vq9.l(r6)
            r3.l = r6
            sp9 r6 = new sp9
            qp9[] r4 = new defpackage.qp9[r4]
            r4[r5] = r1
            r6.<init>((defpackage.qp9[]) r4)
            r3.j = r6
            ea6 r1 = new ea6
            r1.<init>(r3)
            r2.e(r1)
            r0.c = r7
            goto L_0x00d7
        L_0x00d4:
            r25.a()
        L_0x00d7:
            return r5
        L_0x00d8:
            int r2 = r0.o
            r6 = 65505(0xffe1, float:9.1792E-41)
            if (r2 != r6) goto L_0x018e
            l8b r2 = new l8b
            int r6 = r0.v
            r2.<init>((int) r6)
            byte[] r6 = r2.a
            int r9 = r0.v
            r10 = r1
            hf4 r10 = (defpackage.hf4) r10
            r10.j(r6, r5, r9, r5)
            ot9 r6 = r0.x
            if (r6 != 0) goto L_0x018c
            java.lang.String r6 = "http://ns.adobe.com/xap/1.0/"
            java.lang.String r9 = r2.p()
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x018c
            java.lang.String r2 = r2.p()
            if (r2 == 0) goto L_0x018c
            hf4 r1 = (defpackage.hf4) r1
            long r9 = r1.c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0111
        L_0x010e:
            r6 = 0
            goto L_0x0184
        L_0x0111:
            mt9 r1 = defpackage.ev0.A(r2)     // Catch:{ ParserException | NumberFormatException | XmlPullParserException -> 0x0116 }
            goto L_0x011c
        L_0x0116:
            java.lang.String r1 = "Ignoring unexpected XMP metadata"
            defpackage.i8b.V(r1)
            r1 = 0
        L_0x011c:
            if (r1 != 0) goto L_0x011f
            goto L_0x010e
        L_0x011f:
            java.util.List r2 = r1.b
            int r12 = r2.size()
            if (r12 >= r11) goto L_0x0128
            goto L_0x010e
        L_0x0128:
            int r11 = r2.size()
            int r11 = r11 - r4
            r4 = r5
            r13 = r7
            r15 = r13
            r19 = r15
            r21 = r19
        L_0x0134:
            if (r11 < 0) goto L_0x0169
            java.lang.Object r12 = r2.get(r11)
            lt9 r12 = (defpackage.lt9) r12
            java.lang.String r6 = r12.a
            java.lang.String r5 = "video/mp4"
            boolean r5 = r5.equals(r6)
            r4 = r4 | r5
            if (r11 != 0) goto L_0x0152
            long r5 = r12.c
            long r9 = r9 - r5
            r5 = 0
        L_0x014c:
            r23 = r5
            r5 = r9
            r9 = r23
            goto L_0x0157
        L_0x0152:
            long r5 = r12.b
            long r5 = r9 - r5
            goto L_0x014c
        L_0x0157:
            if (r4 == 0) goto L_0x0162
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 == 0) goto L_0x0162
            long r21 = r5 - r9
            r19 = r9
            r4 = 0
        L_0x0162:
            if (r11 != 0) goto L_0x0166
            r15 = r5
            r13 = r9
        L_0x0166:
            int r11 = r11 + r3
            r5 = 0
            goto L_0x0134
        L_0x0169:
            int r2 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x010e
            int r2 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x010e
            int r2 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x010e
            int r2 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x017a
            goto L_0x010e
        L_0x017a:
            ot9 r6 = new ot9
            long r1 = r1.a
            r12 = r6
            r17 = r1
            r12.<init>(r13, r15, r17, r19, r21)
        L_0x0184:
            r0.x = r6
            if (r6 == 0) goto L_0x018c
            long r1 = r6.o
            r0.w = r1
        L_0x018c:
            r2 = 0
            goto L_0x0196
        L_0x018e:
            int r2 = r0.v
            hf4 r1 = (defpackage.hf4) r1
            r1.z(r2)
            goto L_0x018c
        L_0x0196:
            r0.c = r2
            return r2
        L_0x0199:
            r2 = r5
            r9.D(r11)
            byte[] r3 = r9.a
            hf4 r1 = (defpackage.hf4) r1
            r1.j(r3, r2, r11, r2)
            int r1 = r9.A()
            int r1 = r1 - r11
            r0.v = r1
            r0.c = r11
            return r2
        L_0x01ae:
            r2 = r5
            r9.D(r11)
            byte[] r3 = r9.a
            hf4 r1 = (defpackage.hf4) r1
            r1.j(r3, r2, r11, r2)
            int r1 = r9.A()
            r0.o = r1
            r2 = 65498(0xffda, float:9.1782E-41)
            if (r1 != r2) goto L_0x01d2
            long r1 = r0.w
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x01ce
            r0.c = r10
        L_0x01cc:
            r0 = 0
            goto L_0x01e4
        L_0x01ce:
            r25.a()
            goto L_0x01cc
        L_0x01d2:
            r2 = 65488(0xffd0, float:9.1768E-41)
            if (r1 < r2) goto L_0x01dc
            r2 = 65497(0xffd9, float:9.1781E-41)
            if (r1 <= r2) goto L_0x01cc
        L_0x01dc:
            r2 = 65281(0xff01, float:9.1478E-41)
            if (r1 == r2) goto L_0x01cc
            r0.c = r4
            goto L_0x01cc
        L_0x01e4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo7.g(vf5, yl4):int");
    }

    public final boolean n(vf5 vf5) {
        hf4 hf4 = (hf4) vf5;
        l8b l8b = this.a;
        l8b.D(2);
        hf4.q(l8b.a, 0, 2, false);
        if (l8b.A() != 65496) {
            return false;
        }
        l8b.D(2);
        hf4.q(l8b.a, 0, 2, false);
        int A = l8b.A();
        this.o = A;
        if (A == 65504) {
            l8b.D(2);
            hf4.q(l8b.a, 0, 2, false);
            hf4 hf42 = (hf4) vf5;
            hf42.a(l8b.A() - 2, false);
            l8b.D(2);
            hf42.q(l8b.a, 0, 2, false);
            this.o = l8b.A();
        }
        if (this.o != 65505) {
            return false;
        }
        hf4.a(2, false);
        l8b.D(6);
        ((hf4) vf5).q(l8b.a, 0, 6, false);
        return l8b.w() == 1165519206 && l8b.A() == 0;
    }

    public final void release() {
        ou9 ou9 = this.X;
        if (ou9 != null) {
            ou9.getClass();
        }
    }
}
