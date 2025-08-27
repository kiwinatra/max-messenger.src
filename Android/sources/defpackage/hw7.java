package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: hw7  reason: default package */
public final class hw7 extends jw7 {
    public final long a;
    public final String b;

    public hw7(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw7)) {
            return false;
        }
        hw7 hw7 = (hw7) obj;
        return this.a == hw7.a && Intrinsics.areEqual((Object) this.b, (Object) hw7.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorLinkInfo(requestId=");
        sb.append(this.a);
        sb.append(", error=");
        return wj6.n(sb, this.b, ")");
    }
}
