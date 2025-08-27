package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wk6  reason: default package */
public final class wk6 {
    public final vk6 a;
    public int b;
    public boolean c;
    public final boolean d;

    public wk6(vk6 vk6, int i, boolean z, boolean z2) {
        this.a = vk6;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static wk6 a(wk6 wk6, int i, boolean z, int i2) {
        vk6 vk6 = wk6.a;
        if ((i2 & 4) != 0) {
            z = wk6.c;
        }
        boolean z2 = wk6.d;
        wk6.getClass();
        return new wk6(vk6, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk6)) {
            return false;
        }
        wk6 wk6 = (wk6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wk6.a) && this.b == wk6.b && this.c == wk6.c && this.d == wk6.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g63.e(rae.h(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.c;
        return "GalleryAlbum(type=" + this.a + ", totalCount=" + i + ", isLoaded=" + z + ", hasImages=" + this.d + ")";
    }
}
