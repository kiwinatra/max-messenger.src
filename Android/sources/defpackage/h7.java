package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h7  reason: default package */
public final class h7 extends k7 {
    public final ngf a;
    public final int b;
    public final int c;

    public h7() {
        igf igf = new igf(sqa.m);
        int i = pqa.R;
        int i2 = qqa.k;
        this.a = igf;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) h7Var.a) && this.b == h7Var.b && this.c == h7Var.c;
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
        StringBuilder sb = new StringBuilder("ShareScreen(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wj6.l(sb, this.c, ")");
    }
}
