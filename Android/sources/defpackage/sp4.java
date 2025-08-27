package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: sp4  reason: default package */
public final class sp4 implements r2f {
    public final xv1 a;
    public final oqb b;
    public final ma5 c;
    public final t9a d;
    public final int e = 0;
    public final kp4 f;
    public final kp4 g;
    public final Map h;
    public final Lazy i;

    public sp4(xv1 xv1, da7 da7) {
        oqb oqb = da7.n;
        this.a = xv1;
        this.b = oqb;
        this.c = da7.h;
        this.d = da7.i;
        this.f = da7.k;
        this.g = da7.t;
        this.h = null;
        this.i = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new pp4(this, 0));
    }

    public final Object get() {
        return (rp4) this.i.getValue();
    }
}
