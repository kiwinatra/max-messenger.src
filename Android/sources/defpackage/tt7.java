package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: tt7  reason: default package */
public final class tt7 {
    public final ne7 a;
    public final Lazy b;
    public final xme c;
    public final etc d;
    public final jx3 e;
    public final a0a f = cvg.a();

    public tt7(sv0 sv0, ne7 ne7, Lazy lazy, gaf gaf) {
        this.a = ne7;
        this.b = lazy;
        xme a2 = f6e.a(new ouf(new ya8(10)));
        this.c = a2;
        this.d = new etc(a2);
        this.e = e14.a(((osa) gaf).a());
        sv0.d(this);
    }

    public static final Unit a(tt7 tt7, long j) {
        CharSequence f2 = ((vb2) ((fq2) tt7.b.getValue())).f(j);
        if (f2 == null) {
            f2 = "";
        }
        sr2 sr2 = new sr2(f2, j);
        xme xme = tt7.c;
        ouf ouf = (ouf) xme.getValue();
        ya8 ya8 = new ya8(ouf.a.k());
        ya8 ya82 = ouf.a;
        int k = ya82.k();
        for (int i = 0; i < k; i++) {
            ya8.i(ya82.h(i), ya82.l(i));
        }
        ya8.i(j, sr2);
        xme.m((Object) null, new ouf(ya8));
        Unit unit = Unit.INSTANCE;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return unit;
    }

    public static final Unit b(tt7 tt7, long j) {
        xme xme = tt7.c;
        ouf ouf = (ouf) xme.getValue();
        ya8 ya8 = new ya8(ouf.a.k());
        ya8 ya82 = ouf.a;
        int k = ya82.k();
        for (int i = 0; i < k; i++) {
            ya8.i(ya82.h(i), ya82.l(i));
        }
        ya8.j(j);
        xme.m((Object) null, new ouf(ya8));
        Unit unit = Unit.INSTANCE;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return unit;
    }

    @oye
    public final void onEvent(nuf nuf) {
        ev0.v(this.e, (CoroutineContext) null, (f14) null, new st7(this, nuf, (Continuation) null), 3);
    }
}
