package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;

/* renamed from: g53  reason: default package */
public final class g53 implements en {
    public final /* synthetic */ i53 a;

    public g53(i53 i53) {
        this.a = i53;
    }

    public final void i(AppBarLayout appBarLayout, int i) {
        i53 i53 = this.a;
        i53.K0 = i;
        iog iog = i53.M0;
        int d = iog != null ? iog.d() : 0;
        int childCount = i53.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = i53.getChildAt(i2);
            f53 f53 = (f53) childAt.getLayoutParams();
            lbg b = i53.b(childAt);
            int i3 = f53.a;
            if (i3 == 1) {
                b.b(h88.l(-i, 0, ((i53.getHeight() - i53.b(childAt).b) - childAt.getHeight()) - ((f53) childAt.getLayoutParams()).bottomMargin));
            } else if (i3 == 2) {
                b.b(Math.round(((float) (-i)) * f53.b));
            }
        }
        i53.f();
        if (i53.B0 != null && d > 0) {
            WeakHashMap weakHashMap = gag.a;
            i53.postInvalidateOnAnimation();
        }
        int height = i53.getHeight();
        WeakHashMap weakHashMap2 = gag.a;
        int minimumHeight = (height - i53.getMinimumHeight()) - d;
        float f = (float) minimumHeight;
        float min = Math.min(1.0f, ((float) (height - i53.getScrimVisibleHeightTrigger())) / f);
        e53 e53 = i53.w0;
        e53.d = min;
        e53.e = i2a.f(1.0f, min, 0.5f, min);
        e53.f = i53.K0 + minimumHeight;
        e53.p(((float) Math.abs(i)) / f);
    }
}
