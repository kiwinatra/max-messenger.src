package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import ru.ok.messages.views.fragments.FrgContactProfile;

/* renamed from: lxb  reason: default package */
public final class lxb extends pzc implements View.OnClickListener {
    public final TextView D0;
    public final TextView E0;
    public final ImageView F0;
    public pm3 G0;
    public final /* synthetic */ lf0 H0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lxb(lf0 lf0, View view) {
        super(view);
        this.H0 = lf0;
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        view.setBackground(k0.e());
        ImageView imageView = (ImageView) view.findViewById(lic.row_profile_contact_name__iv_icon);
        this.F0 = imageView;
        int i = k0.K;
        imageView.setColorFilter(i);
        TextView textView = (TextView) view.findViewById(lic.row_profile_contact_name__tv_type);
        this.E0 = textView;
        if (textView != null) {
            textView.setTextColor(i);
        }
        TextView textView2 = (TextView) view.findViewById(lic.row_profile_contact_name__tv_name);
        this.D0 = textView2;
        if (textView2 != null) {
            textView2.setTextColor(k0.N);
        }
        view.setOnClickListener(this);
    }

    public final void onClick(View view) {
        FrgContactProfile frgContactProfile = (FrgContactProfile) this.H0.w;
        if (frgContactProfile != null && this.G0.c.ordinal() == 1) {
            h5 h5Var = new h5(7, frgContactProfile);
            zg6 zg6 = new zg6(frgContactProfile, 2);
            int i = y64.e;
            jbd.b(h5Var, xfd.a(), zg6, (qk3) null, qe.a());
        }
    }
}
