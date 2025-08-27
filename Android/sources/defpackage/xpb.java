package defpackage;

/* renamed from: xpb  reason: default package */
public final class xpb extends jkf {
    public static final Object j = new Object();
    public final ir8 e;
    public final boolean f;
    public final boolean g;
    public final wq8 h;
    public final long i;

    public xpb(ypb ypb) {
        this.e = ypb.C0();
        this.f = ypb.G0();
        this.g = ypb.N0();
        this.h = ypb.T0() ? wq8.f : null;
        this.i = v0g.S(ypb.w());
    }

    public final int b(Object obj) {
        return j.equals(obj) ? 0 : -1;
    }

    public final ekf g(int i2, ekf ekf, boolean z) {
        Object obj = j;
        ekf.getClass();
        ekf ekf2 = ekf;
        Object obj2 = obj;
        ekf2.j(obj2, obj, 0, this.i, 0, q9.g, false);
        return ekf;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int i2) {
        return j;
    }

    public final hkf n(int i2, hkf hkf, long j2) {
        hkf.b(j, this.e, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0, this.i, 0, 0, 0);
        return hkf;
    }

    public final int p() {
        return 1;
    }
}
