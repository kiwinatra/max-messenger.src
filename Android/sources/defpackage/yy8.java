package defpackage;

/* renamed from: yy8  reason: default package */
public final /* synthetic */ class yy8 implements Runnable {
    public final /* synthetic */ hz8 a;
    public final /* synthetic */ cx8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;
    public final /* synthetic */ yx8 v;
    public final /* synthetic */ gz8 w;

    public /* synthetic */ yy8(hz8 hz8, cx8 cx8, int i, int i2, yx8 yx8, gz8 gz8) {
        this.a = hz8;
        this.b = cx8;
        this.c = i;
        this.o = i2;
        this.v = yx8;
        this.w = gz8;
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [kh3, java.lang.Object] */
    public final void run() {
        m7f m7f = this.a.e;
        cx8 cx8 = this.b;
        int i = this.c;
        boolean q = m7f.q(cx8, i);
        int i2 = this.o;
        if (!q) {
            hz8.N0(cx8, i2, new swd(-4));
            return;
        }
        yx8 yx8 = this.v;
        yx8.s(cx8);
        yx8.e.getClass();
        gz8 gz8 = this.w;
        if (i == 27) {
            gz8.g(yx8, cx8, i2);
            m7f.d(cx8, i, new Object());
            return;
        }
        m7f.d(cx8, i, new cz8(gz8, yx8, cx8, i2));
    }
}
