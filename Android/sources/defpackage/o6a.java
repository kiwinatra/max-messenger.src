package defpackage;

/* renamed from: o6a  reason: default package */
public final class o6a implements gxd, qh3 {
    public final sv0 a;
    public final hxd b;
    public final rh3 c;

    public o6a(sv0 sv0, hxd hxd, rh3 rh3) {
        this.a = sv0;
        this.b = hxd;
        this.c = rh3;
        ((jxd) hxd).d.add(this);
    }

    public final void a() {
        d();
    }

    public final void b() {
        d();
    }

    public final void c(int i) {
        d();
    }

    public final void d() {
        int i = ((jxd) this.b).h;
        mi3 b2 = this.c.b();
        boolean a2 = this.c.a();
        z68.c("o6a", "stateChanged sessionState = %s, connectionType = %s, backgroundDataEnabled = = %s", i != 1 ? i != 2 ? i != 3 ? null : "loggedIn" : "connected" : "disconnected", iq.C(b2), Boolean.valueOf(a2));
        this.a.c(new sh3(i, b2, a2));
    }
}
