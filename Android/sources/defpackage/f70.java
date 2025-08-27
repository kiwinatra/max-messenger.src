package defpackage;

/* renamed from: f70  reason: default package */
public final /* synthetic */ class f70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wsb b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ f70(wsb wsb, Exception exc, int i) {
        this.a = i;
        this.b = wsb;
        this.c = exc;
    }

    public final void run() {
        Exception exc = this.c;
        wsb wsb = this.b;
        int i = this.a;
        wsb.getClass();
        switch (i) {
            case 0:
                int i2 = t0g.a;
                vb4 vb4 = ((mc5) wsb.b).a.z0;
                sd P = vb4.P();
                vb4.Q(P, 1029, new tb4(P, exc, 12));
                return;
            default:
                int i3 = t0g.a;
                vb4 vb42 = ((mc5) wsb.b).a.z0;
                sd P2 = vb42.P();
                vb42.Q(P2, 1014, new nb4(7, P2, exc));
                return;
        }
    }
}
