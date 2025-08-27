package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v63  reason: default package */
public final class v63 {
    public final u63 a;
    public final int[] b;

    public v63(u63 u63, int[] iArr) {
        this.a = u63;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v63)) {
            return false;
        }
        v63 v63 = (v63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) v63.a) && Intrinsics.areEqual((Object) this.b, (Object) v63.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "CommonBackgroundSkeletonStickerSecondaryColors(baseGradient=" + this.a + ", tongueGradient=" + arrays + ")";
    }
}
