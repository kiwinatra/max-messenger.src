package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: d00  reason: default package */
public final class d00 extends f00 {
    public final long a;
    public final ngf b;

    public d00(long j, mgf mgf) {
        this.a = j;
        this.b = mgf;
    }

    public final long a() {
        return this.a;
    }

    public final ngf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d00)) {
            return false;
        }
        d00 d00 = (d00) obj;
        return this.a == d00.a && Intrinsics.areEqual((Object) this.b, (Object) d00.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Success(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
