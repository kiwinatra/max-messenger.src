package defpackage;

/* renamed from: cx5  reason: default package */
public final class cx5 extends s0 {
    public final /* synthetic */ int c;
    public final boolean o = true;
    public final Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cx5(wv5 wv5, Object obj, int i) {
        super(wv5);
        this.c = i;
        this.v = obj;
    }

    public final void g(pye pye) {
        switch (this.c) {
            case 0:
                this.b.c(new bx5(pye, this.v, this.o));
                return;
            default:
                jfd b = ((lfd) this.v).b();
                fx5 fx5 = new fx5(pye, b, this.b, this.o);
                pye.e(fx5);
                b.a(fx5);
                return;
        }
    }
}
