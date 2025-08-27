package defpackage;

/* renamed from: g33  reason: default package */
public final class g33 implements lcd {
    public final lcd a;
    public boolean b;
    public final /* synthetic */ i33 c;

    public g33(i33 i33, lcd lcd) {
        this.c = i33;
        this.a = lcd;
    }

    public final void b() {
        this.a.b();
    }

    public final boolean c() {
        return !this.c.a() && this.a.c();
    }

    public final int e(long j) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.e(j);
    }

    public final int f(ox0 ox0, ba4 ba4, int i) {
        i33 i33 = this.c;
        if (i33.a()) {
            return -3;
        }
        if (this.b) {
            ba4.b = 4;
            return -4;
        }
        long y = i33.y();
        int f = this.a.f(ox0, ba4, i);
        if (f == -5) {
            ea6 ea6 = (ea6) ox0.b;
            ea6.getClass();
            int i2 = ea6.F;
            int i3 = ea6.E;
            if (!(i3 == 0 && i2 == 0)) {
                if (i33.v != 0) {
                    i3 = 0;
                }
                if (i33.w != Long.MIN_VALUE) {
                    i2 = 0;
                }
                ba6 a2 = ea6.a();
                a2.D = i3;
                a2.E = i2;
                ox0.b = a2.a();
            }
            return -5;
        }
        long j = i33.w;
        if (j == Long.MIN_VALUE || ((f != -4 || ba4.x < j) && (f != -3 || y != Long.MIN_VALUE || ba4.w))) {
            return f;
        }
        ba4.z();
        ba4.b = 4;
        this.b = true;
        return -4;
    }
}
