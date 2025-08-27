package defpackage;

/* renamed from: gc5  reason: default package */
public final /* synthetic */ class gc5 implements k08, i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc5 b;

    public /* synthetic */ gc5(tc5 tc5, int i) {
        this.a = i;
        this.b = tc5;
    }

    public void f(Object obj, xq5 xq5) {
        tc5 tc5 = this.b;
        tc5.getClass();
        ((sob) obj).Y(tc5.w, new qob(xq5));
    }

    public void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 1:
                sob.c0(this.b.W0);
                return;
            default:
                sob.p0(this.b.U0);
                return;
        }
    }
}
