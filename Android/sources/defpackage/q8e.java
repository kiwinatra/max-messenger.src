package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q8e  reason: default package */
public final class q8e extends zs2 {
    public final ngf a;

    public q8e(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8e) && Intrinsics.areEqual((Object) this.a, (Object) ((q8e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowSnackbar(text="), this.a, ")");
    }
}
