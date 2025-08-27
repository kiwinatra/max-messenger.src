package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v4b  reason: default package */
public final class v4b {
    public final zd0 a;
    public final String b;
    public final ze1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final o0g g;
    public final p0g h;
    public final boolean i;
    public final CharSequence j;

    public v4b(zd0 zd0, String str, ze1 ze1, boolean z, boolean z2, boolean z3, o0g o0g, p0g p0g, boolean z4, CharSequence charSequence) {
        this.a = zd0;
        this.b = str;
        this.c = ze1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = o0g;
        this.h = p0g;
        this.i = z4;
        this.j = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4b)) {
            return false;
        }
        v4b v4b = (v4b) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) v4b.a) && Intrinsics.areEqual((Object) this.b, (Object) v4b.b) && Intrinsics.areEqual((Object) this.c, (Object) v4b.c) && this.d == v4b.d && this.e == v4b.e && this.f == v4b.f && Intrinsics.areEqual((Object) this.g, (Object) v4b.g) && this.h == v4b.h && this.i == v4b.i && Intrinsics.areEqual((Object) this.j, (Object) v4b.j);
    }

    public final int hashCode() {
        int i2 = 0;
        zd0 zd0 = this.a;
        int hashCode = (zd0 == null ? 0 : zd0.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ze1 ze1 = this.c;
        int e2 = g63.e(g63.e(g63.e((hashCode2 + (ze1 == null ? 0 : ze1.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        o0g o0g = this.g;
        int e3 = g63.e((this.h.hashCode() + ((e2 + (o0g == null ? 0 : o0g.hashCode())) * 31)) * 31, 31, this.i);
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return e3 + i2;
    }

    public final String toString() {
        return "OpponentPipState(avatar=" + this.a + ", name=" + this.b + ", id=" + this.c + ", isTalking=" + this.d + ", isMicrophoneEnabled=" + this.e + ", isConnecting=" + this.f + ", videoState=" + this.g + ", action=" + this.h + ", isMe=" + this.i + ", userNameWithState=" + this.j + ")";
    }
}
