package defpackage;

/* renamed from: kud  reason: default package */
public final class kud extends hvd {
    public final /* synthetic */ int l;
    public final Object m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kud(long j, Object obj, int i) {
        super(j);
        this.l = i;
        this.m = obj;
    }

    public final ivd a() {
        switch (this.l) {
            case 0:
                return new lud(this);
            case 1:
                return new lud(this, (byte) 0);
            default:
                return new jvd(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kud(a89 a89) {
        super(0);
        this.l = 0;
        this.m = a89;
    }
}
