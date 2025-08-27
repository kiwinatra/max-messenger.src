package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u63  reason: default package */
public final class u63 {
    public final int[] a;
    public final int b;

    public u63(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u63)) {
            return false;
        }
        u63 u63 = (u63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) u63.a) && this.b == u63.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wj6.l(tr1.p("CommonBackgroundSkeletonStickerSecondaryBaseGradientColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
