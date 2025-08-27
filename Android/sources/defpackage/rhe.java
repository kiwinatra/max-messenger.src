package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rhe  reason: default package */
public final class rhe extends Drawable.ConstantState {
    public final k25 a;
    public int b;
    public final int c = 0;
    public final int d = 0;
    public final l15 e;

    public rhe(k25 k25, int i, l15 l15) {
        this.a = k25;
        this.b = i;
        this.e = l15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhe)) {
            return false;
        }
        rhe rhe = (rhe) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rhe.a) && this.b == rhe.b && this.c == rhe.c && this.d == rhe.d && Intrinsics.areEqual((Object) this.e, (Object) rhe.e);
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final int hashCode() {
        return this.e.hashCode() + rae.h(this.d, rae.h(this.c, rae.h(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final Drawable newDrawable() {
        return new qhe(this);
    }

    public final String toString() {
        int i = this.b;
        return "SpriteEmojiDrawableState(location=" + this.a + ", size=" + i + ", paddingHorizontal=" + this.c + ", paddingVertical=" + this.d + ", bitmapResolver=" + this.e + ")";
    }
}
