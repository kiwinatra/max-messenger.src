package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: c3b  reason: default package */
public final class c3b implements d3b {
    public final mza a;

    public c3b(mza mza) {
        this.a = mza;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3b) && Intrinsics.areEqual((Object) this.a, (Object) ((c3b) obj).a);
    }

    public final int hashCode() {
        mza mza = this.a;
        if (mza == null) {
            return 0;
        }
        return mza.hashCode();
    }

    public final String toString() {
        return "Search(listener=" + this.a + ")";
    }
}
