package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: z2e  reason: default package */
public final class z2e extends j91 {
    public final ngf b;
    public final Integer c;

    public z2e(ngf ngf, Integer num) {
        super(15);
        this.b = ngf;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2e)) {
            return false;
        }
        z2e z2e = (z2e) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) z2e.b) && Intrinsics.areEqual((Object) this.c, (Object) z2e.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.b + ", icon=" + this.c + ")";
    }
}
