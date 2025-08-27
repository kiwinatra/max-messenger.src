package defpackage;

import android.media.AudioAttributes;

/* renamed from: h30  reason: default package */
public final class h30 implements jv0 {
    public static final h30 x = new h30(0, 0, 1, 1, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public final int v;
    public AudioAttributes w;

    public h30(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.o = i4;
        this.v = i5;
    }

    public final AudioAttributes a() {
        if (this.w == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.a).setFlags(this.b).setUsage(this.c);
            int i = t0g.a;
            if (i >= 29) {
                d30.a(usage, this.o);
            }
            if (i >= 32) {
                f30.a(usage, this.v);
            }
            this.w = usage.build();
        }
        return this.w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h30.class != obj.getClass()) {
            return false;
        }
        h30 h30 = (h30) obj;
        return this.a == h30.a && this.b == h30.b && this.c == h30.c && this.o == h30.o && this.v == h30.v;
    }

    public final int hashCode() {
        return ((((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.o) * 31) + this.v;
    }
}
