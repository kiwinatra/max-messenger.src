package defpackage;

import java.io.Serializable;

/* renamed from: hv6  reason: default package */
public final class hv6 implements Serializable {
    public static final hv6 b = new hv6(false);
    public final boolean a;

    public hv6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv6) && this.a == ((hv6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return tr1.m(new StringBuilder("GroupOptions(isPremium="), this.a, ")");
    }
}
