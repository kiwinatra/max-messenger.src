package defpackage;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: jz1  reason: default package */
public final class jz1 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public jz1(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy3;
        this.b = lazy;
        this.c = lazy2;
    }

    public final Long a(long j, a20 a20, String str) {
        Lazy lazy = this.a;
        ((my2) ((qx2) lazy.getValue())).n().d(j, x62.b);
        if (((my2) ((qx2) lazy.getValue())).h(j, new iz1()) == null) {
            return Boxing.boxLong(0);
        }
        ((sv0) this.c.getValue()).c(new xy2(CollectionsKt.listOf(Boxing.boxLong(j)), false, false, (bl4) null, (zub) null, 124));
        jna jna = (jna) ((rl) this.b.getValue());
        return Boxing.boxLong(((jqg) jna.e.getValue()).b(new kz1(((ltb) jna.D()).a.n(), str, j, a20, cjf.C(str))));
    }
}
