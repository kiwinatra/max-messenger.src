package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: du9  reason: default package */
public final class du9 {
    public final ln1 a;
    public final float b;
    public final boolean c;
    public final Long d;
    public final boolean e;

    public du9(ln1 ln1, float f, boolean z, Long l, boolean z2) {
        this.a = ln1;
        this.b = f;
        this.c = z;
        this.d = l;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du9)) {
            return false;
        }
        du9 du9 = (du9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) du9.a) && Float.compare(this.b, du9.b) == 0 && this.c == du9.c && Intrinsics.areEqual((Object) this.d, (Object) du9.d) && this.e == du9.e;
    }

    public final int hashCode() {
        int e2 = g63.e(g63.c(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        Long l = this.d;
        return Boolean.hashCode(this.e) + ((e2 + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieStateUpdate(trackKey=");
        sb.append(this.a);
        sb.append(", volume=");
        sb.append(this.b);
        sb.append(", isPaused=");
        sb.append(this.c);
        sb.append(", position=");
        sb.append(this.d);
        sb.append(", isMuted=");
        return tr1.m(sb, this.e, ")");
    }
}
