package defpackage;

/* renamed from: xy8  reason: default package */
public final /* synthetic */ class xy8 implements Runnable {
    public final /* synthetic */ hz8 a;
    public final /* synthetic */ cx8 b;
    public final /* synthetic */ yvd c;
    public final /* synthetic */ int o;
    public final /* synthetic */ int v;
    public final /* synthetic */ gz8 w;
    public final /* synthetic */ yx8 x;

    public /* synthetic */ xy8(hz8 hz8, cx8 cx8, yvd yvd, int i, int i2, gz8 gz8, yx8 yx8) {
        this.a = hz8;
        this.b = cx8;
        this.c = yvd;
        this.o = i;
        this.v = i2;
        this.w = gz8;
        this.x = yx8;
    }

    public final void run() {
        m7f m7f = this.a.e;
        cx8 cx8 = this.b;
        if (m7f.p(cx8)) {
            yvd yvd = this.c;
            int i = this.o;
            if (yvd != null) {
                if (!m7f.s(cx8, yvd)) {
                    hz8.N0(cx8, i, new swd(-4));
                    return;
                }
            } else if (!m7f.r(cx8, this.v)) {
                hz8.N0(cx8, i, new swd(-4));
                return;
            }
            this.w.g(this.x, cx8, i);
        }
    }
}
