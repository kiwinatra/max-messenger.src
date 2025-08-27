package defpackage;

import java.util.Arrays;

/* renamed from: d38  reason: default package */
public final class d38 {
    public final long a;
    public final float b;
    public final long c;

    public d38(c38 c38) {
        this.a = c38.a;
        this.b = c38.b;
        this.c = c38.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d38)) {
            return false;
        }
        d38 d38 = (d38) obj;
        return this.a == d38.a && this.b == d38.b && this.c == d38.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
