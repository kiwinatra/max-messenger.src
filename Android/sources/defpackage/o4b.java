package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: o4b  reason: default package */
public final class o4b extends j91 {
    public final Uri b;

    public o4b(Uri uri) {
        super(9);
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4b) && Intrinsics.areEqual((Object) this.b, (Object) ((o4b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OpenExternalLink(url=" + this.b + ")";
    }
}
