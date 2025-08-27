package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Lazy;

/* renamed from: xk6  reason: default package */
public final class xk6 extends pzc {
    public final SimpleDraweeView D0;
    public final TextView E0;

    public xk6(View view) {
        super(view);
        scf scf;
        this.D0 = (SimpleDraweeView) view.findViewById(lic.row_media_bar_actions__icon);
        this.E0 = (TextView) view.findViewById(lic.row_media_bar_actions__title);
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        view.setBackground(scf.e());
    }
}
