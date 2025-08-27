package defpackage;

/* renamed from: ep8  reason: default package */
public final /* synthetic */ class ep8 implements i08, lp8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np8 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ ep8(np8 np8, boolean z, int i) {
        this.a = i;
        this.b = np8;
        this.c = z;
    }

    public void d(i67 i67, int i) {
        switch (this.a) {
            case 1:
                i67.F0(this.b.c, i, this.c);
                return;
            case 2:
                i67.x0(this.b.c, i, this.c);
                return;
            default:
                i67.b0(this.b.c, i, this.c);
                return;
        }
    }

    public void invoke(Object obj) {
        sob sob = (sob) obj;
        switch (this.a) {
            case 0:
                sob.i(this.b.n.r, this.c);
                return;
            default:
                sob.i(this.b.n.r, this.c);
                return;
        }
    }
}
