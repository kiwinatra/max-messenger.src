package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wp4  reason: default package */
public final class wp4 {
    public final long a;
    public final String b;
    public final boolean c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public wp4(long j, String str, boolean z, List list, boolean z2, boolean z3, int i) {
        z = (i & 4) != 0 ? false : z;
        list = (i & 8) != 0 ? CollectionsKt.emptyList() : list;
        z2 = (i & 16) != 0 ? false : z2;
        z3 = (i & 32) != 0 ? false : z3;
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp4)) {
            return false;
        }
        wp4 wp4 = (wp4) obj;
        return this.a == wp4.a && Intrinsics.areEqual((Object) this.b, (Object) wp4.b) && this.c == wp4.c && Intrinsics.areEqual((Object) this.d, (Object) wp4.d) && this.e == wp4.e && this.f == wp4.f;
    }

    public final int hashCode() {
        int d2 = g63.d(Long.hashCode(this.a) * 31, 31, this.b);
        boolean z = true;
        boolean z2 = this.c;
        if (z2) {
            z2 = true;
        }
        int i = rae.i(this.d, (d2 + (z2 ? 1 : 0)) * 31, 31);
        boolean z3 = this.e;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f;
        if (!z4) {
            z = z4;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpaceConsumer(size=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", isDirectory=");
        sb.append(this.c);
        sb.append(", children=");
        sb.append(this.d);
        sb.append(", overflow=");
        sb.append(this.e);
        sb.append(", excluded=");
        return wzf.l(sb, this.f, ')');
    }
}
