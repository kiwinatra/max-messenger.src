package defpackage;

import java.util.Objects;

/* renamed from: z2d  reason: default package */
public final class z2d implements n9d {
    public final boolean a;

    public z2d(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z2d.class != obj.getClass()) {
            return false;
        }
        return this.a == ((z2d) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return wzf.l(new StringBuilder("RequestAsr{isEnabled="), this.a, '}');
    }
}
