package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: njb  reason: default package */
public final class njb {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final CharSequence e;

    public njb(long j, long j2, CharSequence charSequence, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njb)) {
            return false;
        }
        njb njb = (njb) obj;
        return this.a == njb.a && this.b == njb.b && Intrinsics.areEqual((Object) this.c, (Object) njb.c) && Intrinsics.areEqual((Object) this.d, (Object) njb.d) && Intrinsics.areEqual((Object) this.e, (Object) njb.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + g63.d(g63.d(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "PickerChip(id=" + this.a + ", avatarSourceId=" + this.b + ", title=" + this.c + ", avatarUrl=" + this.d + ", abbreviation=" + this.e + ")";
    }
}
