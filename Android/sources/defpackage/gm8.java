package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: gm8  reason: default package */
public final class gm8 implements g74 {
    public final Lazy a;

    public gm8(q4 q4Var) {
        this.a = LazyKt.lazy(new us2(q4Var, 9));
    }

    public final j74 a() {
        return ((hx0) this.a.getValue()).a();
    }
}
