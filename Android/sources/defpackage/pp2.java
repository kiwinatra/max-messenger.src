package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pp2  reason: default package */
public final class pp2 extends ykd {
    public final boolean A0;
    public final boolean B0;
    public final boolean C0 = false;
    public final CharSequence D0;
    public final boolean E0;
    public final int F0;
    public final long G0;
    public final h42 X;
    public final Uri Y;
    public final long Z;
    public final long c;
    public final boolean o;
    public final boolean v;
    public final isb v0;
    public final boolean w;
    public final CharSequence w0;
    public final boolean x;
    public final List x0;
    public final CharSequence y;
    public final boolean y0;
    public final int z;
    public final boolean z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public pp2(long r7, boolean r9, boolean r10, boolean r11, boolean r12, java.lang.String r13, int r14, defpackage.h42 r15, android.net.Uri r16, long r17, defpackage.isb r19, java.lang.CharSequence r20, java.util.List r21, boolean r22, boolean r23, boolean r24, boolean r25, java.lang.CharSequence r26, boolean r27) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r3 = r21
            xkd r4 = defpackage.xkd.a
            r6.<init>(r4, r3)
            r0.c = r1
            r4 = r9
            r0.o = r4
            r4 = r10
            r0.v = r4
            r4 = r11
            r0.w = r4
            r4 = r12
            r0.x = r4
            r4 = r13
            r0.y = r4
            r4 = r14
            r0.z = r4
            r4 = r15
            r0.X = r4
            r4 = r16
            r0.Y = r4
            r4 = r17
            r0.Z = r4
            r4 = r19
            r0.v0 = r4
            r4 = r20
            r0.w0 = r4
            r0.x0 = r3
            r3 = r22
            r0.y0 = r3
            r3 = r23
            r0.z0 = r3
            r3 = r24
            r0.A0 = r3
            r3 = r25
            r0.B0 = r3
            r3 = 0
            r0.C0 = r3
            r3 = r26
            r0.D0 = r3
            r3 = r27
            r0.E0 = r3
            int r3 = defpackage.hra.l
            r0.F0 = r3
            r0.G0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp2.<init>(long, boolean, boolean, boolean, boolean, java.lang.String, int, h42, android.net.Uri, long, isb, java.lang.CharSequence, java.util.List, boolean, boolean, boolean, boolean, java.lang.CharSequence, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp2)) {
            return false;
        }
        pp2 pp2 = (pp2) obj;
        return this.c == pp2.c && this.o == pp2.o && this.v == pp2.v && this.w == pp2.w && this.x == pp2.x && Intrinsics.areEqual((Object) this.y, (Object) pp2.y) && this.z == pp2.z && this.X == pp2.X && Intrinsics.areEqual((Object) this.Y, (Object) pp2.Y) && this.Z == pp2.Z && Intrinsics.areEqual((Object) this.v0, (Object) pp2.v0) && Intrinsics.areEqual((Object) this.w0, (Object) pp2.w0) && Intrinsics.areEqual((Object) this.x0, (Object) pp2.x0) && this.y0 == pp2.y0 && this.z0 == pp2.z0 && this.A0 == pp2.A0 && this.B0 == pp2.B0 && this.C0 == pp2.C0 && Intrinsics.areEqual((Object) this.D0, (Object) pp2.D0) && this.E0 == pp2.E0;
    }

    public final long getItemId() {
        return this.G0;
    }

    public final boolean h(ykd ykd) {
        return Intrinsics.areEqual((Object) this, (Object) (pp2) ykd);
    }

    public final int hashCode() {
        int e = g63.e(g63.e(g63.e(g63.e(Long.hashCode(this.c) * 31, 31, this.o), 31, this.v), 31, this.w), 31, this.x);
        int i = 0;
        CharSequence charSequence = this.y;
        int hashCode = (this.X.hashCode() + rae.h(this.z, (e + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31)) * 31;
        Uri uri = this.Y;
        int hashCode2 = (this.v0.hashCode() + wzf.i((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.Z)) * 31;
        CharSequence charSequence2 = this.w0;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return Boolean.hashCode(this.E0) + wj6.e(this.D0, g63.e(g63.e(g63.e(g63.e(g63.e(rae.i(this.x0, (hashCode2 + i) * 31, 31), 31, this.y0), 31, this.z0), 31, this.A0), 31, this.B0), 31, this.C0), 31);
    }

    public final int i() {
        return this.F0;
    }

    public final boolean n(ykd ykd) {
        return ykd.getItemId() == this.G0;
    }

    public final String toString() {
        String y2 = vzg.y(this.v0.a);
        String y3 = vzg.y(this.w0);
        String p = CollectionsKt___CollectionsKt.joinToString$default(this.x0, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new gl1(19), 31, (Object) null);
        StringBuilder sb = new StringBuilder("ChatSearchModel(id=");
        sb.append(this.c);
        sb.append(", viewType=");
        sb.append(this.F0);
        sb.append(", itemId=");
        sb.append(this.G0);
        sb.append(", isPinned=");
        sb.append(this.o);
        sb.append(", isMuted=");
        sb.append(this.v);
        sb.append(", hasUnreadReplyOrMention=");
        sb.append(this.w);
        sb.append(", hasReaction=");
        sb.append(this.x);
        sb.append(", lastMessageTime=");
        sb.append(this.y);
        sb.append(", unreadCount=");
        sb.append(this.z);
        sb.append(", status=");
        sb.append(this.X);
        sb.append(", avatar=");
        sb.append(this.Y);
        sb.append(", avatarSourceId=");
        sb.append(this.Z);
        sb.append(", preProcessedChatTitle=");
        sb.append(y2);
        sb.append(", subtitle=");
        sb.append(y3);
        sb.append(", titleHighlights=");
        sb.append(p);
        sb.append(", isChannel=");
        sb.append(this.y0);
        sb.append(", highlightTitle=");
        sb.append(this.z0);
        sb.append(", highlightLink=");
        sb.append(this.A0);
        sb.append(", highlightContactName=");
        sb.append(this.B0);
        sb.append(", selected=");
        sb.append(this.C0);
        sb.append(", abbreviation=*, isVerified=");
        return tr1.m(sb, this.E0, ")");
    }
}
