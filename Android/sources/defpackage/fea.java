package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: fea  reason: default package */
public final class fea {
    public final Map a;
    public final vea b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;

    public fea(Map map, vea vea, int i, int i2, String str, boolean z, String str2) {
        this.a = map;
        this.b = vea;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = z;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fea)) {
            return false;
        }
        fea fea = (fea) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) fea.a) && Intrinsics.areEqual((Object) this.b, (Object) fea.b) && this.c == fea.c && this.d == fea.d && Intrinsics.areEqual((Object) this.e, (Object) fea.e) && this.f == fea.f && Intrinsics.areEqual((Object) this.g, (Object) fea.g);
    }

    public final int hashCode() {
        int e2 = g63.e(g63.d(rae.h(this.d, rae.h(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return e2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationData(notificationsMap=");
        sb.append(this.a);
        sb.append(", notificationSettings=");
        sb.append(this.b);
        sb.append(", totalUnreadMessagesCount=");
        sb.append(this.c);
        sb.append(", notificationId=");
        sb.append(this.d);
        sb.append(", groupSummaryKey=");
        sb.append(this.e);
        sb.append(", checkCount=");
        sb.append(this.f);
        sb.append(", tag=");
        return wj6.n(sb, this.g, ")");
    }
}
