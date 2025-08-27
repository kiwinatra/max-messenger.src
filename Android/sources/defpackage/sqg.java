package defpackage;

import android.os.Handler;

/* renamed from: sqg  reason: default package */
public abstract class sqg extends sc3 {
    public final yj0 k;

    public sqg(yj0 yj0) {
        this.k = yj0;
    }

    public abstract void A(jkf jkf);

    public void B() {
        y((Object) null, this.k);
    }

    public final jkf h() {
        return this.k.h();
    }

    public final ir8 i() {
        return this.k.i();
    }

    public final boolean j() {
        return this.k.j();
    }

    public final void m(brf brf) {
        this.j = brf;
        this.i = v0g.o((Handler.Callback) null);
        B();
    }

    public void t(ir8 ir8) {
        this.k.t(ir8);
    }

    public final nz8 u(Object obj, nz8 nz8) {
        Void voidR = (Void) obj;
        return z(nz8);
    }

    public final long v(long j, Object obj) {
        Void voidR = (Void) obj;
        return j;
    }

    public final int w(int i, Object obj) {
        Void voidR = (Void) obj;
        return i;
    }

    public final void x(Object obj, yj0 yj0, jkf jkf) {
        Void voidR = (Void) obj;
        A(jkf);
    }

    public nz8 z(nz8 nz8) {
        return nz8;
    }
}
