package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: xb  reason: default package */
public final class xb extends xag {
    public static final /* synthetic */ KProperty[] X = {rae.s(xb.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;", 0)};
    public final long b;
    public final lb c;
    public final Lazy o;
    public final Lazy v;
    public final wie w = o5a.U();
    public final n6e x;
    public final xme y;
    public final wb z;

    public xb(long j, lb lbVar, Lazy lazy, Lazy lazy2) {
        this.b = j;
        this.c = lbVar;
        this.o = lazy;
        this.v = lazy2;
        n6e b2 = m5a.b(0, 0, (cu0) null, 7);
        this.x = b2;
        xme a = f6e.a((Object) null);
        this.y = a;
        this.z = new wb(0, new i21(lbVar.j, b2, new x2(this, (Continuation) null, 1), 4), this);
        if (lbVar.g.compareAndSet(false, true)) {
            ev0.v(lbVar.f, (CoroutineContext) null, (f14) null, new kb(lbVar, (Continuation) null), 3);
        }
        bs0.K(new ps5(lbVar.l, new rb(this, (Continuation) null), 5), this.a);
        bs0.K(new ps5(bs0.w(bs0.v(a, 200)), new tb(this, lazy2, (Continuation) null), 5), this.a);
    }

    public final boolean j() {
        CharSequence charSequence = (CharSequence) this.y.getValue();
        return !(charSequence == null || charSequence.length() == 0);
    }
}
