package defpackage;

import android.view.View;

/* renamed from: ag9  reason: default package */
public final /* synthetic */ class ag9 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gg9 b;

    public /* synthetic */ ag9(gg9 gg9, int i) {
        this.a = i;
        this.b = gg9;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gg9 gg9 = this.b;
                if (!gg9.isSelected()) {
                    t3a t3a = gg9.b1;
                    a89 a89 = gg9.U0.a;
                    t3a.getClass();
                    return;
                }
                return;
            case 1:
                gg9 gg92 = this.b;
                if (!gg92.isSelected()) {
                    t3a t3a2 = gg92.b1;
                    a89 a892 = gg92.U0.a;
                    t3a2.getClass();
                    return;
                }
                return;
            case 2:
                gg9 gg93 = this.b;
                if (gg93.b1 != null) {
                    a89 a893 = gg93.U0.a;
                    return;
                }
                return;
            default:
                t3a t3a3 = this.b.b1;
                return;
        }
    }

    public /* synthetic */ ag9(gg9 gg9, a89 a89) {
        this.a = 3;
        this.b = gg9;
    }
}
