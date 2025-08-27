package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: iw7  reason: default package */
public final class iw7 extends jw7 {
    public final long a;
    public final Long b;
    public final Long c;
    public final cs3 d;
    public final gv6 e;
    public final d4g f;
    public final Long g;
    public final String h;

    public iw7(long j, Long l, Long l2, cs3 cs3, gv6 gv6, d4g d4g, Long l3, String str) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = cs3;
        this.e = gv6;
        this.f = d4g;
        this.g = l3;
        this.h = str;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw7)) {
            return false;
        }
        iw7 iw7 = (iw7) obj;
        return this.a == iw7.a && Intrinsics.areEqual((Object) this.b, (Object) iw7.b) && Intrinsics.areEqual((Object) this.c, (Object) iw7.c) && Intrinsics.areEqual((Object) this.d, (Object) iw7.d) && Intrinsics.areEqual((Object) this.e, (Object) iw7.e) && Intrinsics.areEqual((Object) this.f, (Object) iw7.f) && Intrinsics.areEqual((Object) this.g, (Object) iw7.g) && Intrinsics.areEqual((Object) this.h, (Object) iw7.h);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        cs3 cs3 = this.d;
        int hashCode4 = (hashCode3 + (cs3 == null ? 0 : cs3.hashCode())) * 31;
        gv6 gv6 = this.e;
        int hashCode5 = (hashCode4 + (gv6 == null ? 0 : gv6.hashCode())) * 31;
        d4g d4g = this.f;
        int hashCode6 = (hashCode5 + (d4g == null ? 0 : d4g.hashCode())) * 31;
        Long l3 = this.g;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "SuccessLinkInfo(requestId=" + this.a + ", chatId=" + this.b + ", messageId=" + this.c + ", contactSearchResult=" + this.d + ", groupChatInfo=" + this.e + ", videoConference=" + this.f + ", stickerSetId=" + this.g + ", startPayload=" + this.h + ")";
    }
}
