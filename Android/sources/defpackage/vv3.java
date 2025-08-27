package defpackage;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function1;

/* renamed from: vv3  reason: default package */
public final class vv3 extends jj0 {
    public final Function1 v;

    public vv3(rx2 rx2) {
        super((j4b) new w63(13));
        this.v = rx2;
    }

    public final void s(pzc pzc, int i) {
        uv3 uv3 = (uv3) pzc;
        xv3 xv3 = (xv3) E(i);
        uv3.F0.setText(xv3.c);
        View view = uv3.D0;
        Drawable b = ew3.b(view.getContext(), xv3.b);
        if (b != null) {
            b.setTint(uv3.M().x);
        } else {
            b = null;
        }
        uv3.E0.setImageDrawable(b);
        ct.G(view, 300, new pb(23, uv3.G0, xv3));
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new uv3(this, LayoutInflater.from(viewGroup.getContext()).inflate(ujc.row_context_menu_list_action, viewGroup, false));
    }
}
