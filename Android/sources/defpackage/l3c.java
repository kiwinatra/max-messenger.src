package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l3c  reason: default package */
public final class l3c extends m3c {
    public final kxb a;
    public final int b;

    public l3c(kxb kxb, int i) {
        k3c k3c = k3c.a;
        this.a = kxb;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3c)) {
            return false;
        }
        l3c l3c = (l3c) obj;
        if (!Intrinsics.areEqual((Object) this.a, (Object) l3c.a)) {
            return false;
        }
        k3c k3c = k3c.a;
        return hi7.l(this.b, l3c.b);
    }

    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        int hashCode = k3c.a.hashCode();
        return Integer.hashCode(this.b) + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final int i() {
        return this.b;
    }

    public final String toString() {
        String d0 = hi7.d0(this.b);
        return "Result(cellModel=" + this.a + ", type=" + k3c.a + ", itemViewType=" + d0 + ")";
    }
}
