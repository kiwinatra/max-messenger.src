package defpackage;

import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6f  reason: default package */
public final class j6f {
    public final GradientDrawable a;
    public final GradientDrawable b;
    public final GradientDrawable c;
    public final GradientDrawable d;

    public j6f(GradientDrawable gradientDrawable, GradientDrawable gradientDrawable2, GradientDrawable gradientDrawable3, GradientDrawable gradientDrawable4) {
        this.a = gradientDrawable;
        this.b = gradientDrawable2;
        this.c = gradientDrawable3;
        this.d = gradientDrawable4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6f)) {
            return false;
        }
        j6f j6f = (j6f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) j6f.a) && Intrinsics.areEqual((Object) this.b, (Object) j6f.b) && Intrinsics.areEqual((Object) this.c, (Object) j6f.c) && Intrinsics.areEqual((Object) this.d, (Object) j6f.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StateDrawable(enabledChecked=" + this.a + ", enabledUnchecked=" + this.b + ", disabledChecked=" + this.c + ", disabledUnchecked=" + this.d + ")";
    }
}
