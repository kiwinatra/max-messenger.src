package defpackage;

/* renamed from: cp8  reason: default package */
public final /* synthetic */ class cp8 implements lp8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ np8 b;
    public final /* synthetic */ float c;

    public /* synthetic */ cp8(np8 np8, float f, int i) {
        this.a = i;
        this.b = np8;
        this.c = f;
    }

    public final void d(i67 i67, int i) {
        switch (this.a) {
            case 0:
                i67.x(this.b.c, i, this.c);
                return;
            default:
                i67.y(this.b.c, i, this.c);
                return;
        }
    }
}
