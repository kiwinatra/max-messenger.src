package defpackage;

import kotlin.Lazy;
import kotlin.collections.SetsKt;

/* renamed from: y13  reason: default package */
public final class y13 {
    public final Lazy a;
    public final Lazy b;

    public y13(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final void a(long j, long j2) {
        z68.c("y13", "clearChat id=%d, time=%d", Long.valueOf(j), Long.valueOf(j2));
        ((r62) this.a.getValue()).s(j, j2);
        ((qwa) this.b.getValue()).b(SetsKt.setOf(Long.valueOf(j)));
    }
}
