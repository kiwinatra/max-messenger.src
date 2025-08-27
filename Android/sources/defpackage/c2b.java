package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;

/* renamed from: c2b  reason: default package */
public final class c2b extends TabLayout implements phf {
    public final d2b k1 = ((d2b) e2b.a.getValue());
    public final Lazy l1 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new c28(23, this));

    public c2b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setSelectedTabIndicator((Drawable) getIndicatorDrawable());
        fu4.k.e(getContext()).f().h().getClass();
        super.setSelectedTabIndicatorColor(-16745729);
        super.setTabIndicatorFullWidth(false);
        setBackgroundColor(0);
        setTabRippleColor((ColorStateList) null);
        setClipToPadding(false);
        float f = (float) 4;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), getPaddingTop(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), getPaddingBottom());
        cjf.O(Reflection.getOrCreateKotlinClass(TabLayout.class), this, "requestedTabMinWidth", 0);
    }

    private final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.l1.getValue();
    }

    public final void onThemeChanged(k2b k2b) {
        k2b.h().getClass();
        super.setSelectedTabIndicatorColor(-16745729);
        fu4.e(fu4.k.e(getContext()), this);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            layoutParams.height = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        }
        super.setLayoutParams(layoutParams);
    }
}
