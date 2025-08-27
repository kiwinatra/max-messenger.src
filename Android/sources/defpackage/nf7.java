package defpackage;

import java.util.Arrays;

/* renamed from: nf7  reason: default package */
public final class nf7 extends ad9 {
    public static volatile nf7[] u;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public long f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public long l = 0;
    public long m = 0;
    public String n = "";
    public byte[] o = ct.h;
    public String p = "";
    public rf7[] q = rf7.a();
    public long r = 0;
    public String s = "";
    public boolean t = false;

    public nf7() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long j2 = this.a;
        int i2 = 0;
        int h2 = j2 != 0 ? j43.h(1, j2) : 0;
        if (!this.b.equals("")) {
            h2 += j43.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += j43.l(3, this.c);
        }
        if (!this.d.equals("")) {
            h2 += j43.l(4, this.d);
        }
        if (!this.e.equals("")) {
            h2 += j43.l(5, this.e);
        }
        long j3 = this.f;
        if (j3 != 0) {
            h2 += j43.k(j3) + j43.m(6);
        }
        int i3 = this.g;
        if (i3 != 0) {
            h2 += j43.f(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            h2 += j43.f(8, i4);
        }
        if (this.i) {
            h2 += j43.a(9);
        }
        if (this.j) {
            h2 += j43.a(10);
        }
        if (this.k) {
            h2 += j43.a(11);
        }
        long j4 = this.l;
        if (j4 != 0) {
            h2 += j43.k(j4) + j43.m(12);
        }
        long j5 = this.m;
        if (j5 != 0) {
            h2 += j43.h(13, j5);
        }
        if (!this.n.equals("")) {
            h2 += j43.l(14, this.n);
        }
        if (!Arrays.equals(this.o, ct.h)) {
            h2 += j43.b(15, this.o);
        }
        if (!this.p.equals("")) {
            h2 += j43.l(16, this.p);
        }
        rf7[] rf7Arr = this.q;
        if (rf7Arr != null && rf7Arr.length > 0) {
            while (true) {
                rf7[] rf7Arr2 = this.q;
                if (i2 >= rf7Arr2.length) {
                    break;
                }
                rf7 rf7 = rf7Arr2[i2];
                if (rf7 != null) {
                    h2 = j43.i(17, rf7) + h2;
                }
                i2++;
            }
        }
        long j6 = this.r;
        if (j6 != 0) {
            h2 += j43.h(18, j6);
        }
        if (!this.s.equals("")) {
            h2 += j43.l(19, this.s);
        }
        return this.t ? h2 + j43.a(20) : h2;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s2 = i43.s();
            switch (s2) {
                case 0:
                    break;
                case 8:
                    this.a = i43.q();
                    continue;
                case 18:
                    this.b = i43.r();
                    continue;
                case 26:
                    this.c = i43.r();
                    continue;
                case 34:
                    this.d = i43.r();
                    continue;
                case 42:
                    this.e = i43.r();
                    continue;
                case 48:
                    this.f = i43.q();
                    continue;
                case 56:
                    this.g = i43.p();
                    continue;
                case 64:
                    this.h = i43.p();
                    continue;
                case 72:
                    this.i = i43.f();
                    continue;
                case 80:
                    this.j = i43.f();
                    continue;
                case 88:
                    this.k = i43.f();
                    continue;
                case 96:
                    this.l = i43.q();
                    continue;
                case 104:
                    this.m = i43.q();
                    continue;
                case 114:
                    this.n = i43.r();
                    continue;
                case 122:
                    this.o = i43.g();
                    continue;
                case 130:
                    this.p = i43.r();
                    continue;
                case 138:
                    int q2 = ct.q(i43, 138);
                    rf7[] rf7Arr = this.q;
                    int length = rf7Arr == null ? 0 : rf7Arr.length;
                    int i2 = q2 + length;
                    rf7[] rf7Arr2 = new rf7[i2];
                    if (length != 0) {
                        System.arraycopy(rf7Arr, 0, rf7Arr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        rf7 rf7 = new rf7();
                        rf7Arr2[length] = rf7;
                        i43.j(rf7);
                        i43.s();
                        length++;
                    }
                    rf7 rf72 = new rf7();
                    rf7Arr2[length] = rf72;
                    i43.j(rf72);
                    this.q = rf7Arr2;
                    continue;
                case 144:
                    this.r = i43.q();
                    continue;
                case 154:
                    this.s = i43.r();
                    continue;
                case 160:
                    this.t = i43.f();
                    continue;
                default:
                    if (!i43.u(s2)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        long j2 = this.a;
        if (j2 != 0) {
            j43.x(1, j2);
        }
        if (!this.b.equals("")) {
            j43.E(2, this.b);
        }
        if (!this.c.equals("")) {
            j43.E(3, this.c);
        }
        if (!this.d.equals("")) {
            j43.E(4, this.d);
        }
        if (!this.e.equals("")) {
            j43.E(5, this.e);
        }
        long j3 = this.f;
        int i2 = 0;
        if (j3 != 0) {
            j43.F(6, 0);
            j43.D(j3);
        }
        int i3 = this.g;
        if (i3 != 0) {
            j43.w(7, i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            j43.w(8, i4);
        }
        boolean z = this.i;
        if (z) {
            j43.r(9, z);
        }
        boolean z2 = this.j;
        if (z2) {
            j43.r(10, z2);
        }
        boolean z3 = this.k;
        if (z3) {
            j43.r(11, z3);
        }
        long j4 = this.l;
        if (j4 != 0) {
            j43.F(12, 0);
            j43.D(j4);
        }
        long j5 = this.m;
        if (j5 != 0) {
            j43.x(13, j5);
        }
        if (!this.n.equals("")) {
            j43.E(14, this.n);
        }
        if (!Arrays.equals(this.o, ct.h)) {
            j43.s(15, this.o);
        }
        if (!this.p.equals("")) {
            j43.E(16, this.p);
        }
        rf7[] rf7Arr = this.q;
        if (rf7Arr != null && rf7Arr.length > 0) {
            while (true) {
                rf7[] rf7Arr2 = this.q;
                if (i2 >= rf7Arr2.length) {
                    break;
                }
                rf7 rf7 = rf7Arr2[i2];
                if (rf7 != null) {
                    j43.y(17, rf7);
                }
                i2++;
            }
        }
        long j6 = this.r;
        if (j6 != 0) {
            j43.x(18, j6);
        }
        if (!this.s.equals("")) {
            j43.E(19, this.s);
        }
        boolean z4 = this.t;
        if (z4) {
            j43.r(20, z4);
        }
    }
}
