package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yt6  reason: default package */
public final class yt6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;

    public yt6(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
        this.d = iArr4;
        this.e = iArr5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt6)) {
            return false;
        }
        yt6 yt6 = (yt6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) yt6.a) && Intrinsics.areEqual((Object) this.b, (Object) yt6.b) && Intrinsics.areEqual((Object) this.c, (Object) yt6.c) && Intrinsics.areEqual((Object) this.d, (Object) yt6.d) && Intrinsics.areEqual((Object) this.e, (Object) yt6.e);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        int hashCode2 = Arrays.hashCode(this.c);
        int hashCode3 = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode3 + ((hashCode2 + ((hashCode + (Arrays.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        String arrays3 = Arrays.toString(this.c);
        String arrays4 = Arrays.toString(this.d);
        String arrays5 = Arrays.toString(this.e);
        StringBuilder r = rae.r("GradientsBannerDkColors(backgroundFantasyGradient=", arrays, ", backgroundIconContainerGradient=", arrays2, ", backgroundVibrantGradient=");
        r.append(arrays3);
        r.append(", strokeIconContainerGradient=");
        r.append(arrays4);
        r.append(", backgroundPaleBlueGradient=");
        return wj6.n(r, arrays5, ")");
    }
}
