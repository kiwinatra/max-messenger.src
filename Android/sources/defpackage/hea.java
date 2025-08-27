package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hea  reason: default package */
public final class hea {
    public final String a;
    public final boolean b;
    public final Uri c;

    public hea(String str, boolean z, Uri uri) {
        this.a = str;
        this.b = z;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hea)) {
            return false;
        }
        hea hea = (hea) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) hea.a) && this.b == hea.b && Intrinsics.areEqual((Object) this.c, (Object) hea.c) && Intrinsics.areEqual((Object) "image/*", (Object) "image/*");
    }

    public final int hashCode() {
        String str = this.a;
        return ((this.c.hashCode() + g63.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31) + 1911932022;
    }

    public final String toString() {
        return "NotificationImage(prefetchUrl=" + this.a + ", canBeLoadedFromNetwork=" + this.b + ", notificationImageUri=" + this.c + ", notificationImageMimeType=image/*)";
    }
}
