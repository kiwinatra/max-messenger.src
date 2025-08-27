package defpackage;

import java.util.List;

/* renamed from: se7  reason: default package */
public final class se7 implements r2f {
    public final List a;
    public final boolean b;

    public se7(List list, boolean z) {
        cvg.m("List of suppliers is empty!", !list.isEmpty());
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof se7)) {
            return false;
        }
        return hsg.k(this.a, ((se7) obj).a);
    }

    public final Object get() {
        return new re7(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        w28 K = hsg.K(this);
        K.x(this.a, "list");
        return K.toString();
    }
}
