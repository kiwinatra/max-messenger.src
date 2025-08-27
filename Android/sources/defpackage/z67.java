package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z67  reason: default package */
public final class z67 {
    public final a77 a;
    public final int b;
    public final int c;

    public z67(a77 a77, int i, int i2) {
        this.a = a77;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z67)) {
            return false;
        }
        z67 z67 = (z67) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) z67.a) && this.b == z67.b && this.c == z67.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconLocalColors(tabbar=");
        sb.append(this.a);
        sb.append(", verificationSecondary=");
        sb.append(this.b);
        sb.append(", verificationSubhead=");
        return wj6.l(sb, this.c, ")");
    }
}
