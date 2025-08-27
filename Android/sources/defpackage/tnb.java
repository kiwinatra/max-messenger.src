package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tnb  reason: default package */
public final class tnb implements tzb {
    public final ngf a;

    public tnb(igf igf) {
        this.a = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnb)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((tnb) obj).a);
    }

    public final boolean f(lz7 lz7) {
        return ((long) 65536) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) 65536;
    }

    public final int hashCode() {
        return Integer.hashCode(-2147418112) + (this.a.hashCode() * 31);
    }

    public final int i() {
        return -2147418112;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        if (!(lz7 instanceof u7e)) {
            return null;
        }
        return new k0c(((u7e) lz7).a);
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return "PlaceholderItem(text=" + this.a + ", viewType=-2147418112)";
    }
}
