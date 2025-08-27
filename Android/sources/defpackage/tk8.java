package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tk8  reason: default package */
public final class tk8 implements wk8 {
    public final Uri a;

    public tk8(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk8) && Intrinsics.areEqual((Object) this.a, (Object) ((tk8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendFile(uri=" + this.a + ")";
    }
}
