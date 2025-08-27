package defpackage;

import java.util.Arrays;

/* renamed from: sd  reason: default package */
public final class sd {
    public final long a;
    public final ikf b;
    public final int c;
    public final mz8 d;
    public final long e;
    public final ikf f;
    public final int g;
    public final mz8 h;
    public final long i;
    public final long j;

    public sd(long j2, ikf ikf, int i2, mz8 mz8, long j3, ikf ikf2, int i3, mz8 mz82, long j4, long j5) {
        this.a = j2;
        this.b = ikf;
        this.c = i2;
        this.d = mz8;
        this.e = j3;
        this.f = ikf2;
        this.g = i3;
        this.h = mz82;
        this.i = j4;
        this.j = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sd.class != obj.getClass()) {
            return false;
        }
        sd sdVar = (sd) obj;
        return this.a == sdVar.a && this.c == sdVar.c && this.e == sdVar.e && this.g == sdVar.g && this.i == sdVar.i && this.j == sdVar.j && cjf.n(this.b, sdVar.b) && cjf.n(this.d, sdVar.d) && cjf.n(this.f, sdVar.f) && cjf.n(this.h, sdVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
