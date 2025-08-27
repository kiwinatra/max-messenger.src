package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;

/* renamed from: nvc  reason: default package */
public final class nvc extends pzc implements n56, buf {
    public final Function1 D0;
    public final Function1 E0;
    public final ImageView F0;
    public final TextView G0;
    public final TextView H0;
    public final Drawable I0;
    public final ImageButton J0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nvc(View view, Function1 function1, Function1 function12) {
        super(view);
        scf scf;
        scf scf2;
        scf scf3;
        scf scf4;
        View view2 = view;
        this.D0 = function1;
        this.E0 = function12;
        ImageView imageView = (ImageView) view2.findViewById(lic.row_settings_folder__iv_icon);
        this.F0 = imageView;
        this.G0 = (TextView) view2.findViewById(lic.row_settings_folder__tv_icon_emoji);
        TextView textView = (TextView) view2.findViewById(lic.row_settings_folder__name);
        this.H0 = textView;
        Drawable b = ew3.b(view.getContext(), nad.m);
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        b.setTint(scf.m);
        this.I0 = b;
        ImageButton imageButton = (ImageButton) view2.findViewById(lic.row_settings_folder__iv_action);
        float roundToInt = (float) MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        if (imageButton.isInEditMode()) {
            scf2 = vi4.f0;
        } else {
            Context context2 = imageButton.getContext();
            Lazy lazy2 = scf.b0;
            scf2 = j4b.k0(context2);
        }
        int i = scf2.l;
        if (imageButton.isInEditMode()) {
            scf3 = vi4.f0;
        } else {
            Context context3 = imageButton.getContext();
            Lazy lazy3 = scf.b0;
            scf3 = j4b.k0(context3);
        }
        imageButton.setBackground(i8b.N(i, scf3.j, roundToInt, roundToInt, roundToInt, roundToInt));
        imageButton.setImageDrawable(b);
        this.J0 = imageButton;
        float f = (float) 8;
        int roundToInt2 = MathKt.roundToInt(view.getContext().getResources().getDisplayMetrics().density * f);
        view2.setPadding(roundToInt2, roundToInt2, roundToInt2, roundToInt2);
        int roundToInt3 = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        b59.x(roundToInt3, roundToInt3, roundToInt3, roundToInt3, view, imageButton);
        if (view.isInEditMode()) {
            scf4 = vi4.f0;
        } else {
            Context context4 = view.getContext();
            Lazy lazy4 = scf.b0;
            scf4 = j4b.k0(context4);
        }
        view2.setBackground(i8b.H(scf4.n, scf4.j));
        imageView.setColorFilter(scf4.x);
        textView.setTextColor(scf4.G);
    }

    public final Rect g(View view) {
        return rcg.c(this.J0, view);
    }

    public final void j(x16 x16) {
        m58 m58 = x16.b;
        boolean z = m58 instanceof r67;
        TextView textView = this.G0;
        ImageView imageView = this.F0;
        if (z) {
            imageView.setVisibility(0);
            textView.setVisibility(4);
            ((r67) m58).getClass();
            imageView.setImageResource(nad.o0);
        } else if (m58 instanceof s67) {
            imageView.setVisibility(4);
            textView.setVisibility(0);
            textView.setText(((s67) m58).k);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.H0.setText(x16.c);
        ct.G(this.J0, 300, new mvc(this, x16, 0));
        ct.G(this.a, 300, new mvc(this, x16, 1));
    }

    public final View o() {
        return this.a;
    }
}
