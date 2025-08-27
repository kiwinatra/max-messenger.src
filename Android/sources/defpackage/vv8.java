package defpackage;

import android.view.View;

/* renamed from: vv8  reason: default package */
public final class vv8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dw8 b;

    public /* synthetic */ vv8(dw8 dw8, int i) {
        this.a = i;
        this.b = dw8;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                return;
            default:
                dw8 dw8 = this.b;
                if (dw8.z.g()) {
                    dw8.w.getClass();
                    sw8.g(2);
                }
                dw8.dismiss();
                return;
        }
    }
}
