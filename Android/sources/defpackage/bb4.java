package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bb4  reason: default package */
public final class bb4 {
    public final Uri a;

    public /* synthetic */ bb4(Uri uri) {
        this.a = uri;
    }

    public static final String a(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return StringsKt__StringsKt.removePrefix(path, (CharSequence) "/");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bb4)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((bb4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
