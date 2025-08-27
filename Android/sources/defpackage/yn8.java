package defpackage;

import android.text.TextUtils;

/* renamed from: yn8  reason: default package */
public final class yn8 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public yn8(boolean z, String str, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != yn8.class) {
            return false;
        }
        yn8 yn8 = (yn8) obj;
        return TextUtils.equals(this.a, yn8.a) && this.b == yn8.b && this.c == yn8.c;
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
