package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rzd  reason: default package */
public final class rzd implements tzd {
    public final txd a;

    public rzd(txd txd) {
        this.a = txd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzd) && Intrinsics.areEqual((Object) this.a, (Object) ((rzd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SessionsClose(event=" + this.a + ")";
    }
}
