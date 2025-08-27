package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zs0  reason: default package */
public final class zs0 {
    public final at0 a;
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

    public zs0(at0 at0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = at0;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs0)) {
            return false;
        }
        zs0 zs0 = (zs0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zs0.a) && this.b == zs0.b && this.c == zs0.c && this.d == zs0.d && this.e == zs0.e && this.f == zs0.f && this.g == zs0.g && this.h == zs0.h && this.i == zs0.i && this.j == zs0.j && this.k == zs0.k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.k) + rae.h(this.j, rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(this.d, rae.h(this.c, rae.h(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleTextColors(reaction=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", actionFade=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", bodySecondary=");
        sb.append(this.e);
        sb.append(", time=");
        sb.append(this.f);
        sb.append(", author=");
        sb.append(this.g);
        sb.append(", replyName=");
        sb.append(this.h);
        sb.append(", replyBody=");
        sb.append(this.i);
        sb.append(", forwardLabel=");
        sb.append(this.j);
        sb.append(", forwardName=");
        return wj6.l(sb, this.k, ")");
    }
}
