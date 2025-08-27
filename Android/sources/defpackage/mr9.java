package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: mr9  reason: default package */
public final class mr9 implements nr9 {
    public final ngf a;
    public final ngf b;
    public final hob c;
    public final boolean d;

    public mr9(mgf mgf, mgf mgf2, hob hob, boolean z) {
        this.a = mgf;
        this.b = mgf2;
        this.c = hob;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr9)) {
            return false;
        }
        mr9 mr9 = (mr9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) mr9.a) && Intrinsics.areEqual((Object) this.b, (Object) mr9.b) && this.c == mr9.c && this.d == mr9.d;
    }

    public final int hashCode() {
        int g = i2a.g(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + g) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        return tr1.m(sb, this.d, ")");
    }
}
