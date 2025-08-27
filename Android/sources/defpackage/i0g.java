package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.folders.list.FoldersListScreen;

/* renamed from: i0g  reason: default package */
public final class i0g extends kbe implements zl7 {
    public e4 D0;

    public final void M(lz7 lz7) {
        g0g g0g = (g0g) lz7;
        View view = this.a;
        h0g h0g = (h0g) view;
        h0g.setType(g0g.b);
        ngf ngf = g0g.c;
        ngf.getClass();
        CharSequence b = ngf.b(view.getContext().getResources());
        if (b == null) {
            b = "";
        }
        h0g.setTitle(b);
    }

    public final void O() {
        this.D0 = null;
    }

    public final void h() {
        ((h0g) this.a).animate().translationZ(c44.DEFAULT_ASPECT_RATIO);
        e4 e4Var = this.D0;
        if (e4Var != null) {
            w66 c0 = ((FoldersListScreen) e4Var.b).c0();
            int p = p() - 1;
            String str = c0.y;
            if (str != null && str.length() != 0) {
                ev0.v(c0.a, ((osa) c0.c).c().t0(), (f14) null, new v66(c0, str, p, (Continuation) null), 2);
                c0.y = null;
            }
        }
    }

    public final void m() {
        ((h0g) this.a).animate().translationZ(vo4.c().getDisplayMetrics().density * 20.0f);
    }
}
