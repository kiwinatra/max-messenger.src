package defpackage;

import androidx.appcompat.widget.Toolbar;

/* renamed from: dmf  reason: default package */
public final /* synthetic */ class dmf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ dmf(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fmf fmf = this.b.Y0;
                u69 u69 = fmf == null ? null : fmf.b;
                if (u69 != null) {
                    u69.collapseActionView();
                    return;
                }
                return;
            default:
                this.b.n();
                return;
        }
    }
}
