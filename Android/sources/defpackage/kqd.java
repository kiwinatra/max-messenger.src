package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: kqd  reason: default package */
public final class kqd extends pzc {
    public final x15 D0;
    public final Function1 E0;
    public final TamAvatarView F0;
    public final ImageView G0;

    public kqd(View view, x15 x15, f fVar) {
        super(view);
        scf scf;
        this.D0 = x15;
        this.E0 = fVar;
        this.F0 = (TamAvatarView) view.findViewById(lic.row_selected__iv_avatar);
        ImageView imageView = (ImageView) view.findViewById(lic.row_selected__iv_remove);
        this.G0 = imageView;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        imageView.setBackground(i8b.J(scf.n, scf.j));
    }
}
