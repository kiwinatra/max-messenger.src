package defpackage;

/* renamed from: d5g  reason: default package */
public final /* synthetic */ class d5g implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nr4 b;

    public /* synthetic */ d5g(nr4 nr4, int i) {
        this.a = i;
        this.b = nr4;
    }

    public final Object r(do1 do1) {
        switch (this.a) {
            case 0:
                nr4 nr4 = this.b;
                nr4.l = do1;
                return "ReleasedFuture " + nr4;
            default:
                nr4 nr42 = this.b;
                nr42.n = do1;
                return "ReadyToReleaseFuture " + nr42;
        }
    }
}
