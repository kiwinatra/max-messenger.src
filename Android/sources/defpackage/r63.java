package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: r63  reason: default package */
public final class r63 {
    public final p63 a;
    public final q63 b;
    public final t63 c;
    public final v63 d;

    public r63(p63 p63, q63 q63, t63 t63, v63 v63) {
        this.a = p63;
        this.b = q63;
        this.c = t63;
        this.d = v63;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r63)) {
            return false;
        }
        r63 r63 = (r63) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) r63.a) && Intrinsics.areEqual((Object) this.b, (Object) r63.b) && Intrinsics.areEqual((Object) this.c, (Object) r63.c) && Intrinsics.areEqual((Object) this.d, (Object) r63.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonColors(bubbleGradientPrimary=" + this.a + ", bubbleGradientSecondary=" + this.b + ", stickerPrimary=" + this.c + ", stickerSecondary=" + this.d + ")";
    }
}
