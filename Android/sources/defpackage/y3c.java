package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: y3c  reason: default package */
public final class y3c extends pzc implements bif {
    public final TextView D0;
    public final TextView E0;
    public final ImageView F0;
    public n18 G0;
    public final /* synthetic */ xw3 H0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y3c(xw3 xw3, View view) {
        super(view);
        this.H0 = xw3;
        this.D0 = (TextView) view.findViewById(lic.row_profile_live_location__tv_title);
        this.E0 = (TextView) view.findViewById(lic.row_profile_live_location__tv_subtitle);
        this.F0 = (ImageView) view.findViewById(lic.row_profile_live_location__iv_icon);
        y64.n(view, new b5(29, this));
        c();
    }

    public final void M() {
        Context context = this.a.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        n18 n18 = this.G0;
        ImageView imageView = this.F0;
        if (n18 == null) {
            imageView.setColorFilter(k0.N, PorterDuff.Mode.SRC_IN);
        } else if (n18.e) {
            imageView.setColorFilter(k0.l, PorterDuff.Mode.SRC_IN);
        } else if (n18.f) {
            imageView.setColorFilter(k0.z, PorterDuff.Mode.SRC_IN);
        } else if (n18.c()) {
            imageView.setColorFilter(k0.l, PorterDuff.Mode.SRC_IN);
        } else {
            imageView.setColorFilter(k0.N, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void c() {
        View view = this.a;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.setBackground(k0.e());
        this.D0.setTextColor(k0.K);
        this.E0.setTextColor(k0.N);
        M();
    }
}
