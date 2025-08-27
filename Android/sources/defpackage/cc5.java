package defpackage;

/* renamed from: cc5  reason: default package */
public final /* synthetic */ class cc5 implements h08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dob b;
    public final /* synthetic */ int c;

    public /* synthetic */ cc5(dob dob, int i, int i2) {
        this.a = i2;
        this.b = dob;
        this.c = i;
    }

    public final void invoke(Object obj) {
        rob rob = (rob) obj;
        switch (this.a) {
            case 0:
                ikf ikf = this.b.a;
                rob.y(this.c);
                return;
            default:
                rob.e(this.c, this.b.l);
                return;
        }
    }
}
