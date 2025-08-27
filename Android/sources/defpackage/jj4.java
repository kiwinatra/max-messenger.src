package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: jj4  reason: default package */
public final class jj4 extends nj4 implements Comparable {
    public final int X;
    public final int Y;
    public final int Z;
    public final int v;
    public final boolean v0;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final int z;

    public jj4(int i, spf spf, int i2, ej4 ej4, int i3, String str) {
        super(i, spf, i2);
        int i4;
        int i5 = 0;
        this.w = pk0.o(i3, false);
        int i6 = this.o.e & (~ej4.v);
        this.x = (i6 & 1) != 0;
        this.y = (i6 & 2) != 0;
        tb7 tb7 = ej4.t;
        tb7 t = tb7.isEmpty() ? tb7.t("") : tb7;
        int i7 = 0;
        while (true) {
            if (i7 >= t.size()) {
                i7 = IntCompanionObject.MAX_VALUE;
                i4 = 0;
                break;
            }
            i4 = sj4.e(this.o, (String) t.get(i7), ej4.w);
            if (i4 > 0) {
                break;
            }
            i7++;
        }
        this.z = i7;
        this.X = i4;
        int c = sj4.c(this.o.f, ej4.u);
        this.Y = c;
        this.v0 = (this.o.f & 1088) != 0;
        int e = sj4.e(this.o, str, sj4.h(str) == null);
        this.Z = e;
        boolean z2 = i4 > 0 || (tb7.isEmpty() && c > 0) || this.x || (this.y && e > 0);
        if (pk0.o(i3, ej4.t0) && z2) {
            i5 = 1;
        }
        this.v = i5;
    }

    public final int a() {
        return this.v;
    }

    public final /* bridge */ /* synthetic */ boolean b(nj4 nj4) {
        jj4 jj4 = (jj4) nj4;
        return false;
    }

    /* renamed from: c */
    public final int compareTo(jj4 jj4) {
        y93 d = y93.a.d(this.w, jj4.w);
        Integer valueOf = Integer.valueOf(this.z);
        Integer valueOf2 = Integer.valueOf(jj4.z);
        f5b f5b = q5a.a;
        f5b.getClass();
        f5b f5b2 = d5d.a;
        y93 c = d.c(valueOf, valueOf2, f5b2);
        int i = this.X;
        y93 a = c.a(i, jj4.X);
        int i2 = this.Y;
        y93 d2 = a.a(i2, jj4.Y).d(this.x, jj4.x);
        Boolean valueOf3 = Boolean.valueOf(this.y);
        Boolean valueOf4 = Boolean.valueOf(jj4.y);
        if (i != 0) {
            f5b = f5b2;
        }
        y93 a2 = d2.c(valueOf3, valueOf4, f5b).a(this.Z, jj4.Z);
        if (i2 == 0) {
            a2 = a2.e(this.v0, jj4.v0);
        }
        return a2.f();
    }
}
