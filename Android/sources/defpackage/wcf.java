package defpackage;

import android.content.Context;
import android.view.View;
import kotlin.Lazy;

/* renamed from: wcf  reason: default package */
public interface wcf {
    void L0(scf scf);

    void d1(View view) {
        scf scf;
        if (view.isInEditMode()) {
            scf = vi4.f0;
        } else {
            Context context = view.getContext();
            Lazy lazy = scf.b0;
            scf = j4b.k0(context);
        }
        L0(scf);
        view.addOnAttachStateChangeListener(new p50(11, (Object) this));
    }
}
