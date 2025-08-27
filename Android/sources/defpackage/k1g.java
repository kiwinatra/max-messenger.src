package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k1g  reason: default package */
public final class k1g {
    public final int[] a;
    public final float b;

    public k1g(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1g)) {
            return false;
        }
        k1g k1g = (k1g) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) k1g.a) && Float.compare(this.b, k1g.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        return "Gradient(colors=" + arrays + ", angle=" + this.b + ")";
    }
}
