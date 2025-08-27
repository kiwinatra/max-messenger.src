package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ij4  reason: default package */
public final class ij4 extends mj4 implements Comparable {
    public final int X;
    public final int Y;
    public final int Z;
    public final int v;
    public final boolean v0;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public ij4(int i, rpf rpf, int i2, dj4 dj4, int i3, String str) {
        super(i, rpf, i2);
        int i4;
        int i5 = 0;
        this.w = rj4.d(i3, false);
        int i6 = this.o.o & (~dj4.I0);
        this.x = (i6 & 1) != 0;
        this.y = (i6 & 2) != 0;
        tb7 tb7 = dj4.B0;
        tb7 t = tb7.isEmpty() ? tb7.t("") : tb7;
        int i7 = 0;
        while (true) {
            if (i7 >= t.size()) {
                i7 = IntCompanionObject.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = rj4.c(this.o, (String) t.get(i7), dj4.D0);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.z = i7;
        this.X = i4;
        int a = rj4.a(this.o.v, dj4.C0);
        this.Y = a;
        this.v0 = (this.o.v & 1088) != 0;
        int c = rj4.c(this.o, str, rj4.f(str) == null);
        this.Z = c;
        boolean z2 = i4 > 0 || (tb7.isEmpty() && a > 0) || this.x || (this.y && c > 0);
        if (rj4.d(i3, dj4.S0) && z2) {
            i5 = 1;
        }
        this.v = i5;
    }

    public final int a() {
        return this.v;
    }

    public final /* bridge */ /* synthetic */ boolean b(mj4 mj4) {
        ij4 ij4 = (ij4) mj4;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(ij4 ij4) {
        y93 d = y93.a.d(this.w, ij4.w);
        Integer valueOf = Integer.valueOf(this.z);
        Integer valueOf2 = Integer.valueOf(ij4.z);
        f5b f5b = q5a.a;
        f5b.getClass();
        f5b f5b2 = d5d.a;
        y93 c = d.c(valueOf, valueOf2, f5b2);
        int i = this.X;
        y93 a = c.a(i, ij4.X);
        int i2 = this.Y;
        y93 d2 = a.a(i2, ij4.Y).d(this.x, ij4.x);
        Boolean valueOf3 = Boolean.valueOf(this.y);
        Boolean valueOf4 = Boolean.valueOf(ij4.y);
        if (i != 0) {
            f5b = f5b2;
        }
        y93 a2 = d2.c(valueOf3, valueOf4, f5b).a(this.Z, ij4.Z);
        if (i2 == 0) {
            a2 = a2.e(this.v0, ij4.v0);
        }
        return a2.f();
    }
}
