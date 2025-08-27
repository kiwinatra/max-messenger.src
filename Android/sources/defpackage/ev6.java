package defpackage;

/* renamed from: ev6  reason: default package */
public final class ev6 {
    public int a;
    public int b;
    public float c;
    public int d;
    public boolean e;
    public bv6 f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev6)) {
            return false;
        }
        ev6 ev6 = (ev6) obj;
        return this.a == ev6.a && this.b == ev6.b && Float.compare(this.c, ev6.c) == 0 && this.d == ev6.d && this.e == ev6.e && this.f == ev6.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + g63.e(rae.h(this.d, g63.c(rae.h(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31), 31, this.e);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        float f2 = this.c;
        int i3 = this.d;
        boolean z = this.e;
        bv6 bv6 = this.f;
        StringBuilder n = a81.n("PageState(pagesNumber=", i, ", selectedPageIndex=", i2, ", pageOffsetFraction=");
        n.append(f2);
        n.append(", selectedBigDotIndex=");
        n.append(i3);
        n.append(", wasShiftedFromZeroToZero=");
        n.append(z);
        n.append(", dotsAnimationType=");
        n.append(bv6);
        n.append(")");
        return n.toString();
    }
}
