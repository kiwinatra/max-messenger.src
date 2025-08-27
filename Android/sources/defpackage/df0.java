package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: df0  reason: default package */
public final class df0 {
    public final cf0 a;
    public final jf0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    public df0(cf0 cf0, jf0 jf0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = cf0;
        this.b = jf0;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df0)) {
            return false;
        }
        df0 df0 = (df0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) df0.a) && Intrinsics.areEqual((Object) this.b, (Object) df0.b) && this.c == df0.c && this.d == df0.d && this.e == df0.e && this.f == df0.f && this.g == df0.g && this.h == df0.h && this.i == df0.i && this.j == df0.j && this.k == df0.k;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + rae.h(this.k, rae.h(this.j, rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(this.f, rae.h(this.e, rae.h(-1728053248, rae.h(this.d, rae.h(this.c, rae.h(-1184014, rae.h(-1, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundColors(accent=");
        sb.append(this.a);
        sb.append(", local=");
        sb.append(this.b);
        sb.append(", contrastFloating=-1, contrastFloatingSecondary=-1184014, neutralFloating=");
        sb.append(this.c);
        sb.append(", overlay=");
        sb.append(this.d);
        sb.append(", overlaySecondary=-1728053248, overlayStatic=");
        sb.append(this.e);
        sb.append(", surfaceCard=");
        sb.append(this.f);
        sb.append(", surfaceFloating=");
        sb.append(this.g);
        sb.append(", surfaceGround=");
        sb.append(this.h);
        sb.append(", surfacePrimary=");
        sb.append(this.i);
        sb.append(", surfaceSecondary=");
        sb.append(this.j);
        sb.append(", surfaceTertiary=");
        return wj6.l(sb, this.k, ", transparent=0)");
    }
}
