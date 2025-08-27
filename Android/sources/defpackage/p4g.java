package defpackage;

/* renamed from: p4g  reason: default package */
public final class p4g {
    public final qac a;
    public final float b;
    public final float c;
    public final boolean d;

    public p4g(i20 i20) {
        this.a = i20.a;
        this.b = i20.b;
        this.c = i20.c;
        this.d = i20.d;
    }

    public final i20 a() {
        i20 i20 = new i20(1);
        i20.a = this.a;
        i20.b = this.b;
        i20.c = this.c;
        i20.d = this.d;
        return i20;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p4g.class != obj.getClass()) {
            return false;
        }
        p4g p4g = (p4g) obj;
        if (Float.compare(p4g.b, this.b) == 0 && Float.compare(p4g.c, this.c) == 0 && this.d == p4g.d) {
            return this.a == p4g.a;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        qac qac = this.a;
        int hashCode = (qac != null ? qac.hashCode() : 0) * 31;
        float f = this.b;
        int floatToIntBits = (hashCode + (f != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.c;
        if (f2 != c44.DEFAULT_ASPECT_RATIO) {
            i = Float.floatToIntBits(f2);
        }
        return ((floatToIntBits + i) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoConvertOptions{quality=");
        sb.append(this.a);
        sb.append(", startTrimPosition=");
        sb.append(this.b);
        sb.append(", endTrimPosition=");
        sb.append(this.c);
        sb.append(", mute=");
        return wzf.l(sb, this.d, '}');
    }
}
