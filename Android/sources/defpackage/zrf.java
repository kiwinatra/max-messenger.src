package defpackage;

import android.view.ViewGroup;

/* renamed from: zrf  reason: default package */
public final class zrf implements xrf {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ asf c;

    public zrf(asf asf, ViewGroup viewGroup, haf haf) {
        this.c = asf;
        this.a = viewGroup;
        this.b = haf;
    }

    public final void a(yrf yrf) {
        this.a.removeCallbacks(this.b);
    }

    public final void b() {
    }

    public final void c(yrf yrf) {
        asf asf = this.c;
        asf.w.n();
        asf.w = null;
    }

    public final void f() {
    }

    public final void g(yrf yrf) {
        asf asf = this.c;
        asf.w.n();
        asf.w = null;
    }
}
