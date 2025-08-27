package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bu6  reason: default package */
public final class bu6 {
    public final int[] a;

    public bu6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu6) && Intrinsics.areEqual((Object) this.a, (Object) ((bu6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return wj6.k("GradientsComplexColors(overlayFloatingGradient=", Arrays.toString(this.a), ")");
    }
}
