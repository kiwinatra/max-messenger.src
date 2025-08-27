package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: m19  reason: default package */
public final class m19 implements o19 {
    public final Uri a;

    public m19(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m19) && Intrinsics.areEqual((Object) this.a, (Object) ((m19) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
