package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4b  reason: default package */
public final class c4b extends v5a {
    public final String b;

    public c4b(String str) {
        super(Unit.INSTANCE);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4b) && Intrinsics.areEqual((Object) this.b, (Object) ((c4b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("OpenExternalLink(url="), this.b, ")");
    }
}
