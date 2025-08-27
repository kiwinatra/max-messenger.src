package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ma1  reason: default package */
public final class ma1 implements na1 {
    public final String a;

    public ma1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma1) && Intrinsics.areEqual((Object) this.a, (Object) ((ma1) obj).a);
    }

    public final boolean f(lz7 lz7) {
        return 9223372036854775805L == lz7.getItemId();
    }

    public final long getItemId() {
        return 9223372036854775805L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return 3;
    }

    public final String toString() {
        return wj6.n(new StringBuilder("CallShareLinkPreviewState(link="), this.a, ")");
    }
}
