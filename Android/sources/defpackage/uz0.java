package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: uz0  reason: default package */
public final class uz0 {
    public final Lazy a;
    public final Lazy b;
    public final n6e c = m5a.a(1, 1, cu0.b);

    public uz0(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = LazyKt.lazy(new sz0(lazy2, (Object) this, lazy3, 0));
    }
}
