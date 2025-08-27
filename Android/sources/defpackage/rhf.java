package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rhf  reason: default package */
public final class rhf {
    public final int[] a;
    public final float b;

    public rhf(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhf)) {
            return false;
        }
        rhf rhf = (rhf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rhf.a) && Float.compare(this.b, rhf.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return "Gradient(colors=" + arrays + ", angle=" + this.b + ")";
    }
}
