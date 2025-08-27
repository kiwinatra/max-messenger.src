package defpackage;

import kotlin.jvm.internal.Intrinsics;
import one.me.rlottie.RLottieDrawable;

/* renamed from: fsb  reason: default package */
public final class fsb {
    public final String a;
    public final RLottieDrawable b;
    public final int c;
    public final int d;

    public fsb(String str, RLottieDrawable rLottieDrawable, int i, int i2) {
        this.a = str;
        this.b = rLottieDrawable;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsb)) {
            return false;
        }
        fsb fsb = (fsb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) fsb.a) && Intrinsics.areEqual((Object) this.b, (Object) fsb.b) && this.c == fsb.c && this.d == fsb.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Integer.hashCode(this.d) + rae.h(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PreProcessedAnimojiData(emoji=" + this.a + ", drawable=" + this.b + ", from=" + this.c + ", to=" + this.d + ")";
    }
}
