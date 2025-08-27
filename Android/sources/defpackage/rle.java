package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: rle  reason: default package */
public final class rle extends xag {
    public final xme X;
    public final etc Y;
    public final s85 Z = new s85(0);
    public final Lazy b;
    public final bud c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;
    public final xme x;
    public final etc y;
    public final ju3 z;

    public rle(Lazy lazy, Lazy lazy2, Lazy lazy3, cp3 cp3, Lazy lazy4, Lazy lazy5, Lazy lazy6, bud bud) {
        this.b = lazy2;
        this.c = bud;
        this.o = lazy;
        this.v = lazy5;
        this.w = lazy6;
        xme a = f6e.a(po3.d);
        this.x = a;
        etc etc = new etc(a);
        this.y = etc;
        this.z = new ju3(this.a, etc, new he((Object) lazy4, (Object) (Context) lazy2.getValue(), false, 9), lazy, lazy3);
        xme a2 = f6e.a(CollectionsKt.emptyList());
        this.X = a2;
        this.Y = new etc(a2);
        bs0.K(new ps5(cp3.c(), new nle(this, (Continuation) null), 5), this.a);
        cp3.d();
        xag.g(this, (CoroutineContext) null, (f14) null, new ole(this, (Continuation) null), 3);
    }
}
