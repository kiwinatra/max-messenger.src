package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

public class NestedScrollView extends FrameLayout implements k6a, g6a, nid {
    public static final float N0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final rg8 O0 = new rg8(3);
    public static final int[] P0 = {16843130};
    public final int A0;
    public final int B0;
    public final int C0;
    public int D0;
    public final int[] E0;
    public final int[] F0;
    public int G0;
    public int H0;
    public f6a I0;
    public final ft J0;
    public final i6a K0;
    public float L0;
    public final qo4 M0;
    public final float a;
    public long b;
    public final Rect c;
    public final OverScroller o;
    public final EdgeEffect v;
    public View v0;
    public final EdgeEffect w;
    public boolean w0;
    public int x;
    public VelocityTracker x0;
    public boolean y;
    public boolean y0;
    public boolean z;
    public boolean z0;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, adc.nestedScrollViewStyle);
    }

    public static boolean g(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && g((View) parent, view2);
    }

    public final void a(int i) {
        this.K0.i(i);
    }

    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final boolean b(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !h(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            q(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            q(c(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!h(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int c(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void computeScroll() {
        /*
            r14 = this;
            android.widget.OverScroller r0 = r14.o
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            android.widget.OverScroller r0 = r14.o
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r14.o
            int r0 = r0.getCurrY()
            int r1 = r14.H0
            int r1 = r0 - r1
            int r2 = r14.getHeight()
            android.widget.EdgeEffect r3 = r14.w
            android.widget.EdgeEffect r4 = r14.v
            r5 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            r7 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x0047
            float r8 = defpackage.b0h.u(r4)
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0047
            int r6 = -r1
            float r6 = (float) r6
            float r6 = r6 * r7
            float r8 = (float) r2
            float r6 = r6 / r8
            int r2 = -r2
            float r2 = (float) r2
            float r2 = r2 / r7
            float r5 = defpackage.b0h.G(r4, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r4.finish()
        L_0x0045:
            int r1 = r1 - r2
            goto L_0x0065
        L_0x0047:
            if (r1 >= 0) goto L_0x0065
            float r8 = defpackage.b0h.u(r3)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0065
            float r6 = (float) r1
            float r6 = r6 * r7
            float r2 = (float) r2
            float r6 = r6 / r2
            float r2 = r2 / r7
            float r5 = defpackage.b0h.G(r3, r6, r5)
            float r5 = r5 * r2
            int r2 = java.lang.Math.round(r5)
            if (r2 == r1) goto L_0x0045
            r3.finish()
            goto L_0x0045
        L_0x0065:
            r14.H0 = r0
            int[] r0 = r14.F0
            r2 = 1
            r11 = 0
            r0[r2] = r11
            r7 = 0
            i6a r5 = r14.K0
            r8 = 0
            r10 = 1
            r6 = r0
            r9 = r1
            r5.c(r6, r7, r8, r9, r10)
            r5 = r0[r2]
            int r1 = r1 - r5
            int r13 = r14.getScrollRange()
            if (r1 == 0) goto L_0x00a3
            int r5 = r14.getScrollY()
            int r6 = r14.getScrollX()
            r14.k(r1, r6, r5, r13)
            int r6 = r14.getScrollY()
            int r7 = r6 - r5
            int r1 = r1 - r7
            r0[r2] = r11
            r6 = 0
            r8 = 0
            i6a r5 = r14.K0
            int[] r10 = r14.E0
            r11 = 1
            r9 = r1
            r12 = r0
            r5.e(r6, r7, r8, r9, r10, r11, r12)
            r0 = r0[r2]
            int r1 = r1 - r0
        L_0x00a3:
            if (r1 == 0) goto L_0x00da
            int r0 = r14.getOverScrollMode()
            if (r0 == 0) goto L_0x00af
            if (r0 != r2) goto L_0x00d2
            if (r13 <= 0) goto L_0x00d2
        L_0x00af:
            if (r1 >= 0) goto L_0x00c2
            boolean r0 = r4.isFinished()
            if (r0 == 0) goto L_0x00d2
            android.widget.OverScroller r0 = r14.o
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r4.onAbsorb(r0)
            goto L_0x00d2
        L_0x00c2:
            boolean r0 = r3.isFinished()
            if (r0 == 0) goto L_0x00d2
            android.widget.OverScroller r0 = r14.o
            float r0 = r0.getCurrVelocity()
            int r0 = (int) r0
            r3.onAbsorb(r0)
        L_0x00d2:
            android.widget.OverScroller r0 = r14.o
            r0.abortAnimation()
            r14.a(r2)
        L_0x00da:
            android.widget.OverScroller r0 = r14.o
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00e6
            r14.postInvalidateOnAnimation()
            goto L_0x00e9
        L_0x00e6:
            r14.a(r2)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final boolean d(KeyEvent keyEvent) {
        this.c.setEmpty();
        int i = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? f(33) : b(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? f(130) : b(130);
                }
                if (keyCode == 62) {
                    if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    l(i);
                    return false;
                } else if (keyCode == 92) {
                    return f(33);
                } else {
                    if (keyCode == 93) {
                        return f(130);
                    }
                    if (keyCode == 122) {
                        l(33);
                        return false;
                    } else if (keyCode != 123) {
                        return false;
                    } else {
                        l(130);
                        return false;
                    }
                }
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
        return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || d(keyEvent);
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z2) {
        return this.K0.a(f, f2, z2);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.K0.b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.K0.c(iArr, iArr2, i, i2, 0);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.K0.e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.v;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (c6a.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (c6a.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.w;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (c6a.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            }
            if (c6a.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, c44.DEFAULT_ASPECT_RATIO);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final void e(int i) {
        if (getChildCount() > 0) {
            this.o.fling(getScrollX(), getScrollY(), 0, i, 0, 0, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, 0, 0);
            this.K0.h(2, 1);
            this.H0 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final boolean f(int i) {
        int childCount;
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return m(i, rect.top, rect.bottom);
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        ft ftVar = this.J0;
        return ftVar.c | ftVar.b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return c44.DEFAULT_ASPECT_RATIO;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.L0 == c44.DEFAULT_ASPECT_RATIO) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.L0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.L0;
    }

    public final boolean h(View view, int i, int i2) {
        Rect rect = this.c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final boolean hasNestedScrollingParent() {
        return this.K0.g(0);
    }

    public final void i(int[] iArr, int i, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.K0.d(scrollY2, i - scrollY2, i2, iArr);
    }

    public final boolean isNestedScrollingEnabled() {
        return this.K0.d;
    }

    public final void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.D0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.x = (int) motionEvent.getY(i);
            this.D0 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.x0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean k(int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z2 = false;
        } else {
            i2 = 0;
            z2 = true;
        }
        if (i5 <= i4) {
            if (i5 < 0) {
                i4 = 0;
            } else {
                i4 = i5;
                z3 = false;
                if (z3 && !this.K0.g(1)) {
                    this.o.springBack(i2, i4, 0, 0, 0, getScrollRange());
                }
                super.scrollTo(i2, i4);
                return z2 || z3;
            }
        }
        z3 = true;
        this.o.springBack(i2, i4, 0, 0, 0, getScrollRange());
        super.scrollTo(i2, i4);
        if (z2) {
            return true;
        }
    }

    public final void l(int i) {
        boolean z2 = i == 130;
        int height = getHeight();
        Rect rect = this.c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        m(i, i2, i3);
    }

    public final boolean m(int i, int i2, int i3) {
        boolean z2;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z3 = i4 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = focusables.get(i8);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i5 < bottom && top < i6) {
                boolean z5 = i5 < top && bottom < i6;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (!z6) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i5 < scrollY || i6 > i7) {
            q(z3 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i4);
        }
        return z2;
    }

    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        i(iArr, i4, i5);
    }

    public final void o(View view, int i, int i2, int i3, int i4, int i5) {
        i((int[]) null, i4, i5);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.z = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r2 >= 0) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r3 = 1
            int r4 = r26.getAction()
            r5 = 8
            if (r4 != r5) goto L_0x0344
            boolean r4 = r0.w0
            if (r4 != 0) goto L_0x0344
            int r4 = r26.getSource()
            r5 = 2
            r4 = r4 & r5
            if (r4 != r5) goto L_0x001b
            r4 = r3
            goto L_0x001c
        L_0x001b:
            r4 = 0
        L_0x001c:
            r7 = 0
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 26
            if (r4 == 0) goto L_0x002f
            r4 = 9
            float r10 = r1.getAxisValue(r4)
            float r11 = r26.getX()
            int r11 = (int) r11
            goto L_0x0045
        L_0x002f:
            int r4 = r26.getSource()
            r4 = r4 & r8
            if (r4 != r8) goto L_0x0042
            float r10 = r1.getAxisValue(r9)
            int r4 = r25.getWidth()
            int r11 = r4 / 2
            r4 = r9
            goto L_0x0045
        L_0x0042:
            r10 = r7
            r4 = 0
            r11 = 0
        L_0x0045:
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0344
            float r12 = r25.getVerticalScrollFactorCompat()
            float r12 = r12 * r10
            int r10 = (int) r12
            int r12 = r26.getSource()
            r13 = 8194(0x2002, float:1.1482E-41)
            r12 = r12 & r13
            if (r12 != r13) goto L_0x005a
            r12 = r3
            goto L_0x005b
        L_0x005a:
            r12 = 0
        L_0x005b:
            int r10 = -r10
            r0.q(r10, r11, r3, r12)
            if (r4 == 0) goto L_0x0342
            qo4 r0 = r0.M0
            r0.getClass()
            int r10 = r26.getSource()
            int r11 = r26.getDeviceId()
            int r12 = r0.h
            r14 = 34
            int[] r15 = r0.j
            if (r12 != r10) goto L_0x0083
            int r12 = r0.i
            if (r12 != r11) goto L_0x0083
            int r12 = r0.g
            if (r12 == r4) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            r2 = 0
            r6 = 0
            goto L_0x0132
        L_0x0083:
            ts1 r12 = r0.c
            r12.getClass()
            android.content.Context r12 = r0.a
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r12)
            int r2 = r26.getDeviceId()
            int r7 = r26.getSource()
            int r13 = android.os.Build.VERSION.SDK_INT
            java.lang.String r3 = "android"
            java.lang.String r6 = "dimen"
            r9 = -1
            if (r13 < r14) goto L_0x00a5
            int r2 = defpackage.jag.b(r5, r2, r4, r7)
        L_0x00a3:
            r7 = 0
            goto L_0x00da
        L_0x00a5:
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto L_0x00d6
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7)
            if (r2 == 0) goto L_0x00d6
            android.content.res.Resources r2 = r12.getResources()
            if (r7 != r8) goto L_0x00c2
            r7 = 26
            if (r4 != r7) goto L_0x00c2
            java.lang.String r7 = "config_viewMinRotaryEncoderFlingVelocity"
            int r7 = r2.getIdentifier(r7, r6, r3)
            goto L_0x00c3
        L_0x00c2:
            r7 = r9
        L_0x00c3:
            java.util.Objects.requireNonNull(r5)
            if (r7 == r9) goto L_0x00d1
            if (r7 == 0) goto L_0x00d6
            int r2 = r2.getDimensionPixelSize(r7)
            if (r2 >= 0) goto L_0x00a3
            goto L_0x00d6
        L_0x00d1:
            int r2 = r5.getScaledMinimumFlingVelocity()
            goto L_0x00a3
        L_0x00d6:
            r2 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00a3
        L_0x00da:
            r15[r7] = r2
            int r2 = r26.getDeviceId()
            int r7 = r26.getSource()
            if (r13 < r14) goto L_0x00ec
            int r2 = defpackage.jag.a(r5, r2, r4, r7)
        L_0x00ea:
            r3 = 1
            goto L_0x0128
        L_0x00ec:
            android.view.InputDevice r2 = android.view.InputDevice.getDevice(r2)
            if (r2 == 0) goto L_0x00fa
            android.view.InputDevice$MotionRange r2 = r2.getMotionRange(r4, r7)
            if (r2 == 0) goto L_0x00fa
            r2 = 1
            goto L_0x00fb
        L_0x00fa:
            r2 = 0
        L_0x00fb:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != 0) goto L_0x0101
        L_0x00ff:
            r2 = r13
            goto L_0x00ea
        L_0x0101:
            android.content.res.Resources r2 = r12.getResources()
            if (r7 != r8) goto L_0x0112
            r7 = 26
            if (r4 != r7) goto L_0x0112
            java.lang.String r7 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r3 = r2.getIdentifier(r7, r6, r3)
            goto L_0x0113
        L_0x0112:
            r3 = r9
        L_0x0113:
            java.util.Objects.requireNonNull(r5)
            if (r3 == r9) goto L_0x0123
            if (r3 == 0) goto L_0x00ff
            int r2 = r2.getDimensionPixelSize(r3)
            if (r2 >= 0) goto L_0x0121
            goto L_0x00ff
        L_0x0121:
            r13 = r2
            goto L_0x00ff
        L_0x0123:
            int r2 = r5.getScaledMaximumFlingVelocity()
            goto L_0x00ea
        L_0x0128:
            r15[r3] = r2
            r0.h = r10
            r0.i = r11
            r0.g = r4
            r2 = 0
            r6 = 1
        L_0x0132:
            r3 = r15[r2]
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto L_0x0145
            android.view.VelocityTracker r1 = r0.e
            if (r1 == 0) goto L_0x0340
            r1.recycle()
            r1 = 0
            r0.e = r1
            goto L_0x0340
        L_0x0145:
            android.view.VelocityTracker r2 = r0.e
            if (r2 != 0) goto L_0x014f
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r0.e = r2
        L_0x014f:
            android.view.VelocityTracker r2 = r0.e
            ts1 r3 = r0.d
            r3.getClass()
            java.util.Map r3 = defpackage.d2g.a
            r2.addMovement(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r14) goto L_0x0160
            goto L_0x01b9
        L_0x0160:
            int r3 = r26.getSource()
            if (r3 != r8) goto L_0x01b9
            java.util.Map r3 = defpackage.d2g.a
            boolean r5 = r3.containsKey(r2)
            if (r5 != 0) goto L_0x0176
            e2g r5 = new e2g
            r5.<init>()
            r3.put(r2, r5)
        L_0x0176:
            java.lang.Object r3 = r3.get(r2)
            e2g r3 = (defpackage.e2g) r3
            r3.getClass()
            long r7 = r26.getEventTime()
            int r5 = r3.d
            long[] r9 = r3.b
            if (r5 == 0) goto L_0x019b
            int r5 = r3.e
            r10 = r9[r5]
            long r10 = r7 - r10
            r12 = 40
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x019b
            r5 = 0
            r3.d = r5
            r5 = 0
            r3.c = r5
        L_0x019b:
            int r5 = r3.e
            r10 = 1
            int r5 = r5 + r10
            r11 = 20
            int r5 = r5 % r11
            r3.e = r5
            int r12 = r3.d
            if (r12 == r11) goto L_0x01ab
            int r12 = r12 + r10
            r3.d = r12
        L_0x01ab:
            r10 = 26
            float r1 = r1.getAxisValue(r10)
            float[] r10 = r3.a
            r10[r5] = r1
            int r1 = r3.e
            r9[r1] = r7
        L_0x01b9:
            r1 = 1000(0x3e8, float:1.401E-42)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r2.computeCurrentVelocity(r1, r3)
            java.util.Map r5 = defpackage.d2g.a
            java.lang.Object r5 = r5.get(r2)
            e2g r5 = (defpackage.e2g) r5
            if (r5 == 0) goto L_0x02b5
            int r7 = r5.d
            r8 = 2
            if (r7 >= r8) goto L_0x01d5
        L_0x01d0:
            r23 = r4
            r3 = 0
            goto L_0x028c
        L_0x01d5:
            int r8 = r5.e
            r9 = 20
            int r10 = r8 + 20
            r11 = 1
            int r7 = r7 - r11
            int r10 = r10 - r7
            int r10 = r10 % r9
            long[] r7 = r5.b
            r8 = r7[r8]
        L_0x01e3:
            r11 = r7[r10]
            long r19 = r8 - r11
            r21 = 100
            int r13 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r13 <= 0) goto L_0x01f9
            int r11 = r5.d
            r13 = 1
            int r11 = r11 - r13
            r5.d = r11
            int r10 = r10 + r13
            r17 = 20
            int r10 = r10 % 20
            goto L_0x01e3
        L_0x01f9:
            r13 = 1
            r17 = 20
            int r8 = r5.d
            r9 = 2
            if (r8 >= r9) goto L_0x0202
            goto L_0x01d0
        L_0x0202:
            float[] r14 = r5.a
            if (r8 != r9) goto L_0x021b
            int r10 = r10 + r13
            int r10 = r10 % 20
            r7 = r7[r10]
            int r9 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0210
            goto L_0x01d0
        L_0x0210:
            r9 = r14[r10]
            long r7 = r7 - r11
            float r7 = (float) r7
            float r7 = r9 / r7
            r23 = r4
            r3 = r7
            goto L_0x028c
        L_0x021b:
            r8 = 0
            r9 = 0
            r11 = 0
        L_0x021e:
            int r12 = r5.d
            r13 = 1
            int r12 = r12 - r13
            r16 = 1073741824(0x40000000, float:2.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 >= r12) goto L_0x0275
            int r12 = r9 + r10
            r17 = 20
            int r18 = r12 % 20
            r21 = r7[r18]
            int r12 = r12 + r13
            int r12 = r12 % 20
            r23 = r7[r12]
            int r18 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r18 != 0) goto L_0x023f
            r23 = r4
            r4 = r13
            goto L_0x026e
        L_0x023f:
            int r11 = r11 + r13
            r13 = 0
            int r23 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r23 >= 0) goto L_0x0247
            r19 = r20
        L_0x0247:
            float r13 = java.lang.Math.abs(r8)
            float r13 = r13 * r16
            r23 = r4
            double r3 = (double) r13
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r19 = r19 * r3
            r3 = r14[r12]
            r12 = r7[r12]
            long r12 = r12 - r21
            float r4 = (float) r12
            float r3 = r3 / r4
            float r4 = r3 - r19
            float r3 = java.lang.Math.abs(r3)
            float r3 = r3 * r4
            float r3 = r3 + r8
            r4 = 1
            if (r11 != r4) goto L_0x026d
            r8 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r8
        L_0x026d:
            r8 = r3
        L_0x026e:
            int r9 = r9 + r4
            r4 = r23
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x021e
        L_0x0275:
            r23 = r4
            r3 = 0
            int r4 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r4 >= 0) goto L_0x027e
            r19 = r20
        L_0x027e:
            float r3 = java.lang.Math.abs(r8)
            float r3 = r3 * r16
            double r3 = (double) r3
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r3 = r3 * r19
        L_0x028c:
            float r1 = (float) r1
            float r3 = r3 * r1
            r5.c = r3
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r4 = java.lang.Math.abs(r1)
            float r4 = -r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x02a4
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
            r5.c = r1
            goto L_0x02b7
        L_0x02a4:
            float r3 = r5.c
            float r4 = java.lang.Math.abs(r1)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x02b7
            float r1 = java.lang.Math.abs(r1)
            r5.c = r1
            goto L_0x02b7
        L_0x02b5:
            r23 = r4
        L_0x02b7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r1 < r3) goto L_0x02c4
            r4 = r23
            float r1 = defpackage.c2g.a(r2, r4)
            goto L_0x02e8
        L_0x02c4:
            r4 = r23
            if (r4 != 0) goto L_0x02cd
            float r1 = r2.getXVelocity()
            goto L_0x02e8
        L_0x02cd:
            r1 = 1
            if (r4 != r1) goto L_0x02d5
            float r1 = r2.getYVelocity()
            goto L_0x02e8
        L_0x02d5:
            java.util.Map r1 = defpackage.d2g.a
            java.lang.Object r1 = r1.get(r2)
            e2g r1 = (defpackage.e2g) r1
            if (r1 == 0) goto L_0x02e7
            r2 = 26
            if (r4 == r2) goto L_0x02e4
            goto L_0x02e7
        L_0x02e4:
            float r1 = r1.c
            goto L_0x02e8
        L_0x02e7:
            r1 = 0
        L_0x02e8:
            d6a r2 = r0.b
            java.lang.Object r3 = r2.b
            androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
            float r3 = r3.getVerticalScrollFactorCompat()
            float r3 = -r3
            float r1 = r1 * r3
            float r3 = java.lang.Math.signum(r1)
            java.lang.Object r2 = r2.b
            androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
            if (r6 != 0) goto L_0x030d
            float r4 = r0.f
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x0312
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0312
        L_0x030d:
            android.widget.OverScroller r3 = r2.o
            r3.abortAnimation()
        L_0x0312:
            float r3 = java.lang.Math.abs(r1)
            r4 = 0
            r4 = r15[r4]
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x031f
            goto L_0x0340
        L_0x031f:
            r3 = 1
            r4 = r15[r3]
            int r3 = -r4
            float r3 = (float) r3
            float r4 = (float) r4
            float r1 = java.lang.Math.min(r1, r4)
            float r1 = java.lang.Math.max(r3, r1)
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0334
            r7 = r3
            goto L_0x033e
        L_0x0334:
            android.widget.OverScroller r3 = r2.o
            r3.abortAnimation()
            int r3 = (int) r1
            r2.e(r3)
            r7 = r1
        L_0x033e:
            r0.f = r7
        L_0x0340:
            r0 = 1
            goto L_0x0343
        L_0x0342:
            r0 = r3
        L_0x0343:
            return r0
        L_0x0344:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.w0) {
            return true;
        }
        int i = action & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.D0;
                    if (!(i2 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i2)) == -1)) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.x) > this.A0 && (2 & getNestedScrollAxes()) == 0) {
                            this.w0 = true;
                            this.x = y2;
                            if (this.x0 == null) {
                                this.x0 = VelocityTracker.obtain();
                            }
                            this.x0.addMovement(motionEvent);
                            this.G0 = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        j(motionEvent);
                    }
                }
            }
            this.w0 = false;
            this.D0 = -1;
            VelocityTracker velocityTracker = this.x0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.x0 = null;
            }
            if (this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            a(0);
        } else {
            int y3 = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x2 >= childAt.getLeft() && x2 < childAt.getRight()) {
                    this.x = y3;
                    this.D0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.x0;
                    if (velocityTracker2 == null) {
                        this.x0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.x0.addMovement(motionEvent);
                    this.o.computeScrollOffset();
                    if (!w(motionEvent) && this.o.isFinished()) {
                        z2 = false;
                    }
                    this.w0 = z2;
                    this.K0.h(2, 0);
                }
            }
            if (!w(motionEvent) && this.o.isFinished()) {
                z2 = false;
            }
            this.w0 = z2;
            VelocityTracker velocityTracker3 = this.x0;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.x0 = null;
            }
        }
        return this.w0;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z2, i, i2, i3, i4);
        int i6 = 0;
        this.y = false;
        View view = this.v0;
        if (view != null && g(view, this)) {
            View view2 = this.v0;
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c2 = c(rect);
            if (c2 != 0) {
                scrollBy(0, c2);
            }
        }
        this.v0 = null;
        if (!this.z) {
            if (this.I0 != null) {
                scrollTo(getScrollX(), this.I0.a);
                this.I0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.z = true;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.y0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(c44.DEFAULT_ASPECT_RATIO, f2, true);
        e((int) f2);
        return true;
    }

    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.K0.b(f, f2);
    }

    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.K0.c(iArr, (int[]) null, i, i2, 0);
    }

    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        i((int[]) null, i4, 0);
    }

    public final void onNestedScrollAccepted(View view, View view2, int i) {
        r(view, view2, i, 0);
    }

    public final void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        super.scrollTo(i, i2);
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !(!h(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f6a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f6a f6a = (f6a) parcelable;
        super.onRestoreInstanceState(f6a.getSuperState());
        this.I0 = f6a;
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, f6a, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.a = getScrollY();
        return baseSavedState;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && h(findFocus, 0, i4)) {
            Rect rect = this.c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int c2 = c(rect);
            if (c2 == 0) {
                return;
            }
            if (this.z0) {
                v(0, c2, false);
            } else {
                scrollBy(0, c2);
            }
        }
    }

    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return p(view, view2, i, 0);
    }

    public final void onStopNestedScroll(View view) {
        s(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        MotionEvent motionEvent2 = motionEvent;
        if (this.x0 == null) {
            this.x0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.G0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f = c44.DEFAULT_ASPECT_RATIO;
        obtain.offsetLocation(c44.DEFAULT_ASPECT_RATIO, (float) this.G0);
        i6a i6a = this.K0;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.w;
            EdgeEffect edgeEffect2 = this.v;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.x0;
                velocityTracker.computeCurrentVelocity(1000, (float) this.C0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.D0);
                if (Math.abs(yVelocity) >= this.B0) {
                    if (b0h.u(edgeEffect2) != c44.DEFAULT_ASPECT_RATIO) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            e(-yVelocity);
                        }
                    } else if (b0h.u(edgeEffect) != c44.DEFAULT_ASPECT_RATIO) {
                        int i = -yVelocity;
                        if (u(edgeEffect, i)) {
                            edgeEffect.onAbsorb(i);
                        } else {
                            e(i);
                        }
                    } else {
                        int i2 = -yVelocity;
                        float f2 = (float) i2;
                        if (!i6a.b(c44.DEFAULT_ASPECT_RATIO, f2)) {
                            dispatchNestedFling(c44.DEFAULT_ASPECT_RATIO, f2, true);
                            e(i2);
                        }
                    }
                } else if (this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.D0 = -1;
                this.w0 = false;
                VelocityTracker velocityTracker2 = this.x0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.x0 = null;
                }
                a(0);
                this.v.onRelease();
                this.w.onRelease();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.D0);
                if (findPointerIndex != -1) {
                    int y2 = (int) motionEvent2.getY(findPointerIndex);
                    int i3 = this.x - y2;
                    float x2 = motionEvent2.getX(findPointerIndex) / ((float) getWidth());
                    float height = ((float) i3) / ((float) getHeight());
                    if (b0h.u(edgeEffect2) != c44.DEFAULT_ASPECT_RATIO) {
                        float f3 = -b0h.G(edgeEffect2, -height, x2);
                        if (b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO) {
                            edgeEffect2.onRelease();
                        }
                        f = f3;
                    } else if (b0h.u(edgeEffect) != c44.DEFAULT_ASPECT_RATIO) {
                        float G = b0h.G(edgeEffect, height, 1.0f - x2);
                        if (b0h.u(edgeEffect) == c44.DEFAULT_ASPECT_RATIO) {
                            edgeEffect.onRelease();
                        }
                        f = G;
                    }
                    int round = Math.round(f * ((float) getHeight()));
                    if (round != 0) {
                        invalidate();
                    }
                    int i4 = i3 - round;
                    if (!this.w0 && Math.abs(i4) > this.A0) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.w0 = true;
                        i4 = i4 > 0 ? i4 - this.A0 : i4 + this.A0;
                    }
                    if (this.w0) {
                        int q = q(i4, (int) motionEvent2.getX(findPointerIndex), 0, false);
                        this.x = y2 - q;
                        this.G0 += q;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.w0 && getChildCount() > 0 && this.o.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.D0 = -1;
                this.w0 = false;
                VelocityTracker velocityTracker3 = this.x0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.x0 = null;
                }
                a(0);
                this.v.onRelease();
                this.w.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.x = (int) motionEvent2.getY(actionIndex);
                this.D0 = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                j(motionEvent);
                this.x = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.D0));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.w0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                a(1);
            }
            int pointerId = motionEvent2.getPointerId(0);
            this.x = (int) motionEvent.getY();
            this.D0 = pointerId;
            i6a.h(2, 0);
        }
        VelocityTracker velocityTracker4 = this.x0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final boolean p(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public final int q(int i, int i2, int i3, boolean z2) {
        int i4;
        int i5;
        boolean z3;
        VelocityTracker velocityTracker;
        int i6 = i2;
        int i7 = i3;
        i6a i6a = this.K0;
        if (i7 == 1) {
            i6a.h(2, i7);
        }
        boolean c2 = this.K0.c(this.F0, this.E0, 0, i, i3);
        int[] iArr = this.F0;
        int[] iArr2 = this.E0;
        if (c2) {
            i5 = i - iArr[1];
            i4 = iArr2[1];
        } else {
            i5 = i;
            i4 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z4 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z5 = k(i5, 0, scrollY, scrollRange) && !i6a.g(i7);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        int i8 = scrollRange;
        this.K0.e(0, scrollY2, 0, i5 - scrollY2, this.E0, i3, iArr);
        int i9 = i4 + iArr2[1];
        int i10 = i5 - iArr[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.w;
        EdgeEffect edgeEffect2 = this.v;
        if (i11 < 0) {
            if (z4) {
                b0h.G(edgeEffect2, ((float) (-i10)) / ((float) getHeight()), ((float) i6) / ((float) getWidth()));
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i11 > i8 && z4) {
            b0h.G(edgeEffect, ((float) i10) / ((float) getHeight()), 1.0f - (((float) i6) / ((float) getWidth())));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z3 = false;
        } else {
            z3 = z5;
        }
        if (z3 && i7 == 0 && (velocityTracker = this.x0) != null) {
            velocityTracker.clear();
        }
        if (i7 == 1) {
            a(i7);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    public final void r(View view, View view2, int i, int i2) {
        ft ftVar = this.J0;
        if (i2 == 1) {
            ftVar.c = i;
        } else {
            ftVar.b = i;
        }
        this.K0.h(2, i2);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.y) {
            Rect rect = this.c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int c2 = c(rect);
            if (c2 != 0) {
                scrollBy(0, c2);
            }
        } else {
            this.v0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int c2 = c(rect);
        boolean z3 = c2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, c2);
            } else {
                v(0, c2, false);
            }
        }
        return z3;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.x0) != null) {
            velocityTracker.recycle();
            this.x0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void requestLayout() {
        this.y = true;
        super.requestLayout();
    }

    public final void s(View view, int i) {
        ft ftVar = this.J0;
        if (i == 1) {
            ftVar.c = 0;
        } else {
            ftVar.b = 0;
        }
        a(i);
    }

    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.y0) {
            this.y0 = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        i6a i6a = this.K0;
        if (i6a.d) {
            WeakHashMap weakHashMap = gag.a;
            v9g.z(i6a.c);
        }
        i6a.d = z2;
    }

    public void setOnScrollChangeListener(e6a e6a) {
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.z0 = z2;
    }

    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean startNestedScroll(int i) {
        return this.K0.h(i, 0);
    }

    public final void stopNestedScroll() {
        a(0);
    }

    public final void t(View view, int i, int i2, int[] iArr, int i3) {
        this.K0.c(iArr, (int[]) null, i, i2, i3);
    }

    public final boolean u(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float u = b0h.u(edgeEffect) * ((float) getHeight());
        float f = this.a * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) N0;
        return ((float) (Math.exp((d / (d - 1.0d)) * log) * ((double) f))) < u;
    }

    public final void v(int i, int i2, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.o;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
                if (z2) {
                    this.K0.h(2, 1);
                } else {
                    a(1);
                }
                this.H0 = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.o.isFinished()) {
                    this.o.abortAnimation();
                    a(1);
                }
                scrollBy(i, i2);
            }
            this.b = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.v;
        if (b0h.u(edgeEffect) != c44.DEFAULT_ASPECT_RATIO) {
            b0h.G(edgeEffect, c44.DEFAULT_ASPECT_RATIO, motionEvent.getX() / ((float) getWidth()));
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.w;
        if (b0h.u(edgeEffect2) == c44.DEFAULT_ASPECT_RATIO) {
            return z2;
        }
        b0h.G(edgeEffect2, c44.DEFAULT_ASPECT_RATIO, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.c = new Rect();
        this.y = true;
        this.z = false;
        this.v0 = null;
        this.w0 = false;
        this.z0 = true;
        this.D0 = -1;
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.M0 = new qo4(getContext(), new d6a(0, (Object) this));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = gz4.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.v = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = gz4.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.w = edgeEffect2;
        this.a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.o = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A0 = viewConfiguration.getScaledTouchSlop();
        this.B0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.C0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P0, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.J0 = new ft(6);
        this.K0 = new i6a(this);
        setNestedScrollingEnabled(true);
        gag.j(this, O0);
    }

    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
