package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: x36  reason: default package */
public final class x36 extends kbe {
    public final void M(lz7 lz7) {
        g0g g0g = (g0g) lz7;
        f0g f0g = g0g.b;
        f0g f0g2 = f0g.a;
        View view = this.a;
        if (f0g == f0g2) {
            ((TextView) view).setEnabled(false);
        }
        ngf ngf = g0g.c;
        ngf.getClass();
        ((TextView) view).setText(ngf.b(view.getContext().getResources()));
    }
}
