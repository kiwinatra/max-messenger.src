package defpackage;

/* renamed from: fye  reason: default package */
public final class fye {
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
    public final int k;

    public fye(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
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
        this.k = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fye)) {
            return false;
        }
        fye fye = (fye) obj;
        fye.getClass();
        return this.a == fye.a && this.b == fye.b && this.c == fye.c && this.d == fye.d && this.e == fye.e && this.f == fye.f && this.g == fye.g && this.h == fye.h && this.i == fye.i && this.j == fye.j && this.k == fye.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + rae.h(this.j, rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(-16745729, rae.h(this.d, rae.h(this.c, rae.h(this.b, rae.h(this.a, Integer.hashCode(1308622847) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrokeColors(contrastSecondaryStatic=1308622847, contrastStatic=");
        sb.append(this.a);
        sb.append(", negative=");
        sb.append(this.b);
        sb.append(", positive=");
        sb.append(this.c);
        sb.append(", secondary=");
        sb.append(this.d);
        sb.append(", themed=-16745729, transparent=");
        sb.append(this.e);
        sb.append(", localCarverTabBar=");
        sb.append(this.f);
        sb.append(", localTabBarPrimary=");
        sb.append(this.g);
        sb.append(", localTopBarPrimary=");
        sb.append(this.h);
        sb.append(", separatorContrast=");
        sb.append(this.i);
        sb.append(", separatorPrimary=");
        sb.append(this.j);
        sb.append(", separatorSecondary=");
        return wj6.l(sb, this.k, ")");
    }
}
