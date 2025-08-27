package defpackage;

import java.util.Objects;

/* renamed from: fy8  reason: default package */
public final class fy8 implements bx8 {
    public final ly8 a;

    public fy8(ly8 ly8) {
        this.a = ly8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != fy8.class) {
            return false;
        }
        return v0g.a(this.a, ((fy8) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
