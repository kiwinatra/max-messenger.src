package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: og0  reason: default package */
public final class og0 {
    public final Drawable a;
    public final int b;
    public final int c;
    public final float d;

    public og0(GradientDrawable gradientDrawable, int i, float f, int i2) {
        f = (i2 & 8) != 0 ? 12.0f : f;
        this.a = gradientDrawable;
        this.b = i;
        this.c = 20;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og0)) {
            return false;
        }
        og0 og0 = (og0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) og0.a) && this.b == og0.b && this.c == og0.c && Float.compare(this.d, og0.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + rae.h(this.c, rae.h(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Style(backgroundDrawable=" + this.a + ", width=" + this.b + ", height=" + this.c + ", textSize=" + this.d + ")";
    }
}
