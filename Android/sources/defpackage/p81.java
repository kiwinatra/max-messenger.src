package defpackage;

import android.text.SpannableString;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: p81  reason: default package */
public final class p81 {
    public static final p81 c = new p81((SpannableString) null, q81.a);
    public final CharSequence a;
    public final q81 b;

    public p81(SpannableString spannableString, q81 q81) {
        this.a = spannableString;
        this.b = q81;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p81)) {
            return false;
        }
        p81 p81 = (p81) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) p81.a) && this.b == p81.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "CallIndicatorState(title=" + this.a + ", indicatorState=" + this.b + ")";
    }
}
