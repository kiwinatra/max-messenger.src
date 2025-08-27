package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: al6  reason: default package */
public final class al6 implements lz7 {
    public final wk6 a;
    public final Uri b;
    public final boolean c;
    public final long o;

    public al6(wk6 wk6, Uri uri, boolean z) {
        this.a = wk6;
        this.b = uri;
        this.c = z;
        this.o = (long) wk6.a.b().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al6)) {
            return false;
        }
        al6 al6 = (al6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) al6.a) && Intrinsics.areEqual((Object) this.b, (Object) al6.b) && this.c == al6.c;
    }

    public final long getItemId() {
        return this.o;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (uri == null ? 0 : uri.hashCode())) * 31);
    }

    public final int i() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryAlbumUiItem(album=");
        sb.append(this.a);
        sb.append(", cover=");
        sb.append(this.b);
        sb.append(", isSelected=");
        return tr1.m(sb, this.c, ")");
    }
}
