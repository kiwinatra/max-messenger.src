package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yh2  reason: default package */
public final class yh2 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final xh2 d;

    public yh2(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, xh2 xh2) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = xh2;
    }

    public static yh2 a(yh2 yh2, xh2 xh2) {
        CharSequence charSequence = yh2.a;
        CharSequence charSequence2 = yh2.b;
        CharSequence charSequence3 = yh2.c;
        yh2.getClass();
        return new yh2(charSequence, charSequence2, charSequence3, xh2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh2)) {
            return false;
        }
        yh2 yh2 = (yh2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) yh2.a) && Intrinsics.areEqual((Object) this.b, (Object) yh2.b) && Intrinsics.areEqual((Object) this.c, (Object) yh2.c) && Intrinsics.areEqual((Object) this.d, (Object) yh2.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wj6.e(this.c, wj6.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "InfoPanelState(author=" + this.a + ", dateText=" + this.b + ", captionText=" + this.c + ", frameState=" + this.d + ")";
    }
}
