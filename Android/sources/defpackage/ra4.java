package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ra4  reason: default package */
public final class ra4 {
    public final Uri a;
    public final ma4 b;
    public final Set c;
    public final boolean d;
    public final Set e;

    public ra4(Uri uri, ma4 ma4, LinkedHashSet linkedHashSet, boolean z, Set set) {
        this.a = uri;
        this.b = ma4;
        this.c = linkedHashSet;
        this.d = z;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra4)) {
            return false;
        }
        ra4 ra4 = (ra4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ra4.a) && this.b == ra4.b && Intrinsics.areEqual((Object) this.c, (Object) ra4.c) && this.d == ra4.d && Intrinsics.areEqual((Object) this.e, (Object) ra4.e);
    }

    public final int hashCode() {
        int e2 = g63.e((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        Set set = this.e;
        return e2 + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        String uri = this.a.toString();
        return "DeepLinkRoute(deepLinkUri=" + uri + ", constraint=" + this.b + ", requiredParams=" + this.c + ", supportRoot=" + this.d + ", bundleRequiredParams=" + this.e + ")";
    }
}
