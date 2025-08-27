package defpackage;

/* renamed from: dt8  reason: default package */
public final class dt8 implements oo8, sob {
    public final ry8 a;
    public final ex8 b;

    public dt8(ry8 ry8, ex8 ex8) {
        this.a = ry8;
        this.b = ex8;
    }

    public final void Y(vob vob, qob qob) {
        if (qob.a.a(4, 5, 14, 0)) {
            this.a.f(this.b, false);
        }
    }

    public final void b() {
        this.a.f(this.b, false);
    }

    public final void g() {
        this.a.f(this.b, false);
    }

    public final void onDisconnected() {
        ry8 ry8 = this.a;
        ex8 ex8 = this.b;
        if (ry8.d(ex8)) {
            ry8.g(ex8);
        }
        ry8.f(ex8, false);
    }

    public final void t(boolean z) {
        if (z) {
            this.a.f(this.b, false);
        }
    }
}
