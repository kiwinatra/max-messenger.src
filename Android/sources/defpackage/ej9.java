package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: ej9  reason: default package */
public final class ej9 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public ej9(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public final Object a(long j, Long l, Continuation continuation) {
        return ev0.I(((osa) ((gaf) this.c.getValue())).b(), new dj9(l, this, j, (Continuation) null), continuation);
    }
}
