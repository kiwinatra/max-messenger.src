package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t63  reason: default package */
public final class t63 {
    public final s63 a;
    public final int[] b;

    public t63(s63 s63, int[] iArr) {
        this.a = s63;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t63)) {
            return false;
        }
        t63 t63 = (t63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) t63.a) && Intrinsics.areEqual((Object) this.b, (Object) t63.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "CommonBackgroundSkeletonStickerPrimaryColors(baseGradient=" + this.a + ", tongueGradient=" + arrays + ")";
    }
}
