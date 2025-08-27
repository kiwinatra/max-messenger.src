package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j7  reason: default package */
public final class j7 extends k7 {
    public final ngf a;
    public final int b;
    public final int c;

    public j7() {
        igf igf = new igf(sqa.h);
        int i = nad.P0;
        int i2 = qqa.s;
        this.a = igf;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) j7Var.a) && this.b == j7Var.b && this.c == j7Var.c;
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
        StringBuilder sb = new StringBuilder("WriteToChat(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return wj6.l(sb, this.c, ")");
    }
}
