package defpackage;

/* renamed from: j3d  reason: default package */
public final /* synthetic */ class j3d implements eo1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k3d b;

    public /* synthetic */ j3d(k3d k3d, int i) {
        this.a = i;
        this.b = k3d;
    }

    public final Object r(do1 do1) {
        switch (this.a) {
            case 0:
                this.b.e = do1;
                return "CaptureCompleteFuture";
            default:
                this.b.f = do1;
                return "RequestCompleteFuture";
        }
    }
}
