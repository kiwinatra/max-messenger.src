package defpackage;

import kotlin.enums.EnumEntriesKt;

/* renamed from: ok5  reason: default package */
public enum ok5 {
    v(jya.x, jya.y, "UNKNOWN"),
    w(jya.o, jya.p, "DOCS"),
    x(jya.f, jya.g, "TABLES"),
    y(jya.u, jya.v, "TEXTS"),
    z(jya.i, jya.j, "IMAGES"),
    X(jya.A, jya.B, "VIDEOS"),
    Y(jya.c, jya.d, "ARCHIVES"),
    Z(jya.r, jya.s, "BINS"),
    v0(jya.l, jya.m, "MUSIC");
    
    public final int a;
    public final int b;
    public final int c;
    public final int o;

    static {
        ok5[] ok5Arr;
        x0 = EnumEntriesKt.enumEntries((E[]) ok5Arr);
    }

    /* access modifiers changed from: public */
    ok5(int i, int i2, String str) {
        int i3 = jya.C;
        this.a = r3;
        this.b = i;
        this.c = i2;
        this.o = i3;
    }
}
