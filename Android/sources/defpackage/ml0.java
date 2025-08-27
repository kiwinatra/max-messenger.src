package defpackage;

import java.util.Arrays;

/* renamed from: ml0  reason: default package */
public final class ml0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ml0(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml0)) {
            return false;
        }
        ml0 ml0 = (ml0) obj;
        return this.c == ml0.c && this.d == ml0.d && cjf.n(this.a, ml0.a) && cjf.n(this.b, ml0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
