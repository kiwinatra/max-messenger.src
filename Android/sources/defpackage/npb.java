package defpackage;

import java.util.Arrays;

/* renamed from: npb  reason: default package */
public final class npb {
    public static final npb c = new npb(false, false);
    public static final String d = Integer.toString(0, 36);
    public static final String e = Integer.toString(1, 36);
    public final boolean a;
    public final boolean b;

    static {
        int i = v0g.a;
    }

    public npb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npb)) {
            return false;
        }
        npb npb = (npb) obj;
        return this.a == npb.a && this.b == npb.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }
}
