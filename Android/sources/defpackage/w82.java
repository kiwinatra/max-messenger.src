package defpackage;

/* renamed from: w82  reason: default package */
public final class w82 {
    public final /* synthetic */ ia2 a;

    public w82(ia2 ia2) {
        this.a = ia2;
    }

    @oye
    public final void onEvent(w88 w88) {
        String str = ia2.K0;
        z68.c(str + "/bus", "LoginEvent", new Object[0]);
        ia2 ia2 = this.a;
        pm7 pm7 = ia2.x0;
        if (pm7 != null && pm7.isCancelled()) {
            ia2.l();
        }
        or7 or7 = ia2.z0;
        if (or7 != null && or7.f()) {
            ia2.k();
        }
    }
}
