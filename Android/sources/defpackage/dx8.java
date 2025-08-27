package defpackage;

import java.util.List;

/* renamed from: dx8  reason: default package */
public final class dx8 {
    public final tb7 a;
    public final int b;
    public final long c;

    public dx8(int i, long j, List list) {
        this.a = tb7.p(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx8)) {
            return false;
        }
        dx8 dx8 = (dx8) obj;
        if (this.a.equals(dx8.a)) {
            Integer valueOf = Integer.valueOf(this.b);
            Integer valueOf2 = Integer.valueOf(dx8.b);
            int i = v0g.a;
            if (valueOf.equals(valueOf2) && Long.valueOf(this.c).equals(Long.valueOf(dx8.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return kr7.y(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
