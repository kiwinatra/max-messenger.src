package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: oae  reason: default package */
public final class oae implements lz7 {
    public final ngf a;
    public final ngf b;
    public final long c;
    public final int o = ena.a;

    public oae(int i, igf igf, mgf mgf) {
        this.a = igf;
        this.b = mgf;
        this.c = (long) i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oae)) {
            return false;
        }
        oae oae = (oae) obj;
        oae.getClass();
        int i = ena.a;
        return Intrinsics.areEqual((Object) this.a, (Object) oae.a) && Intrinsics.areEqual((Object) this.b, (Object) oae.b);
    }

    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + i2a.g(Integer.hashCode(ena.b) * 31, 31, this.a);
    }

    public final int i() {
        return this.o;
    }

    public final String toString() {
        return "SimpleActionItem(id=" + ena.b + ", title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
