package defpackage;

import javax.inject.Provider;

/* renamed from: lh4  reason: default package */
public final class lh4 extends nla {
    public final /* synthetic */ int b = 1;
    public final zad c;
    public final wl d;
    public final ola e;

    /* JADX WARNING: type inference failed for: r0v1, types: [ola, java.lang.Object] */
    public lh4(xrb xrb) {
        super(xrb);
        this.e = new Object();
        wl wlVar = xrb.Z;
        if (wlVar != null) {
            this.d = wlVar;
            this.c = new zad(wlVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final wl a() {
        switch (this.b) {
            case 0:
                return (hm4) this.d;
            case 1:
                return (hm4) this.d;
            default:
                return this.d;
        }
    }

    public final ola b() {
        switch (this.b) {
            case 0:
                return (jk3) this.e;
            case 1:
                return (g6d) this.e;
            default:
                return (v02) this.e;
        }
    }

    public final zad c() {
        switch (this.b) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            default:
                return this.c;
        }
    }

    public lh4(ic3 ic3, pm pmVar, tm tmVar, o21 o21) {
        super(ic3);
        fx fxVar = new fx(2, pmVar, o21);
        k47 k47 = new k47(new p9a(20));
        k47.e = (jm) ic3.o;
        k47.b.a = new dv(new grg(11, fxVar));
        hm4 hm4 = new hm4(k47, fxVar, tmVar, (Provider) ic3.c);
        this.e = new jk3(fxVar, hm4, k47);
        this.d = hm4;
        this.c = new zad(hm4);
    }

    public lh4(ic3 ic3, cf3 cf3, bmf bmf) {
        super(ic3);
        gm4 gm4 = new gm4((Object) cf3);
        k47 k47 = new k47(new p9a(20));
        k47.e = (jm) ic3.o;
        k47.b.a = new dv(new grg(11, gm4));
        hm4 hm4 = new hm4(k47, gm4, bmf, (Provider) ic3.c);
        this.e = new g6d(gm4, hm4, k47, 7);
        this.d = hm4;
        this.c = new zad(hm4);
    }
}
