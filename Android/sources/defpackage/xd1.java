package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import kotlin.jvm.functions.Function0;

/* renamed from: xd1  reason: default package */
public final class xd1 extends kbe {
    public final u6h D0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xd1(android.content.Context r3, defpackage.u6h r4) {
        /*
            r2 = this;
            ol3 r0 = new ol3
            r1 = 0
            r0.<init>(r3, r1)
            r2.<init>(r0)
            r2.D0 = r4
            l2b r2 = defpackage.l2b.a
            r0.setCustomTheme(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd1.<init>(android.content.Context, u6h):void");
    }

    public final void M(lz7 lz7) {
        String str;
        sd1 sd1 = (sd1) lz7;
        ol3 ol3 = (ol3) this.a;
        ol3.setId(Long.hashCode(sd1.y));
        String str2 = sd1.b;
        ol3.setName((CharSequence) str2);
        ol3.Y(sd1.a.a, str2, sd1.o);
        Integer num = sd1.x;
        if (num != null) {
            str = ol3.getContext().getString(num.intValue());
        } else {
            str = null;
        }
        ol3.setMessage(str);
        ct.G(ol3, 300, new pb(4, sd1, this));
        l2b l2b = l2b.a;
        int i = l2b.g.a.b;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(l2b.d.i);
        ol3.setBackground(new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, (Drawable) null));
        if (sd1.v) {
            ol3.b0(ol3, (Integer) null, (zpa) null, (Function0) null, 6);
        } else {
            ol3.a0(Integer.valueOf(pqa.Y), zpa.o, xpa.v, new s2(12, (Object) this, (Object) sd1));
        }
        ol3.setCustomTheme(l2b);
    }
}
