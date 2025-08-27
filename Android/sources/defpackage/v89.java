package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* renamed from: v89  reason: default package */
public final class v89 extends ViewGroup {
    public boolean a;
    public final int b = MathKt.roundToInt(((float) 32) * vo4.c().getDisplayMetrics().density);
    public final int c;
    public final int o;
    public final int v;
    public long v0;
    public final int w;
    public final RectF w0;
    public View x;
    public Function1 x0;
    public View y;
    public final Lazy z;

    public v89(Context context) {
        super(context);
        float f = (float) 6;
        this.c = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.o = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        this.v = MathKt.roundToInt(((float) 38) * vo4.c().getDisplayMetrics().density);
        this.w = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        this.z = vi9.a.getAccessor().h(et0.class);
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setWillNotDraw(false);
        this.w0 = new RectF();
    }

    private final et0 getBubbleUiOptions() {
        return (et0) this.z.getValue();
    }

    public final int a(int i, u89 u89) {
        if (this.a) {
            i -= this.v;
        }
        int paddingStart = getPaddingStart() + u89.getMarginStart();
        int marginEnd = u89.getMarginEnd();
        return RangesKt.coerceAtMost(getBubbleUiOptions().g(), i - (marginEnd + (getPaddingEnd() + paddingStart)));
    }

    public final long getAvatarId() {
        return this.v0;
    }

    public final View getContentView$message_list_release() {
        return this.x;
    }

    public final int getContentViewTopMargin() {
        View view = this.x;
        if (view == null) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final boolean getOffsetBubbleByAvatar() {
        return this.a;
    }

    public final Function1<Long, Unit> getOnAvatarClickListener$message_list_release() {
        return this.x0;
    }

    public final View getOutsideBubbleView$message_list_release() {
        return this.y;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.x;
        if (view != null) {
            int paddingStart = getPaddingStart();
            u89 u89 = (u89) view.getLayoutParams();
            if (u89.a) {
                if (this.a) {
                    paddingStart += this.b + this.o;
                }
                i5 = u89.getMarginStart() + paddingStart;
            } else {
                int measuredWidth = i3 - view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                i5 = (measuredWidth - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd() : 0)) - getPaddingEnd();
            }
            int i6 = u89.topMargin;
            ev0.x(view, i5, i6, 0, 12);
            View view2 = this.y;
            if (view2 != null && view2.getVisibility() == 0) {
                ev0.x(view2, i5, view.getMeasuredHeight() + i6 + this.w, 0, 12);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.a) {
            int i5 = this.b;
            i3 = this.c;
            i4 = i5 + i3;
        } else {
            i3 = 0;
            i4 = 0;
        }
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        View view = this.x;
        if (view != null) {
            View view2 = this.y;
            int i6 = (view2 == null || view2.getVisibility() != 0) ? IntCompanionObject.MIN_VALUE : 1073741824;
            u89 u89 = (u89) view.getLayoutParams();
            view.measure(View.MeasureSpec.makeMeasureSpec(a(defaultSize, u89), i6), i2);
            i4 = Math.max(i4 + i3, view.getMeasuredHeight() + u89.topMargin + u89.bottomMargin);
            if (view2 != null && view2.getVisibility() == 0) {
                u89 u892 = (u89) view2.getLayoutParams();
                view2.measure(View.MeasureSpec.makeMeasureSpec(a(defaultSize, u892), 1073741824), i2);
                i4 = view2.getMeasuredHeight() + this.w + u892.topMargin + u892.bottomMargin + i4;
            }
        }
        setMeasuredDimension(defaultSize, i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Function1 function1;
        RectF rectF = this.w0;
        if (rectF.isEmpty() || this.v0 <= 0 || !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (function1 = this.x0) != null) {
            function1.invoke(Long.valueOf(this.v0));
        }
        return true;
    }

    public final void setAvatarId(long j) {
        this.v0 = j;
    }

    public final void setListener(t89 t89) {
    }

    public final void setOffsetBubbleByAvatar(boolean z2) {
        this.a = z2;
    }

    public final void setOnAvatarClickListener$message_list_release(Function1<? super Long, Unit> function1) {
        this.x0 = function1;
    }
}
