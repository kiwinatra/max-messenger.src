package defpackage;

import androidx.media3.transformer.ExportException;
import java.util.Objects;

/* renamed from: yd5  reason: default package */
public final class yd5 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final m53 i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final int o;
    public final ExportException p;
    public final tb7 q;

    public yd5(k0d k0d, long j2, long j3, int i2, int i3, int i4, String str, String str2, int i5, m53 m53, int i6, int i7, int i8, String str3, String str4, int i9, ExportException exportException) {
        String str5 = str2;
        String str6 = str4;
        int i10 = i9;
        this.q = k0d;
        this.a = j2;
        this.b = j3;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str;
        this.g = str5;
        this.h = i5;
        this.i = m53;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = str3;
        this.n = str6;
        this.o = i10;
        this.p = exportException;
        a(str5, i10, k0d, 1);
        a(str6, i10, k0d, 2);
    }

    public static void a(String str, int i2, k0d k0d, int i3) {
        if (str != null && i2 != 1) {
            boolean z = false;
            lx5 r = k0d.listIterator(0);
            while (r.hasNext()) {
                xd5 xd5 = (xd5) r.next();
                if ((i3 == 1 ? xd5.a : xd5.b) == null) {
                    if (!z) {
                        z = true;
                    } else {
                        return;
                    }
                } else if (!z) {
                    z = true;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd5)) {
            return false;
        }
        yd5 yd5 = (yd5) obj;
        return Objects.equals(this.q, yd5.q) && this.a == yd5.a && this.b == yd5.b && this.c == yd5.c && this.d == yd5.d && this.e == yd5.e && Objects.equals(this.f, yd5.f) && Objects.equals(this.g, yd5.g) && this.h == yd5.h && Objects.equals(this.i, yd5.i) && this.j == yd5.j && this.k == yd5.k && this.l == yd5.l && Objects.equals(this.m, yd5.m) && Objects.equals(this.n, yd5.n) && this.o == yd5.o && Objects.equals(this.p, yd5.p);
    }

    public final int hashCode() {
        int hashCode = Objects.hashCode(this.f);
        int hashCode2 = Objects.hashCode(this.g);
        int hashCode3 = Objects.hashCode(this.i);
        int hashCode4 = Objects.hashCode(this.m);
        int hashCode5 = Objects.hashCode(this.n);
        return Objects.hashCode(this.p) + ((((hashCode5 + ((hashCode4 + ((((((((hashCode3 + ((((hashCode2 + ((hashCode + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}
