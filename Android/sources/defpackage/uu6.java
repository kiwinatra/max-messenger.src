package defpackage;

import androidx.gridlayout.widget.GridLayout;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: uu6  reason: default package */
public final class uu6 {
    public static final uu6 e = GridLayout.l(IntCompanionObject.MIN_VALUE, 1, GridLayout.D0, c44.DEFAULT_ASPECT_RATIO);
    public final boolean a;
    public final ru6 b;
    public final ryg c;
    public final float d;

    public uu6(boolean z, ru6 ru6, ryg ryg, float f) {
        this.a = z;
        this.b = ru6;
        this.c = ryg;
        this.d = f;
    }

    public final ryg a(boolean z) {
        ku6 ku6 = GridLayout.D0;
        ryg ryg = this.c;
        return ryg != ku6 ? ryg : this.d == c44.DEFAULT_ASPECT_RATIO ? z ? GridLayout.G0 : GridLayout.L0 : GridLayout.M0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uu6.class != obj.getClass()) {
            return false;
        }
        uu6 uu6 = (uu6) obj;
        return this.c.equals(uu6.c) && this.b.equals(uu6.b);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
