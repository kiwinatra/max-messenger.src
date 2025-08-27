package defpackage;

import android.view.View;

/* renamed from: mvc  reason: default package */
public final /* synthetic */ class mvc implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ nvc b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ mvc(nvc nvc, x16 x16, int i) {
        this.a = i;
        this.b = nvc;
        this.c = x16;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.D0.invoke(this.c);
                return;
            default:
                this.b.E0.invoke(this.c);
                return;
        }
    }
}
