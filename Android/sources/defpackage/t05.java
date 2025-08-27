package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* renamed from: t05  reason: default package */
public final class t05 extends v02 {
    public final /* synthetic */ int x;

    public /* synthetic */ t05(int i) {
        this.x = i;
    }

    public final void n(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float f2;
        float f3;
        switch (this.x) {
            case 0:
                RectF e = v02.e(tabLayout, view);
                RectF e2 = v02.e(tabLayout, view2);
                if (e.left < e2.left) {
                    double d = (((double) f) * 3.141592653589793d) / 2.0d;
                    f2 = (float) (1.0d - Math.cos(d));
                    f3 = (float) Math.sin(d);
                } else {
                    double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                    f2 = (float) Math.sin(d2);
                    f3 = (float) (1.0d - Math.cos(d2));
                }
                drawable.setBounds(xg.c((int) e.left, f2, (int) e2.left), drawable.getBounds().top, xg.c((int) e.right, f3, (int) e2.right), drawable.getBounds().bottom);
                return;
            default:
                int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                if (i >= 0) {
                    view = view2;
                }
                RectF e3 = v02.e(tabLayout, view);
                float b = i < 0 ? xg.b(1.0f, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, 0.5f, f) : xg.b(c44.DEFAULT_ASPECT_RATIO, 1.0f, 0.5f, 1.0f, f);
                drawable.setBounds((int) e3.left, drawable.getBounds().top, (int) e3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b * 255.0f));
                return;
        }
    }
}
