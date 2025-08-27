package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: zk3  reason: default package */
public final class zk3 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public zk3(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
    }

    public final Unit a(long j) {
        String name = zk3.class.getName();
        z68.c(name, "add, id = " + j, new Object[0]);
        ((km3) this.a.getValue()).h(j, tm3.a, (sm3) null);
        jna jna = (jna) ((rl) this.c.getValue());
        ocf.d(jna.E(), new ts3(4, ((ltb) jna.D()).a.n(), j, (String) null, (String) null, (String) null, (String) null), false, 0, 12);
        ((uu3) this.b.getValue()).b(CollectionsKt.listOf(Boxing.boxLong(j)));
        ((sv0) this.d.getValue()).c(new zu3(j));
        return Unit.INSTANCE;
    }
}
