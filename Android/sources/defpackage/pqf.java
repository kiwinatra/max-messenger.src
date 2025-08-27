package defpackage;

import java.util.Arrays;

/* renamed from: pqf  reason: default package */
public final class pqf {
    public static final String f = Integer.toString(0, 36);
    public static final String g = Integer.toString(1, 36);
    public static final String h = Integer.toString(3, 36);
    public static final String i = Integer.toString(4, 36);
    public final int a;
    public final spf b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i2 = v0g.a;
    }

    public pqf(spf spf, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = spf.a;
        this.a = i2;
        boolean z2 = false;
        n79.g(i2 == iArr.length && i2 == zArr.length);
        this.b = spf;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final pqf a(String str) {
        return new pqf(this.b.a(str), this.c, this.d, this.e);
    }

    public final spf b() {
        return this.b;
    }

    public final ea6 c(int i2) {
        return this.b.d[i2];
    }

    public final int d(int i2) {
        return this.d[i2];
    }

    public final int e() {
        return this.b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pqf.class != obj.getClass()) {
            return false;
        }
        pqf pqf = (pqf) obj;
        return this.c == pqf.c && this.b.equals(pqf.b) && Arrays.equals(this.d, pqf.d) && Arrays.equals(this.e, pqf.e);
    }

    public final boolean f() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i2) {
        return this.e[i2];
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
