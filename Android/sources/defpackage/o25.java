package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: o25  reason: default package */
public final class o25 extends g7b {
    public final List e;

    public o25(Drawable drawable, List list) {
        super(1, p7b.EMOJI, drawable, (String) null);
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o25.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.e.equals(((o25) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (super.hashCode() * 31);
    }
}
