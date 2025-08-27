package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: lig  reason: default package */
public final class lig implements tig {
    public final String a;

    public lig(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lig) && Intrinsics.areEqual((Object) this.a, (Object) ((lig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("OpenLinkExternal(url="), this.a, ")");
    }
}
