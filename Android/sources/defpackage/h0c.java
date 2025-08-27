package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h0c  reason: default package */
public final class h0c extends j91 {
    public final ngf b;
    public final Integer c;

    public h0c(ngf ngf, Integer num) {
        super(10);
        this.b = ngf;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0c)) {
            return false;
        }
        h0c h0c = (h0c) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) h0c.b) && Intrinsics.areEqual((Object) this.c, (Object) h0c.c);
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
