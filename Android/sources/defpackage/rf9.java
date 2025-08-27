package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: rf9  reason: default package */
public final class rf9 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final Lazy e;

    public rf9(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy4;
        this.e = LazyKt.lazy(new ur(20, lazy3));
    }
}
