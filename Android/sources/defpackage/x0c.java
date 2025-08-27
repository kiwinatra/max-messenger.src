package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x0c  reason: default package */
public final class x0c {
    public final ngf a;
    public final int b;
    public final f0b c;

    public x0c(igf igf, int i, ms1 ms1) {
        this.a = igf;
        this.b = i;
        this.c = ms1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0c)) {
            return false;
        }
        x0c x0c = (x0c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) x0c.a) && this.b == x0c.b && Intrinsics.areEqual((Object) this.c, (Object) x0c.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", bottomMargin=" + this.b + ", cancelAction=" + this.c + ")";
    }
}
