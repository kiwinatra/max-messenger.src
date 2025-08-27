package defpackage;

import android.view.Surface;

/* renamed from: r3f  reason: default package */
public final class r3f {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;

    public r3f(Surface surface, int i, int i2, int i3) {
        n79.f("orientationDegrees must be 0, 90, 180, or 270", i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270);
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3f)) {
            return false;
        }
        r3f r3f = (r3f) obj;
        return this.b == r3f.b && this.c == r3f.c && this.d == r3f.d && this.a.equals(r3f.a);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
