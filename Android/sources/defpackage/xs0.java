package defpackage;

/* renamed from: xs0  reason: default package */
public final class xs0 {
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
    public final int l;
    public final int m;
    public final int n;

    public xs0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
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
        this.l = i13;
        this.m = i14;
        this.n = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs0)) {
            return false;
        }
        xs0 xs0 = (xs0) obj;
        xs0.getClass();
        return this.a == xs0.a && this.b == xs0.b && this.c == xs0.c && this.d == xs0.d && this.e == xs0.e && this.f == xs0.f && this.g == xs0.g && this.h == xs0.h && this.i == xs0.i && this.j == xs0.j && this.k == xs0.k && this.l == xs0.l && this.m == xs0.m && this.n == xs0.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + rae.h(this.m, rae.h(this.l, rae.h(this.k, rae.h(this.j, rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(this.d, rae.h(this.c, rae.h(this.b, rae.h(this.a, Integer.hashCode(-1685946) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleIconColors(alert=-1685946, readStatus=");
        sb.append(this.a);
        sb.append(", readStatusCapsule=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", actionSecondary=");
        sb.append(this.d);
        sb.append(", reply=");
        sb.append(this.e);
        sb.append(", iconItem=");
        sb.append(this.f);
        sb.append(", callNeutral=");
        sb.append(this.g);
        sb.append(", callNegative=");
        sb.append(this.h);
        sb.append(", replyForwarded=");
        sb.append(this.i);
        sb.append(", verificationAuthor=");
        sb.append(this.j);
        sb.append(", verificationBody=");
        sb.append(this.k);
        sb.append(", verificationForwardName=");
        sb.append(this.l);
        sb.append(", verificationReplyBody=");
        sb.append(this.m);
        sb.append(", verificationReplyName=");
        return wj6.l(sb, this.n, ")");
    }
}
