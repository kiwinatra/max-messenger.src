package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: op9  reason: default package */
public final class op9 {
    public final Map a;
    public final long b;

    public op9(ts tsVar, long j) {
        this.a = tsVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op9)) {
            return false;
        }
        op9 op9 = (op9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) op9.a) && this.b == op9.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteMessage(data=" + this.a + ", sentTime=" + this.b + ")";
    }
}
