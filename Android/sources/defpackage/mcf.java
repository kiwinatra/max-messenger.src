package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: mcf  reason: default package */
public final class mcf {
    public final qm a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;

    public mcf(qm qmVar, boolean z, boolean z2, long j, int i) {
        this.a = qmVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcf)) {
            return false;
        }
        mcf mcf = (mcf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) mcf.a) && this.b == mcf.b && this.c == mcf.c && this.d == mcf.d && this.e == mcf.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + wzf.i(g63.e(g63.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task(apiTask=");
        sb.append(this.a);
        sb.append(", executeAndSave=");
        sb.append(this.b);
        sb.append(", retry=");
        sb.append(this.c);
        sb.append(", dependsRequestId=");
        sb.append(this.d);
        sb.append(", dependencyType=");
        return wj6.l(sb, this.e, ")");
    }
}
