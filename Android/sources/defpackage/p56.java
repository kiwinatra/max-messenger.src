package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: p56  reason: default package */
public final class p56 extends pzc {
    public final x15 D0;
    public final Function2 E0;
    public final TamAvatarView F0;
    public final TextView G0;
    public final AppCompatImageView H0;

    public p56(View view, x15 x15, c26 c26) {
        super(view);
        scf scf;
        this.D0 = x15;
        this.E0 = c26;
        this.F0 = (TamAvatarView) view.findViewById(lic.row_folder__avatar);
        TextView textView = (TextView) view.findViewById(lic.row_folder__name);
        this.G0 = textView;
        this.H0 = (AppCompatImageView) view.findViewById(lic.row_folder__select);
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        view.setBackground(i8b.H(scf.n, scf.j));
        textView.setTextColor(scf.G);
    }
}
