package defpackage;

import android.text.SpannableStringBuilder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ga1  reason: default package */
public final class ga1 extends ka1 {
    public final CharSequence a;
    public final String b;

    public ga1(SpannableStringBuilder spannableStringBuilder, String str) {
        this.a = spannableStringBuilder;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga1)) {
            return false;
        }
        ga1 ga1 = (ga1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ga1.a) && Intrinsics.areEqual((Object) this.b, (Object) ga1.b);
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Name(name=" + this.a + ", accessibility=" + this.b + ")";
    }
}
