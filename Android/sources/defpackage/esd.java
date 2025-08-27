package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: esd  reason: default package */
public final class esd {
    public final ViewGroup a;
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new ifb(27, this));

    public esd(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final int a() {
        return ((csd) this.b.getValue()).getMeasuredHeight();
    }

    public final int b() {
        return ((csd) this.b.getValue()).getMeasuredWidth();
    }

    public final void c(int i, int i2) {
        ev0.x((View) this.b.getValue(), i, i2, 0, 12);
    }

    public final void d(int i, int i2) {
        ((csd) this.b.getValue()).measure(i, i2);
    }

    public final void e(Layout layout) {
        Lazy lazy = this.b;
        if (layout != null) {
            csd csd = (csd) lazy.getValue();
            csd.a = layout;
            TextPaint paint = layout.getPaint();
            if (paint != null) {
                paint.setColor(csd.b);
            }
            csd.requestLayout();
            csd.invalidate();
            if (csd.getParent() == null) {
                this.a.addView(csd, new ViewGroup.LayoutParams(-2, -2));
            }
            csd.setVisibility(0);
        } else if (lazy.isInitialized()) {
            ((csd) lazy.getValue()).setVisibility(8);
        }
    }

    public final void f(int i) {
        TextPaint paint;
        Lazy lazy = this.b;
        if (lazy.isInitialized()) {
            csd csd = (csd) lazy.getValue();
            csd.b = i;
            Layout layout = csd.a;
            if (!(layout == null || (paint = layout.getPaint()) == null)) {
                paint.setColor(i);
            }
            csd.invalidate();
        }
    }
}
