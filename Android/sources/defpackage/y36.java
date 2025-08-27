package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: y36  reason: default package */
public final class y36 extends pzc implements n56, zl7 {
    public final Function1 D0;
    public final Function3 E0;
    public final ou4 F0;
    public final ImageView G0;
    public final TextView H0;
    public final TextView I0;

    public y36(View view, Function1 function1, Function3 function3, ou4 ou4) {
        super(view);
        scf scf;
        this.D0 = function1;
        this.E0 = function3;
        this.F0 = ou4;
        ImageView imageView = (ImageView) view.findViewById(lic.row_settings_folder__iv_icon);
        this.G0 = imageView;
        this.H0 = (TextView) view.findViewById(lic.row_settings_folder__tv_icon_emoji);
        ImageButton imageButton = (ImageButton) view.findViewById(lic.row_settings_folder__iv_action);
        imageButton.setImageResource(nad.o1);
        imageButton.setBackgroundTintList(ColorStateList.valueOf(fw3.a(imageButton.getContext(), lad.u)));
        imageButton.setOnTouchListener(new ng1(5, this));
        TextView textView = (TextView) view.findViewById(lic.row_settings_folder__name);
        this.I0 = textView;
        TextView textView2 = (TextView) view.findViewById(lic.row_settings_folder__subtitle);
        int roundToInt = MathKt.roundToInt(((float) 8) * view.getContext().getResources().getDisplayMetrics().density);
        view.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        view.setBackground(i8b.H(scf.n, scf.j));
        int i = scf.x;
        imageView.setColorFilter(i);
        imageButton.setColorFilter(i);
        textView.setTextColor(scf.G);
        textView2.setTextColor(scf.N);
    }

    public final void h() {
        this.a.animate().translationZ(c44.DEFAULT_ASPECT_RATIO);
        ou4 ou4 = this.F0;
        if (ou4 != null) {
            FolderSettingsViewModel i3 = ((g46) ou4).b.i3();
            int p = p();
            String str = i3.m;
            if (str != null && str.length() != 0) {
                ev0.v(b0h.C(i3), ((osa) i3.h).c().t0(), (f14) null, new e56(i3, str, p, (Continuation) null), 2);
                i3.m = null;
            }
        }
    }

    public final void j(x16 x16) {
        m58 m58 = x16.b;
        boolean z = m58 instanceof r67;
        TextView textView = this.H0;
        ImageView imageView = this.G0;
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
        String str = x16.c;
        int length = str.length();
        View view = this.a;
        TextView textView2 = this.I0;
        if (length > 0) {
            textView2.setText(str);
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            textView2.setTextColor(j4b.k0(context).G);
        } else {
            textView2.setText(view.getContext().getString(qad.B2));
            Context context2 = view.getContext();
            Lazy lazy2 = scf.b0;
            textView2.setTextColor(j4b.k0(context2).N);
        }
        ct.G(view, 300, new h24(6, (Object) this, (Object) x16));
        view.setOnLongClickListener(new yb1(6, this, x16));
    }

    public final void m() {
        View view = this.a;
        view.animate().translationZ((float) MathKt.roundToInt(((float) 20) * view.getContext().getResources().getDisplayMetrics().density));
    }
}
