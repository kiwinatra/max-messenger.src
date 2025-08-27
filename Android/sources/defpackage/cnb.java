package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: cnb  reason: default package */
public final /* synthetic */ class cnb implements edg {
    public final /* synthetic */ int a;
    public final /* synthetic */ enb b;

    public /* synthetic */ cnb(enb enb, int i) {
        this.a = i;
        this.b = enb;
    }

    public final void b() {
        switch (this.a) {
            case 0:
                enb enb = this.b;
                enb.a();
                dnb dnb = (dnb) enb.X.o;
                if (!enb.C0) {
                    pbb pbb = new pbb(1, enb, dnb);
                    ViewTreeObserver viewTreeObserver = enb.c.getViewTreeObserver();
                    viewTreeObserver.addOnGlobalLayoutListener(new cdg(viewTreeObserver, pbb));
                    return;
                }
                return;
            default:
                this.b.a();
                return;
        }
    }
}
