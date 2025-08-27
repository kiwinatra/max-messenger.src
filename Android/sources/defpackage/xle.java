package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: xle  reason: default package */
public final class xle extends LinearLayout implements phf {
    public static final /* synthetic */ KProperty[] x = {rae.s(xle.class, "expandableState", "getExpandableState()Lone/me/sdk/uikit/common/chat/StartMiniAppActionView$ExpandableState;", 0)};
    public final StateListDrawable a;
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(2, this));
    public final Lazy c;
    public final bl o;
    public ValueAnimator v;
    public int w;

    public xle(Context context) {
        super(context, (AttributeSet) null);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 20.0f);
        Unit unit = Unit.INSTANCE;
        stateListDrawable.addState(new int[]{16842910}, gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(vo4.c().getDisplayMetrics().density * 20.0f);
        stateListDrawable.addState(new int[]{-16842910}, gradientDrawable2);
        this.a = stateListDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(dad.R);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        appCompatImageView.setImageDrawable(getLeftOuterDrawable());
        this.c = LazyKt.lazy(new a1b(context, 27));
        Delegates delegates = Delegates.INSTANCE;
        vle vle = vle.a;
        this.o = new bl(this);
        setMinimumWidth(MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density));
        setOrientation(0);
        addView(appCompatImageView);
        onThemeChanged(fu4.k.e(getContext()).f());
        setBackground(stateListDrawable);
        float f = (float) 10;
        float f2 = (float) 6;
        setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
    }

    public static final void a(xle xle) {
        Lazy lazy = xle.c;
        if (lazy.isInitialized()) {
            TextView textView = (TextView) lazy.getValue();
            xle.w = textView.getMeasuredWidth();
            ValueAnimator valueAnimator = xle.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator b2 = b(xle, textView, true);
            xle.v = b2;
            b2.start();
        }
    }

    public static final ValueAnimator b(xle xle, TextView textView, boolean z) {
        int i = 0;
        int i2 = z ? xle.w : 0;
        if (z) {
            xle.getClass();
        } else {
            i = xle.w;
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i2, i}).setDuration(150);
        duration.addUpdateListener(new z00(24, (Object) textView));
        duration.addListener(new wle(z, textView, 1));
        duration.addListener(new wle(z, textView, 0));
        return duration;
    }

    private final Drawable getLeftOuterDrawable() {
        return (Drawable) this.b.getValue();
    }

    public final vle getExpandableState() {
        return (vle) this.o.getValue(this, x[0]);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density), 1073741824));
    }

    public final void onThemeChanged(k2b k2b) {
        Drawable leftOuterDrawable = getLeftOuterDrawable();
        k2b.getIcon().getClass();
        iq.a0(leftOuterDrawable, -1);
        StateListDrawable stateListDrawable = this.a;
        k2b.c().a.getClass();
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{16842910}))).setColor(-16745729);
        ((GradientDrawable) stateListDrawable.getStateDrawable(stateListDrawable.findStateDrawableIndex(new int[]{-16842910}))).setColor(k2b.b().a.r);
    }

    public final void setExpandableState(vle vle) {
        this.o.setValue(this, x[0], vle);
    }

    public final void setText(CharSequence charSequence) {
        Lazy lazy = this.c;
        if (charSequence != null && charSequence.length() != 0) {
            y7e.c(this, (View) lazy.getValue(), -1);
            ((TextView) lazy.getValue()).setText(charSequence);
            ((View) lazy.getValue()).setVisibility(0);
        } else if (lazy.isInitialized()) {
            TextView textView = (TextView) lazy.getValue();
            a(this);
        }
    }
}
