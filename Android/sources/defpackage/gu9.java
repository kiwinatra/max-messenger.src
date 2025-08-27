package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gu9  reason: default package */
public final class gu9 {
    public final String a;
    public final int b;
    public final int c;

    public gu9(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu9)) {
            return false;
        }
        gu9 gu9 = (gu9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gu9.a) && this.b == gu9.b && this.c == gu9.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ryg.a(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Quality(link=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wj6.l(sb, this.c, ")");
    }
}
