package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xr4  reason: default package */
public final class xr4 implements yr4 {
    public final Uri a;
    public final sr4 b;

    public xr4(Uri uri, sr4 sr4) {
        this.a = uri;
        this.b = sr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr4)) {
            return false;
        }
        xr4 xr4 = (xr4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) xr4.a) && this.b == xr4.b;
    }

    public final int hashCode() {
        Uri uri = this.a;
        return this.b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "DownloadMediaCompleted(uri=" + this.a + ", cause=" + this.b + ")";
    }
}
