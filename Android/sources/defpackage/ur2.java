package defpackage;

import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: ur2  reason: default package */
public final class ur2 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public ur2(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public final Unit a(long j, long j2, Continuation continuation) {
        ((nd) this.a.getValue()).e("ACTION_MSG_UNPIN");
        jna jna = (jna) ((rl) this.b.getValue());
        if (jna.r(j)) {
            wr2 wr2 = r2;
            wr2 wr22 = new wr2(((ltb) jna.D()).a.n(), j, j2, 0, (String) null, false, (String) null, (HashMap) null, (String) null, (String) null, (a20) null, -1L, false, 0);
            jna.A(jna, wr2);
        }
        r62 n = ((my2) ((qx2) this.c.getValue())).n();
        Long boxLong = Boxing.boxLong(j);
        n.getClass();
        n.d(boxLong.longValue(), x62.o);
        n.i(boxLong.longValue(), false, new fm0(21));
        Unit unit = Unit.INSTANCE;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return unit;
    }
}
