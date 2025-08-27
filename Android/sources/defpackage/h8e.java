package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h8e  reason: default package */
public final class h8e implements dk9 {
    public final List a;
    public final ngf b;
    public final ngf c;
    public final List d;

    public h8e(List list, ngf ngf, igf igf, List list2) {
        this.a = list;
        this.b = ngf;
        this.c = igf;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8e)) {
            return false;
        }
        h8e h8e = (h8e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) h8e.a) && Intrinsics.areEqual((Object) this.b, (Object) h8e.b) && Intrinsics.areEqual((Object) this.c, (Object) h8e.c) && Intrinsics.areEqual((Object) this.d, (Object) h8e.d);
    }

    public final int hashCode() {
        int g = i2a.g(this.a.hashCode() * 31, 31, this.b);
        ngf ngf = this.c;
        return this.d.hashCode() + ((g + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(messageIds=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
