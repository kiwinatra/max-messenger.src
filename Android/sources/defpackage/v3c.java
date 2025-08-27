package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v3c  reason: default package */
public final class v3c implements x3c {
    public final ngf a;

    public v3c(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3c) && Intrinsics.areEqual((Object) this.a, (Object) ((v3c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowRestoreMembersSnackbar(caption="), this.a, ")");
    }
}
