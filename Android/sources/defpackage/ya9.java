package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ya9  reason: default package */
public final class ya9 {
    public final int A;
    public final long B;
    public final int C;
    public final int D;
    public final long E;
    public final List F;
    public final xd9 G;
    public final Long H;
    public final Boolean I;
    public final int J;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final oa9 h;
    public final qe9 i;
    public final long j;
    public final String k;
    public final String l;
    public final w28 m;
    public final int n;
    public final boolean o;
    public final int p;
    public final long q;
    public final boolean r;
    public final long s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public ya9(long j2, long j3, long j4, long j5, long j6, long j7, String str, oa9 oa9, qe9 qe9, long j8, String str2, String str3, w28 w28, int i2, boolean z2, int i3, long j9, boolean z3, long j10, String str4, String str5, long j11, long j12, int i4, long j13, int i5, int i6, int i7, long j14, int i8, int i9, long j15, List list, xd9 xd9, Long l2, Boolean bool) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = str;
        this.h = oa9;
        this.i = qe9;
        this.j = j8;
        this.k = str2;
        this.l = str3;
        this.m = w28;
        this.n = i2;
        this.o = z2;
        this.p = i3;
        this.q = j9;
        this.r = z3;
        this.s = j10;
        this.t = str4;
        this.u = str5;
        this.v = j11;
        this.w = j12;
        this.J = i4;
        this.x = j13;
        this.y = i5;
        this.z = i6;
        this.A = i7;
        this.B = j14;
        this.C = i8;
        this.D = i9;
        this.E = j15;
        this.F = list;
        this.G = xd9;
        this.H = l2;
        this.I = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya9)) {
            return false;
        }
        ya9 ya9 = (ya9) obj;
        return this.a == ya9.a && this.b == ya9.b && this.c == ya9.c && this.d == ya9.d && this.e == ya9.e && this.f == ya9.f && Intrinsics.areEqual((Object) this.g, (Object) ya9.g) && this.h == ya9.h && this.i == ya9.i && this.j == ya9.j && Intrinsics.areEqual((Object) this.k, (Object) ya9.k) && Intrinsics.areEqual((Object) this.l, (Object) ya9.l) && Intrinsics.areEqual((Object) this.m, (Object) ya9.m) && this.n == ya9.n && this.o == ya9.o && this.p == ya9.p && this.q == ya9.q && this.r == ya9.r && this.s == ya9.s && Intrinsics.areEqual((Object) this.t, (Object) ya9.t) && Intrinsics.areEqual((Object) this.u, (Object) ya9.u) && this.v == ya9.v && this.w == ya9.w && this.J == ya9.J && this.x == ya9.x && this.y == ya9.y && this.z == ya9.z && this.A == ya9.A && this.B == ya9.B && this.C == ya9.C && this.D == ya9.D && this.E == ya9.E && Intrinsics.areEqual((Object) this.F, (Object) ya9.F) && Intrinsics.areEqual((Object) this.G, (Object) ya9.G) && Intrinsics.areEqual((Object) this.H, (Object) ya9.H) && Intrinsics.areEqual((Object) this.I, (Object) ya9.I);
    }

    public final int hashCode() {
        int i2 = wzf.i(wzf.i(wzf.i(wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int i3 = 0;
        String str = this.g;
        int i4 = wzf.i((this.i.hashCode() + ((this.h.hashCode() + ((i2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.j);
        String str2 = this.k;
        int hashCode = (i4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        w28 w28 = this.m;
        int i5 = wzf.i(g63.e(wzf.i(rae.h(this.p, g63.e(rae.h(this.n, (hashCode2 + (w28 == null ? 0 : w28.hashCode())) * 31, 31), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s);
        String str4 = this.t;
        int hashCode3 = (i5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int i6 = rae.i(this.F, wzf.i(rae.h(this.D, rae.h(this.C, wzf.i(rae.h(this.A, rae.h(this.z, rae.h(this.y, wzf.i((tr1.y(this.J) + wzf.i(wzf.i((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.v), 31, this.w)) * 31, 31, this.x), 31), 31), 31), 31, this.B), 31), 31), 31, this.E), 31);
        xd9 xd9 = this.G;
        int hashCode4 = (i6 + (xd9 == null ? 0 : xd9.hashCode())) * 31;
        Long l2 = this.H;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.I;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return hashCode5 + i3;
    }

    public final String toString() {
        return "MessageEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", updateTime=" + this.d + ", sender=" + this.e + ", cid=" + this.f + ", text=" + this.g + ", deliveryStatus=" + this.h + ", status=" + this.i + ", timeLocal=" + this.j + ", error=" + this.k + ", localizedError=" + this.l + ", attaches=" + this.m + ", mediaType=" + this.n + ", detectShare=" + this.o + ", messagesLinkType=" + this.p + ", messagesLinkId=" + this.q + ", insertedFromMessageLink=" + this.r + ", messagesLinkChatId=" + this.s + ", messageLinkChatName=" + this.t + ", messageLinkChatLink=" + this.u + ", messageLinkOutChatId=" + this.v + ", messageLinkOutMessageId=" + this.w + ", type=" + wj6.w(this.J) + ", chatId=" + this.x + ", ttl=" + this.y + ", channelViews=" + this.z + ", channelForwards=" + this.A + ", viewTime=" + this.B + ", zoom=" + this.C + ", options=" + this.D + ", liveUntil=" + this.E + ", elements=" + this.F + ", reactions=" + this.G + ", timeToFire=" + this.H + ", notifySender=" + this.I + ")";
    }
}
