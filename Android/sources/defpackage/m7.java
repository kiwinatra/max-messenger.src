package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: m7  reason: default package */
public final class m7 extends n7 {
    public final ngf b;
    public final int c;
    public final int d;

    public m7() {
        igf igf = new igf(sqa.e);
        int i = pqa.i;
        int i2 = qqa.n;
        this.b = igf;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) m7Var.b) && this.c == m7Var.c && this.d == m7Var.d;
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
        StringBuilder sb = new StringBuilder("SpeakerMode(name=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", id=");
        return wj6.l(sb, this.d, ")");
    }
}
