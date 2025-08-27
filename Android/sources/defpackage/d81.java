package defpackage;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d81  reason: default package */
public final class d81 implements f81 {
    public final l21 a;
    public final boolean b;
    public final CharSequence c;

    public d81(l21 l21, boolean z, SpannableStringBuilder spannableStringBuilder) {
        this.a = l21;
        this.b = z;
        this.c = spannableStringBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d81)) {
            return false;
        }
        d81 d81 = (d81) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) d81.a) && this.b == d81.b && Intrinsics.areEqual((Object) this.c, (Object) d81.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "Calling(chatState=" + this.a + ", isVideo=" + this.b + ", callTypeDescription=" + this.c + ")";
    }
}
