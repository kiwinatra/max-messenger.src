package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: i7  reason: default package */
public final class i7 extends k7 {
    public final ngf a;
    public final int b;
    public final int c;

    public i7() {
        igf igf = new igf(sqa.q);
        int i = pqa.R;
        int i2 = qqa.m;
        this.a = igf;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) i7Var.a) && this.b == i7Var.b && this.c == i7Var.c;
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
        StringBuilder sb = new StringBuilder("ShareScreenUnavailable(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wj6.l(sb, this.c, ")");
    }
}
