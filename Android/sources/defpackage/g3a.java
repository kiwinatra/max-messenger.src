package defpackage;

/* renamed from: g3a  reason: default package */
public final /* synthetic */ class g3a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i3a b;

    public /* synthetic */ g3a(i3a i3a, int i) {
        this.a = i;
        this.b = i3a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ok8 ok8 = this.b.w0;
                ok8.getClass();
                ok8.setHalfScreen((grb) new arb(ok8, 1));
                return;
            case 1:
                ok8 ok82 = this.b.w0;
                ok82.getClass();
                ok82.setHalfScreen((grb) new arb(ok82, 1));
                return;
            default:
                this.b.x0.p();
                return;
        }
    }
}
