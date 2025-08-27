package defpackage;

/* renamed from: hp8  reason: default package */
public final /* synthetic */ class hp8 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ppb b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ hp8(ppb ppb, Integer num, int i) {
        this.a = i;
        this.b = ppb;
        this.c = num;
    }

    public final void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 0:
                sob.f0(this.b.j, this.c.intValue());
                return;
            case 1:
                ppb ppb = this.b;
                sob.q(ppb.d, ppb.e, this.c.intValue());
                return;
            default:
                sob.e(this.c.intValue(), this.b.t);
                return;
        }
    }
}
