package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: iz6  reason: default package */
public final class iz6 implements mz6 {
    public final long a;
    public final long b;
    public final boolean c;
    public final List d;
    public final String e;

    public iz6(long j, long j2, boolean z, ArrayList arrayList, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = arrayList;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz6)) {
            return false;
        }
        iz6 iz6 = (iz6) obj;
        return this.a == iz6.a && this.b == iz6.b && this.c == iz6.c && Intrinsics.areEqual((Object) this.d, (Object) iz6.d) && Intrinsics.areEqual((Object) this.e, (Object) iz6.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rae.i(this.d, g63.e(wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Group(chatServerId=");
        sb.append(this.a);
        sb.append(", chatLocalId=");
        sb.append(this.b);
        sb.append(", isGroupCallAvailable=");
        sb.append(this.c);
        sb.append(", messagesIds=");
        sb.append(this.d);
        sb.append(", link=");
        return wj6.n(sb, this.e, ")");
    }
}
