package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eu6  reason: default package */
public final class eu6 {
    public final int[] a;
    public final int[] b;

    public eu6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu6)) {
            return false;
        }
        eu6 eu6 = (eu6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) eu6.a) && Intrinsics.areEqual((Object) this.b, (Object) eu6.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return rae.p("GradientsOverlayColors(surfaceGroundGradient=", Arrays.toString(this.a), ", surfacePrimaryGradient=", Arrays.toString(this.b), ")");
    }
}
