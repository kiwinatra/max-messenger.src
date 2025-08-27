package defpackage;

import java.util.Arrays;

/* renamed from: td  reason: default package */
public final class td {
    public final long a;
    public final jkf b;
    public final int c;
    public final nz8 d;
    public final long e;
    public final jkf f;
    public final int g;
    public final nz8 h;
    public final long i;
    public final long j;

    public td(long j2, jkf jkf, int i2, nz8 nz8, long j3, jkf jkf2, int i3, nz8 nz82, long j4, long j5) {
        this.a = j2;
        this.b = jkf;
        this.c = i2;
        this.d = nz8;
        this.e = j3;
        this.f = jkf2;
        this.g = i3;
        this.h = nz82;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || td.class != obj.getClass()) {
            return false;
        }
        td tdVar = (td) obj;
        return this.a == tdVar.a && this.c == tdVar.c && this.e == tdVar.e && this.g == tdVar.g && this.i == tdVar.i && this.j == tdVar.j && cjf.n(this.b, tdVar.b) && cjf.n(this.d, tdVar.d) && cjf.n(this.f, tdVar.f) && cjf.n(this.h, tdVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
