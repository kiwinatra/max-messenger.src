package ru.ok.messages.media.mediabar;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.b;
import ru.ok.messages.views.fragments.FrgSlideOut;

public abstract class FrgLocalMedia extends FrgSlideOut implements b58 {
    public d48 C1;
    public boolean D1;
    public o48 E1;
    public ProgressBar F1;
    public View G1;
    public boolean H1;

    public static Bundle i3(d48 d48, boolean z, a48 a48) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ru.ok.messages.extra.LOCAL_MEDIA", d48);
        bundle.putBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT", z);
        bundle.putParcelable("ru.ok.messages.extra.OPTIONS", a48);
        return bundle;
    }

    public final void A1(int i) {
        zh6 zh6 = (zh6) X2();
        if (zh6 != null) {
            ActLocalMedias actLocalMedias = (ActLocalMedias) zh6;
            if (!actLocalMedias.C0.X) {
                actLocalMedias.Z().f.a();
            }
        }
        if (this.D1) {
            b M1 = M1();
            M1.getClass();
            l8.a(M1);
            return;
        }
        super.A1(i);
    }

    public void A2(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        this.F1 = (ProgressBar) view.findViewById(lic.frg_local_media__progress_bar);
        this.G1 = view.findViewById(lic.frg_local_media__progress_background);
        iq.b0(this.F1, fw3.a(O1(), lad.v));
        iq.I(this.F1, !this.H1);
        iq.I(this.G1, !this.H1);
    }

    public final void U0(boolean z) {
        ProgressBar progressBar = this.F1;
        if (progressBar == null || this.G1 == null) {
            this.H1 = z;
            return;
        }
        boolean z2 = !z;
        iq.I(progressBar, z2);
        iq.I(this.G1, z2);
    }

    public final String V2() {
        return null;
    }

    public final void c3(m5 m5Var) {
        super.c3(m5Var);
        if (!(M1() instanceof zh6)) {
            throw new IllegalStateException("Parent activity must implement FrgLocalMedia.Listener interface");
        }
    }

    public final boolean e1() {
        return !this.D1;
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        b33 Y2 = Y2();
        M2(true);
        if (Y2 != null) {
            Y2.n();
        }
        Bundle bundle2 = this.x;
        this.C1 = (d48) bundle2.getParcelable("ru.ok.messages.extra.LOCAL_MEDIA");
        this.D1 = bundle2.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT");
        a48 a48 = (a48) bundle2.getParcelable("ru.ok.messages.extra.OPTIONS");
        this.E1 = ((n48) ((qra) ((id3) this.p1.b)).getAccessor().g(n48.class)).a(this, this.C1);
    }

    public void j3() {
    }

    public void l2() {
        super.l2();
        this.E1.a();
    }

    public void t2() {
        super.t2();
        o48 o48 = this.E1;
        sqd sqd = o48.b;
        sqd.f.remove(o48);
        sqd.g.remove(o48);
    }

    public void w2() {
        super.w2();
        o48 o48 = this.E1;
        sqd sqd = o48.b;
        sqd.f.add(o48);
        sqd.g.add(o48);
    }
}
