package defpackage;

import java.util.List;

/* renamed from: sqf  reason: default package */
public final class sqf implements jv0 {
    public static final sqf b = new sqf(k0d.v);
    public final tb7 a;

    static {
        lx5 lx5 = tb7.b;
    }

    public sqf(List list) {
        this.a = tb7.p(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sqf.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sqf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
