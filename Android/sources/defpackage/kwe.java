package defpackage;

/* renamed from: kwe  reason: default package */
public final /* synthetic */ class kwe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nwe b;

    public /* synthetic */ kwe(nwe nwe, int i) {
        this.a = i;
        this.b = nwe;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                nwe nwe = this.b;
                if (!nwe.v.b0()) {
                    nwe.v.a0();
                    return;
                }
                return;
            default:
                this.b.Y.set(true);
                return;
        }
    }
}
