package defpackage;

/* renamed from: gne  reason: default package */
public final class gne {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public gne(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        this.j = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gne)) {
            return false;
        }
        gne gne = (gne) obj;
        gne.getClass();
        return this.a == gne.a && this.b == gne.b && this.c == gne.c && this.d == gne.d && this.e == gne.e && this.f == gne.f && this.g == gne.g && this.h == gne.h && this.i == gne.i && this.j == gne.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(this.d, rae.h(-16751924, rae.h(this.c, rae.h(this.b, rae.h(this.a, Integer.hashCode(-4473925) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatesTextColors(activeContrastStatic=-4473925, activeNegative=");
        sb.append(this.a);
        sb.append(", activeNeutralThemed=");
        sb.append(this.b);
        sb.append(", activePrimary=");
        sb.append(this.c);
        sb.append(", activeThemed=-16751924, disabledContrast=");
        sb.append(this.d);
        sb.append(", disabledContrastStatic=");
        sb.append(this.e);
        sb.append(", disabledNegative=");
        sb.append(this.f);
        sb.append(", disabledNeutralThemed=");
        sb.append(this.g);
        sb.append(", disabledPrimary=");
        sb.append(this.h);
        sb.append(", disabledPrimaryStatic=");
        sb.append(this.i);
        sb.append(", disabledThemed=");
        return wj6.l(sb, this.j, ")");
    }
}
