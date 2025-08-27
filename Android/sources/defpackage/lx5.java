package defpackage;

/* renamed from: lx5  reason: default package */
public final class lx5 extends r1 {
    public final /* synthetic */ int o = 0;
    public final Iterable v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lx5(mx5 mx5, int i) {
        super(i, 0);
        this.v = mx5;
    }

    public final Object a(int i) {
        switch (this.o) {
            case 0:
                return ((mx5) this.v).a[i].iterator();
            default:
                return ((tb7) this.v).get(i);
        }
    }

    public lx5(tb7 tb7, int i) {
        super(tb7.size(), i);
        this.v = tb7;
    }
}
