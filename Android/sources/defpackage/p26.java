package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.math.MathKt;

/* renamed from: p26  reason: default package */
public final class p26 extends pzc {
    public final Function0 D0;
    public final Function0 E0;

    public p26(View view, b26 b26, b26 b262) {
        super(view);
        scf scf;
        this.D0 = b26;
        this.E0 = b262;
        TextView textView = (TextView) view;
        textView.setCompoundDrawablePadding(MathKt.roundToInt(((float) 21) * view.getContext().getResources().getDisplayMetrics().density));
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        textView.setTextColor(scf.l);
        view.setBackground(i8b.H(scf.n, scf.j));
    }
}
