package defpackage;

import android.view.View;

/* renamed from: ce9  reason: default package */
public final /* synthetic */ class ce9 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe9 b;

    public /* synthetic */ ce9(fe9 fe9, int i) {
        this.a = i;
        this.b = fe9;
    }

    public final boolean onLongClick(View view) {
        switch (this.a) {
            case 0:
                ee9 ee9 = this.b.B0;
                if (ee9 == null) {
                    return true;
                }
                gg9 gg9 = (gg9) ee9;
                if (gg9.b1 == null) {
                    return true;
                }
                a89 a89 = gg9.U0.a;
                return true;
            default:
                ee9 ee92 = this.b.B0;
                if (ee92 == null) {
                    return false;
                }
                gg9 gg92 = (gg9) ee92;
                if (gg92.b1 != null) {
                    a89 a892 = gg92.U0.a;
                }
                return true;
        }
    }
}
