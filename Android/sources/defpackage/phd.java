package defpackage;

import android.view.View;

/* renamed from: phd  reason: default package */
public final /* synthetic */ class phd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xhd b;

    public /* synthetic */ phd(xhd xhd, int i) {
        this.a = i;
        this.b = xhd;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.v.invoke();
                return;
            case 1:
                this.b.a.invoke();
                return;
            default:
                this.b.c.invoke();
                return;
        }
    }
}
