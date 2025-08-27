package defpackage;

/* renamed from: mz3  reason: default package */
public final /* synthetic */ class mz3 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk3 b;

    public /* synthetic */ mz3(rk3 rk3, int i) {
        this.a = i;
        this.b = rk3;
    }

    public final void accept(Object obj) {
        int i = this.a;
        rk3 rk3 = this.b;
        switch (i) {
            case 0:
                rk3.accept((String) obj);
                return;
            default:
                rk3.accept((Throwable) obj);
                return;
        }
    }
}
