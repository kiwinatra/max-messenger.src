package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wr7  reason: default package */
public final class wr7 implements tzb {
    public final String a;
    public final c63 b;

    public wr7(String str, c63 c63) {
        this.a = str;
        this.b = c63;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr7)) {
            return false;
        }
        wr7 wr7 = (wr7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wr7.a) && Intrinsics.areEqual((Object) this.b, (Object) wr7.b);
    }

    public final boolean f(lz7 lz7) {
        return ((long) 2) == lz7.getItemId();
    }

    public final long getItemId() {
        return (long) 2;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        c63 c63 = this.b;
        if (c63 != null) {
            i = c63.a.hashCode();
        }
        return hashCode + i;
    }

    public final int i() {
        return 2;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        if (!(lz7 instanceof wr7)) {
            return null;
        }
        return new j0c(((wr7) lz7).b);
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        return "LastNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
