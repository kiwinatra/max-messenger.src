package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: y8a  reason: default package */
public final class y8a extends pzc implements buf {
    public final Function0 D0;
    public final TextView E0;
    public final ImageView F0;
    public final Drawable G0;

    public y8a(View view, Function0 function0) {
        super(view);
        scf scf;
        this.D0 = function0;
        TextView textView = (TextView) view.findViewById(lic.row_new_folder__tv_new_folder);
        this.E0 = textView;
        this.F0 = (ImageView) view.findViewById(lic.row_new_folder__iv_new_folder_icon);
        Drawable b = ew3.b(view.getContext(), nad.o);
        this.G0 = b;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        textView.setTextColor(scf.l);
        b.setTint(scf.l);
        view.setBackground(i8b.H(scf.n, scf.j));
    }

    public final Rect g(View view) {
        return rcg.c(this.F0, view);
    }

    public final View o() {
        return this.a;
    }
}
