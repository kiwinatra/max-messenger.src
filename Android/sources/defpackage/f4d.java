package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: f4d  reason: default package */
public final class f4d {
    public final Resources a;
    public final Resources.Theme b;

    public f4d(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f4d.class != obj.getClass()) {
            return false;
        }
        f4d f4d = (f4d) obj;
        return this.a.equals(f4d.a) && Objects.equals(this.b, f4d.b);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
