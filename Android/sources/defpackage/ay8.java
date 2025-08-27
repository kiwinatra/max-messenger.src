package defpackage;

/* renamed from: ay8  reason: default package */
public final /* synthetic */ class ay8 implements hy8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy8 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ay8(iy8 iy8, long j, int i) {
        this.a = i;
        this.b = iy8;
        this.c = j;
    }

    public final void b(cx8 cx8) {
        switch (this.a) {
            case 0:
                this.b.w.s.P((int) this.c);
                return;
            default:
                this.b.w.s.seekTo(this.c);
                return;
        }
    }
}
