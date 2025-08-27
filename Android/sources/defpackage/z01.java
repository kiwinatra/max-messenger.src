package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* renamed from: z01  reason: default package */
public final class z01 extends LinearLayout {
    public static final /* synthetic */ int x0 = 0;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final p8d o;
    public final p8d v;
    public ymf v0;
    public final p8d w;
    public u41 w0;
    public y01 x;
    public aj8 y;
    public aj8 z;

    public z01(Context context) {
        super(context, (AttributeSet) null);
        m mVar = new m(27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.a = LazyKt.lazy(lazyThreadSafetyMode, mVar);
        int roundToInt = MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density);
        int roundToInt2 = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
        this.b = LazyKt.lazy(lazyThreadSafetyMode, new j6(15, this));
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new v4(context, 6));
        p8d p8d = new p8d(context, (AttributeSet) null);
        p8d.setId(kgc.call_dinamic);
        p8d.setLayoutParams(new LinearLayout.LayoutParams(roundToInt, roundToInt));
        p8d.setListener(new x01(this, 0));
        p8d.setImageSize(new l8d(roundToInt, roundToInt));
        p8d.setButtonPadding(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 3.5d));
        this.o = p8d;
        p8d p8d2 = new p8d(context, (AttributeSet) null);
        p8d2.setId(kgc.call_microphone);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = roundToInt2;
        p8d2.setLayoutParams(layoutParams);
        p8d2.setListener(new x01(this, 1));
        p8d2.setImageSize(new l8d(roundToInt, roundToInt));
        p8d2.setButtonPadding(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 3.5d));
        this.v = p8d2;
        p8d p8d3 = new p8d(context, (AttributeSet) null);
        p8d3.setId(kgc.call_video);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = roundToInt2;
        p8d3.setLayoutParams(layoutParams2);
        p8d.P(p8d3, cad.U0);
        p8d3.setListener(new x01(this, 2));
        p8d3.setImageSize(new l8d(roundToInt, roundToInt));
        p8d3.setButtonPadding(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 3.5d));
        this.w = p8d3;
        p8d p8d4 = new p8d(context, (AttributeSet) null);
        p8d4.setId(kgc.call_cancel);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = roundToInt2;
        p8d4.setLayoutParams(layoutParams3);
        p8d.P(p8d4, pqa.F);
        p8d4.setAccessibility(Integer.valueOf(ykc.call_cancel_accessibility));
        p8d4.setListener(new x01(this, 3));
        p8d4.setMode(k8d.c);
        p8d4.setImageSize(new l8d(roundToInt, roundToInt));
        p8d4.setButtonPadding(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 3.5d));
        setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, MathKt.roundToInt(((float) 72) * vo4.c().getDisplayMetrics().density));
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#5F2D2D31"));
        setBackground(shapeDrawable);
        int roundToInt3 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        setPadding(roundToInt3, roundToInt3, roundToInt3, roundToInt3);
        addView(p8d);
        addView(p8d2);
        addView(p8d3);
        addView(p8d4);
    }

    public static void a(z01 z01) {
        y01 y01;
        if (z01.w0 != null && (y01 = z01.x) != null) {
            ((grg) y01).C(z01.getContainer());
        }
    }

    public static void c(p8d p8d, Drawable drawable, Drawable drawable2, aj8 aj8, ngf ngf, ngf ngf2) {
        int ordinal = aj8.ordinal();
        if (ordinal == 0) {
            l2b.f.getClass();
            p8d.O(drawable2, -15987442);
            p8d.setMode(k8d.o);
            p8d.setAccessibility(ngf2);
        } else if (ordinal == 1) {
            l2b.f.getClass();
            p8d.O(drawable, -1);
            p8d.setMode(k8d.x);
            p8d.setAccessibility(ngf);
        } else if (ordinal == 2) {
            l2b.f.getClass();
            p8d.O(drawable2, -15987442);
            p8d.setMode(k8d.w);
            p8d.setAccessibility(ngf);
        } else if (ordinal == 3) {
            p8d.O(drawable2, l2b.f.c);
            p8d.setMode(k8d.x);
            p8d.setAccessibility(ngf2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final float[] getBgRadius() {
        return (float[]) this.a.getValue();
    }

    private final View getContainer() {
        return (View) this.b.getValue();
    }

    private final int getContextHeight() {
        int measuredHeight = getContainer().getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = getContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        return g63.b((float) 6, vo4.c().getDisplayMetrics().density, measuredHeight + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
    }

    private final oq9 getMicrophoneOnDrawable() {
        return (oq9) this.c.getValue();
    }

    public final void b() {
        int i;
        igf igf = new igf(sqa.F0);
        int i2 = pqa.z;
        int[] iArr = new int[2];
        p8d p8d = this.v;
        p8d.getLocationOnScreen(iArr);
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        if (orNull != null) {
            i = a81.e((float) 8, vo4.c().getDisplayMetrics().density, orNull.intValue() - (p8d.getWidth() / 2));
        } else {
            i = a81.e((float) 8, vo4.c().getDisplayMetrics().density, (int) p8d.getX());
        }
        Point point = new Point(i, getContextHeight());
        ymf ymf = this.v0;
        if (ymf == null || !ymf.isShowing()) {
            ymf ymf2 = this.v0;
            if (ymf2 != null) {
                ymf2.dismiss();
            }
            ymf ymf3 = new ymf(getContext(), (View) p8d, (Function0) new m(24), (Function0) new m(26), (wmf) null, (vmf) null, 96);
            ymf3.d(igf);
            ymf3.c(Integer.valueOf(i2));
            ymf3.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
            ymf3.setOnDismissListener(new w01(0, this));
            this.v0 = ymf3;
            return;
        }
        ymf ymf4 = this.v0;
        if (ymf4 != null) {
            ymf4.e(point, 8388691, CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c.isInitialized() && this.y == aj8.c) {
            getMicrophoneOnDrawable().start();
        }
    }

    public final void onDetachedFromWindow() {
        if (this.c.isInitialized()) {
            getMicrophoneOnDrawable().stop();
        }
        super.onDetachedFromWindow();
    }

    public final void setAudioInfo(u41 u41) {
        if (!Intrinsics.areEqual((Object) this.w0, (Object) u41)) {
            this.w0 = u41;
            int a2 = u41.a();
            ngf contentDescription = u41.getContentDescription();
            Drawable b2 = ew3.b(getContext(), a2);
            c(this.o, b2, b2, u41 instanceof r41 ? aj8.b : aj8.c, contentDescription, contentDescription);
        }
    }

    public final void setClickListener(y01 y01) {
        this.x = y01;
    }

    public final void setMicrophoneEnabled(aj8 aj8) {
        if (this.y != aj8) {
            this.y = aj8;
            c(this.v, getMicrophoneOnDrawable(), ew3.b(getContext(), pqa.B), aj8, new igf(ykc.call_microphone_enabled_accessibility), new igf(ykc.call_microphone_disabled_accessibility));
            if (aj8 == aj8.c) {
                getMicrophoneOnDrawable().start();
            } else {
                getMicrophoneOnDrawable().stop();
            }
        }
    }

    public final void setVideoEnabled(aj8 aj8) {
        if (this.z != aj8) {
            this.z = aj8;
            c(this.w, ew3.b(getContext(), pqa.c0), ew3.b(getContext(), pqa.a0), aj8, new igf(ykc.call_video_enabled_accessibility), new igf(ykc.call_video_disabled_accessibility));
        }
    }

    public final void setVolumeMicrophone(float f) {
        oq9 microphoneOnDrawable = getMicrophoneOnDrawable();
        microphoneOnDrawable.getClass();
        float coerceIn = RangesKt.coerceIn(f, (float) c44.DEFAULT_ASPECT_RATIO, 1.0f);
        if (microphoneOnDrawable.z != coerceIn) {
            microphoneOnDrawable.z = coerceIn;
            jg jgVar = microphoneOnDrawable.w;
            float[] fArr = {jgVar.a, coerceIn};
            ObjectAnimator objectAnimator = microphoneOnDrawable.x;
            objectAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(jgVar, fArr)});
            objectAnimator.start();
            microphoneOnDrawable.invalidateSelf();
        }
    }
}
