package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: azb  reason: default package */
public final class azb {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final zyb g;

    public azb(String str, long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, zyb zyb) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = z2;
        this.g = zyb;
    }

    public static azb a(azb azb, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = azb.a;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = azb.e;
        }
        return new azb(str2, azb.b, azb.c, azb.d, z, azb.f, azb.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azb)) {
            return false;
        }
        azb azb = (azb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) azb.a) && this.b == azb.b && Intrinsics.areEqual((Object) this.c, (Object) azb.c) && Intrinsics.areEqual((Object) this.d, (Object) azb.d) && this.e == azb.e && this.f == azb.f && this.g == azb.g;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int i2 = wzf.i((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (i2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return this.g.hashCode() + g63.e(g63.e((hashCode + i) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "ProfileEditAppBarState(avatarUrl=" + this.a + ", avatarSourceId=" + this.b + ", firstName=" + this.c + ", abbreviation=" + this.d + ", showAcceptChanges=" + this.e + ", showAddPhoto=" + this.f + ", confirmType=" + this.g + ")";
    }
}
