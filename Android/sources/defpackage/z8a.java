package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: z8a  reason: default package */
public final class z8a extends h3b {
    public boolean H0;

    private final int getVerticalPaddingOffset() {
        return (getPaddingTop() / 2) - (getPaddingBottom() / 2);
    }

    public static void o(View view, int i, int i2) {
        view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }

    public static void p(View view, int i, int i2) {
        view.layout(i, i2 - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + i, view.getMeasuredHeight() + (i2 - (view.getMeasuredHeight() / 2)));
    }

    public final void f(j7e j7e) {
        addView(j7e);
    }

    public boolean getShouldUpdateConstraints() {
        return this.H0;
    }

    public final void h(View view) {
        addView(view);
    }

    public final void i(View view) {
        removeView(view);
    }

    public final void j() {
    }

    public final void n() {
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int verticalPaddingOffset;
        int measuredHeight2;
        int verticalPaddingOffset2;
        int measuredHeight3;
        int verticalPaddingOffset3;
        int ordinal = getForm().ordinal();
        if (ordinal == 0) {
            View t = y7e.t(getSelectionViewLazy());
            if (t != null) {
                p(t, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View leftView = getLeftView();
            if (leftView != null) {
                leftView.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (leftView.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), leftView.getMeasuredWidth() + getPaddingLeft(), (leftView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View t2 = y7e.t(getSubtitleTextViewLazy());
            if (t2 != null) {
                measuredHeight = (((getMeasuredHeight() - t2.getMeasuredHeight()) - getTitleTextView().getMeasuredHeight()) - MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset = getVerticalPaddingOffset();
            } else {
                measuredHeight = (getMeasuredHeight() / 2) - (getTitleTextView().getMeasuredHeight() / 2);
                verticalPaddingOffset = getVerticalPaddingOffset();
            }
            int i5 = measuredHeight + verticalPaddingOffset;
            View rightPrimaryView = getRightPrimaryView();
            View rightSecondaryView = getRightSecondaryView();
            if ((rightSecondaryView instanceof pza) && k()) {
                pza pza = (pza) rightSecondaryView;
                pza.layout((getMeasuredWidth() - getPaddingRight()) - pza.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (pza.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (pza.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightPrimaryView != null && rightSecondaryView != null) {
                rightPrimaryView.layout((getMeasuredWidth() - getPaddingRight()) - rightPrimaryView.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightPrimaryView.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightPrimaryView.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                float f = (float) 12;
                rightSecondaryView.layout(a81.e(f, vo4.c().getDisplayMetrics().density, ct.s(rightPrimaryView) - rightSecondaryView.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (rightSecondaryView.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), a81.e(f, vo4.c().getDisplayMetrics().density, ct.s(rightPrimaryView)), (rightSecondaryView.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightSecondaryView != null) {
                rightSecondaryView.layout((getMeasuredWidth() - getPaddingRight()) - rightSecondaryView.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightSecondaryView.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightSecondaryView.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightPrimaryView != null) {
                rightPrimaryView.layout((getMeasuredWidth() - getPaddingRight()) - rightPrimaryView.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightPrimaryView.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightPrimaryView.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
            View t3 = y7e.t(getTitleAvatarViewLazy());
            View t4 = y7e.t(getTitleDropdownViewLazy());
            int measuredHeight4 = (getTitleTextView().getMeasuredHeight() / 2) + i5;
            int i6 = 0;
            int roundToInt = t3 != null ? (MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) + t3.getMeasuredWidth()) / 2 : 0;
            if (t4 != null) {
                i6 = (MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) + t4.getMeasuredWidth()) / 2;
            }
            int measuredWidth = (((getMeasuredWidth() / 2) - roundToInt) - i6) - (getTitleTextView().getMeasuredWidth() / 2);
            if (t3 != null) {
                p(t3, measuredWidth, measuredHeight4);
                measuredWidth = tr1.e((float) 8, vo4.c().getDisplayMetrics().density, t3.getMeasuredWidth(), measuredWidth);
            }
            o(getTitleTextView(), measuredWidth, i5);
            float f2 = (float) 2;
            int e = tr1.e(f2, vo4.c().getDisplayMetrics().density, getTitleTextView().getMeasuredWidth(), measuredWidth);
            if (t4 != null) {
                p(t4, e, measuredHeight4);
            }
            if (t2 != null) {
                int measuredWidth2 = (getMeasuredWidth() / 2) - (t2.getMeasuredWidth() / 2);
                View t5 = y7e.t(getTitleAvatarViewLazy());
                o(t2, measuredWidth2, MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density) + (t5 != null ? t5.getBottom() : getTitleTextView().getBottom()));
            }
        } else if (ordinal == 1) {
            View t6 = y7e.t(getSelectionViewLazy());
            if (t6 != null) {
                p(t6, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View t7 = y7e.t(getSubtitleTextViewLazy());
            if (t7 != null) {
                measuredHeight2 = (((getMeasuredHeight() - t7.getMeasuredHeight()) - getTitleTextView().getMeasuredHeight()) - MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density)) / 2;
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            } else {
                measuredHeight2 = (getMeasuredHeight() / 2) - (getTitleTextView().getMeasuredHeight() / 2);
                verticalPaddingOffset2 = getVerticalPaddingOffset();
            }
            int i7 = measuredHeight2 + verticalPaddingOffset2;
            o(getTitleTextView(), getPaddingLeft(), i7);
            View t8 = y7e.t(getTitleDropdownViewLazy());
            if (t8 != null) {
                p(t8, g63.b((float) 2, vo4.c().getDisplayMetrics().density, getTitleTextView().getRight()), (getTitleTextView().getMeasuredHeight() / 2) + i7);
            }
            if (t7 != null) {
                o(t7, getPaddingLeft(), MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) + getTitleTextView().getBottom());
            }
            View rightPrimaryView2 = getRightPrimaryView();
            View rightSecondaryView2 = getRightSecondaryView();
            if ((rightSecondaryView2 instanceof pza) && k()) {
                pza pza2 = (pza) rightSecondaryView2;
                pza2.layout((getMeasuredWidth() - getPaddingRight()) - pza2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (pza2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (pza2.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightPrimaryView2 != null && rightSecondaryView2 != null) {
                rightPrimaryView2.layout((getMeasuredWidth() - getPaddingRight()) - rightPrimaryView2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightPrimaryView2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightPrimaryView2.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                float f3 = (float) 16;
                rightSecondaryView2.layout(a81.e(f3, vo4.c().getDisplayMetrics().density, ct.s(rightPrimaryView2) - rightSecondaryView2.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (rightSecondaryView2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), a81.e(f3, vo4.c().getDisplayMetrics().density, ct.s(rightPrimaryView2)), (rightSecondaryView2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightSecondaryView2 != null) {
                rightSecondaryView2.layout((getMeasuredWidth() - getPaddingRight()) - rightSecondaryView2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightSecondaryView2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightSecondaryView2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightPrimaryView2 != null) {
                rightPrimaryView2.layout((getMeasuredWidth() - getPaddingRight()) - rightPrimaryView2.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightPrimaryView2.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightPrimaryView2.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
        } else if (ordinal == 2) {
            View t9 = y7e.t(getSelectionViewLazy());
            if (t9 != null) {
                p(t9, getPaddingStart(), (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                return;
            }
            View t10 = y7e.t(getSubtitleTextViewLazy());
            if (t10 != null) {
                measuredHeight3 = ((getMeasuredHeight() - t10.getMeasuredHeight()) - getTitleTextView().getMeasuredHeight()) / 2;
                verticalPaddingOffset3 = getVerticalPaddingOffset();
            } else {
                measuredHeight3 = (getMeasuredHeight() / 2) - (getTitleTextView().getMeasuredHeight() / 2);
                verticalPaddingOffset3 = getVerticalPaddingOffset();
            }
            int i8 = measuredHeight3 + verticalPaddingOffset3;
            int paddingLeft = getPaddingLeft();
            View leftView2 = getLeftView();
            if (leftView2 != null) {
                leftView2.layout(getPaddingLeft(), ((getMeasuredHeight() / 2) - (leftView2.getMeasuredHeight() / 2)) + getVerticalPaddingOffset(), leftView2.getMeasuredWidth() + getPaddingLeft(), (leftView2.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                paddingLeft += leftView2.getMeasuredWidth();
            }
            View t11 = y7e.t(getTitleAvatarViewLazy());
            if (t11 != null) {
                int roundToInt2 = paddingLeft + (getLeftView() != null ? MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) / 2 : MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density));
                p(t11, roundToInt2, (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
                paddingLeft = roundToInt2 + t11.getMeasuredWidth();
            }
            float f4 = (float) 8;
            int b = g63.b(f4, vo4.c().getDisplayMetrics().density, paddingLeft);
            o(getTitleTextView(), b, i8);
            View t12 = y7e.t(getTitleDropdownViewLazy());
            if (t12 != null) {
                p(t12, g63.b((float) 2, vo4.c().getDisplayMetrics().density, getTitleTextView().getRight()), (getTitleTextView().getMeasuredHeight() / 2) + i8);
            }
            if (t10 != null) {
                o(t10, b, getTitleTextView().getBottom());
            }
            View rightPrimaryView3 = getRightPrimaryView();
            View rightSecondaryView3 = getRightSecondaryView();
            if ((rightSecondaryView3 instanceof pza) && k()) {
                pza pza3 = (pza) rightSecondaryView3;
                pza3.layout((getMeasuredWidth() - getPaddingRight()) - pza3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (pza3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (pza3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightPrimaryView3 != null && rightSecondaryView3 != null) {
                rightPrimaryView3.layout((getMeasuredWidth() - getPaddingRight()) - rightPrimaryView3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightPrimaryView3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightPrimaryView3.getMeasuredWidth() / 2) + (getHeight() / 2) + getVerticalPaddingOffset());
                rightSecondaryView3.layout(a81.e(f4, vo4.c().getDisplayMetrics().density, ct.s(rightPrimaryView3) - rightSecondaryView3.getMeasuredWidth()), ((getMeasuredHeight() / 2) - (rightSecondaryView3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), a81.e(f4, vo4.c().getDisplayMetrics().density, ct.s(rightPrimaryView3)), (rightSecondaryView3.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightSecondaryView3 != null) {
                rightSecondaryView3.layout((getMeasuredWidth() - getPaddingRight()) - rightSecondaryView3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightSecondaryView3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightSecondaryView3.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            } else if (rightPrimaryView3 != null) {
                rightPrimaryView3.layout((getMeasuredWidth() - getPaddingRight()) - rightPrimaryView3.getMeasuredWidth(), ((getMeasuredHeight() / 2) - (rightPrimaryView3.getMeasuredWidth() / 2)) + getVerticalPaddingOffset(), getMeasuredWidth() - getPaddingRight(), (rightPrimaryView3.getMeasuredWidth() / 2) + (getMeasuredHeight() / 2) + getVerticalPaddingOffset());
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int ordinal = getForm().ordinal();
        if (ordinal == 0) {
            int size = View.MeasureSpec.getSize(i);
            int paddingBottom = getPaddingBottom() + getPaddingTop() + MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density);
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            View t = y7e.t(getSelectionViewLazy());
            if (t != null) {
                t.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824));
            }
            if (t != null) {
                measureChild(t, i3, i4);
            }
            float f = (float) 12;
            float f2 = f;
            int paddingRight = getPaddingRight() + q(i, i2, MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), getRightPrimaryView(), getRightSecondaryView());
            int paddingLeft2 = getPaddingLeft();
            View leftView = getLeftView();
            if (leftView != null) {
                measureChild(leftView, i3, i4);
                paddingLeft2 = tr1.e(f2, vo4.c().getDisplayMetrics().density, leftView.getMeasuredWidth(), paddingLeft2);
            }
            int max = size - (Math.max(paddingLeft2, paddingRight) * 2);
            View t2 = y7e.t(getSubtitleTextViewLazy());
            if (t2 != null) {
                t2.measure(View.MeasureSpec.makeMeasureSpec(max, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View t3 = y7e.t(getTitleAvatarViewLazy());
            if (t3 != null) {
                measureChild(t3, i3, i4);
                max -= MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density) + t3.getMeasuredWidth();
            }
            View t4 = y7e.t(getTitleDropdownViewLazy());
            if (t4 != null) {
                measureChild(t4, i3, i4);
                max -= MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) + t4.getMeasuredWidth();
            }
            getTitleTextView().measure(View.MeasureSpec.makeMeasureSpec(max, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size, paddingBottom);
        } else if (ordinal == 1) {
            int size2 = View.MeasureSpec.getSize(i);
            int paddingBottom2 = getPaddingBottom() + getPaddingTop() + MathKt.roundToInt(((float) 52) * vo4.c().getDisplayMetrics().density);
            int paddingLeft3 = (size2 - getPaddingLeft()) - getPaddingRight();
            View t5 = y7e.t(getSelectionViewLazy());
            if (t5 != null) {
                t5.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft3, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom2, 1073741824));
            }
            int q = paddingLeft3 - q(i, i2, MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density), getRightPrimaryView(), getRightSecondaryView());
            View t6 = y7e.t(getSubtitleTextViewLazy());
            if (t6 != null) {
                t6.measure(View.MeasureSpec.makeMeasureSpec(q, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View t7 = y7e.t(getTitleDropdownViewLazy());
            if (t7 != null) {
                measureChild(t7, i3, i4);
                q -= MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) + t7.getMeasuredWidth();
            }
            getTitleTextView().measure(View.MeasureSpec.makeMeasureSpec(q, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size2, paddingBottom2);
        } else if (ordinal == 2) {
            int size3 = View.MeasureSpec.getSize(i);
            float f3 = (float) 64;
            int paddingBottom3 = getPaddingBottom() + getPaddingTop() + MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3);
            int paddingLeft4 = (size3 - getPaddingLeft()) - getPaddingRight();
            View t8 = y7e.t(getSelectionViewLazy());
            if (t8 != null) {
                t8.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft4, 1073741824), View.MeasureSpec.makeMeasureSpec(paddingBottom3, 1073741824));
            }
            float f4 = (float) 8;
            int q2 = paddingLeft4 - q(i, i2, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), getRightPrimaryView(), getRightSecondaryView());
            View leftView2 = getLeftView();
            if (leftView2 != null) {
                measureChild(leftView2, i3, i4);
                q2 -= leftView2.getMeasuredWidth();
            }
            View t9 = y7e.t(getTitleAvatarViewLazy());
            if (t9 != null) {
                measureChild(t9, i3, i4);
                q2 -= MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density) + (t9.getMeasuredWidth() + (getLeftView() != null ? MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4) / 2 : MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4)));
            }
            View t10 = y7e.t(getSubtitleTextViewLazy());
            if (t10 != null) {
                t10.measure(View.MeasureSpec.makeMeasureSpec(q2, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            View t11 = y7e.t(getTitleDropdownViewLazy());
            if (t11 != null) {
                measureChild(t11, i3, i4);
                q2 -= MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density) + t11.getMeasuredWidth();
            }
            getTitleTextView().measure(View.MeasureSpec.makeMeasureSpec(q2, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            setMeasuredDimension(size3, getPaddingBottom() + getPaddingTop() + MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final int q(int i, int i2, int i3, int i4, View view, View view2) {
        int measuredWidth;
        if (view == null || view2 == null) {
            if (view != null) {
                measureChild(view, i, i2);
                measuredWidth = view.getMeasuredWidth();
            } else if (view2 == null) {
                return 0;
            } else {
                measureChild(view2, i, i2);
                measuredWidth = view2.getMeasuredWidth();
            }
            return measuredWidth + i3;
        }
        measureChild(view, i, i2);
        measureChild(view2, i, i2);
        return view2.getMeasuredWidth() + view.getMeasuredWidth() + i4 + i3;
    }

    public void setShouldUpdateConstraints(boolean z) {
        this.H0 = z;
    }

    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }
}
