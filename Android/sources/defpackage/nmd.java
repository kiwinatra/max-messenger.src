package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nmd  reason: default package */
public final class nmd implements tzb {
    public final ngf a;
    public final Function1 b;
    public final ogf c;
    public final int o;
    public final int v;

    public nmd(ngf ngf, ogf ogf, int i, int i2) {
        duc duc = new duc(3);
        ogf = (i2 & 4) != 0 ? puf.t : ogf;
        i = (i2 & 8) != 0 ? 2048 : i;
        this.a = ngf;
        this.b = duc;
        this.c = ogf;
        this.o = i;
        this.v = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd)) {
            return false;
        }
        nmd nmd = (nmd) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nmd.a) && Intrinsics.areEqual((Object) this.b, (Object) nmd.b) && Intrinsics.areEqual((Object) this.c, (Object) nmd.c) && tf6.D(this.o, nmd.o);
    }

    public final long getItemId() {
        return (long) this.o;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Integer.hashCode(this.o) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final int i() {
        return this.v;
    }

    public final String toString() {
        String p0 = tf6.p0(this.o);
        return "Section(title=" + this.a + ", textColor=" + this.b + ", typography=" + this.c + ", itemViewType=" + p0 + ")";
    }
}
