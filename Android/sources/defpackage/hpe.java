package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: hpe  reason: default package */
public final class hpe extends g7b {
    public final List e;

    public hpe(Drawable drawable, List list) {
        super((long) 2, p7b.STICKER, drawable, (String) null);
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hpe.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.e.equals(((hpe) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (super.hashCode() * 31);
    }
}
