package defpackage;

import java.io.Serializable;

/* renamed from: xv0  reason: default package */
public final class xv0 implements Serializable {
    public final String a;
    public final fw0 b;
    public final int c;
    public final String o;
    public final String v;
    public final boolean w;
    public final long x;
    public final boolean y;

    public xv0(uv0 uv0) {
        this.a = uv0.a;
        this.b = uv0.b;
        this.c = uv0.c;
        this.o = uv0.d;
        this.v = uv0.e;
        this.w = uv0.f;
        this.y = uv0.g;
        this.x = uv0.h;
    }

    public final xv0 a(boolean z) {
        uv0 uv0 = new uv0(this.a, this.b, this.c);
        uv0.d = this.o;
        uv0.e = this.v;
        uv0.h = this.x;
        uv0.f = this.w;
        uv0.g = z;
        return new xv0(uv0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xv0)) {
            return false;
        }
        xv0 xv0 = (xv0) obj;
        if (cvg.c(this.a, xv0.a) && cvg.c(this.v, xv0.v) && this.b == xv0.b && this.w == xv0.w && this.c == xv0.c && this.x == xv0.x) {
            return cvg.c(this.o, xv0.o);
        }
        return false;
    }
}
