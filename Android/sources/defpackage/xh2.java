package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xh2  reason: default package */
public final class xh2 {
    public final de6 a;
    public final boolean b;
    public final boolean c;

    public xh2(de6 de6, boolean z, boolean z2, int i) {
        de6 = (i & 1) != 0 ? null : de6;
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? true : z2;
        this.a = de6;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2)) {
            return false;
        }
        xh2 xh2 = (xh2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xh2.a) && this.b == xh2.b && this.c == xh2.c;
    }

    public final int hashCode() {
        de6 de6 = this.a;
        return Boolean.hashCode(this.c) + g63.e((de6 == null ? 0 : de6.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameState(frame=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", featureEnabled=");
        return tr1.m(sb, this.c, ")");
    }
}
