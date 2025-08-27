package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: hvc  reason: default package */
public final class hvc extends g7b {
    public final List e;
    public final List f;

    public hvc(Drawable drawable, List list, List list2) {
        super((long) 1, p7b.RECENTS, drawable, (String) null);
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hvc.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        hvc hvc = (hvc) obj;
        if (!this.e.equals(hvc.e)) {
            return false;
        }
        return this.f.equals(hvc.f);
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        return this.f.hashCode() + ((hashCode + (super.hashCode() * 31)) * 31);
    }
}
