package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: qn3  reason: default package */
public final class qn3 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final um3 e;

    public qn3(long j, long j2, int i, int i2, um3 um3) {
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = um3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn3)) {
            return false;
        }
        qn3 qn3 = (qn3) obj;
        return this.a == qn3.a && this.b == qn3.b && this.c == qn3.c && this.d == qn3.d && Intrinsics.areEqual((Object) this.e, (Object) qn3.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rae.h(this.d, rae.h(this.c, wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        return "ContactEntity(id=" + this.a + ", serverId=" + this.b + ", presence=" + this.c + ", presenceType=" + this.d + ", contactData=" + this.e + ")";
    }
}
