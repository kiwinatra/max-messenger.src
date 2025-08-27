package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: de6  reason: default package */
public final class de6 {
    public final Bitmap a;
    public final int b;
    public final int c;

    public de6(int i, int i2, Bitmap bitmap) {
        this.a = bitmap;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de6)) {
            return false;
        }
        de6 de6 = (de6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) de6.a) && this.b == de6.b && this.c == de6.c;
    }

    public final int hashCode() {
        Bitmap bitmap = this.a;
        return Integer.hashCode(this.c) + rae.h(this.b, (bitmap == null ? 0 : bitmap.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResultFrame(bitmap=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return wj6.l(sb, this.c, ")");
    }
}
