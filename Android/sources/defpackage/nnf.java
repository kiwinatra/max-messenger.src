package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: nnf  reason: default package */
public final class nnf {
    public final mnf a;
    public final qnf b;
    public final onf c;
    public final pnf d;

    public nnf(mnf mnf, qnf qnf, onf onf, pnf pnf) {
        this.a = mnf;
        this.b = qnf;
        this.c = onf;
        this.d = pnf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnf)) {
            return false;
        }
        nnf nnf = (nnf) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nnf.a) && Intrinsics.areEqual((Object) this.b, (Object) nnf.b) && Intrinsics.areEqual((Object) this.c, (Object) nnf.c) && Intrinsics.areEqual((Object) this.d, (Object) nnf.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TopbarColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ")";
    }
}
