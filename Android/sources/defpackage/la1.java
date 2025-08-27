package defpackage;

import android.text.SpannableStringBuilder;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: la1  reason: default package */
public final class la1 implements na1 {
    public final boolean X;
    public final boolean Y;
    public final boolean Z;
    public final ze1 a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final zd0 v;
    public final o0g v0;
    public final boolean w;
    public final p0g w0;
    public final boolean x;
    public final ca1 x0;
    public final boolean y;
    public final lge y0;
    public final boolean z;

    public la1(ze1 ze1, String str, SpannableStringBuilder spannableStringBuilder, String str2, zd0 zd0, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, o0g o0g, p0g p0g, ca1 ca1, lge lge) {
        this.a = ze1;
        this.b = str;
        this.c = spannableStringBuilder;
        this.o = str2;
        this.v = zd0;
        this.w = z2;
        this.x = z3;
        this.y = z4;
        this.z = z5;
        this.X = z6;
        this.Y = z7;
        this.Z = z8;
        this.v0 = o0g;
        this.w0 = p0g;
        this.x0 = ca1;
        this.y0 = lge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la1)) {
            return false;
        }
        la1 la1 = (la1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) la1.a) && Intrinsics.areEqual((Object) this.b, (Object) la1.b) && Intrinsics.areEqual((Object) this.c, (Object) la1.c) && Intrinsics.areEqual((Object) this.o, (Object) la1.o) && Intrinsics.areEqual((Object) this.v, (Object) la1.v) && this.w == la1.w && this.x == la1.x && this.y == la1.y && this.z == la1.z && this.X == la1.X && this.Y == la1.Y && this.Z == la1.Z && Intrinsics.areEqual((Object) this.v0, (Object) la1.v0) && this.w0 == la1.w0 && this.x0 == la1.x0 && this.y0 == la1.y0;
    }

    public final boolean f(lz7 lz7) {
        return this.a.a == lz7.getItemId();
    }

    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str2 = this.o;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        zd0 zd0 = this.v;
        int e = g63.e(g63.e(g63.e(g63.e(g63.e(g63.e(g63.e((hashCode4 + (zd0 == null ? 0 : zd0.hashCode())) * 31, 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.X), 31, this.Y), 31, this.Z);
        o0g o0g = this.v0;
        if (o0g != null) {
            i = o0g.hashCode();
        }
        return this.y0.hashCode() + ((this.x0.hashCode() + ((this.w0.hashCode() + ((e + i) * 31)) * 31)) * 31);
    }

    public final int i() {
        return 1;
    }

    public final Object l(Object obj) {
        la1 la1 = (la1) ((lz7) obj);
        List createListBuilder = CollectionsKt.createListBuilder();
        CharSequence charSequence = this.c;
        CharSequence charSequence2 = la1.c;
        boolean areEqual = Intrinsics.areEqual((Object) charSequence, (Object) charSequence2);
        String str = la1.o;
        if (!areEqual || !Intrinsics.areEqual((Object) this.o, (Object) str)) {
            createListBuilder.add(new ga1((SpannableStringBuilder) charSequence2, str));
        }
        ca1 ca1 = this.x0;
        ca1 ca12 = la1.x0;
        if (ca1 != ca12) {
            createListBuilder.add(new ha1(ca12));
        }
        boolean z2 = this.x;
        boolean z3 = la1.x;
        if (z2 != z3) {
            createListBuilder.add(new fa1(z3));
        }
        boolean z4 = this.w;
        boolean z5 = la1.w;
        if (z4 != z5) {
            createListBuilder.add(new ia1(z5));
        }
        zd0 zd0 = this.v;
        zd0 zd02 = la1.v;
        if (!Intrinsics.areEqual((Object) zd0, (Object) zd02)) {
            createListBuilder.add(new da1(zd02));
        }
        p0g p0g = this.w0;
        p0g p0g2 = la1.w0;
        if (p0g != p0g2) {
            createListBuilder.add(new ea1(p0g2));
        }
        o0g o0g = this.v0;
        o0g o0g2 = la1.v0;
        if (!Intrinsics.areEqual((Object) o0g, (Object) o0g2)) {
            createListBuilder.add(new ja1(o0g2));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final String toString() {
        return "CallOpponentState(opponentId=" + this.a + ", userName=" + this.b + ", userNameWithState=" + this.c + ", userNameAccessibility=" + this.o + ", avatar=" + this.v + ", isTalking=" + this.w + ", isConnecting=" + this.x + ", isVideoEnabled=" + this.y + ", isMicrophoneEnabled=" + this.z + ", isMe=" + this.X + ", isAdmin=" + this.Y + ", isCreator=" + this.Z + ", videoState=" + this.v0 + ", buttonAction=" + this.w0 + ", networkState=" + this.x0 + ", talkingState=" + this.y0 + ")";
    }
}
