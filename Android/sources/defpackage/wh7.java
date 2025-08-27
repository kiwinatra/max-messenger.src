package defpackage;

import android.graphics.Insets;

/* renamed from: wh7  reason: default package */
public final class wh7 {
    public static final wh7 e = new wh7(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public wh7(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static wh7 a(wh7 wh7, wh7 wh72) {
        return b(Math.max(wh7.a, wh72.a), Math.max(wh7.b, wh72.b), Math.max(wh7.c, wh72.c), Math.max(wh7.d, wh72.d));
    }

    public static wh7 b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new wh7(i, i2, i3, i4);
    }

    public static wh7 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return vh7.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wh7.class != obj.getClass()) {
            return false;
        }
        wh7 wh7 = (wh7) obj;
        return this.d == wh7.d && this.a == wh7.a && this.c == wh7.c && this.b == wh7.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return tr1.k(sb, this.d, '}');
    }
}
