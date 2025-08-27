package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: fxd  reason: default package */
public final class fxd {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final e4e g;
    public final boolean h;

    public fxd(long j, String str, String str2, String str3, String str4, int i, e4e e4e, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = e4e;
        this.h = z;
    }

    public static fxd a(fxd fxd, int i, e4e e4e, boolean z, int i2) {
        long j = fxd.a;
        String str = fxd.b;
        String str2 = fxd.c;
        String str3 = fxd.d;
        String str4 = fxd.e;
        if ((i2 & 64) != 0) {
            e4e = fxd.g;
        }
        e4e e4e2 = e4e;
        if ((i2 & Uuid.SIZE_BITS) != 0) {
            z = fxd.h;
        }
        fxd.getClass();
        return new fxd(j, str, str2, str3, str4, i, e4e2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxd)) {
            return false;
        }
        fxd fxd = (fxd) obj;
        return this.a == fxd.a && Intrinsics.areEqual((Object) this.b, (Object) fxd.b) && Intrinsics.areEqual((Object) this.c, (Object) fxd.c) && Intrinsics.areEqual((Object) this.d, (Object) fxd.d) && Intrinsics.areEqual((Object) this.e, (Object) fxd.e) && this.f == fxd.f && Intrinsics.areEqual((Object) this.g, (Object) fxd.g) && this.h == fxd.h;
    }

    public final int hashCode() {
        int d2 = g63.d(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int d3 = g63.d((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int y = (tr1.y(this.f) + ((d3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        e4e e4e = this.g;
        if (e4e != null) {
            i = e4e.a.hashCode();
        }
        int i2 = (y + i) * 31;
        boolean z = this.h;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionState(versionCode=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", environment=");
        sb.append(this.c);
        sb.append(", sessionUuid=");
        sb.append(this.d);
        sb.append(", processName=");
        sb.append(this.e);
        sb.append(", status=");
        int i = this.f;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NATIVE" : "ANR" : "CRASH" : "BLANK");
        sb.append(", maxSeverity=");
        sb.append(this.g);
        sb.append(", isInBackground=");
        return wzf.l(sb, this.h, ')');
    }
}
