package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Lazy;

/* renamed from: ik8  reason: default package */
public final class ik8 extends pzc implements b58 {
    public final ch D0;
    public final hk8 E0;
    public final o20 F0;
    public final boolean G0;
    public final v3d H0;
    public final n48 I0;
    public uqd J0;
    public final SimpleDraweeView K0;
    public final ProgressBar L0;
    public final View M0;
    public boolean N0;
    public o48 O0;

    public ik8(View view, ch chVar, hk8 hk8, o20 o20, boolean z, v3d v3d, n48 n48) {
        super(view);
        scf scf;
        this.D0 = chVar;
        this.E0 = hk8;
        this.F0 = o20;
        this.G0 = z;
        this.H0 = v3d;
        this.I0 = n48;
        this.K0 = (SimpleDraweeView) view.findViewById(lic.row_media_bar_selected__drawee);
        ProgressBar progressBar = (ProgressBar) view.findViewById(lic.row_media_bar_selected__progress_bar);
        this.L0 = progressBar;
        this.M0 = view.findViewById(lic.row_media_bar_selected__progress_background);
        ct.G(view, 300, new xu3(24, (Object) this));
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        view.setBackgroundColor(scf.n);
        iq.b0(progressBar, fw3.a(view.getContext(), lad.v));
    }

    public final void B1(d48 d48, Uri uri, int i, Uri uri2) {
        d48 d482;
        uqd uqd = this.J0;
        if (uqd != null && (d482 = uqd.a) != null && d48.b == d482.b) {
            SimpleDraweeView simpleDraweeView = this.K0;
            if (uri == null) {
                simpleDraweeView.setController((gv4) null);
                return;
            }
            ra7 d = ra7.d(uri);
            if (uri2 != null) {
                d.l = new o6b(uri2);
            }
            d.d = this.H0;
            if (i != 0) {
                d.l = new efb(i, 0);
            }
            knb a = ld9.p.get();
            a.e = d.a();
            a.l = simpleDraweeView.getController();
            simpleDraweeView.setController(a.a());
        }
    }

    public final void U0(boolean z) {
        int i = 8;
        this.L0.setVisibility(z ? 0 : 8);
        if (z) {
            i = 0;
        }
        this.M0.setVisibility(i);
    }
}
