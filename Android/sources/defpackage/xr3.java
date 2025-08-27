package defpackage;

import android.view.ViewGroup;
import kotlin.math.MathKt;

/* renamed from: xr3  reason: default package */
public final class xr3 extends y0c {
    public final void M(lz7 lz7) {
        lo3 lo3 = (lo3) lz7;
        ol3 ol3 = (ol3) this.a;
        if (lo3.z && lo3.x == eyb.CHANGE_ADMIN) {
            int roundToInt = MathKt.roundToInt(((float) 64) * vo4.c().getDisplayMetrics().density);
            int roundToInt2 = MathKt.roundToInt(((float) 80) * vo4.c().getDisplayMetrics().density);
            ol3.W0.b = v9a.x;
            ViewGroup.LayoutParams layoutParams = ol3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = roundToInt2;
                ol3.setLayoutParams(layoutParams);
                ol3.b1 = roundToInt;
                ol3.U();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        ol3.Y(lo3.a, lo3.w, lo3.o);
        ol3.setName((CharSequence) lo3.b);
        ol3.setMessage(lo3.c.a(ol3.getContext()));
    }
}
