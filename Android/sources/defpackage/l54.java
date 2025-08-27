package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: l54  reason: default package */
public final class l54 extends ah8 {
    public final RectF v;

    public l54(j4e j4e, RectF rectF) {
        super(j4e);
        this.v = rectF;
    }

    public final Drawable newDrawable() {
        m54 m54 = new m54(this);
        m54.invalidateSelf();
        return m54;
    }

    public l54(l54 l54) {
        super((ah8) l54);
        this.v = l54.v;
    }
}
