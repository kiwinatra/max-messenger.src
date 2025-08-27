package defpackage;

/* renamed from: hif  reason: default package */
public final class hif implements xvb {
    public final /* synthetic */ int a;
    public final xvb b;
    public final Object c;

    public /* synthetic */ hif(xvb xvb, Object obj, int i) {
        this.a = i;
        this.b = xvb;
        this.c = obj;
    }

    public final void a(zi0 zi0, yvb yvb) {
        switch (this.a) {
            case 0:
                tf6.P();
                ik0 ik0 = (ik0) yvb;
                bwb bwb = ik0.c;
                ik0.Z.v.getClass();
                r38 r38 = new r38(zi0, bwb, yvb, this);
                ik0.a(new o57(4, r38, this));
                ((dm4) this.c).e(r38);
                return;
            default:
                this.b.a(new is0(this, zi0, yvb), yvb);
                return;
        }
    }
}
