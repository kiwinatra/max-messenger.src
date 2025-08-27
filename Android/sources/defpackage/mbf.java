package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: mbf  reason: default package */
public abstract class mbf {
    public final Context a;
    public final ed4 b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;

    public mbf(Context context, ed4 ed4, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5) {
        this.a = context;
        this.b = ed4;
        this.c = lazy;
        this.d = lazy5;
        this.e = lazy3;
        this.f = lazy2;
        this.g = lazy4;
        this.h = ((no9) lazy5.getValue()).c;
        this.i = ((no9) lazy5.getValue()).a;
        this.j = ((no9) lazy5.getValue()).d;
        cq cqVar = (cq) this;
        this.k = LazyKt.lazy(new lbf(cqVar, 0));
        this.l = LazyKt.lazy(new lbf(cqVar, 1));
    }

    public final jwa a() {
        return (jwa) this.e.getValue();
    }

    public final pwa b() {
        return (pwa) this.f.getValue();
    }

    public abstract boolean c();
}
