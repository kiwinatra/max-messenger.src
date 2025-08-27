package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: id9  reason: default package */
public final class id9 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;
    public final xd9 j;
    public final int k;
    public final long l;
    public final boolean m;
    public final long n;
    public final String o;
    public final String p;
    public final qe9 q;
    public final int r;
    public final int s;
    public final long t;
    public final int u;
    public final int v;
    public final long w;
    public final Long x;
    public final Boolean y;

    public id9(long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str, List list, xd9 xd9, int i2, long j9, boolean z, long j10, String str2, String str3, qe9 qe9, int i3, int i4, long j11, int i5, int i6, long j12, Long l2, Boolean bool) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = j8;
        this.h = str;
        this.i = list;
        this.j = xd9;
        this.k = i2;
        this.l = j9;
        this.m = z;
        this.n = j10;
        this.o = str2;
        this.p = str3;
        this.q = qe9;
        this.r = i3;
        this.s = i4;
        this.t = j11;
        this.u = i5;
        this.v = i6;
        this.w = j12;
        this.x = l2;
        this.y = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id9)) {
            return false;
        }
        id9 id9 = (id9) obj;
        return this.a == id9.a && this.b == id9.b && this.c == id9.c && this.d == id9.d && this.e == id9.e && this.f == id9.f && this.g == id9.g && Intrinsics.areEqual((Object) this.h, (Object) id9.h) && Intrinsics.areEqual((Object) this.i, (Object) id9.i) && Intrinsics.areEqual((Object) this.j, (Object) id9.j) && this.k == id9.k && this.l == id9.l && this.m == id9.m && this.n == id9.n && Intrinsics.areEqual((Object) this.o, (Object) id9.o) && Intrinsics.areEqual((Object) this.p, (Object) id9.p) && this.q == id9.q && this.r == id9.r && this.s == id9.s && this.t == id9.t && this.u == id9.u && this.v == id9.v && this.w == id9.w && Intrinsics.areEqual((Object) this.x, (Object) id9.x) && Intrinsics.areEqual((Object) this.y, (Object) id9.y);
    }

    public final int hashCode() {
        int i2 = wzf.i(wzf.i(wzf.i(wzf.i(wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        int i3 = 0;
        String str = this.h;
        int i4 = rae.i(this.i, (i2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        xd9 xd9 = this.j;
        int i5 = wzf.i(g63.e(wzf.i(rae.h(this.k, (i4 + (xd9 == null ? 0 : xd9.hashCode())) * 31, 31), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int hashCode = (i5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int i6 = wzf.i(rae.h(this.v, rae.h(this.u, wzf.i(rae.h(this.s, (tr1.y(this.r) + ((this.q.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31, 31), 31, this.t), 31), 31), 31, this.w);
        Long l2 = this.x;
        int hashCode2 = (i6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.y;
        if (bool != null) {
            i3 = bool.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "MessagePartEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", chatId=" + this.d + ", updateTime=" + this.e + ", sender=" + this.f + ", cid=" + this.g + ", text=" + this.h + ", elements=" + this.i + ", reactions=" + this.j + ", messagesLinkType=" + this.k + ", messagesLinkId=" + this.l + ", insertedFromMessageLink=" + this.m + ", messagesLinkChatId=" + this.n + ", messageLinkChatName=" + this.o + ", messageLinkChatLink=" + this.p + ", status=" + this.q + ", type=" + wj6.w(this.r) + ", ttl=" + this.s + ", viewTime=" + this.t + ", zoom=" + this.u + ", options=" + this.v + ", liveUntil=" + this.w + ", timeToFire=" + this.x + ", notifySender=" + this.y + ")";
    }
}
