package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wo7  reason: default package */
public final class wo7 {
    public final String a;
    public final int b;

    public wo7(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo7)) {
            return false;
        }
        wo7 wo7 = (wo7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wo7.a) && this.b == wo7.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JsBridgeMethodErrorReason(title=" + this.a + ", code=" + this.b + ")";
    }
}
