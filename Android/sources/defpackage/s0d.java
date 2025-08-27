package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: s0d  reason: default package */
public final class s0d implements m04 {
    public final float a;

    public s0d(float f) {
        this.a = f;
    }

    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0d)) {
            return false;
        }
        return this.a == ((s0d) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
