package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w3c  reason: default package */
public final class w3c implements x3c {
    public final ngf a;

    public w3c(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w3c) && Intrinsics.areEqual((Object) this.a, (Object) ((w3c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowSuccessRestoredMembersSnackbar(caption="), this.a, ")");
    }
}
