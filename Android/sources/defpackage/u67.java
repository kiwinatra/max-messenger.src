package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: u67  reason: default package */
public final class u67 {
    public final z67 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public u67(z67 z67, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = z67;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u67)) {
            return false;
        }
        u67 u67 = (u67) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) u67.a) && this.b == u67.b && this.c == u67.c && this.d == u67.d && this.e == u67.e && this.f == u67.f && this.g == u67.g && this.h == u67.h && this.i == u67.i;
    }

    public final int hashCode() {
        return Integer.hashCode(-16745729) + rae.h(this.i, rae.h(this.h, rae.h(this.g, rae.h(-15987442, rae.h(this.f, rae.h(this.e, rae.h(this.d, rae.h(this.c, rae.h(-1, rae.h(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconColors(local=");
        sb.append(this.a);
        sb.append(", contrast=");
        sb.append(this.b);
        sb.append(", contrastStatic=-1, negative=");
        sb.append(this.c);
        sb.append(", neutralThemed=");
        sb.append(this.d);
        sb.append(", positive=");
        sb.append(this.e);
        sb.append(", primary=");
        sb.append(this.f);
        sb.append(", primaryStatic=-15987442, quaternary=");
        sb.append(this.g);
        sb.append(", secondary=");
        sb.append(this.h);
        sb.append(", tertiary=");
        return wj6.l(sb, this.i, ", themed=-16745729)");
    }
}
