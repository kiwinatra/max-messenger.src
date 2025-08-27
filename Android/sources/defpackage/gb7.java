package defpackage;

import java.util.Arrays;

/* renamed from: gb7  reason: default package */
public final class gb7 extends p1 implements fb7 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1g = (c1g) obj;
        int g = ((q1) c1g).g();
        if (g == 0) {
            throw null;
        } else if (g != 6) {
            return false;
        } else {
            boolean z = c1g instanceof gb7;
            byte[] bArr = this.a;
            if (z) {
                return Arrays.equals(bArr, ((gb7) c1g).a);
            }
            byte[] bArr2 = ((p1) c1g.u()).a;
            return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public final int g() {
        return 6;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final fb7 u() {
        return this;
    }

    public final fb7 y() {
        return this;
    }
}
