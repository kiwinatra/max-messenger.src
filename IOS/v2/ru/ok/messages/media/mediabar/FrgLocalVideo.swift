package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalVideo extends FrgLocalMedia implements d2a {
    public ju8 I1;
    public x2a J1;
    public b1a K1;
    public SimpleDraweeView L1;
    public kj8 M1;

    public final void B1(d48 d48, Uri uri, int i, Uri uri2) {
        if (uri != null) {
            this.L1.setImageURI(uri);
        }
    }

    public final void D0() {
        hi6 h3 = h3();
        if (h3 != null) {
            h3.b(true, true, false);
        }
    }

    public final void W0(Throwable th) {
        hi7.b0(0, O1(), fhf.f(O1(), th));
    }

    public final void Z2(View view) {
        b1a b1a = this.K1;
        if (b1a != null) {
            f2a f2a = b1a.a;
            if (f2a instanceof bif) {
                ((bif) f2a).c();
            }
        }
    }

    public final void j3() {
        if (this.K1 != null) {
            hi6 h3 = h3();
            if (h3 == null || !h3.d()) {
                this.K1.G(false);
            } else {
                this.K1.G(true);
            }
        }
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(ujc.frg_local_video, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.r1.n);
        this.I1 = ((ku8) M1()).a();
        this.M1 = M1() instanceof kj8 ? (kj8) M1() : null;
        this.J1 = new x2a(O1(), slideOutLayout.findViewById(lic.frg_local_video__player), ((qra) ((id3) this.p1.b)).d(), ((qra) ((id3) this.p1.b)).c());
        if (bundle != null || !this.x.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT")) {
            ((View) this.J1.c).setVisibility(8);
        } else {
            this.K1 = new b1a(this.J1, this.I1, O1(), ((qra) ((id3) this.p1.b)).s().f, ((qra) ((id3) this.p1.b)).H(), this, ((qra) ((id3) this.p1.b)).K(), this.M1);
            k3();
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(lic.frg_local_video__iv_video);
        this.L1 = simpleDraweeView;
        y64.n(simpleDraweeView, new b5(17, this));
        SimpleDraweeView simpleDraweeView2 = this.L1;
        if (this.D1) {
            simpleDraweeView2.setTransitionName(this.C1.a());
        }
        lc5 lc5 = new lc5(18, (Object) this);
        WeakHashMap weakHashMap = gag.a;
        v9g.u(slideOutLayout, lc5);
        t9g.c(slideOutLayout);
        return slideOutLayout;
    }

    public final void k3() {
        if (this.K1 != null) {
            d48 d48 = this.C1;
            if (d48 == null || ((d48 instanceof k00) && cvg.A(((k00) d48).X.r))) {
                z68.c("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Can't bind local media. Skip", new Object[0]);
                ((View) this.J1.c).setVisibility(8);
                return;
            }
            z68.c("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Bind local media success", new Object[0]);
            ((View) this.J1.c).setVisibility(0);
            b1a b1a = this.K1;
            d48 d482 = this.C1;
            b1a.getClass();
            z68.c("b1a", "Bind local media %s", Long.valueOf(d482.b));
            ((m48) b1a.b).j = false;
            jbd.c(b1a.z);
            b1a.Z();
            b1a.Y();
            r7g a = b1a.y.a();
            a.c = true;
            a.e = true;
            a.f = false;
            a.g = false;
            a.n = null;
            a.s = true;
            r7g r7g = new r7g(a);
            b1a.y = r7g;
            ((o4a) b1a.a).m(r7g);
            boolean z = d482 instanceof k00;
            jbf jbf = b1a.v;
            if (z) {
                k00 k00 = (k00) d482;
                if (cvg.A(k00.X.r)) {
                    kbf kbf = (kbf) jbf;
                    fce j = b1a.x.c(k00.X, k00.Y, k00.Z).n(kbf.a()).j(kbf.c());
                    ao1 ao1 = new ao1(3, new a1a(b1a, 0), new a1a(b1a, 1));
                    j.l(ao1);
                    b1a.z = ao1;
                    return;
                }
            }
            mka mka = new mka(1, new g18(26, b1a, d482));
            jbf.getClass();
            kbf kbf2 = (kbf) jbf;
            fce j2 = mka.n(kbf2.a()).j(kbf2.c());
            ao1 ao12 = new ao1(3, new a1a(b1a, 0), new a1a(b1a, 1));
            j2.l(ao12);
            b1a.z = ao12;
        }
    }

    public final void l2() {
        super.l2();
        m3();
    }

    public final void l3() {
        m3();
        View view = (View) this.J1.c;
        if (view != null) {
            view.setVisibility(0);
        }
        this.K1 = new b1a(this.J1, this.I1, O1(), ((qra) ((id3) this.p1.b)).s().f, ((qra) ((id3) this.p1.b)).H(), this, ((qra) ((id3) this.p1.b)).K(), this.M1);
        k3();
    }

    public final void m() {
        hi6 h3 = h3();
        if (h3 != null) {
            h3.c();
        }
    }

    public final void m3() {
        if (this.K1 != null) {
            z68.c("ru.ok.messages.media.mediabar.FrgLocalMedia", "Release", new Object[0]);
            ((m48) this.K1.b).n();
            this.K1.I(false);
            this.K1 = null;
        }
    }

    public final boolean s2(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.o1) {
            return true;
        }
        U2();
        return true;
    }

    public final void t2() {
        super.t2();
        m3();
    }

    public final void w2() {
        super.w2();
        this.E1.c();
    }
}
