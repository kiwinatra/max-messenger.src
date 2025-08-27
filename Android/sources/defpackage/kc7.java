package defpackage;

import java.util.Arrays;

/* renamed from: kc7  reason: default package */
public final class kc7 extends p1 implements jc7 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        q1 q1Var = (q1) ((c1g) obj);
        if (q1Var.g() != 5) {
            return false;
        }
        boolean z = q1Var instanceof kc7;
        byte[] bArr = this.a;
        if (z) {
            return Arrays.equals(bArr, ((kc7) q1Var).a);
        }
        byte[] bArr2 = ((p1) q1Var.s()).a;
        return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
    }

    public final int g() {
        return 5;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final jc7 s() {
        return this;
    }

    public final jc7 v() {
        return this;
    }
}
