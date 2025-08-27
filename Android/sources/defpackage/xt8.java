package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xt8  reason: default package */
public final class xt8 extends v5a {
    public final Uri b;
    public final String c;

    public xt8(Uri uri, String str) {
        super(Unit.INSTANCE);
        this.b = uri;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt8)) {
            return false;
        }
        xt8 xt8 = (xt8) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) xt8.b) && Intrinsics.areEqual((Object) this.c, (Object) xt8.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenCropScreen(uri=" + this.b + ", path=" + this.c + ")";
    }
}
