package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h50  reason: default package */
public final class h50 extends i50 {
    public final ngf a;

    public h50(igf igf) {
        this.a = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h50) && Intrinsics.areEqual((Object) this.a, (Object) ((h50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowTooltipEvent(textSource="), this.a, ")");
    }
}
