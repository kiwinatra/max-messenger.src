package defpackage;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: xl7  reason: default package */
public abstract class xl7 {
    public static final vl7 o = new vl7(0);
    public static final vl7 v = new vl7(1);
    public int a = -1;
    public final int b;
    public final int c;

    public xl7(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    public static int b(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= -3158065 & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= -789517 & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    public void a(RecyclerView recyclerView, pzc pzc) {
        View view = pzc.a;
        Object tag = view.getTag(wfc.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = gag.a;
            v9g.s(view, floatValue);
        }
        view.setTag(wfc.item_touch_helper_previous_elevation, (Object) null);
        view.setTranslationX(c44.DEFAULT_ASPECT_RATIO);
        view.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
    }

    public float d(float f) {
        return f;
    }

    public float e() {
        return 0.5f;
    }

    public final int f(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.a == -1) {
            this.a = recyclerView.getResources().getDimensionPixelSize(hec.item_touch_helper_max_drag_scroll_per_frame);
        }
        float f = 1.0f;
        int interpolation = (int) (v.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))) * ((float) (((int) Math.signum((float) i2)) * this.a)));
        if (j <= 2000) {
            f = ((float) j) / 2000.0f;
        }
        int interpolation2 = (int) (o.getInterpolation(f) * ((float) interpolation));
        return interpolation2 == 0 ? i2 > 0 ? 1 : -1 : interpolation2;
    }

    public boolean g() {
        return true;
    }

    public void h(Canvas canvas, RecyclerView recyclerView, pzc pzc, float f, float f2, int i, boolean z) {
        View view = pzc.a;
        if (z && view.getTag(wfc.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = gag.a;
            Float valueOf = Float.valueOf(v9g.i(view));
            int childCount = recyclerView.getChildCount();
            float f3 = c44.DEFAULT_ASPECT_RATIO;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = gag.a;
                    float i3 = v9g.i(childAt);
                    if (i3 > f3) {
                        f3 = i3;
                    }
                }
            }
            v9g.s(view, f3 + 1.0f);
            view.setTag(wfc.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public abstract boolean i(pzc pzc, pzc pzc2);

    public void j(pzc pzc, int i) {
    }
}
