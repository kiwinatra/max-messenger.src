package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: h5d  reason: default package */
public final class h5d {
    public final Lazy a = LazyKt.lazy(new mxb(27));
    public final Lazy b;
    public g5d c;

    public h5d(Lazy lazy, Lazy lazy2) {
        this.b = LazyKt.lazy(new sz0(lazy, (Object) this, lazy2, 10));
    }

    public final tg1 a() {
        return (tg1) this.b.getValue();
    }

    public final void b() {
        g5d g5d = this.c;
        if (g5d == g5d.END || g5d == g5d.BUSY) {
            this.c = null;
            return;
        }
        this.c = null;
        a().c();
    }
}
