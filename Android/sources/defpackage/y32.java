package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y32  reason: default package */
public final class y32 implements lz7 {
    public final Boolean a;
    public final kf0 b;
    public final Drawable c;
    public final Drawable o;

    public y32(Boolean bool, kf0 kf0, Drawable drawable, Drawable drawable2) {
        this.a = bool;
        this.b = kf0;
        this.c = drawable;
        this.o = drawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y32)) {
            return false;
        }
        y32 y32 = (y32) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y32.a) && Intrinsics.areEqual((Object) this.b, (Object) y32.b) && Intrinsics.areEqual((Object) this.c, (Object) y32.c) && Intrinsics.areEqual((Object) this.o, (Object) y32.o);
    }

    public final boolean f(lz7 lz7) {
        return getItemId() == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) this.b.a.hashCode();
    }

    public final int hashCode() {
        int i = 0;
        Boolean bool = this.a;
        int d = g63.d((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b.a);
        Drawable drawable = this.c;
        int hashCode = (d + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            i = drawable2.hashCode();
        }
        return hashCode + i;
    }

    public final int i() {
        return 0;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        y32 y32 = lz7 instanceof y32 ? (y32) lz7 : null;
        if (y32 == null) {
            return null;
        }
        Boolean bool = this.a;
        Boolean bool2 = y32.a;
        if (!Intrinsics.areEqual((Object) bool, (Object) bool2)) {
            return new x32(bool2);
        }
        return null;
    }

    public final String toString() {
        return "ChatBackground(isSelected=" + this.a + ", backgroundId=" + this.b + ", drawable=" + this.c + ", previewDrawable=" + this.o + ")";
    }
}
