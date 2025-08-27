package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dhg  reason: default package */
public final class dhg extends ehg {
    public final String a;

    public dhg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhg) && Intrinsics.areEqual((Object) this.a, (Object) ((dhg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("OpenLinkExternal(url="), this.a, ")");
    }
}
