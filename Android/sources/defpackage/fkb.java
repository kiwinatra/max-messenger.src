package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: fkb  reason: default package */
public final class fkb extends pzc {
    public final x15 D0;
    public final Function1 E0;
    public final TamAvatarView F0;
    public final TextView G0;
    public final ImageView H0;

    public fkb(View view, x15 x15, f fVar) {
        super(view);
        scf scf;
        this.D0 = x15;
        this.E0 = fVar;
        this.F0 = (TamAvatarView) view.findViewById(lic.row_folder_picker__avatar);
        TextView textView = (TextView) view.findViewById(lic.row_folder_picker__name);
        this.G0 = textView;
        this.H0 = (ImageView) view.findViewById(lic.row_folder_picker__selected);
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
