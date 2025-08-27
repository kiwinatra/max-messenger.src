package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g7  reason: default package */
public final class g7 extends k7 {
    public final ngf a;
    public final int b;
    public final int c;

    public g7() {
        igf igf = new igf(sqa.i);
        int i = pqa.g0;
        int i2 = qqa.f;
        this.a = igf;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) g7Var.a) && this.b == g7Var.b && this.c == g7Var.c;
    }

    public final int getIcon() {
        return this.b;
    }

    public final int getId() {
        return this.c;
    }

    public final ngf getName() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenProfile(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wj6.l(sb, this.c, ")");
    }
}
