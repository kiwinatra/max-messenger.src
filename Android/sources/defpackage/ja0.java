package defpackage;

import android.util.Size;

/* renamed from: ja0  reason: default package */
public final class ja0 {
    public bt1 a = new Object();
    public za7 b;
    public final za7 c = null;
    public final Size d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Size h;
    public final int i;
    public final ez4 j;
    public final ez4 k;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, bt1] */
    public ja0(Size size, int i2, int i3, boolean z, ez4 ez4, ez4 ez42) {
        if (size != null) {
            this.d = size;
            this.e = i2;
            this.f = i3;
            this.g = z;
            this.h = null;
            this.i = 35;
            this.j = ez4;
            this.k = ez42;
            return;
        }
        throw new NullPointerException("Null size");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0 = (ja0) obj;
        if (this.d.equals(ja0.d) && this.e == ja0.e && this.f == ja0.f && this.g == ja0.g) {
            Size size = ja0.h;
            Size size2 = this.h;
            if (size2 != null ? size2.equals(size) : size == null) {
                if (this.i == ja0.i && this.j.equals(ja0.j) && this.k.equals(ja0.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ (this.g ? 1231 : 1237)) * -721379959;
        Size size = this.h;
        return this.k.hashCode() ^ ((((((hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{size=" + this.d + ", inputFormat=" + this.e + ", outputFormat=" + this.f + ", virtualCamera=" + this.g + ", imageReaderProxyProvider=null, postviewSize=" + this.h + ", postviewImageFormat=" + this.i + ", requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
