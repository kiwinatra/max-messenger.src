package defpackage;

import sun.misc.Unsafe;

/* renamed from: h3h  reason: default package */
public final class h3h extends j3h {
    public h3h(Unsafe unsafe) {
        super((Object) unsafe);
    }

    public final double g1(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    public final float h1(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }

    public final void i1(Object obj, long j, boolean z) {
        if (k3h.g) {
            k3h.b(obj, j, z);
        } else {
            k3h.c(obj, j, z ? (byte) 1 : 0);
        }
    }

    public final void j1(Object obj, long j, byte b) {
        if (k3h.g) {
            k3h.b(obj, j, b);
        } else {
            k3h.c(obj, j, b);
        }
    }

    public final void k1(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }

    public final void l1(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    public final boolean m1(long j, Object obj) {
        return k3h.g ? k3h.q(j, obj) : k3h.r(j, obj);
    }
}
