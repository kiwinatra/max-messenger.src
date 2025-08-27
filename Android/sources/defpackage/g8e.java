package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g8e  reason: default package */
public final class g8e extends xo3 {
    public final long a;
    public final ngf b;
    public final ngf c;
    public final List d;

    public g8e(long j, ngf ngf, igf igf, List list) {
        this.a = j;
        this.b = ngf;
        this.c = igf;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8e)) {
            return false;
        }
        g8e g8e = (g8e) obj;
        return this.a == g8e.a && Intrinsics.areEqual((Object) this.b, (Object) g8e.b) && Intrinsics.areEqual((Object) this.c, (Object) g8e.c) && Intrinsics.areEqual((Object) this.d, (Object) g8e.d);
    }

    public final int hashCode() {
        int g = i2a.g(Long.hashCode(this.a) * 31, 31, this.b);
        ngf ngf = this.c;
        return this.d.hashCode() + ((g + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(contactServerId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
