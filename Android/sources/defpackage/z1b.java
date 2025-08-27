package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: z1b  reason: default package */
public final class z1b extends SwitchCompat implements phf {
    public final Lazy f1;
    public final Lazy g1;

    public z1b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        pna pna = new pna(21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f1 = LazyKt.lazy(lazyThreadSafetyMode, pna);
        this.g1 = LazyKt.lazy(lazyThreadSafetyMode, new pna(22));
        setThumbDrawable(f(getThumbStateDrawable()));
        setTrackDrawable(f(getTrackThumbDrawable()));
        setSwitchMinWidth(MathKt.roundToInt(((float) 51) * vo4.c().getDisplayMetrics().density));
        setEnforceSwitchWidth(false);
        setSplitTrack(false);
        setShowText(false);
        setBackground((Drawable) null);
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public static StateListDrawable f(j6f j6f) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842910, 16842912}, j6f.a);
        stateListDrawable.addState(new int[]{16842910, -16842912}, j6f.b);
        stateListDrawable.addState(new int[]{-16842910, -16842912}, j6f.d);
        stateListDrawable.addState(new int[]{-16842910, 16842912}, j6f.c);
        return stateListDrawable;
    }

    private final j6f getThumbStateDrawable() {
        return (j6f) this.f1.getValue();
    }

    private final j6f getTrackThumbDrawable() {
        return (j6f) this.g1.getValue();
    }

    public final void onDraw(Canvas canvas) {
        float f = (float) 4;
        int roundToInt = MathKt.roundToInt(((float) (((int) ((getThumbPosition() + 0.2f) * f)) + 20)) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) ((int) ((((float) 1) - getThumbPosition()) * ((float) 6)))) * vo4.c().getDisplayMetrics().density);
        int e = a81.e(f, vo4.c().getDisplayMetrics().density, getWidth() - roundToInt);
        int i = getThumbDrawable().getBounds().left + roundToInt2;
        int height = (getHeight() / 2) - (roundToInt / 2);
        getThumbDrawable().setBounds(RangesKt.coerceAtMost(i, e), height, RangesKt.coerceAtMost(i, e) + roundToInt, roundToInt + height);
        super.onDraw(canvas);
    }

    public final void onThemeChanged(k2b k2b) {
        GradientDrawable gradientDrawable = getThumbStateDrawable().a;
        k2b.getIcon().getClass();
        gradientDrawable.setColor(ColorStateList.valueOf(-1));
        getThumbStateDrawable().b.setColor(ColorStateList.valueOf(k2b.getIcon().i));
        GradientDrawable gradientDrawable2 = getTrackThumbDrawable().a;
        k2b.c().a.getClass();
        gradientDrawable2.setColor(ColorStateList.valueOf(-16745729));
        GradientDrawable gradientDrawable3 = getTrackThumbDrawable().a;
        float f = (float) 2;
        int roundToInt = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        k2b.c().a.getClass();
        gradientDrawable3.setStroke(roundToInt, ColorStateList.valueOf(-16745729));
        getTrackThumbDrawable().b.setColor(ColorStateList.valueOf(0));
        getTrackThumbDrawable().b.setStroke(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), ColorStateList.valueOf(k2b.h().j));
        getTrackThumbDrawable().c.setColor(ColorStateList.valueOf(k2b.b().a.r));
        getTrackThumbDrawable().d.setColor(ColorStateList.valueOf(k2b.b().a.l));
    }
}
