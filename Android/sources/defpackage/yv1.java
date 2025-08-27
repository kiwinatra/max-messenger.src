package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yv1  reason: default package */
public final class yv1 implements tzb {
    public final ngf a;

    public yv1(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv1) && Intrinsics.areEqual((Object) this.a, (Object) ((yv1) obj).a);
    }

    public final boolean f(lz7 lz7) {
        return ((long) 256) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) 256;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return 256;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return g63.k(new StringBuilder("CancelDeleteProfileItem(text="), this.a, ")");
    }
}
