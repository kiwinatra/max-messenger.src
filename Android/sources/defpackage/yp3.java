package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: yp3  reason: default package */
public final class yp3 extends xag {
    public static final List B0;
    public static final j95 C0;
    public final xme A0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final eq3 b;
    public final gaf c;
    public final Lazy o;
    public final Lazy v;
    public final etc v0;
    public final Lazy w;
    public final ju3 w0;
    public final Lazy x;
    public final s85 x0;
    public final Lazy y;
    public final s85 y0;
    public final Lazy z;
    public final xme z0;

    static {
        List listOf = CollectionsKt.listOf(wk3.c, wk3.x, wk3.y, wk3.a, wk3.b, wk3.o, wk3.z, wk3.v, wk3.w);
        B0 = listOf;
        C0 = new j95(listOf);
    }

    public yp3(eq3 eq3, Lazy lazy, cp3 cp3, Lazy lazy2, gaf gaf, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12) {
        this.b = eq3;
        this.c = gaf;
        this.o = lazy4;
        this.v = lazy5;
        this.w = lazy6;
        this.x = lazy7;
        this.y = lazy8;
        this.z = lazy9;
        this.X = lazy10;
        this.Y = lazy11;
        this.Z = lazy12;
        xme a = f6e.a(po3.d);
        etc etc = new etc(a);
        this.v0 = etc;
        this.w0 = new ju3(this.a, etc, new he((Object) lazy2, (Object) (Context) lazy.getValue(), eq3 == eq3.a, 9), LazyKt.lazyOf(gaf), lazy3);
        this.x0 = new s85(0);
        this.y0 = new s85(0);
        xme a2 = f6e.a(new igf(sra.j));
        this.z0 = a2;
        this.A0 = a2;
        bs0.K(new ps5(new wb(14, cp3.c(), this), new zw(a, 17), 5), this.a);
        cp3.d();
        xag.g(this, ((osa) gaf).b(), (f14) null, new qp3(this, (Continuation) null), 2);
    }

    public final void j(int i, long j) {
        xag.g(this, ((osa) this.c).a(), (f14) null, new vp3(i, this, j, (Continuation) null), 2);
    }
}
