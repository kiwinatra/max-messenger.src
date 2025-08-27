package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;

/* renamed from: b42  reason: default package */
public final class b42 extends View implements phf {
    public final Lazy a;
    public final Lazy b;

    public b42(Context context) {
        super(context, (AttributeSet) null);
        z32 z32 = new z32(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy lazy = LazyKt.lazy(lazyThreadSafetyMode, z32);
        this.a = lazy;
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new z32(this, 1));
        float f = (float) 64;
        setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density)));
        setClipToOutline(true);
        setOutlineProvider(new a42(this, 0));
        setForeground((Drawable) lazy.getValue());
    }

    private final LayerDrawable getSelectedIndicatorIcon() {
        return (LayerDrawable) this.b.getValue();
    }

    public final void onThemeChanged(k2b k2b) {
        Lazy lazy = this.a;
        if (lazy.isInitialized()) {
            ((GradientDrawable) lazy.getValue()).setStroke(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density), k2b.h().j);
        }
        Paint paint = ((ShapeDrawable) getSelectedIndicatorIcon().getDrawable(0)).getPaint();
        k2b.c().getClass();
        paint.setColor(-1728053248);
        Drawable drawable = getSelectedIndicatorIcon().getDrawable(1);
        k2b.getIcon().getClass();
        iq.a0(drawable, -1);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
    }

    public void setSelected(boolean z) {
        setForeground(z ? getSelectedIndicatorIcon() : (Drawable) this.a.getValue());
        super.setSelected(z);
    }
}
