package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sz6  reason: default package */
public final class sz6 extends tz6 {
    public final String a;

    public sz6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz6) && Intrinsics.areEqual((Object) this.a, (Object) ((sz6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("Time(time="), this.a, ")");
    }
}
