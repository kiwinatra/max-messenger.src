package defpackage;

import kotlin.Lazy;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: l7a  reason: default package */
public final class l7a {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final jx3 f;
    public final n6e g;
    public final dtc h;
    public final xme i;
    public final etc j;
    public volatile String k;

    public l7a(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        this.a = lazy;
        this.b = lazy3;
        this.c = lazy4;
        this.d = lazy5;
        this.e = lazy6;
        this.f = e14.a(((osa) ((gaf) lazy2.getValue())).b());
        n6e b2 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 4);
        this.g = b2;
        this.h = new dtc(b2);
        xme a2 = f6e.a((Object) null);
        this.i = a2;
        this.j = new etc(a2);
    }

    public final void a() {
        this.k = null;
        e0b e0b = (e0b) this.e.getValue();
        e0b.h(new igf(qad.n0));
        e0b.f(new o0b(cad.K));
        e0b.j();
    }

    public final void b() {
        this.k = null;
        e0b e0b = (e0b) this.e.getValue();
        e0b.h(new igf(qad.p0));
        e0b.f(new o0b(cad.K));
        e0b.j();
    }
}
