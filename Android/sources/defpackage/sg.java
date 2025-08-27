package defpackage;

/* renamed from: sg  reason: default package */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fqc b;

    public /* synthetic */ sg(fqc fqc, int i) {
        this.a = i;
        this.b = fqc;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.E();
                return;
            default:
                this.b.D();
                return;
        }
    }
}
