package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gd8  reason: default package */
public final class gd8 {
    public final zd0 a;
    public final CharSequence b;
    public final ze1 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final o0g g;
    public final boolean h;
    public final lge i;
    public final CharSequence j;
    public final String k;

    public gd8(zd0 zd0, CharSequence charSequence, ze1 ze1, boolean z, boolean z2, boolean z3, o0g o0g, boolean z4, lge lge, CharSequence charSequence2, String str) {
        this.a = zd0;
        this.b = charSequence;
        this.c = ze1;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = o0g;
        this.h = z4;
        this.i = lge;
        this.j = charSequence2;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd8)) {
            return false;
        }
        gd8 gd8 = (gd8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) gd8.a) && Intrinsics.areEqual((Object) this.b, (Object) gd8.b) && Intrinsics.areEqual((Object) this.c, (Object) gd8.c) && this.d == gd8.d && this.e == gd8.e && this.f == gd8.f && Intrinsics.areEqual((Object) this.g, (Object) gd8.g) && this.h == gd8.h && this.i == gd8.i && Intrinsics.areEqual((Object) this.j, (Object) gd8.j) && Intrinsics.areEqual((Object) this.k, (Object) gd8.k);
    }

    public final int hashCode() {
        int i2 = 0;
        zd0 zd0 = this.a;
        int hashCode = (zd0 == null ? 0 : zd0.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ze1 ze1 = this.c;
        int e2 = g63.e(g63.e(g63.e((hashCode2 + (ze1 == null ? 0 : ze1.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        o0g o0g = this.g;
        int hashCode3 = (this.i.hashCode() + g63.e((e2 + (o0g == null ? 0 : o0g.hashCode())) * 31, 31, this.h)) * 31;
        CharSequence charSequence2 = this.j;
        int hashCode4 = (hashCode3 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.k;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainSpeakerState(avatar=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.c);
        sb.append(", isTalking=");
        sb.append(this.d);
        sb.append(", isConnectedOnce=");
        sb.append(this.e);
        sb.append(", isConnecting=");
        sb.append(this.f);
        sb.append(", videoState=");
        sb.append(this.g);
        sb.append(", isMe=");
        sb.append(this.h);
        sb.append(", talkingState=");
        sb.append(this.i);
        sb.append(", label=");
        sb.append(this.j);
        sb.append(", userNameAccessibility=");
        return wj6.n(sb, this.k, ")");
    }
}
