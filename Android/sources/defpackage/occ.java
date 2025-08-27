package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: occ  reason: default package */
public final class occ extends ViewGroup implements phf {
    public final TextView a;
    public final ela b;
    public final OneMeDraweeView c;
    public final Lazy o;
    public final Lazy v;
    public final Paint w;
    public final Lazy x;
    public final int y = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
    public final int z;

    public occ(Context context) {
        super(context);
        TextView textView = new TextView(context);
        puf.s.b(textView, uy4.b);
        js9 js9 = fu4.k;
        textView.setTextColor(js9.e(textView.getContext()).f().getText().f);
        textView.setSingleLine();
        textView.setFallbackLineSpacing(false);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setFocusable(0);
        this.a = textView;
        ela ela = new ela(context);
        puf.l.b(ela, uy4.b);
        ela.setTextColor(js9.e(ela.getContext()).f().getText().g);
        ela.setSingleLine();
        ela.setFallbackLineSpacing(false);
        ela.setEllipsize(truncateAt);
        ela.setFocusable(0);
        gsg.h(ela);
        ela.setVisibility(8);
        this.b = ela;
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 4.0f));
        oneMeDraweeView.setVisibility(8);
        this.c = oneMeDraweeView;
        ifb ifb = new ifb(10, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = LazyKt.lazy(lazyThreadSafetyMode, ifb);
        this.v = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 12));
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        js9.e(getContext()).f().h().getClass();
        paint.setColor(-16745729);
        this.w = paint;
        this.x = LazyKt.lazy(lazyThreadSafetyMode, new a1b(context, 13));
        float f = (float) 4;
        this.z = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float f2 = (float) 6;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        addView(textView);
        addView(ela);
        addView(oneMeDraweeView);
        onThemeChanged(js9.e(getContext()).f());
    }

    private final void setCounter(int i) {
        Lazy lazy = this.v;
        wsa wsa = (wsa) lazy.getValue();
        wsa.setVisibility(0);
        wsa.g(i, false);
        y7e.c(this, (View) lazy.getValue(), (Integer) null);
        requestLayout();
        invalidate();
    }

    public final void a(String str, Integer num) {
        OneMeDraweeView oneMeDraweeView = this.c;
        oneMeDraweeView.setVisibility((str != null && !StringsKt.isBlank(str)) || num != null ? 0 : 8);
        oneMeDraweeView.o(str != null ? qa7.b(str) : null, (qa7) null);
        if ((str == null || StringsKt.isBlank(str)) && num != null) {
            Context context = oneMeDraweeView.getContext();
            int intValue = num.intValue();
            js9 js9 = fu4.k;
            ((sp6) oneMeDraweeView.getHierarchy()).i(iq.E(intValue, js9.e(oneMeDraweeView.getContext()).f().getIcon().h, context), 1);
            int roundToInt = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
            oneMeDraweeView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
            oneMeDraweeView.setBackgroundColor(js9.e(oneMeDraweeView.getContext()).f().c().a.g);
            return;
        }
        ((sp6) oneMeDraweeView.getHierarchy()).i((Drawable) null, 1);
        oneMeDraweeView.setPadding(0, 0, 0, 0);
    }

    public final void dispatchDraw(Canvas canvas) {
        float f;
        boolean y2 = ct.y(getContext());
        Paint paint = this.w;
        if (y2) {
            f = ((float) (getMeasuredWidth() - getPaddingEnd())) - (paint.getStrokeWidth() / ((float) 2));
        } else {
            f = (paint.getStrokeWidth() / ((float) 2)) + ((float) getPaddingStart());
        }
        canvas.drawLine(f, (float) getPaddingTop(), f, (float) (getMeasuredHeight() - getPaddingBottom()), paint);
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        Lazy lazy = this.v;
        if (!lazy.isInitialized() || view != lazy.getValue() || this.c.getVisibility() == 0) {
            return super.drawChild(canvas, view, j);
        }
        return true;
    }

    public final TextView getTitleView() {
        return this.a;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int i5 = this.y;
        int roundToInt = MathKt.roundToInt(this.w.getStrokeWidth()) + paddingStart + i5;
        OneMeDraweeView oneMeDraweeView = this.c;
        if (oneMeDraweeView.getVisibility() == 0) {
            ev0.w(oneMeDraweeView, roundToInt, (getMeasuredHeight() / 2) - (oneMeDraweeView.getMeasuredHeight() / 2), oneMeDraweeView.getMeasuredWidth() + roundToInt, (oneMeDraweeView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
            roundToInt += oneMeDraweeView.getMeasuredWidth() + i5;
            Lazy lazy = this.v;
            if (lazy.isInitialized()) {
                wsa wsa = (wsa) lazy.getValue();
                float f = (float) 2;
                ev0.w(wsa, a81.e(f, vo4.c().getDisplayMetrics().density, oneMeDraweeView.getLeft()), g63.b(f, vo4.c().getDisplayMetrics().density, oneMeDraweeView.getBottom()) - wsa.getMeasuredHeight(), wsa.getMeasuredWidth() + a81.e(f, vo4.c().getDisplayMetrics().density, oneMeDraweeView.getLeft()), g63.b(f, vo4.c().getDisplayMetrics().density, oneMeDraweeView.getBottom()));
            }
        }
        ela ela = this.b;
        int visibility = ela.getVisibility();
        TextView textView = this.a;
        if (visibility == 0) {
            float f2 = (float) 4;
            ev0.x(textView, roundToInt, g63.b(f2, vo4.c().getDisplayMetrics().density, getPaddingTop()), 0, 12);
            int e = a81.e(f2, vo4.c().getDisplayMetrics().density, getMeasuredHeight() - getPaddingBottom());
            ev0.w(ela, roundToInt, e - ela.getMeasuredHeight(), ela.getMeasuredWidth() + roundToInt, e);
        } else {
            ev0.w(textView, roundToInt, (getMeasuredHeight() / 2) - (textView.getMeasuredHeight() / 2), textView.getMeasuredWidth() + roundToInt, (textView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        Lazy lazy2 = this.x;
        if (y7e.L(lazy2)) {
            ImageView imageView = (ImageView) lazy2.getValue();
            int e2 = a81.e((float) 36, vo4.c().getDisplayMetrics().density, getMeasuredWidth() - getPaddingEnd());
            ev0.w(imageView, e2, (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), imageView.getMeasuredWidth() + e2, (imageView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
    }

    public final void onMeasure(int i, int i2) {
        Paint paint = this.w;
        paint.setStrokeWidth(vo4.c().getDisplayMetrics().density * 2.0f);
        int size = View.MeasureSpec.getMode(i) == 0 ? getContext().getResources().getDisplayMetrics().widthPixels : View.MeasureSpec.getSize(i);
        int roundToInt = MathKt.roundToInt(paint.getStrokeWidth()) + getPaddingStart();
        int i3 = this.y;
        int paddingEnd = getPaddingEnd() + roundToInt + i3;
        OneMeDraweeView oneMeDraweeView = this.c;
        if (oneMeDraweeView.getVisibility() == 0) {
            int roundToInt2 = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
            oneMeDraweeView.measure(View.MeasureSpec.makeMeasureSpec(roundToInt2, 1073741824), View.MeasureSpec.makeMeasureSpec(roundToInt2, 1073741824));
            paddingEnd += oneMeDraweeView.getMeasuredWidth() + i3;
            Lazy lazy = this.v;
            if (lazy.isInitialized()) {
                ((wsa) lazy.getValue()).measure(0, 0);
            }
        }
        Lazy lazy2 = this.x;
        if (y7e.L(lazy2)) {
            int roundToInt3 = MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density);
            ((ImageView) lazy2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(roundToInt3, 1073741824), View.MeasureSpec.makeMeasureSpec(roundToInt3, 1073741824));
            paddingEnd = tr1.e((float) 6, vo4.c().getDisplayMetrics().density, ((ImageView) lazy2.getValue()).getMeasuredWidth(), paddingEnd);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(RangesKt.coerceAtLeast(size - paddingEnd, 0), IntCompanionObject.MIN_VALUE);
        TextView textView = this.a;
        textView.measure(makeMeasureSpec, 0);
        int measuredHeight = textView.getMeasuredHeight() + getPaddingTop() + getPaddingBottom();
        int i4 = this.z;
        int i5 = (i4 * 2) + measuredHeight;
        ela ela = this.b;
        if (ela.getVisibility() == 0) {
            ela.measure(makeMeasureSpec, 0);
            i5 += ela.getMeasuredHeight() + i4;
        }
        if (oneMeDraweeView.getVisibility() == 0) {
            setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + (MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) * 2) + oneMeDraweeView.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(size, i5);
    }

    public final void onThemeChanged(k2b k2b) {
        this.a.setTextColor(k2b.getText().f);
        this.b.setTextColor(k2b.getText().g);
        k2b.h().getClass();
        this.w.setColor(-16745729);
        Lazy lazy = this.v;
        if (lazy.isInitialized()) {
            ((wsa) lazy.getValue()).f(k2b);
        }
        Lazy lazy2 = this.x;
        if (lazy2.isInitialized()) {
            ((ImageView) lazy2.getValue()).setImageTintList(ColorStateList.valueOf(k2b.getIcon().h));
        }
        OneMeDraweeView oneMeDraweeView = this.c;
        boolean z2 = ((sp6) oneMeDraweeView.getHierarchy()).e.a(1) != null;
        js9 js9 = fu4.k;
        if (z2) {
            oneMeDraweeView.setBackgroundColor(js9.e(getContext()).f().c().a.g);
        }
        Lazy lazy3 = this.o;
        if (lazy3.isInitialized() && ((LayerDrawable) lazy3.getValue()).getNumberOfLayers() > 1) {
            LayerDrawable layerDrawable = (LayerDrawable) lazy3.getValue();
            int i = js9.e(getContext()).f().c().d;
            Drawable drawable = layerDrawable.getDrawable(0);
            iq.a0(drawable, i);
            layerDrawable.setDrawable(0, drawable);
            LayerDrawable layerDrawable2 = (LayerDrawable) lazy3.getValue();
            int i2 = js9.e(getContext()).f().getIcon().b;
            Drawable drawable2 = layerDrawable2.getDrawable(1);
            iq.a0(drawable2, i2);
            layerDrawable2.setDrawable(1, drawable2);
        }
    }

    public final void setBody(CharSequence charSequence) {
        ela ela = this.b;
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            ela.setVisibility(8);
            return;
        }
        ela.setVisibility(0);
        ela.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setDrawOverlay(boolean z2) {
        OneMeDraweeView oneMeDraweeView = this.c;
        if (z2) {
            ((sp6) oneMeDraweeView.getHierarchy()).k((Drawable) this.o.getValue());
        } else {
            ((sp6) oneMeDraweeView.getHierarchy()).k((Drawable) null);
        }
    }

    public final void setImageClickListener(View.OnClickListener onClickListener) {
        ct.G(this.c, 300, onClickListener);
    }

    public final void setRightIconClickListener(View.OnClickListener onClickListener) {
        Lazy lazy = this.x;
        if (lazy.isInitialized()) {
            ct.G((ImageView) lazy.getValue(), 300, onClickListener);
        }
    }

    public final void setRightIconDrawable(Drawable drawable) {
        Lazy lazy = this.x;
        if (drawable != null) {
            ImageView imageView = (ImageView) lazy.getValue();
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            y7e.c(this, (View) lazy.getValue(), -1);
        } else if (lazy.isInitialized()) {
            ImageView imageView2 = (ImageView) lazy.getValue();
            imageView2.setImageDrawable((Drawable) null);
            imageView2.setVisibility(8);
        }
        requestLayout();
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.setText(charSequence);
        requestLayout();
        invalidate();
    }

    public final void setCounter(Integer num) {
        if (num == null) {
            Lazy lazy = this.v;
            if (lazy.isInitialized()) {
                ((wsa) lazy.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        setCounter(num.intValue());
    }
}
