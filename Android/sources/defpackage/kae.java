package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kae  reason: default package */
public final class kae extends g7b {
    public final Drawable e;
    public final List f;

    public kae(Drawable drawable, List list) {
        super((long) 4, p7b.SIMILAR, drawable, (String) null);
        this.e = drawable;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kae)) {
            return false;
        }
        kae kae = (kae) obj;
        return Intrinsics.areEqual((Object) this.e, (Object) kae.e) && Intrinsics.areEqual((Object) this.f, (Object) kae.f);
    }

    public final int hashCode() {
        Drawable drawable = this.e;
        return this.f.hashCode() + ((drawable == null ? 0 : drawable.hashCode()) * 31);
    }

    public final String toString() {
        return "SimilarStickerPage(icon=" + this.e + ", keyboardStickers=" + this.f + ")";
    }
}
