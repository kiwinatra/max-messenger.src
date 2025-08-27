package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: mj5  reason: default package */
public final class mj5 {
    public final long a;
    public final long b;
    public final pj5 c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final boolean l;
    public final boolean m;

    public mj5(long j2, long j3, pj5 pj5, String str, String str2, long j4, long j5, String str3, long j6, String str4, String str5, boolean z, boolean z2) {
        this.a = j2;
        this.b = j3;
        this.c = pj5;
        this.d = str;
        this.e = str2;
        this.f = j4;
        this.g = j5;
        this.h = str3;
        this.i = j6;
        this.j = str4;
        this.k = str5;
        this.l = z;
        this.m = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj5)) {
            return false;
        }
        mj5 mj5 = (mj5) obj;
        return this.a == mj5.a && this.b == mj5.b && this.c == mj5.c && Intrinsics.areEqual((Object) this.d, (Object) mj5.d) && Intrinsics.areEqual((Object) this.e, (Object) mj5.e) && this.f == mj5.f && this.g == mj5.g && Intrinsics.areEqual((Object) this.h, (Object) mj5.h) && this.i == mj5.i && Intrinsics.areEqual((Object) this.j, (Object) mj5.j) && Intrinsics.areEqual((Object) this.k, (Object) mj5.k) && this.l == mj5.l && this.m == mj5.m;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + wzf.i(Long.hashCode(this.a) * 31, 31, this.b)) * 31;
        int i2 = 0;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int i3 = wzf.i(g63.d(wzf.i(wzf.i((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        String str3 = this.j;
        int hashCode3 = (i3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return Boolean.hashCode(this.m) + g63.e((hashCode3 + i2) * 31, 31, this.l);
    }

    public final String toString() {
        dbe.w.getClass();
        StringBuilder sb = new StringBuilder("FcmNotification(chatServerId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", fcmNotificationType=");
        sb.append(this.c);
        sb.append(", chatTitle=");
        sb.append(this.d);
        sb.append(", senderUserName=");
        sb.append(this.e);
        sb.append(", senderUserId=");
        sb.append(this.f);
        sb.append(", time=");
        sb.append(this.g);
        sb.append(", text=");
        sb.append("***");
        sb.append(", pushId=");
        sb.append(this.i);
        sb.append(", eventLey=");
        sb.append(this.j);
        sb.append(", largeImageUrl=");
        sb.append(this.k);
        sb.append(", isScheduledMessage=");
        sb.append(this.l);
        sb.append(", hasAnyError=");
        return tr1.m(sb, this.m, ")");
    }
}
