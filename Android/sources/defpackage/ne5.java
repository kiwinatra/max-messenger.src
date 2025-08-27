package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ne5  reason: default package */
public final class ne5 extends v5a {
    public final String b;

    public ne5(String str) {
        super(Unit.INSTANCE);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ne5) && Intrinsics.areEqual((Object) this.b, (Object) ((ne5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ExternalCallback(params="), this.b, ")");
    }
}
