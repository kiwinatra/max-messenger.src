package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sxc  reason: default package */
public final class sxc {
    public final long a;
    public final ngf b;
    public final zpa c;

    public sxc(long j, igf igf, zpa zpa) {
        this.a = j;
        this.b = igf;
        this.c = zpa;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxc)) {
            return false;
        }
        sxc sxc = (sxc) obj;
        return this.a == sxc.a && Intrinsics.areEqual((Object) this.b, (Object) sxc.b) && this.c == sxc.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + i2a.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ButtonState(id=" + this.a + ", textSource=" + this.b + ", mode=" + this.c + ")";
    }
}
