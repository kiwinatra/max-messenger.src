package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u3c  reason: default package */
public final class u3c implements x3c {
    public final ngf a;
    public final ngf b;
    public final List c;
    public final Bundle d;

    public u3c(ngf ngf, ngf ngf2, List list, Bundle bundle) {
        this.a = ngf;
        this.b = ngf2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3c)) {
            return false;
        }
        u3c u3c = (u3c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) u3c.a) && Intrinsics.areEqual((Object) this.b, (Object) u3c.b) && Intrinsics.areEqual((Object) this.c, (Object) u3c.c) && Intrinsics.areEqual((Object) this.d, (Object) u3c.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ngf ngf = this.b;
        return this.d.hashCode() + rae.i(this.c, (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowConfirmationDialog(title=" + this.a + ", subtitle=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
