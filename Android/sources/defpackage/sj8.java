package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sj8  reason: default package */
public final class sj8 implements vj8 {
    public final tqd a;
    public final int b;

    public sj8(tqd tqd, int i) {
        this.a = tqd;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj8)) {
            return false;
        }
        sj8 sj8 = (sj8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) sj8.a) && this.b == sj8.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMediaItem(item=" + this.a + ", uiPosition=" + this.b + ")";
    }
}
