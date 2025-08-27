package defpackage;

/* renamed from: f33  reason: default package */
public final class f33 implements kcd {
    public final kcd a;
    public boolean b;
    public final /* synthetic */ h33 c;

    public f33(h33 h33, kcd kcd) {
        this.c = h33;
        this.a = kcd;
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

    public final int f(xe8 xe8, aa4 aa4, int i) {
        h33 h33 = this.c;
        if (h33.a()) {
            return -3;
        }
        if (this.b) {
            aa4.b = 4;
            return -4;
        }
        int f = this.a.f(xe8, aa4, i);
        if (f == -5) {
            ca6 ca6 = (ca6) xe8.c;
            ca6.getClass();
            int i2 = ca6.L0;
            int i3 = ca6.K0;
            if (!(i3 == 0 && i2 == 0)) {
                if (h33.v != 0) {
                    i3 = 0;
                }
                if (h33.w != Long.MIN_VALUE) {
                    i2 = 0;
                }
                aa6 a2 = ca6.a();
                a2.A = i3;
                a2.B = i2;
                xe8.c = a2.a();
            }
            return -5;
        }
        long j = h33.w;
        if (j == Long.MIN_VALUE || ((f != -4 || aa4.w < j) && (f != -3 || h33.y() != Long.MIN_VALUE || aa4.v))) {
            return f;
        }
        aa4.z();
        aa4.b = 4;
        this.b = true;
        return -4;
    }
}
