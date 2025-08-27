package defpackage;

import android.view.View;

/* renamed from: be9  reason: default package */
public final /* synthetic */ class be9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe9 b;

    public /* synthetic */ be9(fe9 fe9, int i) {
        this.a = i;
        this.b = fe9;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ee9 ee9 = this.b.B0;
                if (ee9 != null) {
                    ((gg9) ee9).y();
                    return;
                }
                return;
            default:
                ee9 ee92 = this.b.B0;
                if (ee92 != null) {
                    ((gg9) ee92).y();
                    return;
                }
                return;
        }
    }
}
