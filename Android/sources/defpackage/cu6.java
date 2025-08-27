package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cu6  reason: default package */
public final class cu6 {
    public final int[] a;
    public final int[] b;

    public cu6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu6)) {
            return false;
        }
        cu6 cu6 = (cu6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) cu6.a) && Intrinsics.areEqual((Object) this.b, (Object) cu6.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return rae.p("GradientsEmptyBlockIconWrapperColors(shapeGradient=", Arrays.toString(this.a), ", strokeGradient=", Arrays.toString(this.b), ")");
    }
}
