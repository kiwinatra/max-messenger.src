package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: o8e  reason: default package */
public final class o8e implements dk9 {
    public final ngf a;
    public final int b;
    public final ngf c;

    public o8e(ngf ngf, int i, igf igf, int i2) {
        i = (i2 & 2) != 0 ? cad.K : i;
        igf = (i2 & 4) != 0 ? null : igf;
        this.a = ngf;
        this.b = i;
        this.c = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8e)) {
            return false;
        }
        o8e o8e = (o8e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) o8e.a) && this.b == o8e.b && Intrinsics.areEqual((Object) this.c, (Object) o8e.c);
    }

    public final int hashCode() {
        int h = rae.h(this.b, this.a.hashCode() * 31, 31);
        ngf ngf = this.c;
        return h + (ngf == null ? 0 : ngf.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }
}
