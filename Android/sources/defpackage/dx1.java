package defpackage;

/* renamed from: dx1  reason: default package */
public final /* synthetic */ class dx1 implements tk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk4 b;

    public /* synthetic */ dx1(pk4 pk4, int i) {
        this.a = i;
        this.b = pk4;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.B((qvb) obj);
                return;
            case 1:
                qvb qvb = (qvb) obj;
                pk4 pk4 = this.b;
                pk4.B(qvb);
                npg npg = (npg) pk4.e;
                bs0.r("Pending request should be null", ((qvb) npg.c) == null);
                npg.c = qvb;
                return;
            default:
                this.b.E((qc0) obj);
                return;
        }
    }
}
