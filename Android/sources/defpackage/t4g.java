package defpackage;

import java.util.HashMap;

/* renamed from: t4g  reason: default package */
public final class t4g {
    public final ou8 a;
    public final v4g b;
    public final ln5 c;
    public final nd d;
    public final sfd e;
    public final lfd f;
    public final qfd g;
    public final ifg h = new ifg();
    public final HashMap i = new HashMap();

    public t4g(ou8 ou8, v4g v4g, ln5 ln5, nd ndVar, sfd sfd, lfd lfd, qfd qfd) {
        this.a = ou8;
        this.b = v4g;
        this.c = ln5;
        this.d = ndVar;
        this.e = sfd;
        this.f = lfd;
        this.g = qfd;
    }

    public final synchronized void a(k4g k4g) {
        this.i.remove(k4g);
        ryg.k0(new na3(4, this.b.a(), new q4g(k4g, 2)).m(), m58.f, new q4g(k4g, 0), new ivc(10, k4g));
    }
}
