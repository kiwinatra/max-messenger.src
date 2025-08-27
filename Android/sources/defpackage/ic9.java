package defpackage;

import android.net.Uri;
import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ic9  reason: default package */
public final class ic9 implements kc9 {
    public final String a;
    public final int b;
    public final Layout c;
    public final Uri d;

    public ic9(String str, int i, Layout layout, Uri uri) {
        this.a = str;
        this.b = i;
        this.c = layout;
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic9)) {
            return false;
        }
        ic9 ic9 = (ic9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ic9.a) && this.b == ic9.b && Intrinsics.areEqual((Object) this.c, (Object) ic9.c) && Intrinsics.areEqual((Object) this.d, (Object) ic9.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (this.c.hashCode() + rae.h(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        Uri uri = this.d;
        if (uri != null) {
            i = uri.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Media(url=" + this.a + ", attachCount=" + this.b + ", description=" + this.c + ", lowResPreviewUri=" + this.d + ")";
    }
}
