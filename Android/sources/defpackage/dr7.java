package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Reflection;
import kotlin.math.MathKt;

/* renamed from: dr7  reason: default package */
public final class dr7 extends TabLayout implements phf {
    public final Lazy k1 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new ck7(9));

    public dr7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSelectedTabIndicator((Drawable) getIndicatorDrawable());
        js9 js9 = fu4.k;
        setSelectedTabIndicatorColor(js9.e(getContext()).f().c().a.g);
        setTabIndicatorFullWidth(false);
        u3b.a(this, new tj7(3, this, this));
        setTabIndicatorAnimationMode(1);
        setTabTextColors(TabLayout.f(js9.e(getContext()).f().getText().e, js9.e(getContext()).f().getText().f));
        setBackgroundColor(0);
        setTabRippleColor((ColorStateList) null);
        setClipToPadding(false);
        int roundToInt = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        Class<TabLayout> cls = TabLayout.class;
        cjf.O(Reflection.getOrCreateKotlinClass(cls), this, "tabPaddingStart", Integer.valueOf(roundToInt));
        cjf.O(Reflection.getOrCreateKotlinClass(cls), this, "tabPaddingEnd", Integer.valueOf(roundToInt));
    }

    /* access modifiers changed from: private */
    public final GradientDrawable getIndicatorDrawable() {
        return (GradientDrawable) this.k1.getValue();
    }

    public final void onThemeChanged(k2b k2b) {
        setSelectedTabIndicatorColor(k2b.c().a.g);
        js9 js9 = fu4.k;
        setTabTextColors(TabLayout.f(js9.e(getContext()).f().getText().e, js9.e(getContext()).f().getText().f));
        fu4.e(js9.e(getContext()), this);
    }
}
