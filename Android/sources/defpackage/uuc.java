package defpackage;

/* renamed from: uuc  reason: default package */
public final /* synthetic */ class uuc implements zi6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wuc b;

    public /* synthetic */ uuc(wuc wuc, int i) {
        this.a = i;
        this.b = wuc;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                ouc ouc = (ouc) obj;
                wuc wuc = this.b;
                return new na3(4, new hb3(2, new wh8(2, wuc.b(), new pbb(9, wuc, ouc)), suc.a(ouc, 0)), new uuc(wuc, 1));
            default:
                luc luc = (luc) obj;
                wuc wuc2 = this.b;
                luc.c = ((qjd) wuc2.b).m();
                return new na3(4, wuc2.b(), new y3a(21, (Object) luc));
        }
    }
}
