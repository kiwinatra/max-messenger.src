package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: l80  reason: default package */
public final class l80 extends ibf {
    public final String c;
    public final h98 o;
    public final String v;
    public final fo3 w;

    public l80(String str, h98 h98, String str2, fo3 fo3) {
        this.c = str;
        this.o = h98;
        this.v = str2;
        this.w = fo3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l80)) {
            return false;
        }
        l80 l80 = (l80) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) l80.c) && this.o == l80.o && Intrinsics.areEqual((Object) this.v, (Object) l80.v) && Intrinsics.areEqual((Object) this.w, (Object) l80.w);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.v;
        return this.w.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String G = cvg.G(this.c);
        String G2 = cvg.G(this.v);
        StringBuilder p = tr1.p("{token='", G, ", tokenType=");
        p.append(this.o);
        p.append(", userToken='");
        p.append(G2);
        p.append(", profile=");
        p.append(this.w);
        p.append("}");
        return p.toString();
    }
}
