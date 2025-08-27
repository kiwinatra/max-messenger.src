package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;

/* renamed from: fjf  reason: default package */
public final class fjf extends pzc implements wcf {
    public final AppCompatTextView D0;

    public fjf(View view) {
        super(view);
        scf scf;
        this.D0 = (AppCompatTextView) view;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        L0(scf);
    }

    public final void L0(scf scf) {
        this.D0.setTextColor(scf.G);
    }
}
