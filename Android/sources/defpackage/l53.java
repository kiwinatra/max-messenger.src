package defpackage;

import java.util.Arrays;

/* renamed from: l53  reason: default package */
public final class l53 implements jv0 {
    public final int a;
    public final int b;
    public final int c;
    public final byte[] o;
    public int v;

    public l53(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = bArr;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l53.class != obj.getClass()) {
            return false;
        }
        l53 l53 = (l53) obj;
        return this.a == l53.a && this.b == l53.b && this.c == l53.c && Arrays.equals(this.o, l53.o);
    }

    public final int hashCode() {
        if (this.v == 0) {
            this.v = Arrays.hashCode(this.o) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.v;
    }

    public final String toString() {
        boolean z = this.o != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
