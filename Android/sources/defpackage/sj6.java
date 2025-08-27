package defpackage;

/* renamed from: sj6  reason: default package */
public final /* synthetic */ class sj6 implements eo1, vu {
    public final /* synthetic */ int a;
    public final /* synthetic */ zz7 b;

    public /* synthetic */ sj6(zz7 zz7, int i) {
        this.a = i;
        this.b = zz7;
    }

    public zz7 apply(Object obj) {
        switch (this.a) {
            case 2:
                ht1 ht1 = (ht1) obj;
                return ((ht1) this.b.get()).a();
            default:
                Void voidR = (Void) obj;
                return ((ht1) this.b.get()).b();
        }
    }

    public Object r(do1 do1) {
        switch (this.a) {
            case 0:
                qi4 qi4 = new qi4(do1, 1);
                ep4 j = ryg.j();
                zz7 zz7 = this.b;
                zz7.d(qi4, j);
                return "transformVoidFuture [" + zz7 + "]";
            default:
                ep4 j2 = ryg.j();
                zz7 zz72 = this.b;
                hd8.O(false, zz72, do1, j2);
                return "nonCancellationPropagating[" + zz72 + "]";
        }
    }
}
