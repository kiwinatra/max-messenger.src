package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: jy8  reason: default package */
public final class jy8 {
    public final String a;
    public final int b;
    public final int c;

    public jy8(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy8)) {
            return false;
        }
        jy8 jy8 = (jy8) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || jy8.b < 0) ? TextUtils.equals(str, jy8.a) && i == jy8.c : TextUtils.equals(str, jy8.a) && i2 == jy8.b && i == jy8.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.c)});
    }
}
