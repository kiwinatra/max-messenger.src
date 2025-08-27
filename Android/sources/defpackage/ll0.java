package defpackage;

import java.util.Arrays;

/* renamed from: ll0  reason: default package */
public final class ll0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public ll0(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ll0)) {
            return false;
        }
        ll0 ll0 = (ll0) obj;
        return this.c == ll0.c && this.d == ll0.d && cjf.n(this.a, ll0.a) && cjf.n(this.b, ll0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
