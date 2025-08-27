package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l7  reason: default package */
public final class l7 extends n7 {
    public final ngf b;
    public final int c;
    public final int d;

    public l7() {
        igf igf = new igf(sqa.f);
        int i = pqa.j;
        int i2 = qqa.e;
        this.b = igf;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) l7Var.b) && this.c == l7Var.c && this.d == l7Var.d;
    }

    public final int getIcon() {
        return this.c;
    }

    public final int getId() {
        return this.d;
    }

    public final ngf getName() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rae.h(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridMode(name=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", id=");
        return wj6.l(sb, this.d, ")");
    }
}
