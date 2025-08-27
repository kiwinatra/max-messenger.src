package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: to7  reason: default package */
public final class to7 extends vo7 {
    public final wo7 d;

    public to7(wo7 wo7) {
        super("client", 1, wo7);
        this.d = wo7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof to7) && Intrinsics.areEqual((Object) this.d, (Object) ((to7) obj).d);
    }

    public final int hashCode() {
        wo7 wo7 = this.d;
        if (wo7 == null) {
            return 0;
        }
        return wo7.hashCode();
    }

    public final wo7 l() {
        return this.d;
    }

    public final String toString() {
        return "ClientError(reason=" + this.d + ")";
    }
}
