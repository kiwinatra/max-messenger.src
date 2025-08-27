package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ca6  reason: default package */
public final class ca6 implements jv0 {
    public static final ca6 P0 = new ca6(new aa6());
    public static final ip5 Q0 = new ip5(9);
    public final int A0;
    public final float B0;
    public final int C0;
    public final float D0;
    public final byte[] E0;
    public final int F0;
    public final l53 G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public int O0;
    public final rp9 X;
    public final String Y;
    public final String Z;
    public final String a;
    public final String b;
    public final String c;
    public final int o;
    public final int v;
    public final int v0;
    public final int w;
    public final List w0;
    public final int x;
    public final xv4 x0;
    public final int y;
    public final long y0;
    public final String z;
    public final int z0;

    public ca6(aa6 aa6) {
        this.a = aa6.a;
        this.b = aa6.b;
        this.c = t0g.E(aa6.c);
        this.o = aa6.d;
        this.v = aa6.e;
        int i = aa6.f;
        this.w = i;
        int i2 = aa6.g;
        this.x = i2;
        this.y = i2 != -1 ? i2 : i;
        this.z = aa6.h;
        this.X = aa6.i;
        this.Y = aa6.j;
        this.Z = aa6.k;
        this.v0 = aa6.l;
        List list = aa6.m;
        this.w0 = list == null ? Collections.emptyList() : list;
        xv4 xv4 = aa6.n;
        this.x0 = xv4;
        this.y0 = aa6.o;
        this.z0 = aa6.p;
        this.A0 = aa6.q;
        this.B0 = aa6.r;
        int i3 = aa6.s;
        int i4 = 0;
        this.C0 = i3 == -1 ? 0 : i3;
        float f = aa6.t;
        this.D0 = f == -1.0f ? 1.0f : f;
        this.E0 = aa6.u;
        this.F0 = aa6.v;
        this.G0 = aa6.w;
        this.H0 = aa6.x;
        this.I0 = aa6.y;
        this.J0 = aa6.z;
        int i5 = aa6.A;
        this.K0 = i5 == -1 ? 0 : i5;
        int i6 = aa6.B;
        this.L0 = i6 != -1 ? i6 : i4;
        this.M0 = aa6.C;
        int i7 = aa6.D;
        if (i7 != 0 || xv4 == null) {
            this.N0 = i7;
        } else {
            this.N0 = 1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [aa6, java.lang.Object] */
    public final aa6 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.o;
        obj.e = this.v;
        obj.f = this.w;
        obj.g = this.x;
        obj.h = this.z;
        obj.i = this.X;
        obj.j = this.Y;
        obj.k = this.Z;
        obj.l = this.v0;
        obj.m = this.w0;
        obj.n = this.x0;
        obj.o = this.y0;
        obj.p = this.z0;
        obj.q = this.A0;
        obj.r = this.B0;
        obj.s = this.C0;
        obj.t = this.D0;
        obj.u = this.E0;
        obj.v = this.F0;
        obj.w = this.G0;
        obj.x = this.H0;
        obj.y = this.I0;
        obj.z = this.J0;
        obj.A = this.K0;
        obj.B = this.L0;
        obj.C = this.M0;
        obj.D = this.N0;
        return obj;
    }

    public final int b() {
        int i;
        int i2 = this.z0;
        if (i2 == -1 || (i = this.A0) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(ca6 ca6) {
        List list = this.w0;
        if (list.size() != ca6.w0.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) ca6.w0.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final ca6 d(ca6 ca6) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        ca6 ca62 = ca6;
        if (this == ca62) {
            return this;
        }
        int g = uq9.g(this.Z);
        String str3 = ca62.a;
        String str4 = ca62.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (!(g == 3 || g == 1) || (str = ca62.c) == null) {
            str = this.c;
        }
        int i4 = this.w;
        if (i4 == -1) {
            i4 = ca62.w;
        }
        int i5 = this.x;
        if (i5 == -1) {
            i5 = ca62.x;
        }
        String str5 = this.z;
        if (str5 == null) {
            String q = t0g.q(g, ca62.z);
            if (t0g.L(q).length == 1) {
                str5 = q;
            }
        }
        rp9 rp9 = ca62.X;
        rp9 rp92 = this.X;
        if (rp92 != null) {
            if (rp9 != null) {
                pp9[] pp9Arr = rp9.a;
                if (pp9Arr.length != 0) {
                    int i6 = t0g.a;
                    pp9[] pp9Arr2 = rp92.a;
                    Object[] copyOf = Arrays.copyOf(pp9Arr2, pp9Arr2.length + pp9Arr.length);
                    System.arraycopy(pp9Arr, 0, copyOf, pp9Arr2.length, pp9Arr.length);
                    rp92 = new rp9((pp9[]) copyOf);
                }
            }
            rp9 = rp92;
        }
        float f = this.B0;
        if (f == -1.0f && g == 2) {
            f = ca62.B0;
        }
        int i7 = this.o | ca62.o;
        int i8 = this.v | ca62.v;
        ArrayList arrayList = new ArrayList();
        xv4 xv4 = ca62.x0;
        if (xv4 != null) {
            vv4[] vv4Arr = xv4.a;
            int length = vv4Arr.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = length;
                vv4 vv4 = vv4Arr[i9];
                vv4[] vv4Arr2 = vv4Arr;
                if (vv4.v != null) {
                    arrayList.add(vv4);
                }
                i9++;
                length = i10;
                vv4Arr = vv4Arr2;
            }
            str2 = xv4.c;
        } else {
            str2 = null;
        }
        xv4 xv42 = this.x0;
        if (xv42 != null) {
            if (str2 == null) {
                str2 = xv42.c;
            }
            int size = arrayList.size();
            vv4[] vv4Arr3 = xv42.a;
            int length2 = vv4Arr3.length;
            int i11 = 0;
            while (true) {
                String str6 = str2;
                if (i11 >= length2) {
                    break;
                }
                vv4 vv42 = vv4Arr3[i11];
                vv4[] vv4Arr4 = vv4Arr3;
                if (vv42.v != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            i = size;
                            i2 = length2;
                            i3 = 1;
                            arrayList.add(vv42);
                            break;
                        }
                        i = size;
                        i2 = length2;
                        if (((vv4) arrayList.get(i12)).b.equals(vv42.b)) {
                            break;
                        }
                        i12++;
                        length2 = i2;
                        size = i;
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i3 = 1;
                i11 += i3;
                str2 = str6;
                vv4Arr3 = vv4Arr4;
                length2 = i2;
                size = i;
            }
        }
        xv4 xv43 = arrayList.isEmpty() ? null : new xv4(str2, arrayList);
        aa6 a2 = a();
        a2.a = str3;
        a2.b = str4;
        a2.c = str;
        a2.d = i7;
        a2.e = i8;
        a2.f = i4;
        a2.g = i5;
        a2.h = str5;
        a2.i = rp9;
        a2.n = xv43;
        a2.r = f;
        return new ca6(a2);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || ca6.class != obj.getClass()) {
            return false;
        }
        ca6 ca6 = (ca6) obj;
        int i2 = this.O0;
        if (i2 == 0 || (i = ca6.O0) == 0 || i2 == i) {
            return this.o == ca6.o && this.v == ca6.v && this.w == ca6.w && this.x == ca6.x && this.v0 == ca6.v0 && this.y0 == ca6.y0 && this.z0 == ca6.z0 && this.A0 == ca6.A0 && this.C0 == ca6.C0 && this.F0 == ca6.F0 && this.H0 == ca6.H0 && this.I0 == ca6.I0 && this.J0 == ca6.J0 && this.K0 == ca6.K0 && this.L0 == ca6.L0 && this.M0 == ca6.M0 && this.N0 == ca6.N0 && Float.compare(this.B0, ca6.B0) == 0 && Float.compare(this.D0, ca6.D0) == 0 && t0g.a(this.a, ca6.a) && t0g.a(this.b, ca6.b) && t0g.a(this.z, ca6.z) && t0g.a(this.Y, ca6.Y) && t0g.a(this.Z, ca6.Z) && t0g.a(this.c, ca6.c) && Arrays.equals(this.E0, ca6.E0) && t0g.a(this.X, ca6.X) && t0g.a(this.G0, ca6.G0) && t0g.a(this.x0, ca6.x0) && c(ca6);
        }
        return false;
    }

    public final int hashCode() {
        if (this.O0 == 0) {
            int i = 0;
            String str = this.a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.o) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31;
            String str4 = this.z;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            rp9 rp9 = this.X;
            int hashCode5 = (hashCode4 + (rp9 == null ? 0 : Arrays.hashCode(rp9.a))) * 31;
            String str5 = this.Y;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.Z;
            if (str6 != null) {
                i = str6.hashCode();
            }
            this.O0 = ((((((((((((((((Float.floatToIntBits(this.D0) + ((((Float.floatToIntBits(this.B0) + ((((((((((hashCode6 + i) * 31) + this.v0) * 31) + ((int) this.y0)) * 31) + this.z0) * 31) + this.A0) * 31)) * 31) + this.C0) * 31)) * 31) + this.F0) * 31) + this.H0) * 31) + this.I0) * 31) + this.J0) * 31) + this.K0) * 31) + this.L0) * 31) + this.M0) * 31) + this.N0;
        }
        return this.O0;
    }

    public final String toString() {
        String str = this.a;
        int f = g63.f(104, str);
        String str2 = this.b;
        int f2 = g63.f(f, str2);
        String str3 = this.Y;
        int f3 = g63.f(f2, str3);
        String str4 = this.Z;
        int f4 = g63.f(f3, str4);
        String str5 = this.z;
        int f5 = g63.f(f4, str5);
        String str6 = this.c;
        StringBuilder sb = new StringBuilder(g63.f(f5, str6));
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(this.z0);
        sb.append(", ");
        sb.append(this.A0);
        sb.append(", ");
        sb.append(this.B0);
        sb.append("], [");
        sb.append(this.H0);
        sb.append(", ");
        return wj6.l(sb, this.I0, "])");
    }
}
