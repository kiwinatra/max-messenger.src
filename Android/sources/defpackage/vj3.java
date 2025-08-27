package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vj3  reason: default package */
public final class vj3 {
    public final Uri a;
    public final boolean b;

    public vj3(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual((Object) vj3.class, (Object) obj != null ? obj.getClass() : null)) {
            return false;
        }
        vj3 vj3 = (vj3) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) vj3.a) && this.b == vj3.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
