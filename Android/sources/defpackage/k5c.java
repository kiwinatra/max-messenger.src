package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: k5c  reason: default package */
public final class k5c extends pzc {
    public final TextView D0;
    public final ImageView E0;
    public l5c F0;
    public final scf G0;

    public k5c(View view, rma rma) {
        super(view);
        this.D0 = (TextView) view.findViewById(lic.row_profile__tv_title);
        this.E0 = (ImageView) view.findViewById(lic.row_profile__iv_icon);
        ct.G(view, 300, new h24(28, (Object) this, (Object) rma));
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        this.G0 = k0;
        view.setBackground(k0.e());
    }
}
