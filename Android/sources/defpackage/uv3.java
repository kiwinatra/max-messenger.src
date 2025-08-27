package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

/* renamed from: uv3  reason: default package */
public final class uv3 extends pzc {
    public final View D0;
    public final ImageView E0;
    public final TextView F0;
    public final /* synthetic */ vv3 G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uv3(vv3 vv3, View view) {
        super(view);
        this.G0 = vv3;
        this.D0 = view;
        this.E0 = (ImageView) view.findViewById(lic.row_options_action__iv_icon);
        TextView textView = (TextView) view.findViewById(lic.row_options_action__tv_title);
        this.F0 = textView;
        textView.setTextColor(M().G);
        view.setBackground(i8b.H(M().n, M().j));
    }

    public final scf M() {
        View view = this.D0;
        if (view.isInEditMode()) {
            return vi4.f0;
        }
        Context context = view.getContext();
        Lazy lazy = scf.b0;
        return j4b.k0(context);
    }
}
