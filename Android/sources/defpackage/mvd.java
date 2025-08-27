package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: mvd  reason: default package */
public final class mvd extends ivd {
    public final String x0;
    public final boolean y0;
    public final List z0;

    public mvd(kvd kvd) {
        super(kvd);
        this.x0 = kvd.m;
        this.y0 = kvd.n;
        this.z0 = (List) kvd.o;
    }

    public final ga9 A() {
        ga9 ga9 = new ga9();
        ga9.g = this.x0;
        ga9.u = this.y0;
        ga9.F = Collections.unmodifiableList(this.z0);
        return ga9;
    }
}
