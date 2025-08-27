package defpackage;

/* renamed from: nk8  reason: default package */
public final /* synthetic */ class nk8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk3 b;

    public /* synthetic */ nk8(hk3 hk3, int i) {
        this.a = i;
        this.b = hk3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ok8 ok8 = (ok8) this.b.b;
                ok8.S0.s(ok8.getMeasuredHeight(), false, false);
                return;
            default:
                ok8 ok82 = (ok8) this.b.b;
                if (n54.f(ok82.getContext())) {
                    ok82.x();
                    return;
                }
                return;
        }
    }
}
