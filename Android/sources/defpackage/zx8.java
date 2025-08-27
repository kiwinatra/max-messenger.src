package defpackage;

/* renamed from: zx8  reason: default package */
public final /* synthetic */ class zx8 implements hy8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iy8 b;

    public /* synthetic */ zx8(iy8 iy8, int i) {
        this.a = i;
        this.b = iy8;
    }

    public final void b(cx8 cx8) {
        switch (this.a) {
            case 0:
                this.b.w.s.w0();
                return;
            case 1:
                yx8 yx8 = this.b.w;
                if (yx8.s.P0() != null) {
                    yx8.s(cx8);
                    yx8.e.getClass();
                    o5a.F(new swd(-6));
                    return;
                }
                return;
            case 2:
                this.b.w.s.M();
                return;
            case 3:
                this.b.w.s.z();
                return;
            case 4:
                this.b.w.s.x0();
                return;
            case 5:
                this.b.w.s.prepare();
                return;
            case 6:
                this.b.w.s.stop();
                return;
            case 7:
                yx8 yx82 = this.b.w;
                ypb ypb = yx82.s;
                if (v0g.c0(ypb, yx82.p)) {
                    v0g.I(ypb);
                    return;
                } else if (ypb != null && ypb.J0(1)) {
                    ypb.pause();
                    return;
                } else {
                    return;
                }
            case 8:
                this.b.w.s.v0();
                return;
            case 9:
                this.b.w.s.U();
                return;
            case 10:
                this.b.w.g(cx8, true);
                return;
            default:
                ypb ypb2 = this.b.w.s;
                if (ypb2 != null && ypb2.J0(1)) {
                    ypb2.pause();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zx8(iy8 iy8, rpc rpc) {
        this.a = 1;
        this.b = iy8;
    }
}
