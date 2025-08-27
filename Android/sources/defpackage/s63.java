package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s63  reason: default package */
public final class s63 {
    public final int[] a;
    public final int b;

    public s63(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s63)) {
            return false;
        }
        s63 s63 = (s63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) s63.a) && this.b == s63.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wj6.l(tr1.p("CommonBackgroundSkeletonStickerPrimaryBaseGradientColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
