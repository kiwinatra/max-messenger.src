package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import one.me.rlottie.RLottieDrawable;

/* renamed from: e15  reason: default package */
public final class e15 {
    public final int a;
    public final int b;
    public final CharSequence c;
    public final List d;
    public final CharSequence e;
    public final String f;
    public final RLottieDrawable g;

    public e15(int i, int i2, CharSequence charSequence, List list, CharSequence charSequence2, String str, RLottieDrawable rLottieDrawable) {
        this.a = i;
        this.b = i2;
        this.c = charSequence;
        this.d = list;
        this.e = charSequence2;
        this.f = str;
        this.g = rLottieDrawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) e15.class, (Object) obj.getClass())) {
            return false;
        }
        e15 e15 = (e15) obj;
        if (this.a == e15.a && this.b == e15.b && Intrinsics.areEqual((Object) this.c, (Object) e15.c)) {
            return Intrinsics.areEqual((Object) this.d, (Object) e15.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "Emoji(groupIndex=" + this.a + ", indexInGroup=" + this.b + ", defaultValue=" + this.c + ", values=" + this.d + ", animatableValue=" + this.e + ", staticUrl=" + this.f + ", lottieDrawable=" + this.g + ")";
    }

    public e15(int i, CharSequence charSequence, List list) {
        this(0, i, charSequence, list, (CharSequence) null, (String) null, (RLottieDrawable) null);
    }
}
