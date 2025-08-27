package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: bi2  reason: default package */
public final class bi2 {
    public final ngf a;

    public bi2(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi2) && Intrinsics.areEqual((Object) this.a, (Object) ((bi2) obj).a);
    }

    public final int hashCode() {
        ngf ngf = this.a;
        if (ngf == null) {
            return 0;
        }
        return ngf.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ToolbarState(title="), this.a, ")");
    }
}
