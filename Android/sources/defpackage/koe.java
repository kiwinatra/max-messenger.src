package defpackage;

/* renamed from: koe  reason: default package */
public final /* synthetic */ class koe implements nsb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Long b;

    public /* synthetic */ koe(int i, Long l) {
        this.a = i;
        this.b = l;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return ((boe) obj).a == this.b.longValue();
            default:
                return ((fqe) obj).a == this.b.longValue();
        }
    }
}
