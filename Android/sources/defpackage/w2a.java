package defpackage;

/* renamed from: w2a  reason: default package */
public final /* synthetic */ class w2a implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2a b;

    public /* synthetic */ w2a(x2a x2a, int i) {
        this.a = i;
        this.b = x2a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.N(new k2a(11));
                return;
            case 1:
                this.b.N(new k2a(9));
                return;
            default:
                this.b.N(new k2a(10));
                return;
        }
    }
}
