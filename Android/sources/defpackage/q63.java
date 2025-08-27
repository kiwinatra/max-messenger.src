package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q63  reason: default package */
public final class q63 {
    public final int[] a;
    public final int b;

    public q63(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q63)) {
            return false;
        }
        q63 q63 = (q63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) q63.a) && this.b == q63.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wj6.l(tr1.p("CommonBackgroundSkeletonBubbleGradientSecondaryColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
