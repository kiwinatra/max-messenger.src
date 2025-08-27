package defpackage;

/* renamed from: dc5  reason: default package */
public final /* synthetic */ class dc5 implements i08, pk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ us8 b;

    public /* synthetic */ dc5(us8 us8, int i) {
        this.a = i;
        this.b = us8;
    }

    public void accept(Object obj) {
        ((ypb) obj).b0(this.b);
    }

    public void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 0:
                sob.b0(this.b);
                return;
            default:
                sob.c0(this.b);
                return;
        }
    }
}
