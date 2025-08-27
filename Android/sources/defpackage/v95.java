package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v95  reason: default package */
public final class v95 {
    public final String a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public v95(String str, int i, int i2, long j, boolean z, boolean z2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = z;
        this.f = z2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v95)) {
            return false;
        }
        v95 v95 = (v95) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) v95.a) && this.b == v95.b && this.c == v95.c && this.d == v95.d && this.e == v95.e && this.f == v95.f && this.g == v95.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + g63.e(g63.e(wzf.i(rae.h(this.c, rae.h(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecutorConfig(threadName=");
        sb.append(this.a);
        sb.append(", corePoolSize=");
        sb.append(this.b);
        sb.append(", maxPoolSize=");
        sb.append(this.c);
        sb.append(", keepAliveTimeMs=");
        sb.append(this.d);
        sb.append(", allowCoreThreadTimeOut=");
        sb.append(this.e);
        sb.append(", prestartCoreThreads=");
        sb.append(this.f);
        sb.append(", threadPriority=");
        return wj6.l(sb, this.g, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v95(String str, int i, long j, boolean z, boolean z2, int i2, int i3) {
        this(str, 1, i, (i3 & 8) != 0 ? 0 : j, z, (i3 & 32) != 0 ? false : z2, (i3 & 64) != 0 ? 5 : i2);
    }
}
