package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: q7e  reason: default package */
public final class q7e implements tzb {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7e)) {
            return false;
        }
        ((q7e) obj).getClass();
        return true;
    }

    public final boolean f(lz7 lz7) {
        return ((long) 8) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) 8;
    }

    public final int hashCode() {
        return Integer.hashCode(536870920);
    }

    public final int i() {
        return 536870920;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return "ShortLinkHeaderItem(viewType=536870920)";
    }
}
