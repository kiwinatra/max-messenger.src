package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;

/* renamed from: u18  reason: default package */
public final class u18 extends ConstraintLayout {
    public ro4 E0;
    public ImageView F0;
    public ProgressBar G0;
    public TextView H0;
    public TextView I0;
    public ImageButton J0;
    public t18 K0;
    public n18 L0;

    public final void L() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        n18 n18 = this.L0;
        if (n18 == null) {
            this.F0.setColorFilter(k0.x, PorterDuff.Mode.SRC_IN);
        } else if (n18.e) {
            this.F0.setColorFilter(k0.l, PorterDuff.Mode.SRC_IN);
        } else if (n18.f) {
            this.F0.setColorFilter(k0.z, PorterDuff.Mode.SRC_IN);
        } else if (n18.c()) {
            this.F0.setColorFilter(k0.l, PorterDuff.Mode.SRC_IN);
        } else {
            this.F0.setColorFilter(k0.x, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void M() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        n18 n18 = this.L0;
        if (n18 == null) {
            ru4.g(this.G0.getIndeterminateDrawable(), k0.x);
        } else if (n18.e) {
            ru4.g(this.G0.getIndeterminateDrawable(), k0.l);
        } else {
            ru4.g(this.G0.getIndeterminateDrawable(), k0.x);
        }
    }

    public void setListener(t18 t18) {
        this.K0 = t18;
    }
}
