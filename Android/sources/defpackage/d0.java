package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: d0  reason: default package */
public final class d0 implements m04 {
    public final float a;

    public d0(float f) {
        this.a = f;
    }

    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        return this.a == ((d0) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
