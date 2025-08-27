package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: dqf  reason: default package */
public final class dqf {
    public static final String c = Integer.toString(0, 36);
    public static final String d = Integer.toString(1, 36);
    public final spf a;
    public final tb7 b;

    static {
        int i = v0g.a;
    }

    public dqf(spf spf, List list) {
        if (list.isEmpty() || (((Integer) Collections.min(list)).intValue() >= 0 && ((Integer) Collections.max(list)).intValue() < spf.a)) {
            this.a = spf;
            this.b = tb7.p(list);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dqf.class != obj.getClass()) {
            return false;
        }
        dqf dqf = (dqf) obj;
        return this.a.equals(dqf.a) && this.b.equals(dqf.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
