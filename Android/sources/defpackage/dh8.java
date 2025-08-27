package defpackage;

import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* renamed from: dh8  reason: default package */
public final class dh8 extends fg8 {
    public final float g;
    public final float h;
    public final float i;

    public dh8(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(iec.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.h = resources.getDimension(iec.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.i = resources.getDimension(iec.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void a(float f, boolean z, int i2) {
        float interpolation = this.a.getInterpolation(f);
        WeakHashMap weakHashMap = gag.a;
        View view = this.b;
        boolean z2 = (Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 3) == 3;
        boolean z3 = z == z2;
        int width = view.getWidth();
        int height = view.getHeight();
        float f2 = (float) width;
        if (f2 > c44.DEFAULT_ASPECT_RATIO) {
            float f3 = (float) height;
            if (f3 > c44.DEFAULT_ASPECT_RATIO) {
                float f4 = this.g / f2;
                float f5 = this.h / f2;
                float f6 = this.i / f3;
                if (z2) {
                    f2 = 0.0f;
                }
                view.setPivotX(f2);
                if (!z3) {
                    f5 = -f4;
                }
                float a = xg.a(c44.DEFAULT_ASPECT_RATIO, f5, interpolation);
                float f7 = a + 1.0f;
                view.setScaleX(f7);
                float a2 = 1.0f - xg.a(c44.DEFAULT_ASPECT_RATIO, f6, interpolation);
                view.setScaleY(a2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        childAt.setPivotX(z2 ? (float) (childAt.getWidth() + (width - childAt.getRight())) : (float) (-childAt.getLeft()));
                        childAt.setPivotY((float) (-childAt.getTop()));
                        float f8 = z3 ? 1.0f - a : 1.0f;
                        float f9 = a2 != c44.DEFAULT_ASPECT_RATIO ? (f7 / a2) * f8 : 1.0f;
                        childAt.setScaleX(f8);
                        childAt.setScaleY(f9);
                    }
                }
            }
        }
    }
}
