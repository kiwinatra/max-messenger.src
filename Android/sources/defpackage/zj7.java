package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: zj7  reason: default package */
public final class zj7 extends kbe {
    /* renamed from: P */
    public final void M(xj7 xj7) {
        Drawable drawable;
        yj7 yj7 = (yj7) this.a;
        CharSequence a = xj7.b.a(yj7.getContext());
        if (a == null) {
            a = "";
        }
        yj7.setText(a);
        Integer num = xj7.c;
        if (num != null) {
            drawable = ew3.b(yj7.getContext(), num.intValue());
        } else {
            drawable = null;
        }
        yj7.setIcon(drawable);
    }
}
