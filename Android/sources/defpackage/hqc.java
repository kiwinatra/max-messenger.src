package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hqc  reason: default package */
public final class hqc implements Comparable, CharSequence, Serializable {
    public final CharSequence a;

    public hqc(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    public final int compareTo(Object obj) {
        return this.a.toString().compareTo(((hqc) obj).a.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqc)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a.toString(), (Object) ((hqc) obj).a.toString());
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + hqc.class.hashCode();
    }

    public final int length() {
        return this.a.length();
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    public final String toString() {
        return this.a.toString();
    }
}
