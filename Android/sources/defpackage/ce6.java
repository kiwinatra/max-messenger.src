package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ce6  reason: default package */
public final class ce6 {
    public static final ce6 d = new ce6((g4g) null, 7);
    public final g4g a;
    public final int b;
    public final int c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ce6(g4g g4g, int i) {
        this((i & 1) != 0 ? null : g4g, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce6)) {
            return false;
        }
        ce6 ce6 = (ce6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ce6.a) && this.b == ce6.b && this.c == ce6.c;
    }

    public final int hashCode() {
        g4g g4g = this.a;
        return Integer.hashCode(this.c) + rae.h(this.b, (g4g == null ? 0 : g4g.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractorData(videoContent=");
        sb.append(this.a);
        sb.append(", frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        return wj6.l(sb, this.c, ")");
    }

    public ce6(g4g g4g, int i, int i2) {
        this.a = g4g;
        this.b = i;
        this.c = i2;
    }
}
