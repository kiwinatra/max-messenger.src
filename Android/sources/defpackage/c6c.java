package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c6c  reason: default package */
public final class c6c extends h6c {
    public final ngf a;
    public final ngf b;
    public final List c;
    public final Bundle d;

    public c6c(ngf ngf, ngf ngf2, List list, Bundle bundle) {
        this.a = ngf;
        this.b = ngf2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6c)) {
            return false;
        }
        c6c c6c = (c6c) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) c6c.a) && Intrinsics.areEqual((Object) this.b, (Object) c6c.b) && Intrinsics.areEqual((Object) this.c, (Object) c6c.c) && Intrinsics.areEqual((Object) this.d, (Object) c6c.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        ngf ngf = this.b;
        int i2 = rae.i(this.c, (hashCode + (ngf == null ? 0 : ngf.hashCode())) * 31, 31);
        Bundle bundle = this.d;
        if (bundle != null) {
            i = bundle.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
