package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dg1  reason: default package */
public final class dg1 {
    public final Integer a;
    public final qi7 b;
    public final CharSequence c;

    public dg1(Integer num, qi7 qi7, CharSequence charSequence) {
        this.a = num;
        this.b = qi7;
        this.c = charSequence;
    }

    public static dg1 a(dg1 dg1, Integer num, ez9 ez9, CharSequence charSequence, int i) {
        if ((i & 1) != 0) {
            num = dg1.a;
        }
        qi7 qi7 = ez9;
        if ((i & 2) != 0) {
            qi7 = dg1.b;
        }
        if ((i & 4) != 0) {
            charSequence = dg1.c;
        }
        dg1.getClass();
        return new dg1(num, qi7, charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg1)) {
            return false;
        }
        dg1 dg1 = (dg1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) dg1.a) && Intrinsics.areEqual((Object) this.b, (Object) dg1.b) && Intrinsics.areEqual((Object) this.c, (Object) dg1.c);
    }

    public final int hashCode() {
        int i = 0;
        Integer num = this.a;
        int hashCode = (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "State(selectedEmoji=" + this.a + ", selectedReasons=" + this.b + ", otherReasonText=" + this.c + ")";
    }
}
