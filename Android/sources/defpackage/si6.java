package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: si6  reason: default package */
public final class si6 {
    public final ri6 a;
    public final ri6 b;

    public si6(ri6 ri6, ri6 ri62) {
        this.a = ri6;
        this.b = ri62;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si6)) {
            return false;
        }
        si6 si6 = (si6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) si6.a) && Intrinsics.areEqual((Object) this.b, (Object) si6.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Results(fts=" + this.a + ", like=" + this.b + ")";
    }
}
