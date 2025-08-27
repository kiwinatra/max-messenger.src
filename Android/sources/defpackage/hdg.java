package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: hdg  reason: default package */
public final class hdg implements su1 {
    public final su1 a;
    public final o4d b;
    public final jdg c;
    public final uzf o;

    public hdg(su1 su1, uzf uzf, nqd nqd) {
        this.a = su1;
        this.o = uzf;
        this.b = new o4d(su1.f(), nqd);
        this.c = new jdg(su1.n());
    }

    public final kha a() {
        return this.a.a();
    }

    public final void d(vzf vzf) {
        ev0.g();
        this.o.d(vzf);
    }

    public final void e(vzf vzf) {
        ev0.g();
        this.o.e(vzf);
    }

    public final au1 f() {
        return this.b;
    }

    public final void h(vzf vzf) {
        ev0.g();
        this.o.h(vzf);
    }

    public final void j(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final void k(ArrayList arrayList) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    public final boolean l() {
        return false;
    }

    public final qu1 n() {
        return this.c;
    }

    public final void o(vzf vzf) {
        ev0.g();
        this.o.o(vzf);
    }
}
