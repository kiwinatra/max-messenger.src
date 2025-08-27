package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g31  reason: default package */
public final class g31 implements i31 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public g31(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31)) {
            return false;
        }
        g31 g31 = (g31) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) g31.a) && this.b == g31.b && this.c == g31.c && this.d == g31.d && this.e == g31.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g63.e(g63.e(g63.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Link(link=");
        sb.append(this.a);
        sb.append(", isNewLink=");
        sb.append(this.b);
        sb.append(", isFrontCameraEnabled=");
        sb.append(this.c);
        sb.append(", isVideoEnabled=");
        sb.append(this.d);
        sb.append(", isAudioEnabled=");
        return tr1.m(sb, this.e, ")");
    }
}
