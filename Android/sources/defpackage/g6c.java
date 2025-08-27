package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: g6c  reason: default package */
public final class g6c extends h6c {
    public final Integer a;
    public final ngf b;

    public g6c(ngf ngf, Integer num) {
        this.a = num;
        this.b = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6c)) {
            return false;
        }
        g6c g6c = (g6c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) g6c.a) && Intrinsics.areEqual((Object) this.b, (Object) g6c.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(iconRes=" + this.a + ", textSource=" + this.b + ")";
    }
}
