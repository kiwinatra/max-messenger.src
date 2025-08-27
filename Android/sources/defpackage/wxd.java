package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: wxd  reason: default package */
public final class wxd extends g7b {
    public final List e;

    public wxd(long j, String str, List list) {
        super(j, p7b.SET, (Drawable) null, str);
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wxd.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.e.equals(((wxd) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (super.hashCode() * 31);
    }
}
