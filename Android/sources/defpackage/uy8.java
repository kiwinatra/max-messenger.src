package defpackage;

import java.util.List;

/* renamed from: uy8  reason: default package */
public final /* synthetic */ class uy8 implements ez8, fz8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ uy8(hz8 hz8, int i, int i2) {
        this.a = i2;
        this.b = hz8;
        this.c = i;
    }

    public void b(ypb ypb, cx8 cx8, List list) {
        switch (this.a) {
            case 1:
                ypb.S(this.b.K0(cx8, ypb, this.c), list);
                return;
            case 2:
                hz8 hz8 = this.b;
                hz8.getClass();
                int size = list.size();
                int i = this.c;
                if (size == 1) {
                    ypb.n0(hz8.K0(cx8, ypb, i), (ir8) list.get(0));
                    return;
                } else {
                    ypb.g0(list, hz8.K0(cx8, ypb, i), hz8.K0(cx8, ypb, i + 1));
                    return;
                }
            default:
                ypb.S(this.b.K0(cx8, ypb, this.c), list);
                return;
        }
    }

    public void e(ypb ypb, cx8 cx8) {
        switch (this.a) {
            case 0:
                ypb.P(this.b.K0(cx8, ypb, this.c));
                return;
            default:
                ypb.K(this.b.K0(cx8, ypb, this.c));
                return;
        }
    }
}
