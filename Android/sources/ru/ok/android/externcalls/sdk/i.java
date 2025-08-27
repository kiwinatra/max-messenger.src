package ru.ok.android.externcalls.sdk;

public final /* synthetic */ class i implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk3 b;

    public /* synthetic */ i(rk3 rk3, int i) {
        this.a = i;
        this.b = rk3;
    }

    public final void accept(Object obj) {
        int i = this.a;
        rk3 rk3 = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                rk3.accept(th);
                return;
            case 1:
                rk3.accept(th);
                return;
            case 2:
                rk3.accept(th);
                return;
            default:
                rk3.accept(th);
                return;
        }
    }
}
