package defpackage;

import android.net.Uri;

/* renamed from: kf  reason: default package */
public final class kf implements qx0 {
    public final qx0 a;
    public final int b;

    public kf(qx0 qx0, int i) {
        this.a = qx0;
        this.b = i;
    }

    public final boolean a(Uri uri) {
        return this.a.a(uri);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kf)) {
            return false;
        }
        kf kfVar = (kf) obj;
        return this.b == kfVar.b && this.a.equals(kfVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 1013) + this.b;
    }

    public final String toString() {
        w28 K = hsg.K(this);
        K.x(this.a, "imageCacheKey");
        K.v(this.b, "frameIndex");
        return K.toString();
    }
}
