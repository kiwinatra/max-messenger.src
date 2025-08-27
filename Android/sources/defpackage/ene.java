package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ene  reason: default package */
public final class ene {
    public final dne a;
    public final fne b;
    public final gne c;

    public ene(dne dne, fne fne, gne gne) {
        this.a = dne;
        this.b = fne;
        this.c = gne;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ene)) {
            return false;
        }
        ene ene = (ene) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ene.a) && Intrinsics.areEqual((Object) this.b, (Object) ene.b) && Intrinsics.areEqual((Object) this.c, (Object) ene.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
