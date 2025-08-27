package defpackage;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: oy8  reason: default package */
public final class oy8 {
    public final String a;
    public final int b;
    public final int c;

    public oy8(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy8)) {
            return false;
        }
        oy8 oy8 = (oy8) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        return (i2 < 0 || oy8.b < 0) ? TextUtils.equals(str, oy8.a) && i == oy8.c : TextUtils.equals(str, oy8.a) && i2 == oy8.b && i == oy8.c;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Integer.valueOf(this.c)});
    }
}
