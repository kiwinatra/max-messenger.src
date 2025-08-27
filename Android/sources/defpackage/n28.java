package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: n28  reason: default package */
public final class n28 {
    public final Lazy a;
    public final Lazy b;

    public n28(Lazy lazy) {
        this.a = lazy;
        this.b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new ur(17, lazy));
    }
}
