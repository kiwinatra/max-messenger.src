package defpackage;

/* renamed from: bp8  reason: default package */
public final /* synthetic */ class bp8 implements lp8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np8 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ bp8(np8 np8, int i, int i2, int i3) {
        this.a = i3;
        this.b = np8;
        this.c = i;
        this.o = i2;
    }

    public final void d(i67 i67, int i) {
        switch (this.a) {
            case 0:
                i67.K(this.b.c, i, this.c, this.o);
                return;
            case 1:
                i67.s(this.b.c, i, this.c, this.o);
                return;
            default:
                i67.D0(this.b.c, i, this.c, this.o);
                return;
        }
    }
}
