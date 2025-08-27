package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.nano.b;

public abstract class FrgAttachView extends FrgSlideOut {
    public a89 C1;
    public l20 D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1 = false;

    public static Bundle i3(l20 l20, a89 a89, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH", l20 != null ? ad9.toByteArray(b.d(l20)) : null);
        bundle.putParcelable("ru.ok.tamtam.extra.MESSAGE", new hd9(a89));
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", z);
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", z2);
        bundle.putBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", z3);
        return bundle;
    }

    public void A1(int i) {
        if (this.F1) {
            androidx.fragment.app.b M1 = M1();
            M1.getClass();
            l8.a(M1);
            return;
        }
        super.A1(i);
    }

    public final void A2(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        if (this.H1) {
            this.H1 = false;
            n3(this.U0);
        }
    }

    public final void Q2(boolean z) {
        super.Q2(z);
        if (this.D1 != null) {
            n3(z);
        } else {
            this.H1 = true;
        }
    }

    public final String V2() {
        return null;
    }

    public final void c3(m5 m5Var) {
        super.c3(m5Var);
        if (!(m5Var instanceof eg6)) {
            throw new RuntimeException("FrgAttachView must be attached to activity that implements FrgAttachView.Listener");
        }
    }

    public final boolean e1() {
        return !this.F1;
    }

    public void j2(Menu menu, MenuInflater menuInflater) {
        MenuItem b;
        boolean z = !this.C1.a.E() && this.C1.a.c != 0 && (!this.D1.f() || this.D1.b.y != 0);
        b33 q1 = q1();
        if (q1 != null && (b = q1.b(lic.menu_attachments__forward)) != null) {
            b.setVisible(z);
        }
    }

    public final a32 j3() {
        return this.q1.g().G(this.C1.a.z);
    }

    /* renamed from: k3 */
    public final eg6 h3() {
        if (X2() != null) {
            return (eg6) X2();
        }
        return null;
    }

    public final void l3(twf twf, x6 x6Var) {
        if (!this.E1) {
            long j = twf.c;
            ((qra) ((id3) this.p1.b)).getClass();
            c48 q = sjd.a.q();
            q.getClass();
            c48.b(q, j, 0, true, 0, 2).j(((kbf) ((qra) ((id3) this.p1.b)).H()).c()).n(((kbf) ((qra) ((id3) this.p1.b)).H()).a()).l(new ao1(3, new ib4(17, this, x6Var), new ip5(10)));
        }
    }

    public void m3(boolean z) {
    }

    public abstract void n3(boolean z);

    public final void o3() {
        this.D1 = qe8.a(this.x.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"));
        this.C1 = ((hd9) this.x.getParcelable("ru.ok.tamtam.extra.MESSAGE")).a;
        this.E1 = this.x.getBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", false);
        this.F1 = this.x.getBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", false);
        this.G1 = this.x.getBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", false);
    }

    public final void p3(SlideOutLayout slideOutLayout, View view) {
        if (this.E1 || this.F1) {
            view.setTransitionName(this.D1.q);
        }
        if (!this.E1) {
            M2(true);
            b33 q1 = q1();
            if (q1 != null) {
                q1.n();
            }
            slideOutLayout.setSlideOutListener(this);
        }
    }

    public final b33 q1() {
        androidx.fragment.app.b M1 = M1();
        if (M1 instanceof kmf) {
            return ((kmf) M1).q1();
        }
        return null;
    }

    public final void q3() {
        eg6 k3 = h3();
        if (k3 != null) {
            ActAttachesView actAttachesView = (ActAttachesView) k3;
            if (actAttachesView.W0 == 1) {
                actAttachesView.c1.c(2, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
                actAttachesView.setRequestedOrientation(0);
                return;
            }
            actAttachesView.c1.c(1, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
            actAttachesView.setRequestedOrientation(1);
        }
    }

    public void r3() {
    }
}
