package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: wkd  reason: default package */
public final class wkd extends xag {
    public final long b;
    public final q72 c;
    public final fu4 o;
    public final wx3 v = new wx3(9, (Object) this);
    public final etc w;
    public final etc x;
    public final s85 y;

    public wkd(tkd tkd, long j, q72 q72, fu4 fu4) {
        this.b = j;
        this.c = q72;
        this.o = fu4;
        this.w = (etc) fu4.h;
        etc etc = (etc) fu4.j;
        this.x = etc;
        this.y = new s85(0);
        bs0.K(new ps5(new dtc(tkd.a), new ukd(this, (Continuation) null), 5), this.a);
        bs0.K(new ps5(new on2(etc, 28), new vkd(this, (Continuation) null), 5), this.a);
    }

    public final void j() {
        this.v.f(false);
        fu4 fu4 = this.o;
        rk2 rk2 = (rk2) fu4.c;
        rk2.g = null;
        rk2.a();
        rk2.a();
        ((xme) fu4.i).setValue((Object) null);
        hld hld = hld.a;
        xme xme = (xme) fu4.g;
        xme.getClass();
        xme.m((Object) null, hld);
    }

    public final void k(boolean z) {
        this.v.f(true);
        fu4 fu4 = this.o;
        rk2 rk2 = (rk2) fu4.c;
        ev0.v(rk2.e, (CoroutineContext) null, (f14) null, new qk2(rk2, (Continuation) null), 3);
        rk2.g = fu4;
        ild ild = new ild(z);
        xme xme = (xme) fu4.g;
        xme.getClass();
        xme.m((Object) null, ild);
    }
}
