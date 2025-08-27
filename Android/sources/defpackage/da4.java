package defpackage;

import android.text.TextUtils;

/* renamed from: da4  reason: default package */
public final class da4 {
    public final String a;
    public final ca6 b;
    public final ca6 c;
    public final int d;
    public final int e;

    public da4(String str, ca6 ca6, ca6 ca62, int i, int i2) {
        y64.g(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            ca6.getClass();
            this.b = ca6;
            ca62.getClass();
            this.c = ca62;
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || da4.class != obj.getClass()) {
            return false;
        }
        da4 da4 = (da4) obj;
        return this.d == da4.d && this.e == da4.e && this.a.equals(da4.a) && this.b.equals(da4.b) && this.c.equals(da4.c);
    }

    public final int hashCode() {
        int d2 = g63.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + d2) * 31);
    }
}
