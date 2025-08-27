package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ShareMediaView extends p89 {
    public float Z0 = ((float) vo4.b((int) 9.0f));

    public ShareMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        ro4.b();
    }

    public final void onMeasure(int i, int i2) {
        l20 F = this.z.F(0);
        if (ld8.c0(F)) {
            int size = (int) ((((float) View.MeasureSpec.getSize(i)) * 2.0f) / 3.0f);
            setMeasuredDimension((int) ((((float) ld8.F(F)) / ((float) ld8.C(F))) * ((float) size)), size);
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size2, (int) ((((float) ld8.C(F)) / ((float) ld8.F(F))) * ((float) size2)));
        }
        ((wz) this.o.c(0)).x.e(getMeasuredWidth(), getMeasuredHeight());
        K();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, m20] */
    public final void p(a89 a89) {
        w28 w28;
        l20 l20 = a89.a.k().g;
        a89 a892 = this.w0;
        boolean z = true;
        boolean z2 = a892 == null || a892.a.b != a89.a.b || ld8.b(a892, a89);
        if (!z2 && this.w0 != null && (w28 = this.z) != null && !p89.I(l20, w28.F(0))) {
            z = false;
        }
        ? obj = new Object();
        obj.a(l20);
        w28 c = obj.c();
        this.z = c;
        this.w0 = a89;
        wz v = v(a89, 0, c.F(0));
        if (z) {
            lv4 lv4 = v.o;
            lv4.getClass();
            ((sp6) lv4).h(ydd.m);
            if (ld8.c0(this.z.F(0))) {
                lv4 lv42 = v.o;
                lv42.getClass();
                ((sp6) lv42).n(b9d.a(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO));
            } else {
                lv4 lv43 = v.o;
                lv43.getClass();
                float f = this.Z0;
                ((sp6) lv43).n(b9d.a(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, f, f));
            }
            O(this.z.F(0), v, false);
        }
        if (z2) {
            M();
        }
        requestLayout();
    }

    public final int w(l20 l20) {
        return 0;
    }
}
