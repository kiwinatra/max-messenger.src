package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dae  reason: default package */
public final class dae {
    public final long a;
    public final ayc b;
    public final ue1 c;
    public final long d;
    public final String e;
    public final String f;

    public dae(long j, ayc ayc, ue1 ue1, long j2, String str, String str2) {
        this.a = j;
        this.b = ayc;
        this.c = ue1;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dae)) {
            return false;
        }
        dae dae = (dae) obj;
        return this.a == dae.a && this.b == dae.b && Intrinsics.areEqual((Object) this.c, (Object) dae.c) && this.d == dae.d && Intrinsics.areEqual((Object) this.e, (Object) dae.e) && Intrinsics.areEqual((Object) this.f, (Object) dae.f);
    }

    public final int hashCode() {
        int i = wzf.i((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        int i2 = 0;
        String str = this.e;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignalingRecordInfo(recordMovieId=");
        sb.append(this.a);
        sb.append(", recordType=");
        sb.append(this.b);
        sb.append(", initiator=");
        sb.append(this.c);
        sb.append(", recordStartTime=");
        sb.append(this.d);
        sb.append(", recordExternalMovieId=");
        sb.append(this.e);
        sb.append(", recordExternalOwnerId=");
        return wj6.n(sb, this.f, ")");
    }
}
