package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p63  reason: default package */
public final class p63 {
    public final int[] a;
    public final int b;

    public p63(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p63)) {
            return false;
        }
        p63 p63 = (p63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) p63.a) && this.b == p63.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wj6.l(tr1.p("CommonBackgroundSkeletonBubbleGradientPrimaryColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
