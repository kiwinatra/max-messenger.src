package defpackage;

import android.text.TextUtils;

/* renamed from: xn8  reason: default package */
public final class xn8 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public xn8(boolean z, String str, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != xn8.class) {
            return false;
        }
        xn8 xn8 = (xn8) obj;
        return TextUtils.equals(this.a, xn8.a) && this.b == xn8.b && this.c == xn8.c;
    }

    public final int hashCode() {
        int i = 1237;
        int d = (g63.d(31, 31, this.a) + (this.b ? 1231 : 1237)) * 31;
        if (this.c) {
            i = 1231;
        }
        return d + i;
    }
}
