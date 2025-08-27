package defpackage;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nc9  reason: default package */
public final class nc9 {
    public final long a;
    public final long b;
    public final Layout c;
    public final kc9 d;
    public final gc9 e;

    public nc9(long j, long j2, Layout layout, kc9 kc9, gc9 gc9) {
        this.a = j;
        this.b = j2;
        this.c = layout;
        this.d = kc9;
        this.e = gc9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc9)) {
            return false;
        }
        nc9 nc9 = (nc9) obj;
        return this.a == nc9.a && this.b == nc9.b && Intrinsics.areEqual((Object) this.c, (Object) nc9.c) && Intrinsics.areEqual((Object) this.d, (Object) nc9.d) && Intrinsics.areEqual((Object) this.e, (Object) nc9.e);
    }

    public final int hashCode() {
        int i = wzf.i(Long.hashCode(this.a) * 31, 31, this.b);
        int i2 = 0;
        Layout layout = this.c;
        int hashCode = (i + (layout == null ? 0 : layout.hashCode())) * 31;
        kc9 kc9 = this.d;
        int hashCode2 = (hashCode + (kc9 == null ? 0 : kc9.hashCode())) * 31;
        gc9 gc9 = this.e;
        if (gc9 != null) {
            i2 = gc9.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MessageLink(messageId=" + this.a + ", messageLinkId=" + this.b + ", senderLayout=" + this.c + ", replyModel=" + this.d + ", forwardModel=" + this.e + ")";
    }
}
