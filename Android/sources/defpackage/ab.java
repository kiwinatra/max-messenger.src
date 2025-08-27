package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: ab  reason: default package */
public final class ab implements m04 {
    public final m04 a;
    public final float b;

    public ab(float f, m04 m04) {
        while (m04 instanceof ab) {
            m04 = ((ab) m04).a;
            f += ((ab) m04).b;
        }
        this.a = m04;
        this.b = f;
    }

    public final float a(RectF rectF) {
        return Math.max(c44.DEFAULT_ASPECT_RATIO, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return this.a.equals(abVar.a) && this.b == abVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
