package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l1g  reason: default package */
public final class l1g {
    public final String a;
    public final int b;
    public final int c;
    public final float d;
    public final boolean e;
    public final int f;

    public l1g(String str, int i, int i2, float f2, boolean z, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = z;
        this.f = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1g)) {
            return false;
        }
        l1g l1g = (l1g) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) l1g.a) && this.b == l1g.b && this.c == l1g.c && Float.compare(this.d, l1g.d) == 0 && this.e == l1g.e && this.f == l1g.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + g63.e(g63.c(rae.h(this.c, rae.h(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pattern(image=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", opacity=");
        sb.append(this.d);
        sb.append(", isOverlay=");
        sb.append(this.e);
        sb.append(", color=");
        return wj6.l(sb, this.f, ")");
    }
}
