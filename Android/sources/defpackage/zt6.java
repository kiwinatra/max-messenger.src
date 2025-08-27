package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zt6  reason: default package */
public final class zt6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;

    public zt6(int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt6)) {
            return false;
        }
        zt6 zt6 = (zt6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zt6.a) && Intrinsics.areEqual((Object) this.b, (Object) zt6.b) && Intrinsics.areEqual((Object) this.c, (Object) zt6.c);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.c) + ((hashCode + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        return wj6.n(rae.r("GradientsButtonTextPromoColors(defaultGradient=", arrays, ", disabledGradient=", arrays2, ", pressedGradient="), Arrays.toString(this.c), ")");
    }
}
