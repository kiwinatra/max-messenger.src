package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e2c  reason: default package */
public final class e2c extends f2c {
    public final ngf a;
    public final int b;

    public e2c(int i, igf igf) {
        this.a = igf;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2c)) {
            return false;
        }
        e2c e2c = (e2c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) e2c.a) && this.b == e2c.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }
}
