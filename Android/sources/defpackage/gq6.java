package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: gq6  reason: default package */
public final class gq6 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public gq6(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public static Object a(gq6 gq6, long j, Continuation continuation) {
        Duration.Companion companion = Duration.Companion;
        return ev0.I(((osa) ((gaf) gq6.c.getValue())).b(), new fq6(gq6, j, DurationKt.toDuration(3, DurationUnit.SECONDS), true, (Continuation) null), continuation);
    }
}
