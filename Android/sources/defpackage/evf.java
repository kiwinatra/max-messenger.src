package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: evf  reason: default package */
public final class evf {
    public final CharSequence a;
    public final CharSequence b;
    public final l21 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public evf(CharSequence charSequence, String str, l21 l21, boolean z, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = str;
        this.c = l21;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evf)) {
            return false;
        }
        evf evf = (evf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) evf.a) && Intrinsics.areEqual((Object) this.b, (Object) evf.b) && Intrinsics.areEqual((Object) this.c, (Object) evf.c) && this.d == evf.d && this.e == evf.e && this.f == evf.f;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        l21 l21 = this.c;
        if (l21 != null) {
            i = l21.hashCode();
        }
        return Boolean.hashCode(this.f) + g63.e(g63.e((hashCode2 + i) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "UnavailableCallState(callDescription=" + this.a + ", callStateStatus=" + this.b + ", chatInfo=" + this.c + ", isCallBackAvailable=" + this.d + ", isVideoCall=" + this.e + ", isPrivacyReason=" + this.f + ")";
    }
}
