package defpackage;

import android.graphics.Point;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: qk1  reason: default package */
public final class qk1 implements vd1 {
    public final /* synthetic */ rk1 a;

    public qk1(rk1 rk1) {
        this.a = rk1;
    }

    public final void k(ze1 ze1, Point point) {
        pk1 pk1 = this.a.W0;
        if (pk1 != null) {
            gga gga = CallScreen.J0;
            ((nh1) pk1).a.p0().r(ze1, point);
        }
    }

    public final void m(ze1 ze1) {
        pk1 pk1 = this.a.W0;
        if (pk1 != null) {
            gga gga = CallScreen.J0;
            ((nh1) pk1).a.p0().o(ze1);
        }
    }

    public final void o(ze1 ze1) {
        Object value;
        pk1 pk1 = this.a.W0;
        if (pk1 != null) {
            gga gga = CallScreen.J0;
            xme xme = ((nh1) pk1).a.p0().c.l;
            do {
                value = xme.getValue();
            } while (!xme.b(value, zm1.a((zm1) value, (ze1) null, (ze1) null, ze1, (vag) null, 27)));
        }
    }

    public final void y() {
        pk1 pk1 = this.a.W0;
        if (pk1 != null) {
            gga gga = CallScreen.J0;
            ((nh1) pk1).a.p0().c.g();
        }
    }
}
