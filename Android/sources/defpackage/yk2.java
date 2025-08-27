package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yk2  reason: default package */
public final class yk2 {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final zk2 e;
    public final List f;
    public final List g;
    public final Bitmap h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final String n;
    public final long o;

    public yk2(long j2, String str, long j3, String str2, zk2 zk2, List list, List list2, Bitmap bitmap, int i2, boolean z, boolean z2, long j4, long j5, String str3, long j6) {
        this.a = j2;
        this.b = str;
        this.c = j3;
        this.d = str2;
        this.e = zk2;
        this.f = list;
        this.g = list2;
        this.h = bitmap;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = j4;
        this.m = j5;
        this.n = str3;
        this.o = j6;
    }

    public static yk2 a(yk2 yk2, List list, List list2, boolean z, int i2) {
        yk2 yk22 = yk2;
        int i3 = i2;
        long j2 = yk22.a;
        String str = yk22.b;
        long j3 = yk22.c;
        String str2 = yk22.d;
        zk2 zk2 = yk22.e;
        List list3 = (i3 & 32) != 0 ? yk22.f : list;
        List list4 = (i3 & 64) != 0 ? yk22.g : list2;
        Bitmap bitmap = yk22.h;
        int i4 = (i3 & 256) != 0 ? yk22.i : 0;
        boolean z2 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? yk22.j : z;
        boolean z3 = yk22.k;
        long j4 = yk22.l;
        long j5 = yk22.m;
        String str3 = yk22.n;
        long j6 = j5;
        long j7 = yk22.o;
        yk2.getClass();
        return new yk2(j2, str, j3, str2, zk2, list3, list4, bitmap, i4, z2, z3, j4, j6, str3, j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yk2)) {
            return false;
        }
        yk2 yk2 = (yk2) obj;
        return this.a == yk2.a && Intrinsics.areEqual((Object) this.b, (Object) yk2.b) && this.c == yk2.c && Intrinsics.areEqual((Object) this.d, (Object) yk2.d) && this.e == yk2.e && Intrinsics.areEqual((Object) this.f, (Object) yk2.f) && Intrinsics.areEqual((Object) this.g, (Object) yk2.g) && Intrinsics.areEqual((Object) this.h, (Object) yk2.h) && this.i == yk2.i && this.j == yk2.j && this.k == yk2.k && this.l == yk2.l && this.m == yk2.m && Intrinsics.areEqual((Object) this.n, (Object) yk2.n) && this.o == yk2.o;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int i3 = rae.i(this.g, rae.i(this.f, (this.e.hashCode() + g63.d(wzf.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31), 31);
        Bitmap bitmap = this.h;
        int i4 = wzf.i(wzf.i(g63.e(g63.e(rae.h(this.i, (i3 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Long.hashCode(this.o) + ((i4 + i2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatNotification(pushId=");
        sb.append(this.a);
        sb.append(", eventKey=");
        sb.append(this.b);
        sb.append(", chatServerId=");
        sb.append(this.c);
        sb.append(", chatTitle=");
        sb.append(this.d);
        sb.append(", chatNotificationType=");
        sb.append(this.e);
        sb.append(", displayMessages=");
        sb.append(this.f);
        sb.append(", droppedMessages=");
        sb.append(this.g);
        sb.append(", chatIcon=");
        sb.append(this.h);
        sb.append(", totalUnreadMessagesCount=");
        sb.append(this.i);
        sb.append(", needNotify=");
        sb.append(this.j);
        sb.append(", showNotificationText=");
        sb.append(this.k);
        sb.append(", lastMessageId=");
        sb.append(this.l);
        sb.append(", lastMessageDate=");
        sb.append(this.m);
        sb.append(", pushType=");
        sb.append(this.n);
        sb.append(", createdTime=");
        return wj6.m(sb, this.o, ")");
    }
}
