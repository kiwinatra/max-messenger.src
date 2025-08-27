package defpackage;

import java.io.Serializable;

/* renamed from: x10  reason: default package */
public final class x10 implements Serializable {
    public static final x10 Z = new Object().a();
    public final String X;
    public final String Y;
    public final String a;
    public final String b;
    public final int c;
    public final int o;
    public final boolean v;
    public final byte[] w;
    public final String x;
    public final long y;
    public final String z;

    public x10(w10 w10) {
        this.a = w10.a;
        this.b = w10.b;
        this.c = w10.c;
        this.o = w10.d;
        this.v = w10.e;
        this.w = w10.f;
        this.x = w10.g;
        this.y = w10.h;
        this.z = w10.i;
        this.X = w10.j;
        this.Y = w10.k;
    }

    public final String a() {
        String str = this.b;
        if (!cvg.A(str)) {
            return str;
        }
        String str2 = this.a;
        if (!cvg.A(str2)) {
            return cjf.A(str2, kl0.v, jl0.b);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [w10, java.lang.Object] */
    public final w10 b() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.o;
        obj.e = this.v;
        obj.f = this.w;
        obj.g = this.x;
        obj.h = this.y;
        obj.i = this.z;
        obj.j = this.X;
        obj.k = this.Y;
        return obj;
    }
}
