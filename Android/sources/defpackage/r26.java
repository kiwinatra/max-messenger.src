package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: r26  reason: default package */
public final class r26 extends pzc {
    public final Function2 D0;
    public final Function1 E0;
    public final TamAvatarView F0;
    public final TextView G0;
    public final TextView H0;
    public final ImageView I0;
    public final ImageView J0;
    public final Drawable K0;

    public r26(View view, c26 c26, d26 d26) {
        super(view);
        scf scf;
        scf scf2;
        this.D0 = c26;
        this.E0 = d26;
        this.F0 = (TamAvatarView) view.findViewById(lic.row_folder_chat__avatar);
        TextView textView = (TextView) view.findViewById(lic.row_folder_chat__title);
        this.G0 = textView;
        TextView textView2 = (TextView) view.findViewById(lic.row_folder_chat__subtitle);
        this.H0 = textView2;
        ImageView imageView = (ImageView) view.findViewById(lic.row_folder_chat__more_actions);
        this.I0 = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(lic.row_folder_chat__filters_avatar);
        this.J0 = imageView2;
        Drawable b = ew3.b(view.getContext(), nad.m0);
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        b.setTint(scf.x);
        this.K0 = b;
        if (view.isInEditMode()) {
            scf2 = vi4.f0;
        } else {
            Context context2 = view.getContext();
            Lazy lazy2 = scf.b0;
            scf2 = j4b.k0(context2);
        }
        view.setBackground(i8b.H(scf2.n, scf2.j));
        textView.setTextColor(scf2.G);
        textView2.setTextColor(scf2.K);
        imageView.setColorFilter(scf2.x);
        imageView.setBackground(scf2.d());
        imageView2.setBackground(i8b.K(Integer.valueOf(scf2.I), (Integer) null, (Integer) null));
    }
}
