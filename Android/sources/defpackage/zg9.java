package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zg9  reason: default package */
public final class zg9 implements bh9 {
    public final Uri a;

    public zg9(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg9) && Intrinsics.areEqual((Object) this.a, (Object) ((zg9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendImage(mediaUri=" + this.a + ")";
    }
}
