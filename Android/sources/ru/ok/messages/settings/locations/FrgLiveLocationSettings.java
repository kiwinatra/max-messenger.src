package ru.ok.messages.settings.locations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.views.fragments.base.FrgBase;

public class FrgLiveLocationSettings extends FrgBase implements yh6 {
    public r0a B1;
    public eud C1;

    public final String V2() {
        return "SETTINGS_LIVE_LOCATIONS";
    }

    public final void b3(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 301) {
            this.C1.K();
        }
    }

    public final void e3(int i, String[] strArr, int[] iArr) {
        if (eud.t(i)) {
            this.C1.I(i, strArr, iArr);
        }
    }

    public final void k0(long j) {
        z68.c("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "On stop now location click %d", Long.valueOf(j));
        r0a r0a = this.B1;
        j18 j18 = (j18) r0a.o;
        if (j18.Z.G(j) != null) {
            j18.v.a(j18.z0.c(new z60(j18, j, 6)));
        }
        r0a.w.f("LIVE_LOCATION_STOP", "SETTINGS");
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = bundle;
        Context O1 = O1();
        if (O1 == null) {
            z68.f("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Context is null", (Throwable) null);
            return null;
        }
        d18 p = ((sjd) tr1.h((qra) ((id3) this.p1.b))).p();
        ltb y = ((qra) ((id3) this.p1.b)).y();
        r62 l = ((qra) ((id3) this.p1.b)).l();
        yva v = ((qra) ((id3) this.p1.b)).v();
        jd8 J = ((qra) ((id3) this.p1.b)).J();
        jbf H = ((qra) ((id3) this.p1.b)).H();
        H.getClass();
        lfd a = ((kbf) H).a();
        z2a z2a = new z2a(O1, viewGroup, v);
        nd c = ((qra) ((id3) this.p1.b)).c();
        this.C1 = new eud(this.q1.l(), (FrgBase) this);
        r0a r0a = r0;
        r0a r0a2 = new r0a(z2a, y, l, p, J, c, this.C1, a, this.q1.k(), this);
        this.B1 = r0a;
        if (bundle2 != null) {
            r0a.v0 = bundle2.getBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked");
        }
        b33 Y2 = Y2();
        if (Y2 != null) {
            Y2.l(S1(qad.L3));
        }
        z2a.c();
        View view = (View) z2a.c;
        if (view != null) {
            return view;
        }
        z68.f("ru.ok.messages.settings.locations.FrgLiveLocationSettings", "Root view is null", (Throwable) null);
        return null;
    }

    public final void t2() {
        super.t2();
        r0a r0a = this.B1;
        ((Set) ((z2a) r0a.a).a).remove(r0a);
        ((j18) r0a.o).o(r0a, 0);
        jbd.c(r0a.X);
        jbd.c(r0a.Y);
        r0a.v.f(r0a);
    }

    public final void w2() {
        super.w2();
        r0a r0a = this.B1;
        z2a z2a = (z2a) r0a.a;
        z2a.R(r0a);
        z2a.Z(true);
        ((j18) r0a.o).i(r0a, 0);
        r0a.W();
        jbd.c(r0a.Y);
        long q = (long) ((ltb) r0a.b).b.q();
        lja s = jha.o(q, q, TimeUnit.SECONDS, xfd.a()).s(qe.a());
        or7 or7 = new or7(new p0a(r0a, 0), new p79(29), m58.e);
        s.a(or7);
        r0a.Y = or7;
        r0a.v.d(r0a);
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putBoolean("MvcControllerLiveLocationSettingsImpl.permissionChecked", this.B1.v0);
    }
}
