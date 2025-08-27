package defpackage;

import java.util.Objects;

/* renamed from: rgd  reason: default package */
public final class rgd {
    public final qgd a;
    public final x87 b;

    public rgd(qgd qgd, x87 x87) {
        this.a = qgd;
        this.b = x87;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgd)) {
            return false;
        }
        rgd rgd = (rgd) obj;
        return this.a == rgd.a && Objects.equals(this.b, rgd.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
