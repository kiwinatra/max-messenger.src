package defpackage;

/* renamed from: p2a  reason: default package */
public final /* synthetic */ class p2a implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2a b;

    public /* synthetic */ p2a(q2a q2a, int i) {
        this.a = i;
        this.b = q2a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.N(new k2a(1));
                return;
            default:
                this.b.N(new k2a(2));
                return;
        }
    }
}
