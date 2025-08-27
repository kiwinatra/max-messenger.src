package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jig  reason: default package */
public final class jig implements tig {
    public final Uri a;

    public jig(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jig) && Intrinsics.areEqual((Object) this.a, (Object) ((jig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InternalNavigation(uri=" + this.a + ")";
    }
}
