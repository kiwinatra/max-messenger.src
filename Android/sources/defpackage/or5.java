package defpackage;

/* renamed from: or5  reason: default package */
public final class or5 extends pr5 {
    public final /* synthetic */ int v;
    public final /* synthetic */ qr5 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ or5(sr5 sr5, int i) {
        super(sr5);
        this.v = i;
        this.w = sr5;
    }

    public final float a() {
        switch (this.v) {
            case 0:
                qr5 qr5 = this.w;
                return qr5.h + qr5.i;
            case 1:
                qr5 qr52 = this.w;
                return qr52.h + qr52.j;
            default:
                return this.w.h;
        }
    }
}
