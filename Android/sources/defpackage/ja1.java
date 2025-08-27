package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ja1  reason: default package */
public final class ja1 extends ka1 {
    public final o0g a;

    public ja1(o0g o0g) {
        this.a = o0g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja1) && Intrinsics.areEqual((Object) this.a, (Object) ((ja1) obj).a);
    }

    public final int hashCode() {
        o0g o0g = this.a;
        if (o0g == null) {
            return 0;
        }
        return o0g.hashCode();
    }

    public final String toString() {
        return "VideoState(participant=" + this.a + ")";
    }
}
