package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: cp0  reason: default package */
public final class cp0 implements fp0 {
    public final wo3 a;

    public cp0(wo3 wo3) {
        this.a = wo3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp0) && Intrinsics.areEqual((Object) this.a, (Object) ((cp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactList(event=" + this.a + ")";
    }
}
