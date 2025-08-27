package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: o7d  reason: default package */
public final class o7d {
    public final gaf a;
    public final j6d b;
    public final String c = o7d.class.getName();
    public final Lazy d = LazyKt.lazy(new ifb(19, this));

    public o7d(gaf gaf, j6d j6d) {
        this.a = gaf;
        this.b = j6d;
    }

    public final rne a() {
        return (rne) this.d.getValue();
    }
}
