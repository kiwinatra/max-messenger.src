package defpackage;

/* renamed from: dyc  reason: default package */
public final /* synthetic */ class dyc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lyc b;
    public final /* synthetic */ zb0 c;

    public /* synthetic */ dyc(lyc lyc, zb0 zb0, int i) {
        this.a = i;
        this.b = lyc;
        this.c = zb0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t(this.c);
                return;
            default:
                lyc lyc = this.b;
                if (lyc.q == this.c && !lyc.r) {
                    if (lyc.n()) {
                        lyc.H.k();
                    }
                    q55 q55 = lyc.F;
                    if (q55 != null) {
                        ((g65) q55).k();
                        zb0 zb0 = lyc.q;
                        zb0.j(new h8g(zb0.y, lyc.k()));
                        return;
                    }
                    lyc.d0 = true;
                    return;
                }
                return;
        }
    }
}
