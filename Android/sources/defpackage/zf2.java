package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zf2  reason: default package */
public final class zf2 {
    public final y2b a;
    public final CharSequence b;

    public zf2(y2b y2b, String str) {
        this.a = y2b;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf2)) {
            return false;
        }
        zf2 zf2 = (zf2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zf2.a) && Intrinsics.areEqual((Object) this.b, (Object) zf2.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatMediaTabsViewState(avatarParams=" + this.a + ", chatName=" + this.b + ")";
    }
}
