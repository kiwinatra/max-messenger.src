package defpackage;

import java.util.Arrays;

/* renamed from: tob  reason: default package */
public final class tob implements jv0 {
    public final Object a;
    public final int b;
    public final gr8 c;
    public final Object o;
    public final int v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public tob(Object obj, int i, gr8 gr8, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = gr8;
        this.o = obj2;
        this.v = i2;
        this.w = j;
        this.x = j2;
        this.y = i3;
        this.z = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tob.class != obj.getClass()) {
            return false;
        }
        tob tob = (tob) obj;
        return this.b == tob.b && this.v == tob.v && this.w == tob.w && this.x == tob.x && this.y == tob.y && this.z == tob.z && cjf.n(this.a, tob.a) && cjf.n(this.o, tob.o) && cjf.n(this.c, tob.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.o, Integer.valueOf(this.v), Long.valueOf(this.w), Long.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z)});
    }
}
