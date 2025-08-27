package defpackage;

import android.view.View;

/* renamed from: ese  reason: default package */
public final /* synthetic */ class ese implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ hse b;

    public /* synthetic */ ese(hse hse, int i) {
        this.a = i;
        this.b = hse;
    }

    public final void onClick(View view) {
        qq7 qq7;
        switch (this.a) {
            case 0:
                hse hse = this.b;
                gse gse = hse.K0;
                if (gse != null && (qq7 = hse.L0) != null) {
                    gse.w(qq7);
                    return;
                }
                return;
            default:
                hse hse2 = this.b;
                gse gse2 = hse2.K0;
                if (gse2 != null) {
                    gse2.l(hse2.L0);
                    return;
                }
                return;
        }
    }
}
