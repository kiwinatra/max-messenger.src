package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: cj5  reason: default package */
public final class cj5 {
    public final long a;
    public final long b;
    public final long c;
    public final hj5 d;
    public final Long e;
    public final long f;
    public final Long g;
    public final String h;
    public final long i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;

    public cj5(long j2, long j3, long j4, hj5 hj5, Long l2, long j5, Long l3, String str, long j6, long j7, String str2, long j8, long j9) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = hj5;
        this.e = l2;
        this.f = j5;
        this.g = l3;
        this.h = str;
        this.i = j6;
        this.j = j7;
        this.k = str2;
        this.l = j8;
        this.m = j9;
    }

    public static cj5 a(cj5 cj5) {
        cj5 cj52 = cj5;
        hj5 hj5 = hj5.SENT;
        long j2 = cj52.a;
        long j3 = cj52.b;
        long j4 = cj52.c;
        Long l2 = cj52.e;
        long j5 = cj52.f;
        Long l3 = cj52.g;
        String str = cj52.h;
        long j6 = cj52.i;
        long j7 = cj52.j;
        String str2 = cj52.k;
        long j8 = cj52.l;
        long j9 = cj52.m;
        cj5.getClass();
        return new cj5(j2, j3, j4, hj5, l2, j5, l3, str, j6, j7, str2, j8, j9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj5)) {
            return false;
        }
        cj5 cj5 = (cj5) obj;
        return this.a == cj5.a && this.b == cj5.b && this.c == cj5.c && this.d == cj5.d && Intrinsics.areEqual((Object) this.e, (Object) cj5.e) && this.f == cj5.f && Intrinsics.areEqual((Object) this.g, (Object) cj5.g) && Intrinsics.areEqual((Object) this.h, (Object) cj5.h) && this.i == cj5.i && this.j == cj5.j && Intrinsics.areEqual((Object) this.k, (Object) cj5.k) && this.l == cj5.l && this.m == cj5.m;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + wzf.i(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31;
        int i2 = 0;
        Long l2 = this.e;
        int i3 = wzf.i((hashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.f);
        Long l3 = this.g;
        int hashCode2 = (i3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Long.hashCode(this.m) + wzf.i(g63.d(wzf.i(wzf.i((hashCode2 + i2) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FcmAnalyticsEntryDb(pushId=");
        sb.append(this.a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", analyticsStatus=");
        sb.append(this.d);
        sb.append(", senderUserId=");
        sb.append(this.e);
        sb.append(", contentLength=");
        sb.append(this.f);
        sb.append(", sentTime=");
        sb.append(this.g);
        sb.append(", eventKey=");
        sb.append(this.h);
        sb.append(", fcmSentTime=");
        sb.append(this.i);
        sb.append(", receivedTime=");
        sb.append(this.j);
        sb.append(", pushType=");
        sb.append(this.k);
        sb.append(", time=");
        sb.append(this.l);
        sb.append(", createdTime=");
        return wj6.m(sb, this.m, ")");
    }
}
