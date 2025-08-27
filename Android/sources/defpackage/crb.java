package defpackage;

/* renamed from: crb  reason: default package */
public final /* synthetic */ class crb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nrb b;

    public /* synthetic */ crb(nrb nrb, int i) {
        this.a = i;
        this.b = nrb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                nrb.f(this.b);
                return;
            case 1:
                this.b.b.e();
                return;
            default:
                nrb.h(this.b);
                return;
        }
    }
}
