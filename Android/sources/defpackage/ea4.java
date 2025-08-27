package defpackage;

import android.text.TextUtils;

/* renamed from: ea4  reason: default package */
public final class ea4 {
    public final String a;
    public final ea6 b;
    public final ea6 c;
    public final int d;
    public final int e;

    public ea4(String str, ea6 ea6, ea6 ea62, int i, int i2) {
        n79.g(i == 0 || i2 == 0);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            ea6.getClass();
            this.b = ea6;
            ea62.getClass();
            this.c = ea62;
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
        if (obj == null || ea4.class != obj.getClass()) {
            return false;
        }
        ea4 ea4 = (ea4) obj;
        return this.d == ea4.d && this.e == ea4.e && this.a.equals(ea4.a) && this.b.equals(ea4.b) && this.c.equals(ea4.c);
    }

    public final int hashCode() {
        int d2 = g63.d((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + d2) * 31);
    }
}
