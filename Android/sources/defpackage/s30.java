package defpackage;

import java.util.Set;

/* renamed from: s30  reason: default package */
public final class s30 {
    public static final s30 d;
    public final int a;
    public final int b;
    public final dc7 c;

    /* JADX WARNING: type inference failed for: r1v1, types: [cc7, jb7] */
    static {
        s30 s30;
        if (v0g.a >= 33) {
            ? jb7 = new jb7(4);
            for (int i = 1; i <= 10; i++) {
                jb7.a(Integer.valueOf(v0g.t(i)));
            }
            s30 = new s30(2, (Set) jb7.l());
        } else {
            s30 = new s30(2, 10);
        }
        d = s30;
    }

    public s30(int i, Set set) {
        this.a = i;
        dc7 p = dc7.p(set);
        this.c = p;
        wvf m = p.iterator();
        int i2 = 0;
        while (m.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) m.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s30)) {
            return false;
        }
        s30 s30 = (s30) obj;
        return this.a == s30.a && this.b == s30.b && v0g.a(this.c, s30.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        dc7 dc7 = this.c;
        return i + (dc7 == null ? 0 : dc7.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public s30(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
