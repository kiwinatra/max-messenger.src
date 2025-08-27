package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: yw7  reason: default package */
public final class yw7 implements kx7 {
    public final Uri a;

    public yw7(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yw7) && Intrinsics.areEqual((Object) this.a, (Object) ((yw7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenBrowser(uri=" + this.a + ")";
    }
}
