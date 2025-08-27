package defpackage;

/* renamed from: jk4  reason: default package */
public final /* synthetic */ class jk4 implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lk4 b;

    public /* synthetic */ jk4(lk4 lk4, int i) {
        this.a = i;
        this.b = lk4;
    }

    public final Object r(do1 do1) {
        int i = this.a;
        lk4 lk4 = this.b;
        switch (i) {
            case 0:
                synchronized (lk4.a) {
                    lk4.d = do1;
                }
                return "DeferrableSurface-termination(" + lk4 + ")";
            default:
                synchronized (lk4.a) {
                    lk4.f = do1;
                }
                return "DeferrableSurface-close(" + lk4 + ")";
        }
    }
}
