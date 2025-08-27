package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: hl3  reason: default package */
public final class hl3 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public hl3(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
    }

    public final Unit a(long j) {
        String name = hl3.class.getName();
        z68.c(name, "block, id = " + j, new Object[0]);
        ((km3) this.a.getValue()).g(j, sm3.a);
        jna jna = (jna) ((rl) this.d.getValue());
        ocf.d(jna.E(), new ts3(1, ((ltb) jna.D()).a.n(), j, (String) null, (String) null, (String) null, (String) null), false, 0, 12);
        ((r62) this.b.getValue()).m(j, k72.v);
        ((uu3) this.c.getValue()).b(CollectionsKt.listOf(Boxing.boxLong(j)));
        ((sv0) this.e.getValue()).c(new zu3(j));
        return Unit.INSTANCE;
    }
}
