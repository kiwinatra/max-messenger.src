package defpackage;

import java.util.Arrays;

/* renamed from: xsg  reason: default package */
public final class xsg {
    public final boolean[] a = new boolean[dg0.values().length];
    public int b = 0;

    public final boolean a(dg0 dg0, boolean z) {
        int ordinal = dg0.ordinal();
        boolean[] zArr = this.a;
        boolean z2 = zArr[ordinal];
        zArr[dg0.ordinal()] = z;
        if (z2 == z) {
            return false;
        }
        this.b += z ? 1 : -1;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xsg.class != obj.getClass()) {
            return false;
        }
        xsg xsg = (xsg) obj;
        return this.b == xsg.b && Arrays.equals(this.a, xsg.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
}
