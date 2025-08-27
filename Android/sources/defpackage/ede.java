package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ede  reason: default package */
public final class ede implements t87 {
    public final long a;
    public final String b;
    public final b3g c;
    public final ome d;

    public ede(long j, String str, b3g b3g, xme xme) {
        this.a = j;
        this.b = str;
        this.c = b3g;
        this.d = xme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ede)) {
            return false;
        }
        ede ede = (ede) obj;
        return this.a == ede.a && Intrinsics.areEqual((Object) this.b, (Object) ede.b) && Intrinsics.areEqual((Object) this.c, (Object) ede.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.d(Long.hashCode(this.a) * 31, 31, this.b);
    }
}
