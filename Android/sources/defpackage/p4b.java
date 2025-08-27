package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: p4b  reason: default package */
public final class p4b extends j91 {
    public final ngf b;
    public final int c;
    public final ngf d = null;

    public p4b(int i, igf igf) {
        super(9);
        this.b = igf;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4b)) {
            return false;
        }
        p4b p4b = (p4b) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) p4b.b) && this.c == p4b.c && Intrinsics.areEqual((Object) this.d, (Object) p4b.d);
    }

    public final int hashCode() {
        int h = rae.h(this.c, this.b.hashCode() * 31, 31);
        ngf ngf = this.d;
        return h + (ngf == null ? 0 : ngf.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + this.c + ", description=" + this.d + ")";
    }
}
