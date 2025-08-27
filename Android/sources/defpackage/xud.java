package defpackage;

/* renamed from: xud  reason: default package */
public final class xud extends hvd {
    public final /* synthetic */ int l;
    public final long m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xud(int i, long j, long j2) {
        super(j);
        this.l = i;
        this.m = j2;
    }

    public final ivd a() {
        switch (this.l) {
            case 0:
                return new yud(this.a, this.m);
            default:
                return new yud(this);
        }
    }
}
