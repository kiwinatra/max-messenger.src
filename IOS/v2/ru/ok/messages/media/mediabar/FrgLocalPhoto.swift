package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalPhoto extends FrgLocalMedia implements c58, zg3 {
    public LocalPhotoView I1;

    public final void A2(View view, Bundle bundle) {
        super.A2(view, bundle);
        this.E1.b();
    }

    public final void B1(d48 d48, Uri uri, int i, Uri uri2) {
        ra7 d = ra7.d(o5a.x(uri.toString()));
        if (uri2 != null) {
            d.l = new o6b(uri2);
        }
        knb a = ld9.p.get();
        a.e = d.a();
        a.l = this.I1.getController();
        sqd sqd = ((qra) ((id3) this.p1.b)).s().f;
        if (!cvg.A(d48.o) && !dfb.b(sqd.f(d48), d48)) {
            ra7 d2 = ra7.d(o5a.x(d48.o));
            int i2 = d48.v;
            if (i2 != 0) {
                d2.l = new efb(i2, 0);
            }
            a.f = d2.a();
        }
        this.I1.setController(a.a());
        k3();
    }

    public final void D1() {
        super.D1();
        this.I1.getZoomableController().reset();
    }

    public final void G1(Bundle bundle) {
        b M1 = M1();
        if (M1 instanceof ActLocalMedias) {
            z0a z0a = ((ActLocalMedias) M1).M0;
            z0a.getClass();
            z0a.z = new dfb((Uri) null, (Uri) null, (d44) null, (h05) null, (Uri) null, (Uri) null);
            z0a.a0();
            z0a.c0(new t0a(z0a, 5));
            z0a.c0(new t0a(z0a, 0));
        }
    }

    public final boolean d3() {
        this.I1.getZoomableController().reset();
        return false;
    }

    public final void e() {
        if (h3() != null) {
            h3().c();
        }
    }

    public final void j2(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(wjc.menu_local_photo, menu);
        iq.g(this.r1, menu, (Integer) null);
        k3();
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(ujc.frg_local_photo, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.r1.n);
        LocalPhotoView localPhotoView = (LocalPhotoView) slideOutLayout.findViewById(lic.frg_local_photo__iv_photo);
        this.I1 = localPhotoView;
        localPhotoView.setListener(this);
        this.I1.setZoomEnabled(true);
        LocalPhotoView localPhotoView2 = this.I1;
        if (this.D1) {
            localPhotoView2.setTransitionName(this.C1.a());
        }
        return slideOutLayout;
    }

    public final void k3() {
        MenuItem b;
        b M1 = M1();
        b33 q1 = M1 instanceof kmf ? ((kmf) M1).q1() : null;
        if (q1 != null && (b = q1.b(lic.menu_local_photo__clear_edit)) != null) {
            uqd i = ((qra) ((id3) this.p1.b)).s().f.i(this.C1);
            if (i != null) {
                b.setVisible(dfb.b(i.c, i.a));
            } else {
                b.setVisible(false);
            }
            b M12 = M1();
            if (M12 instanceof hn) {
                M12.invalidateOptionsMenu();
            }
        }
    }

    public final boolean s2(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            d3();
            m5 X2 = X2();
            if (X2 == null || !this.o1) {
                return true;
            }
            X2.onBackPressed();
            return true;
        } else if (menuItem.getItemId() != lic.menu_local_photo__clear_edit) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", qad.j7);
            bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", qad.m7);
            bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", qad.m0);
            ConfirmationDialog confirmationDialog = new ConfirmationDialog();
            confirmationDialog.L2(bundle);
            confirmationDialog.P2(0, this);
            confirmationDialog.Y2(this.D0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
            return true;
        }
    }

    public final void w2() {
        super.w2();
        this.E1.b();
    }
}
