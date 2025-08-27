package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y2b  reason: default package */
public final class y2b {
    public final String a;
    public final CharSequence b;
    public final long c;
    public final Drawable d = null;

    public y2b(long j, CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2b)) {
            return false;
        }
        y2b y2b = (y2b) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y2b.a) && Intrinsics.areEqual((Object) this.b, (Object) y2b.b) && this.c == y2b.c && Intrinsics.areEqual((Object) this.d, (Object) y2b.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int i2 = wzf.i(wj6.e(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        Drawable drawable = this.d;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "AvatarParams(url=" + this.a + ", abbreviationName=" + this.b + ", id=" + this.c + ", placeholder=" + this.d + ")";
    }
}
